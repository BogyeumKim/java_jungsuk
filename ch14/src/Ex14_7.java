import java.io.File;
import java.util.Arrays;
import java.util.stream.Stream;

public class Ex14_7 {

	public static void main(String[] args) {
		Stream<String[]> strArrStrm = Stream.of(new String[] {"abc","def","jkl"},new String[] {"ABC","DEF","JKL"});
		
		Stream<String> strStrm = strArrStrm.flatMap(Arrays::stream);
		
		strStrm.map(String::toLowerCase)
			.distinct()
			.sorted()
			.forEach(System.out::println);
		
		System.out.println();
		
		String[] lineArr = {
				"Hi my name is chobo",
				"How are you?"
		};
		
		Stream<String> lineStream = Arrays.stream(lineArr);
		lineStream.flatMap(l -> Stream.of(l.split(" +")))
			.map(String::toLowerCase)
			.distinct()
			.sorted()
			.forEach(System.out::println);
		
		System.out.println();
		
	}
}

