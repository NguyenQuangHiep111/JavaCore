package day_04.classroom.demo_method;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // tạo đối tượng
        //<tên class> <Tên biến tham chiếu> = new <Tên class>
//        Caculator caculator = new Caculator();
//        //Gọi phương thức sum
//        caculator.sum();
//        //Gọi phương thức minus
//        caculator.minus(12,9);

        Bmi bmi = new Bmi();
        bmi.bmiCaculator();
        bmi.bmiCaculator2(1.5, 40);

        Scanner sc = new Scanner(System.in);
        System.out.println("nhập chiều cao : ");
        double cao = sc.nextDouble();
        System.out.println("nhập cân nặng : ");
        double nang = sc.nextDouble();


        double bmiResult = bmi.bmiCaculator3(cao, nang);
        System.out.println("Chỉ số bmi : " + bmiResult);

//        bmi.result(bmiResult);
        System.out.println(bmi.result(bmiResult));



    }
}
