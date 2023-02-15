class Point9 {
    int x, y;

    public Point9(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

class Circle9 implements Cloneable{
    Point9 p; // 원전
    double r; // 반지름

    public Circle9(Point9 p, double r) {
        this.p = p;
        this.r = r;
    }

    public Circle9 lowCopy(){ // 얕은 복사 : 참조하는 주소도 같음
        Object obj= null;
        try {
            obj=super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return (Circle9) obj;
    }

    public Circle9 deepCopy(){
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        Circle9 c = (Circle9) obj;
        c.p = new Point9(this.p.x , this.p.y);

        return c;
    }

    @Override
    public String toString() {
        return "Circle9{" +
                "p=" + p +
                ", r=" + r +
                '}';
    }
}



public class Ex9_9 {
    public static void main(String[] args) {
        Circle9 c1 = new Circle9(new Point9(1,1),2.0);
        Circle9 c2 = c1.lowCopy();
        Circle9 c3 = c1.deepCopy();

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        c1.p.x = 9;
        c1.p.y = 9;
        System.out.println(" = c1 변경후 ");
        System.out.println(c1);
        System.out.println("얕은복사"+c2);
        System.out.println("깊은복사"+c3);


    }

}
