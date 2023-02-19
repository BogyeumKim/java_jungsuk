package ch10;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ex10_27 {
    public static void main(String[] args) {
        LocalDate Year = LocalDate.parse("2023-02-20", DateTimeFormatter.ISO_LOCAL_DATE);

        LocalDate date = LocalDate.parse("2020-11-11");
        LocalTime time = LocalTime.parse("23:45:45");
        LocalDateTime dateTime = LocalDateTime.parse("2023-02-20T23:43:43");

        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime endOfYear = LocalDateTime.parse("2015-12-31 23:23:23", pattern);

        System.out.println(Year);
        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);
        System.out.println(endOfYear);
    }
}
