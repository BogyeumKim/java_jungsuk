import java.util.function.Function;
import java.util.function.Predicate;

public class Ex14_3 {

	public static void main(String[] args) {
		Function<String, Integer> f = (s) -> Integer.parseInt(s,16); // < String이 입력 , Integer 가 출력 > 16진수로 변경
		Function<Integer, String> g = (i) -> Integer.toBinaryString(i); // 입력 Integer 출력 String
		
		Function<String , String> h = f.andThen(g); // 위에 f,g 를 String 입출력으로 합침
		Function<Integer, Integer> h2 = f.compose(g); // g.andThen(f)와 같음 반대로 Integer로 입출력됨
		
		System.out.println(h.apply("FF")); // "FF" -> 255(16진수) -> "111111"(g는 2진수 문자열로 변경)
		System.out.println(h2.apply(2)); // 2 -> "10" -> 16
		
		Function<String, String> f2 = x -> x; // 항등 함수 (identify function) x넣으면 x 그대로 나오는거임
		System.out.println(f2.apply("AAA")); // AAA가 그대로 출력
		
		Predicate<Integer> p = i -> i <100;
		Predicate<Integer> q = i -> i< 200;
		Predicate<Integer> r = i -> i%2 ==0;
		Predicate<Integer> notP = p.negate(); // negate가 p의 !(반대)임 i >= 100 
		
		Predicate<Integer> all = notP.and(q.or(r)); // (i>=100) && ( i<200 || i%2 ==0 )
		System.out.println(all.test(150)); // i에 150넣으면 true && ( true || true ) -> true && true -> true
		
		String str1 = "abc";
		String str2 = "abc";
		
		// str1과 str2가 같은지 비교 결과 반환
		Predicate<String> p2 = Predicate.isEqual(str1);
		boolean result = p2.test(str2);
		System.out.println(result);
		
	}

}
