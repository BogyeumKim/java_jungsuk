
class A {
	public void method(I i) {
		i.method();
	}
}

interface I {
	public void method();
}

class B implements I{
	@Override
	public void method() {
		System.out.println("B의 메소드");
	}
}

class C implements I {
	@Override
	public void method() {
		System.out.println("C의 메소드");
	}
}


public class InterfaceTest {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		a.method(b); // a가 b를 사용(의존)
		a.method(new C());
		
		
		
	}

}
