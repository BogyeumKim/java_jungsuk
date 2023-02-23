import javax.swing.*;

public class Ex13_7_1 {
    public static void main(String[] args) {
        ThreadEx7 th1 = new ThreadEx7();
        th1.start();
        
        String input = JOptionPane.showInputDialog("아무값이나 입력ㄱ");
        System.out.println("입력한 값은 " + input + "입니다");
    }
}

class ThreadEx7 extends Thread {
    @Override
    public void run() {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

