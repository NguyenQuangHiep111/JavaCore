package day_02.classroom;

public class PrintData {
    public static void main(String[] args) {

        System.out.print("Xin chào");
        System.out.print("các bạn");

        System.out.println("Xin chào");
        System.out.println("các bạn");

        String name= "Hiep";
        int age = 26;
        String address = "HN";

        System.out.printf("Xin chào các bạn , tôi tên là : %s, " +
                "năm nay tôi : %d, tôi đến từ %s",name,age,address);

        System.out.printf("\n%f + %f = %f", 8.5,9f,(8.5+9));
    }
}
