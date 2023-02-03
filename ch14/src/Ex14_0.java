
public class Ex14_0 {

	public static void main(String[] args) {
//		Object obj = (a,b) -> a>b ? a : b; // 라담식. 익명객체
//		Object obj = new Object(); { // 불가 Object 객체가아닌 함수형 인터페이스 객체로 받아와야함
		
		
		
//		MyFunction obj = new MyFunction() {
//			public int max (int a, int b ) { // 오버라이딩 - 접근제어자는 좁게 못바꾸므로 public 써야함
//				return a>b?a:b;
//			}
//		};
		
		// 10~14를 간결하게 람다식으로 쓰면 아래
		// 람다식 다루기 위해 참조변수의 타입은 함수형 인터페이스로!!!!
		MyFunction obj = (a,b) -> a>b ? a:b;
		
		int value = obj.max(3,5); // 함수형 인터페이스
		System.out.println(value);
		
	}

}


@FunctionalInterface // 함수형 인터페이스는 단 하나의 추상 메서드만 가능.
interface MyFunction {
//	abstract int max(int a, int b); // default
	
	int max (int a,int b); // abstract도 안써도됨 생략가능함 interface가 애초에 미완성 abstract이기때문에
//	public abstract int max2(int a, int b); // 불가  함수형 인터페이스는 메서드 하나만있어야함
}
