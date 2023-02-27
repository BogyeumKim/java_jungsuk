public class Ex13_18 {
    public static void main(String[] args) {
        ThEx13_18 th1 = new ThEx13_18("*");
        ThEx13_18 th2 = new ThEx13_18("**");
        ThEx13_18 th3 = new ThEx13_18("***");

        th1.start();
        th2.start();
        th3.start();

        try {
            Thread.sleep(2000);
            th1.suspend();
            Thread.sleep(2000);
            th2.suspend();
            Thread.sleep(3000);
            th1.resume();
            Thread.sleep(3000);
            th1.stop();
            Thread.sleep(3000);
            th3.stop();
        }catch (InterruptedException e) {}
    }
}

class ThEx13_18 implements Runnable {
    boolean suspended = false;
    boolean stopped = false;

    Thread th;

    ThEx13_18(String name) {
        th = new Thread(this,name); // Thread(Runnable r , String name);
    }

    @Override
    public void run() {
        String name = th.getName();
        while (!stopped) {
            if (!suspended) {
                System.out.println(name);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(name + "- interrupted");
                }
            } else { // 만약 suspended가 true라면 while문은 하는일 없으니 무한 반복되지만 아래처럼 yield로 양보해야 낭비를 막을수있다.
                Thread.yield(); // 자신에게 주어진 실행시간을 다음차례쓰레드에 양보한다.
            }
        } // while
        System.out.println(name + " - stopped");
    }

    void suspend(){
        suspended = true;
        th.interrupt(); // 쓰레드 작업중지
        System.out.println(th.getName() + " - interrupt() by supsend ()");
    }

    void stop(){
        stopped = true;
        th.interrupt();
        System.out.println(th.getName() + " - interrupt() by stop ()");
    }

    void resume() {
        suspended = false;
//        th.interrupt(); // 추가하면 43line sleep()에서 Interrupted예외 발생하는 즉시 일시정지 상태를 벗어나 응답성이 좋아짐.
    }
    void start() {
        th.start();
//        th.interrupt(); // 추가하면 43line sleep()에서 Interrupted예외 발생하는 즉시 일시정지 상태를 벗어나 응답성이 좋아짐.
    }

}
