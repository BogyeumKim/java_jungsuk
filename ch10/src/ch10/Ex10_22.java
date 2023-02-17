package ch10;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Ex10_22 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now(); // 오늘 날짜
        LocalTime now = LocalTime.now(); // 오늘 시간

        LocalDate birthDate = LocalDate.of(1995, 11, 24); // of 는 날짜관련 set 기능
        LocalTime birthTime = LocalTime.of(04, 26, 22);

        System.out.println("오늘 : " + today);
        System.out.println("현재시간 : " + now);
        System.out.println("내 생일 : " + birthDate);
        System.out.println("태어난 시간 : " + birthTime);

        System.out.println(birthDate.withYear(2000)); // brithDate 년도를 2000로
        System.out.println(birthDate.plusDays(1)); // 생일에서 1일 추가
        System.out.println(birthDate.plus(1, ChronoUnit.DAYS)); // 위와 동일



    }
}
