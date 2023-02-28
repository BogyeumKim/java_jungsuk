import java.util.Optional;
import java.util.OptionalInt;

public class Ex14_12 {
    public static void main(String[] args) {
        Optional<String> optStr = Optional.of("abcde");
        Optional<Integer> optInt = optStr.map(String::length);
        System.out.println("optStr = " + optStr.get());
        System.out.println("optInt = " + optInt.get());

        System.out.println("===============");

        int result1 = Optional.of("123").filter(x -> x.length() > 0).map(Integer::parseInt).get();
        int result2 = Optional.of("").filter(x -> x.length() > 0).map(Integer::parseInt).orElse(-1); // orElse는 반환값이 null또는 0일때 orElse의값으로 반환
        System.out.println("result1 = "+result1);
        System.out.println("result2 = "+result2);

        System.out.println("===============");

        //ifPresent는 옵셔녈 객체의 값이 null이면 false 아니면 true 반환
        Optional.of("456").map(Integer::parseInt).ifPresent(x -> System.out.printf("result3=%d%n", x));

        OptionalInt optInt1 = OptionalInt.of(0); // 0저장
        OptionalInt optInt2 = OptionalInt.empty(); // 빈객체 생성

        //ifPresent는 옵셔녈 객체의 값이 null이면 false 아니면 true 반환
        System.out.println(optInt1.isPresent()); // true
        System.out.println(optInt2.isPresent()); // false

        System.out.println(optInt1.getAsInt()); // 0
//        System.out.println(optInt2.getAsInt()); // NoSuchElement에러
        System.out.println("optInt1 = "+optInt1);
        System.out.println("optInt2 = "+optInt2);
        System.out.println("optInt1.equals(optInt2) ?" + optInt1.equals(optInt2));

        System.out.println("===============");

//        ofNullable은 값이 null일때 NullPoint 에러를 발생시키지 않음
        Optional<String> opt = Optional.ofNullable(null); // null저장
        Optional<String> opt2 = Optional.empty(); // 빈 객체 생성

        System.out.println("opt = " + opt);
        System.out.println("opt2 = " + opt2);
        System.out.println("opt.equals(opt2) ?" + opt.equals(opt2));

        System.out.println("===============");

        int result3 = optStrToInt(Optional.of("123"),0);
        int result4 = optStrToInt(Optional.of(""),0);

        System.out.println("result3 = "+result3);
        System.out.println("result4 = "+result4);
    }
    /*  출력결과
        optStr = abcde
        optInt = 5
        ===============
        result1 = 123
        result2 = -1
        ===============
        result3=0
        true
        false
        0
        optInt1 = OptionalInt[0]
        optInt2 = OptionalInt.empty
        optInt1.equals(optInt2) ?false
        ===============
        opt = Optional.empty
        opt2 = Optional.empty
        opt.equals(opt2) ?true
        ===============
        result3 = 123
        result4 = 0

        */

    static int optStrToInt(Optional<String> opt, int val) {
        try {
            return opt.map(Integer::parseInt).get();
        } catch (Exception e) {
            return val;
        }
    }
}
