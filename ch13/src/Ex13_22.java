public class Ex13_22 {
    public static void main(String[] args) {
//        Thread th1 = new Thread(new RunEx22());
//        Thread th2 = new Thread(new RunEx22());
//        th1.start();
//        th2.start();
        Runnable r = new RunEx22();
        new Thread(r).start();
        new Thread(r).start();
        /*
         Thread th1 = new Thread(new RunEx22()) , Thread th2 = new Thread(new RunEx22())
         만든후 th1.start() , th2.start()방식으로 하면 서로 다른 쓰레드라 서로다른 각자의 1000을 가지고있어서 음수안뜸
         Runnable로 멀티쓰레드로 실행시켜도 synchronized 동기화 안시키면 음수뜸
         */
    }
}

class Account {
    private int balance = 1000; // private로 좁게 설정해야 동기화 의미가 있음!

    public int getBalance() {
        return balance;
    }

    public synchronized void withdraw(int money) { // synchronized로 메서드를 동기화시킴
        if (balance >= money) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            ;
            balance -= money;
        }
    }
}

class RunEx22 implements Runnable {
    Account acc = new Account();

    @Override
    public void run() {
        while (acc.getBalance() > 0) {
            int moeny = (int)(Math.random() * 3 +1) *100; // 100,200,300중 하나
            acc.withdraw(moeny);
            System.out.println("현재 금액 : "+acc.getBalance() );
        }
    }
}