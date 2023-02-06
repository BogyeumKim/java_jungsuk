import java.io.File;
import java.util.Arrays;
import java.util.stream.Stream;

public class Ex14_7 {

	public static void main(String[] args) {
		Stream<String[]> strArrStrm = Stream.of(new String[] {"abc","def","jkl"},new String[] {"ABC","DEF","JKL"});
		
		Stream<String> strStrm = strArrStrm.flatMap(Arrays::stream); // abc ,def 가 하나의 flatMap으로 하나의 Stream으로 모아짐
		
		strStrm.map(String::toLowerCase) // 소문자로 변경 
			.distinct() // 중복제거
			.sorted() // 정렬
			.forEach(System.out::println);
		
		System.out.println();
		
		String[] lineArr = {
				"Hi my name is chobo",
				"How are you?"
		};
		
		Stream<String> lineStream = Arrays.stream(lineArr); // 배열을 스트림으로 변환
		lineStream.flatMap(l -> Stream.of(l.split(" +"))) // flatMap split으로 공백 기준으로 다 가져옴
			.map(String::toLowerCase) // 소문자로
			.distinct() // 중복제거
			.sorted() // 순차정렬 abcd ... ~ 
			.forEach(System.out::println);
		
		System.out.println();
		
	}
}

