import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Ex14_5 {

	public static void main(String[] args) {
		Stream<Student> studentStream = Stream.of(
				new Student("이씨", 3, 300),
				new Student("김씨", 2, 200),
				new Student("안씨", 2, 100),
				new Student("박씨", 1, 150),
				new Student("소씨", 3, 290),
				new Student("유씨", 3, 180)
				);
		
		studentStream.sorted(
				Comparator.comparing(Student::getBan) // 반별 정렬 , 반 역순하려면 뒤에 .reversed()
				.thenComparing(Comparator.naturalOrder())) // 기본정렬 , 마찬가지로 역순 reversed
				.forEach(System.out::println);
	}

}

class Student implements Comparable<Student>{
	String name;
	int ban;
	int totalScore;
	
	public Student(String name, int ban, int totalScore) {
		this.name = name;
		this.ban = ban;
		this.totalScore = totalScore;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", ban=" + ban + ", totalScore=" + totalScore + "]";
	}
	
	public String getName() {
		return name;
	}

	public int getBan() {
		return ban;
	}

	public int getTotalScore() {
		return totalScore;
	}

	@Override
	public int compareTo(Student o) { // Comparable은 compareTo를 꼭 오버라이딩해야함.
		return o.totalScore - this.totalScore; // 총점 내린차순을 기본 정렬
	}
	
	
}

