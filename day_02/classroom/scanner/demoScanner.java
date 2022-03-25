package day_02.classroom.scanner;

import java.util.Scanner;

public class demoScanner {
    public static void main(String[] args) {
        //Tạo đối tượng Scanner
        Scanner sc = new Scanner(System.in);
//        System.out.println("Mời bạn nhập tên :");
//        String name = sc.nextLine();
//        System.out.println("Mời bạn nhập tuổi :");
//        int age = sc.nextInt();
//        System.out.println(name + age);
//        System.out.println("Nhập điểm");
//        double diem = sc.nextDouble();
//        System.out.println(diem);
//        sc.nextLine();
        ///xử lí trôi lệnh
//      sc.nextLine();
//        double poin = Double.parseDouble(sc.nextLine());
//        System.out.println("Nhập địa chỉ :");
//        String address = sc.nextLine();
//        System.out.println(address);
//        String st = name.toUpperCase();
//        System.out.println(st);


        // tính bmi
        System.out.println("Mời nhập chiều cao :");
        double cao = sc.nextDouble();
        System.out.println("Mời nhập cân nặng :");
        double nang = sc.nextDouble();
        double bmi =nang/(cao*cao);
        System.out.println("Chỉ số BMI là :" + bmi);
    }
}
