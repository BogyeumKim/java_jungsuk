import java.util.Arrays;
import java.util.stream.Stream;

public class Ex14_11 {
    public static void main(String[] args) {
        Stream<String[]> strArrStrm = Stream.of(new String[]{"abc", "def", "jkl"}, new String[]{"ABC", "GHI", "JKL"});

        Stream<String> strStrm = strArrStrm.flatMap(Arrays::stream); // 배열을 변환시에는 Map이아닌 flatMap 기억하자

        strStrm.map(String::toLowerCase).distinct().sorted().forEach(System.out::println);
        System.out.println();

        String[] lineArr = {"Believe or not It is true", " Do or do not There is no try"};

        Stream<String> lineStream = Arrays.stream(lineArr);
        lineStream.flatMap(l -> Stream.of(l.split(" +"))).map(String::toLowerCase).distinct().sorted().forEach(System.out::println);
        System.out.println();

        Stream<String> strStrm1 = Stream.of("AAA", "ABC", "bBb", "Dd");
        Stream<String> strStrm2 = Stream.of("bbb", "aaa", "ccc", "dd");

        Stream<Stream<String>> strStrmStrm = Stream.of(strStrm1, strStrm2);
        Stream<String> strStream = strStrmStrm.map(s -> s.toArray(String[] ::new)).flatMap(Arrays::stream);
        strStream.map(String::toLowerCase).distinct().forEach(System.out::println);

        }

    }

