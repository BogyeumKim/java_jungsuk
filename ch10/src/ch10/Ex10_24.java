package ch10;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

import static java.time.DayOfWeek.*;

class DayAfterTomorrow implements TemporalAdjuster {
    @Override
    public Temporal adjustInto(Temporal temp) {
        return temp.plus(2, ChronoUnit.DAYS);
    }

}
class Ex10_24 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate date = today.with(new DayAfterTomorrow());

        System.out.println(today); // 오늘
        System.out.println(date);
        /*
        DayAfterTomorrow 클래스에서 구현한 adjustInto로 인해 2일 추가된 날짜가 나옴.
        TemproalAdjuster가 인터페이스니까 오버라이드 하며 사용됨
        with()는 Temproal temp 참조타입에서 temp를 반환하며 자동으로 adjustInto 메서드가 사용됨
         */

        System.out.println(today.with(TemporalAdjusters.firstDayOfNextMonth())); //  다음달의 첫날
        System.out.println(today.with(TemporalAdjusters.firstDayOfMonth())); // 이달의 첫날
        System.out.println(today.with(TemporalAdjusters.lastDayOfMonth())); // 이달 마지막날
        System.out.println(today.with(TemporalAdjusters.firstInMonth(TUESDAY))); // DayofWeek. * 임포트해주자. 이달의 첫번째 화요일
        System.out.println(today.with(TemporalAdjusters.lastInMonth(TUESDAY))); // 이달의 마지막 화요일
        System.out.println(today.with(TemporalAdjusters.previous(TUESDAY))); // 지난 주 화욜
        System.out.println(today.with(TemporalAdjusters.previousOrSame(TUESDAY))); // 지난 주 화욜 ( 오늘 포함 )
        System.out.println(today.with(TemporalAdjusters.next(TUESDAY))); // 다음주 화욜
        System.out.println(today.with(TemporalAdjusters.nextOrSame(TUESDAY))); // 다음주 화욜 ( 오늘 포함 )
        System.out.println(today.with(TemporalAdjusters.dayOfWeekInMonth(4,TUESDAY))); // 이달의 4번째 화욜

    }
}
