public class Ex14_3_1 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.method(100);
    }
}

class Outer{
    int val=10; // Outer.this.val
    class Inner{
        int val=20; // this.val

        void method(int i) {
            int val=30;
//            i = 10; // 에러. 람다식 내에서 참조변수는 final이 기본이라 상수의값을 변경불가함

            MyFunction14_3 f = () -> {
                System.out.println("          i : "+i);
                System.out.println("         val : "+val);
                System.out.println("         this.val : "+ ++this.val);
                System.out.println("  Outer.this.val : "+ ++Outer.this.val);
            };

            f.myMethod();
        }
    } // Inner
}
@FunctionalInterface
interface MyFunction14_3 {
    public abstract void myMethod();
}
