package day_03.classroom;

import java.util.Scanner;

public class baiTapVongLap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;

        do {
            System.out.println("Nhập a");
            a = sc.nextInt();
        } while (a == 0);

        System.out.println("Nhập b");
        int b = sc.nextInt();

        System.out.println("Nhập c");
        int c = sc.nextInt();

        double delta = b * b - 4 * a * c;

        if (delta < 0) {
            System.out.println("Phương trình vô nghiệm!");
        } else if (delta == 0) {
            double x1 = -b / (2 * a);
            System.out.println("Phương trinh có 1 nghiệm là x1 = x2 = " + x1);
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phương trình có 2 nghiệm x1 = " + x1 + " và x2 = " + x2);
        }
    }
}
