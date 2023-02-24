public class Ex13_12 {

    public static void main(String[] args) {
        Thred13_1 th1 = new Thred13_1();
        Thread13_2 th2 = new Thread13_2();
        th1.start();
        th2.start();

        try {
            th1.sleep(2000); // th1이 아닌 main 쓰레드에영향됨 main쓰레드에서 돌리는거니까. 그래서 sleep은 참조변수를 호출하는것보단 아래처럼 Thread.sleep(2000)이런식으로
//            Thred13_1.sleep(2000);
        }catch (InterruptedException e){}

        System.out.println("<<main 종료>>");

    }

}


class Thred13_1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print("-");
        }
        System.out.print("< th1 종료 >");
    }
}

class Thread13_2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print("l");
        }
        System.out.print("< th2 종료 >");
    }
}