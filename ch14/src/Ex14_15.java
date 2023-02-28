import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class Ex14_15 {
    public static void main(String[] args) {
        Student14_15[] stuArr = {
                new Student14_15("나자바","man",1,1,300),
                new Student14_15("김지미","girl",1,1,250),
                new Student14_15("김자바","man",1,1,200),
                new Student14_15("이지미","girl",1,2,150),
                new Student14_15("남자바","man",1,2,100),
                new Student14_15("안지미","girl",1,2,100),
                new Student14_15("황지미","girl",1,3,50),
                new Student14_15("강지미","girl",1,3,150),
                new Student14_15("이자바","man",1,3,200),

                new Student14_15("나자바","man",2,1,300),
                new Student14_15("김지미","girl",2,1,250),
                new Student14_15("김자바","man",2,1,200),
                new Student14_15("이지미","girl",2,2,150),
                new Student14_15("남자바","man",2,2,100),
                new Student14_15("안지미","girl",2,2,100),
                new Student14_15("황지미","girl",2,3,50),
                new Student14_15("강지미","girl",2,3,150),
                new Student14_15("이자바","man",2,3,200)
        };

        System.out.println("1. 단순분할(성별로 분할)");

//        groupingBy는 Function , partitioningBy는 predicate로 Boolean타입만 가능 예제에서는 성별을 true false로 나누어 partitioningBy를 사용
        Map<String, List<Student14_15>> stuBySex = Stream.of(stuArr).collect(groupingBy(Student14_15::getsex));
        List<Student14_15> males = stuBySex.get("man");
        List<Student14_15> girls = stuBySex.get("girl");

        for(Student14_15 m : males) System.out.println(m);
        System.out.println("===============아래부터여자==============");
        for(Student14_15 g : girls) System.out.println(g);

        System.out.println("2. 단순분할 + 통계(성별 학생수) ");
        // counting()는 반환타입이 Long이며 sum이랑 똑같음
        Map<String, Long> stuNumBySex = Stream.of(stuArr).collect(groupingBy(Student14_15::getsex, counting()));

        System.out.println("남학생 수 :"+stuNumBySex.get("man"));
        System.out.println("여학생 수 :"+stuNumBySex.get("girl"));

        // Optional은 널 예외처리하기쉬운 클래스
        System.out.println("3. 단순분할 + 통계(성별 1등) ");
        Map<String, Optional<Student14_15>> topSocreBySex = Stream.of(stuArr).collect(groupingBy(Student14_15::getsex, maxBy(Comparator.comparingInt(Student14_15::getScore))));
        System.out.println("남학생 1등 : "+topSocreBySex.get("man"));
        System.out.println("여학생 1등 : "+topSocreBySex.get("girl"));

        // 일반 Student객체 제네릭타입으로 저장
        Map<String, Student14_15> topScoreBySex2 = Stream.of(stuArr).collect(groupingBy(Student14_15::getsex, collectingAndThen(maxBy(Comparator.comparingInt(Student14_15::getScore)), Optional::get)));
        System.out.println("남학생 1등 : "+topScoreBySex2.get("man"));
        System.out.println("여학생 1등 : "+topScoreBySex2.get("girl"));

        System.out.println("4. 다중분할(성별 불합격자, 100점이하)");
        // score<=100 같이 true,  false 불리언타입은 partitioningBy로 비교하며 Map 제네릭타입도 불리언으로 맞춰주자.
        Map<String, Map<Boolean, List<Student14_15>>> failedStuBySex = Stream.of(stuArr).collect(groupingBy(Student14_15::getsex, partitioningBy(s -> s.getScore() <= 100)));
        List<Student14_15> failedMan = failedStuBySex.get("man").get(true);
        List<Student14_15> failedGirl = failedStuBySex.get("girl").get(true);

        for(Student14_15 s : failedMan) System.out.println(s);
        for(Student14_15 s : failedGirl) System.out.println(s);
    }
}

class Student14_15 {
    String name;
    String sex;
    int hak;
    int ban;
    int score;

    public Student14_15(String name, String sex, int hak, int ban, int score) {
        this.name = name;
        this.sex = sex;
        this.hak = hak;
        this.ban = ban;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public String getsex() {
        return sex;
    }

    public int getHak() {
        return hak;
    }

    public int getBan() {
        return ban;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Student14_15{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", hak=" + hak +
                ", ban=" + ban +
                ", score=" + score +
                '}';
    }
}
enum Level { 상,중,하 }
