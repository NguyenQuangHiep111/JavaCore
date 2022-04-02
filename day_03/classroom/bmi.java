package day_03.classroom;

import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
        //bmi <18.5 => gầy
        //bmi >=18.5 && bmi <=24.9 => bình thường
        //bmi >=25 => béo

        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập chiều cao :");
//        double cao = sc.nextDouble();
//        System.out.println("Nhập cân nặng :");
//        double nang = sc.nextDouble();
//        double bmi = nang/(cao*cao);
//
//        if (bmi<18.5){
//            System.out.println("Gầy");
//        }else if (bmi >=18.5 && bmi <=24.9){
//            System.out.println("Bình thường");
//        }else {
//            System.out.println("Thùa cân");
//        }
        // kiểm tra có phải tam giác hay k
        System.out.println("nhập cạnh a :");
        double a = sc.nextDouble();
        System.out.println("nhập cạnh b :");
        double b = sc.nextDouble();
        System.out.println("nhập cạnh c :");
        double c = sc.nextDouble();

        if (a+b > c && a+c>b && b+c >a){
            System.out.println("là tam giác");
        }else{
            System.out.println("k là tam giác");
        }
    }
}
