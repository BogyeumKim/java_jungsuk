public class Ex13_2_2 {
    public static void main(String[] args) {
        ThreadEx2_1 t1 = new ThreadEx2_1();
        t1.start(); // main은 잘 종료됨
        t1.run(); // main 포함 에러남
    }
}

class ThreadEx2_1 extends Thread {
    @Override
    public void run() {
        throwException();
    }

    void throwException() {
        try {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
