import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex14_98 {
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		Stream<Integer> intStream = list.stream(); // list를 Stream으로 변환
		
		intStream.forEach(System.out::print); // forEach()는 최종연산
		
		// stream은 1회용. 최종연산하면 닫히므로 다시 생성해야함
		intStream = list.stream(); // list로부터 strea을 다시 생성
		intStream.forEach(System.out::println);
		
		System.out.println(" ========= 배열 =======");
//		Stream<String> strStream = Stream.of("a","b","c");
		
		String[] strArr = {"a","b","c"};
		Stream<String> strStream = Arrays.stream(strArr); // 위에 Stream.of("a","b","c")랑 동일
		strStream.forEach(System.out::print);
		
		System.out.println();
		
		Integer[] integerArr = {new Integer(1),new Integer(2),new Integer(3),new Integer(4),new Integer(5)};
		Stream<Integer> integerStream = Arrays.stream(integerArr);
		integerStream.forEach(System.out::print);
		
		System.out.println(); // 위 Integer[]로 Stream 만들지말고 아래 int[] 기본 배열로 만들면 오토박싱에 다른 메서드도 쓸수있음  sum , average 등
		  
		int[] intArr = {1,2,3,4,5};
		IntStream intStream2 = Arrays.stream(intArr);
//		System.out.println(intStream2.sum());
		intStream2.forEach(System.out::print);
		
		System.out.println();
		System.out.println(" ========= 임의의수 =======");
		
//		IntStream intStream3 = new Random().ints(); // 무한스트림이라 계속 나옴
//		IntStream intStream3 = new Random().ints(5); // ints에 숫자 넣으면 limit와 동일함 . limit 안해도됨
//		IntStream intStream3 = new Random().ints(5,9); // ints에 매개변수 숫자 2개 넣으면 5<= x < 9 사이의 임의의숫자만 나옴. 대신 무한스트림이라 limit 다시 넣어줘야함 
		IntStream intStream3 = new Random().ints(10,5,9); // ints에 매개변수 숫자 3개 넣으면 맨앞은 limit와 같은  기능임
		intStream3.
//		limit(5).
		forEach(System.out::println);
		
		
		System.out.println(" ========= 람다식 스트림 =======");
		Stream<Integer> intStream4 = Stream.iterate(0, n -> n+2); // 짝수만출력 , 시작 speed(0)부분을 1로 바꾸면 홀수만 출력
		intStream4.limit(10).forEach(System.out::println);
		
		System.out.println();
		Stream<Integer> intStream5 = Stream.generate(()->1);
		intStream5.limit(10).forEach(System.out::println);
		
		
	}

}

