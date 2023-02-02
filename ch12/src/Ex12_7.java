
class Parent {
	void parentMethod() {
		System.out.println("test");
	}
}

class Child extends Parent{
	@Override
	@Deprecated
	void parentMethod() {
		// TODO Auto-generated method stub
 		System.out.println("test2");
	}
}

@FunctionalInterface // 함수형인터페이스만 붙이는건데 함수형인터페이스는 추상메서드 "하나"만 가능함 아래 voide check() 주석풀면 에러남
interface Testable { 
	void test(); // 추상메서드
//	void check(); // 추상메서드
}
public class Ex12_7 {
	public static void main(String[] args) {
		Child c = new Child();
		c.parentMethod();
		}
	}
	
