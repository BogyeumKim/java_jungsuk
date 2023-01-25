
public class Ex7_12 {
	
	
	class InstanceInner {
		int iv = 100;
//		static int cv = 100; // 에러 스태틱 변수 선언 불가
		final static int CONST = 100; // final 스태틱은 상수이므로 허용
	}
	
	static class StaticInner {
		int iv = 200;
		static int cv = 200; // static 클래스만 static 멤버 정의 가능
	}
	
	void myMethod() {
		class LocalInner{
			int iv = 300;
//			static int cv = 300; // 에러
			final static int CONST = 300;
			
		}
		System.out.println("hi");
	}
	
	
	
	public static void main(String[] args) {
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv);
		Ex7_12 a = new Ex7_12();
		a.myMethod();
		
	}

}
