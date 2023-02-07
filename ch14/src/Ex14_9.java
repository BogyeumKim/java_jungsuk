import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex14_9 {

	public static void main(String[] args) {
		String[] strArr = {"Inheritance","Java","Lambda","stream","Optional","Count","sum"};
		
		Stream.of(strArr)
		.parallel() // 병렬처리
		.forEach(System.out::println);
//		.forEachOrdered(System.out::println); // 병렬처리해도 순서 유지시키는 forEachOrderd
		
		boolean noEmptyStr = Stream.of(strArr).noneMatch(s->s.length() ==0); // noneMatch s.length==0 인게 있냐? 없으니 true로 나옴 none니까
		
		Optional<String> sWrod = Stream.of(strArr).filter(s->s.charAt(0)=='s').findFirst(); 
//		Optional<String> sWrod = Stream.of(strArr).parallel().filter(s->s.charAt(0)=='s').findAny(); // 병렬로 처리하면서 s인 아무거나
		
		System.out.println("noEmptyStr="+noEmptyStr);
		System.out.println("sWord="+sWrod.get());
		
		// Stream<String[]>을 IntStream으로 변환 Stream<Integer>이랑 똑같지만 성능이 기본형인 IntStream이 더 좋음
		IntStream intStream1 = Stream.of(strArr).mapToInt((s)->s.length());
		IntStream intStream2 = Stream.of(strArr).mapToInt(String::length);
		IntStream intStream3 = Stream.of(strArr).mapToInt((s)->s.length());
		IntStream intStream4 = Stream.of(strArr).mapToInt(String::length);
		
		int count = intStream1.reduce(0, (a,b)->a+1);
		int sum = intStream2.reduce(0, (a,b)->a+b);
		OptionalInt max = intStream3.reduce(Integer::max);
		OptionalInt min = intStream4.reduce(Integer::min);
		
		System.out.println("count="+count);
		System.out.println("sum="+sum);
		System.out.println("Max="+max.getAsInt());
		System.out.println("Min="+min.getAsInt());
		
	}
}

