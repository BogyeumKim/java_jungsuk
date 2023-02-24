import javax.swing.*;

public class Ex13_13 {
    public static void main(String[] args) throws Exception{
        ThEx13_13 th1 = new ThEx13_13();
        th1.start();

        String input = JOptionPane.showInputDialog("아무 값이나 입력");
        System.out.println("입력한 값은 : " + input);
        th1.interrupt(); // interrupt()를 호출하면 interrupted 상태가 ture로됨. 고로 19line while문 탈출
        System.out.println("isInterrupted(): "+th1.isInterrupted());
    }
}

class ThEx13_13 extends Thread {
    @Override
    public void run() {
        int i = 10;
        while (i != 0 && !isInterrupted()) { // isInterrupted = 쓰레드의 interrupted 상태 반환 , !니까 false일때
            System.out.println(i--);
            for (long x=0;x<2500000000L;x++); // 시간지연용
        }
        System.out.println("카운트 종료");
    }
}
