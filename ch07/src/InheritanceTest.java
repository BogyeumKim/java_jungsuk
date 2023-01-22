class Point extends Object { // object안써도 컴파일시 자동으로 생성해줌 object에는 여러개의 메소드가 있음
	int x;
	int y;
	
}

//class Circle extends Point{ // 상속  
//	int r;
//}

class Circle { // 포함
	Point p = new Point();
	int r;
}


public class InheritanceTest {

	public static void main(String[] args) {

		Circle c = new Circle();
		c.p.x = 1; // 포함
		c.p.y = 2;
//		c.x=1; // 상속 
//		c.y=2;
//		c.r=3;
		
		System.out.println(c.p.x);
		System.out.println(c.p.y);
		System.out.println(c.r);
		
		System.out.println(c.toString()); // Object 클래스에 toString 메소드 존재하여 이용가능
	}

}
