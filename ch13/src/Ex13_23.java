import java.util.ArrayList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Ex13_23 {
    public static void main(String[] args) throws Exception {
    테이블 table = new 테이블(); // 여러쓰레드가 공유하는 객체 테이블
        new Thread(new 요리(table),"COOK1").start(); // Runnable r = new Runnable() -> Thread(r).start
        new Thread(new 손님(table,"도넛"), "손님1").start(); // Thread는 객체,이름
        new Thread(new 손님(table,"버거"),"손님2").start();

        Thread.sleep(2000); // main 메서드에서 예외 던지니까 try 필요 X
        System.exit(0);

    }
}

class 손님 implements Runnable {
    private 테이블 table;
    private String 음식;

    public 손님(테이블 table, String 음식) {
        this.table = table;
        this.음식 = 음식;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(100);
            }catch (InterruptedException e){}

            String name = Thread.currentThread().getName();

            table.삭제(음식);
            System.out.println(name + " 는 " + 음식 + " 을 먹었습니다");

//            if (먹다()) {
//                System.out.println(name + " 는 " + 음식 + " 을 먹었습니다");
//            } else {
//                System.out.println(name + " 는 " + 음식 + " 을 먹기를 실패했습니다");
//            }
        }
    }
//    boolean 먹다() { return table.삭제(음식);}
}

class 요리 implements Runnable {
    private 테이블 table;

    public 요리(테이블 table) {
        this.table = table;
    }

    @Override
    public void run() {
        while (true) {
            int idx = (int)(Math.random() * table.음식들()); // 음식들(메뉴) 중 하나를 선택해서
            table.추가(table.메뉴[idx]); // 테이블에 추가

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {}
        }
    }
}

class 테이블 {
    String[] 메뉴 = { "도넛","도넛","버거"};
    final int MAX_FOOD = 6; // 테이블에 놓을수있는 최대 음식 개수

    private ArrayList<String> 접시 = new ArrayList<>();
    private ReentrantLock lock = new ReentrantLock();
    private Condition forCook = lock.newCondition();
    private Condition forCust = lock.newCondition();

    public  void 추가(String 음식) { // 동기화 추가
        lock.lock(); // lock 시작 unlock으로 끝나는 부분까지 임계영역 이며 lock 이후는 try finally로 묶어야함.
        try {
            while (접시.size() >= MAX_FOOD) { // 테이블접시에 음식 다찰때까지
                String name = Thread.currentThread().getName();
                System.out.println(name + " 은 기다리고있습니다. 테이블에 음식이 가득차서 ");
                try {
                    forCook.await(); // 요리 쓰레드를 기다리게 함.
//                wait(); // 요리 쓰레드를 기다리게한다.
                    Thread.sleep(500);
                } catch (InterruptedException e ){}
            }

            접시.add(음식);
            forCust.signal(); // 기다리고있는 손님을 깨움
//        notify(); // 기다리고있는 손님을 깨우기 위함
            System.out.println("접시에는 : "+ 접시.toString());
        } finally {
            lock.unlock(); // lock 해제
        }
    }

    public void 삭제(String 음식) {
        lock.lock();
//        synchronized (this) {
            String name = Thread.currentThread().getName();
        try{
            while (접시.size() == 0) {
                System.out.println(name + " 은 기다리고있습니다. 테이블에 아무것도 없어서 ");
                try {
                    forCust.await(); // 손님 쓰레드를 기다리게한다.
//                    wait(); // 손님쓰레드를 기다리게 한다.
                    Thread.sleep(500);
                } catch (InterruptedException e) {}

            }

            while (true){
                for (int i = 0; i < 접시.size(); i++) {
                    if (음식.equals(접시.get(i))) {
                        접시.remove(i);
                        forCook.signal(); // 잠자고있는 요리를 깨움
//                        notify(); // 잠자고 있는 요리를 깨우기 위함
                        return;
                    }
                } // for

                try{
                    System.out.println(name + " 은 기다리고있습니다. 원하는 음식이 없어서.");
                    forCust.await(); // 원하는 은식이 없는 손님쓰레드를 기다리게함.
//                    wait(); // 원하는 음식이 없는 손님쓰레드를 기다리게한다.
                    Thread.sleep(500);
                } catch (InterruptedException e){}
            }//while
        } finally {
            lock.unlock();
        }
    }

    int 음식들() { return 메뉴.length; }
}