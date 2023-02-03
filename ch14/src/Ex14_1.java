
public class Ex14_1 {

	static void execute(MyFunction2 f) { // 매개변수 타입이 MyFunction
		f.run();
	}
	
	static MyFunction2 getMyFunction() { // 반환 타입이 MyFunction 메서드
		MyFunction2 f = () -> System.out.println("f3.run()");
		return f; // return () -> sop("f3.run()") 이랑 동일
	}
	
	public static void main(String[] args) {
		MyFunction2 f1 = () -> System.out.println("f1.run()"); // 매게변수 입력과 반환타입이 똑같아야함 4번줄 
		
		MyFunction2 f2 = new MyFunction2() {
			
			@Override
			public void run() {
				System.out.println("f2.run()");
			} // run
		}; // MyFunction2
		
		MyFunction2 f3 = getMyFunction();
		
		f1.run();
		f2.run();
		f3.run();
		
		execute(f1);  // 4번줄 매개변수 타입이 MyFunction 객체니까 매개변수에 f1( MyFunction ) 객체 넣은거임
		execute( () -> System.out.println("run()zz"));
		
		
	} // main
}


@FunctionalInterface // 함수형 인터페이스는 단 하나의 추상 메서드만 가능.
interface MyFunction2 {
	void run(); // public abstract 달린거임.
}
