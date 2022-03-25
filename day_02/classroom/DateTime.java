package day_02.classroom;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main(String[] args) {
        LocalDate toDay = LocalDate.now();
        System.out.println(toDay);


        LocalDate curentDate = LocalDate.of(2021, 10, 5);
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

        LocalTime currenttime = LocalTime.of(12, 30);
        System.out.println(currenttime);

        System.out.println(time.getHour());

        System.out.println(time.plusMinutes(300));


        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        LocalDateTime localDateTime = LocalDateTime.of(curentDate, currenttime);
        System.out.println(localDateTime);

        String fomat = "dd/MM/yyyy,hh:mm";
        DateTimeFormatter myformat = DateTimeFormatter.ofPattern(fomat);
        String rs = dateTime.format(myformat);
        System.out.println(rs);


        String name = "Nguyễn Quang Hiệp";
        String month = "01/05/2001";
        String address= "Long Biên";
        System.out.println("Xin chào, tôi tên là :"+name+",tôi sinh ngày :"+month+",tôi đến từ :"+address);

    }
}
