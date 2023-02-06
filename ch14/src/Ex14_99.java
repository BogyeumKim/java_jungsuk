import java.util.function.Function;
import java.util.function.Supplier;

public class Ex14_99 {
	
	public static void main(String[] args) {
//		Supplier<MyClass> s = () -> new MyClass(); // Supplier는 입력X 출력만 O
		Supplier<MyClass> s = MyClass::new;
		
		MyClass mc = s.get();
		System.out.println(mc);
		
		//MyClass2에는 매개변수가 있음. Supllier는 입력X라 Function으로 사용
//		Function<Integer, MyClass2> f = (i) -> new MyClass2(i); 
		Function<Integer, MyClass2> f = MyClass2::new;
		
		MyClass2 mc2 = f.apply(100);
		System.out.println(mc2.iv);
		
		// 배열은 꼭 Function으로
//		Function<Integer, int[]> f2 = (i) -> new int[i];
		Function<Integer, int[]> f2 = int[]::new; // 메서드참조로 변환
		int[] arr = f2.apply(200);
		System.out.println("arr.length="+arr.length);
	}

}

class MyClass{}

class MyClass2{
	int iv;

	public MyClass2(int iv) {
		this.iv = iv;
	}
	
}
