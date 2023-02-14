public class Ex6_20 {
    int iv=10;
    static int cv = 20;

    int iv2= cv;
//    static int cv2 = iv; // 에러 cv변수에서는 iv를 사용 불가
    static int cv2 = new Ex6_20().iv; // cv변수에 iv 넣으려면 객체를 가져오자.

    static void staticMethod1(){
        System.out.println("cv = " + cv);
//        System.out.println("iv = " + iv); // 에러 cv메소드에는 iv 사용불가
        Ex6_20 e = new Ex6_20();
        System.out.println(e.iv); // 객체 생성후 참조해오자
    }

    void ivMethod1(){
        System.out.println(iv);
        System.out.println(cv);
    }

    static void staticMethod2(){
        staticMethod1();
//        ivMethod1(); // 에러. cv에는 iv 불가 객체 가져오자
        Ex6_20 e = new Ex6_20();
        e.ivMethod1();
    }

    void ivMethod2(){
        staticMethod1();
        staticMethod2();
        ivMethod1();
        ivMethod2();
    }
}
