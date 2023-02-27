public class Ex13_20 {
    public static void main(String[] args) {
        ThEx20_1 gc = new ThEx20_1();
        gc.setDaemon(true); // 다른 일반 쓰레드의 작업을 돕는 보조쓰레드 일반 쓰레드 종료되면 데몬쓰레드도 강제종료 이거 없으면 계속 while문 반복
        gc.start();

        int requiredMemory = 0;

        for (int i = 0; i < 20; i++) {
            requiredMemory = (int) (Math.random() * 10) * 20;

            if (gc.freeMemory() < requiredMemory || gc.freeMemory() < gc.totalMemory() * 0.4) { // 남은메모리가 전체메모리 40% 미만일때
                    gc.interrupt(); // 잠자고있는 gc 쓰레드를 깨움
                try{
                    gc.join(100); // 위에 gc를 깨우고나서 join을 이용하여 main쓰레드를 기다리게하고 gc 먼저 처리하도록
                }catch (InterruptedException e) { }
            }
            gc.usedMemory += requiredMemory;
            System.out.println("usedMemory : "+gc.usedMemory);
        }
    }
}

class ThEx20_1 extends Thread {
    final static int MAX_MEMORY = 1000;
    int usedMemory = 0;

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(10 * 1000); // 10초 기다리기
            } catch (InterruptedException e) {
                System.out.println("Awaken by interrupt()");
            }

            gc(); // 가비지 컬렉션 수행
            System.out.println("가비지 컬렉션 Free Memory :"+freeMemory());
        }
    }

    void gc(){
        usedMemory -=300;
        if(usedMemory<0) usedMemory=0;
    }
    int totalMemory() { return MAX_MEMORY; }
    int freeMemory() { return MAX_MEMORY - usedMemory; }
}

