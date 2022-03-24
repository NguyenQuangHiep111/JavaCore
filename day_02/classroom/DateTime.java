package day_02.classroom;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateTime {
    public static void main(String[] args) {
        LocalDate toDay = LocalDate.now();
        System.out.println(toDay);


        LocalDate curentDate = LocalDate.of(2021,10,5);
        System.out.println(curentDate);

        System.out.println(toDay.getDayOfMonth());
        System.out.println(toDay.getDayOfWeek());
        System.out.println(toDay.getDayOfYear());

        System.out.println(toDay.getMonth());
        System.out.println(toDay.getMonthValue());

        System.out.println(toDay.plusDays(1));
        System.out.println(toDay.minusDays(1));


        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalTime currenttime = LocalTime.of(12,30);

    }
}
