package day_02.classroom;

import java.time.LocalDate;
import java.time.Month;
import java.util.Locale;

public class demo_String {
    public static void main(String[] args) {
        // sử dụng String Literal
        String name = "Hiep";
        String fullname = "hiep";

        String title="bbc";

        //sử dụng từ khóa new
        String address = new String("Hà Nội");
        System.out.println("tôi tên là : "+name);
        System.out.println("nhà tôi ở :"+address);

        int size = name.length();
        System.out.println("Chuỗi "+ name +" dài"+size);

        System.out.println("độ dài chuỗi : " + address + " là : "+address.length());

        System.out.println("Tên in hoa là : "+ name.toUpperCase());
        System.out.println("Tên in thường là : "+ name.toLowerCase());

        System.out.println("So sánh 2 chuỗi :"+name.equals(address));

        String result = name.equals(address)? "hai chuoi giong nhau" : "Hai chuỗi khác nhau";
        System.out.println(result);

        System.out.println("so sánh k phân biệt hoa thường : "+ name.equalsIgnoreCase(fullname));

        String str = "       Java          ";
        System.out.println("Chuỗi ban đầu : "+ str);

        System.out.println("chuỗi sau khi bỏ khoảng trắng : "+str.trim());

        System.out.println("Thay thế chữ j thành p " + str.replace('J','p'));

        System.out.println(str.contains("a"));

        System.out.println("Kí tự ô nằm ở index bao nhiêu : "+ address.indexOf("i"));

        System.out.println("chữ ở index đầu tiên : "+address.charAt(0));

        System.out.println("Lấy ra chuỗi con : " +address.substring(4));
        System.out.println(" chuỗi con : " +address.substring(3,5));

        String namefull = "hiep";
        String temp= String.valueOf(namefull.charAt(0));
        String rs = temp.toUpperCase()+fullname.substring(1).toLowerCase();
        System.out.println(rs);
        System.out.println(temp.toUpperCase()+namefull.substring(1));


        Season muadong= Season.WINTER;
        System.out.println(muadong);

        Month thangHai= Month.FEBRUARY;
        System.out.println(thangHai);



    }
}
