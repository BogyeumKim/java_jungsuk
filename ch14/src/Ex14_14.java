import java.util.Collections;
import java.util.*;
import static java.util.stream.Collectors.*;
import java.util.stream.*;

public class Ex14_14 {
    public static void main(String[] args) {
        Student14[] stuArr = { new Student14("이자바",3,300),
                new Student14("김자바",1,200),
                new Student14("안자바",2,100),
                new Student14("박자바",2,150),
                new Student14("소자바",1,200),
                new Student14("나자바",3,290),
                new Student14("감자바",3,180)
        };

        // 학생 이름만 뽑아서 List<String>에 저장
        List<String> name = Stream.of(stuArr).map(Student14::getName).collect(Collectors.toList());
        System.out.println(name);
        System.out.println("==================================");

        // 스트림을 배열로 변환
        Student14[] stuArr2 = Stream.of(stuArr).toArray(Student14[]::new);
        for (Student14 i : stuArr2) {
            System.out.println(i);
        }
        System.out.println("==================================");

        // 스트림을 Map<String, Student>로 변환. 학생 이름이 Key
        Map<String, Student14> stuMap = Stream.of(stuArr).collect(Collectors.toMap(s -> s.getName(), p -> p));
        for (String i : stuMap.keySet()) {
            System.out.println(i + "-" + stuMap.get(i));
        }
        System.out.println("==================================");

        long count = Stream.of(stuArr).collect(counting());
        long totalScroe = Stream.of(stuArr).collect(summingInt(Student14::getTotalScore));

        System.out.println("count = " + count);
        System.out.println("totalScore = " + totalScroe);
        System.out.println("==================================");

        totalScroe = Stream.of(stuArr).collect(reducing(0, Student14::getTotalScore, Integer::sum));
        System.out.println("totalScore = "+totalScroe);

        // Optional = null 회피하기위해
        Optional<Student14> topStudent = Stream.of(stuArr).collect(maxBy(Comparator.comparingInt(Student14::getTotalScore)));
        System.out.println("topStudent = " + topStudent);

        IntSummaryStatistics stat = Stream.of(stuArr).collect(summarizingInt(Student14::getTotalScore));
        System.out.println(stat);
        System.out.println("==================================");

        String stuNames = Stream.of(stuArr).map(Student14::getName).collect(joining(",","{","}"));
        System.out.println(stuNames);


    }
}

class Student14 implements Comparable<Student14> {
    String name;
    int ban;
    int totalScore;

    public Student14(String name, int ban, int totalScore) {
        this.name = name;
        this.ban = ban;
        this.totalScore = totalScore;
    }

    @Override
    public String toString() {
        return "Student14{" +
                "name='" + name + '\'' +
                ", ban=" + ban +
                ", totalScore=" + totalScore +
                '}';
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
    public int compareTo(Student14 o) {
        return o.totalScore - this.totalScore; // 내림차순
    }
}
