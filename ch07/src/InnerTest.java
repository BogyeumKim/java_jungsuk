class AAA{
	int i;
	BBB b = new BBB();
	
	class BBB{ // BBB는 AAA의 내부 class
		void method() {
//			AAA a = new AAA();
//			System.out.println(a.i);
		}
	}
}

class CCC{
//	BBB b = new BBB(); 
}

public class InnerTest {

	public static void main(String[] args) {
//		BBB b = new BBB();
//		b.method();
		AAA ab = new AAA();
	}

}
