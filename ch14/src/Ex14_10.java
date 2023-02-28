import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex14_10 {
    public static void main(String[] args) {
        Student14_10[] stuArr = { new Student14_10("이자바",3,300),
                                    new Student14_10("김자바",1,200),
                                    new Student14_10("안자바",2,100),
                                    new Student14_10("박자바",2,150),
                                    new Student14_10("소자바",1,200),
                                    new Student14_10("나자바",3,290),
                                    new Student14_10("감자바",3,180)
                                    };

        Stream<Student14_10> stuStream = Stream.of(stuArr);
        stuStream.sorted(Comparator.comparing(Student14_10::getBna)
                .thenComparing(Comparator.naturalOrder())).forEach(System.out::println);

        stuStream = Stream.of(stuArr); // 최종연산후 다시 생성해줘야함
        IntStream stuScoreStream = stuStream.mapToInt(Student14_10::getTotalScore);

        IntSummaryStatistics stat = stuScoreStream.summaryStatistics(); // IntSummary 사용시 스트림 다시생성해줄필요가없음
        System.out.println("cout = " + stat.getCount());
        System.out.println("sum = " + stat.getSum());
        System.out.printf("average = %.2f%n", stat.getAverage());
        System.out.println("min = " + stat.getMin());
        System.out.println("max = " + stat.getMax());

    }
}

class Student14_10 implements Comparable<Student14_10> {
    String name;
    int bna;
    int totalScore;

    public Student14_10(String name, int bna, int totalScore) {
        this.name = name;
        this.bna = bna;
        this.totalScore = totalScore;
    }

    @Override
    public String toString() {
        return "Student14_10{" +
                "name='" + name + '\'' +
                ", bna=" + bna +
                ", totalScore=" + totalScore +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getBna() {
        return bna;
    }

    public int getTotalScore() {
        return totalScore;
    }

    @Override
    public int compareTo(Student14_10 o) {
        return o.totalScore - this.totalScore;
    }
}
