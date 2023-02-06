import java.io.File;
import java.util.stream.Stream;

public class Ex14_6 {

	public static void main(String[] args) {
		File[] fileArr = { new File("Ex1.java") , new File("Ex1.bak") , new File("Ex2.java") , new File("Ex1") , new File("Ex1.txt") };
		
		Stream<File> fileStream = Stream.of(fileArr);
		
		// map()으로 Stream<File>을 Stream<String>으로 변환
//		Stream<String> filenameStream = fileStream.map(File::getName); // 메서드 참조
		Stream<String> filenameStream = fileStream.map((f)->f.getName()); //람다식
		filenameStream.forEach(System.out::println);; // 모든 파일 이름 출력
		
		fileStream = Stream.of(fileArr); // 최종연산 끝나고 다시 스트림 생성해야함
		
		fileStream.map(File::getName)
			.filter(s -> s.indexOf('.')!=-1) // 확장자 없는것 제외
			.peek(s->System.out.printf("filename=%s%n",s))
			.map(s -> s.substring(s.indexOf('.')+1)) // 확장자만 추출
			.peek(s->System.out.printf("filename=%s%n",s))
			.map(String::toUpperCase) // 모두 대문자 변환
			.peek(s->System.out.printf("filename=%s%n",s))
			.distinct() // 중복 제거
			.forEach(System.out::print);
		
		System.out.println();

	}
}

