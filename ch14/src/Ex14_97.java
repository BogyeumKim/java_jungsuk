import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex14_97 {
	
	public static void main(String[] args) {
//		int[] arr = null; // 이대로 sop찍으면 널포인트익셉션걸림
		int[] arr = new int[0];
		System.out.println("arr.length="+arr.length);
		
		Optional<String> opt = null; // ok. 하지만 바람직X
		Optional<String> opt2 = Optional.empty();
//		Optional<String> opt2 = Optional.of("abc");
		System.out.println("opt="+opt2);
//		System.out.println("opt="+opt2.get()); // 노서치엘리멘트익셉션뜸
		
		String str = "";
		
//		try {
//			str = opt2.get(); // 예외발생
//		} catch (Exception e) {
//			str = ""; // 예외가 발생하면 "";
//		}
		
//		str = opt2.orElse("EMPTY"); // opt2에 저장된값이 null이면 EMPTY로 위에 catch와 똑같음
		str = opt2.orElseGet(()->"EMPTY2"); // 위 코드를 람다식으로 바꾼코드 ,  () -> new String() ,, new::String 이랑 동일함.
		System.out.println("str ="+str);
	}

}

