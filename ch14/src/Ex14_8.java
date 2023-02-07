import java.util.Optional;
import java.util.OptionalInt;

public class Ex14_8 {

	public static void main(String[] args) {
		Optional<String> optStr = Optional.of("abcde");
		Optional<Integer> optInt = optStr.map(s->s.length()); // String::length이랑 동일 
		System.out.println("optStr ="+optStr.get());
		System.out.println("optInt ="+optInt.get());
		
		int result1 = Optional.of("123")
						.filter(x->x.length() >0) // 조건식 filter
						.map(Integer::parseInt).get();
		
		int result2 = Optional.of("")
				.filter(x->x.length() >0) 
				.map(Integer::parseInt).orElse(-1);
		
		System.out.println("result1="+result1);
		System.out.println("result2="+result2);
		
		Optional.of("456").map(Integer::parseInt).ifPresent(x->System.out.printf("result3=%d%n",x)); // ifPresent : null이 아니면 실행
		
		OptionalInt optInt1 = OptionalInt.of(0); // 0 저장
		OptionalInt optInt2 = OptionalInt.empty(); // 
		
		System.out.println(optInt1.isPresent()); // true
		System.out.println(optInt2.isPresent()); // false
		
		System.out.println(optInt1.getAsInt()); // 0
		System.out.println("optInt1="+optInt1);
		System.out.println("optInt1="+optInt2);
	}
}

