package day_04.classroom.demo_method;

import java.util.Scanner;

public class Caculator {
    public void sum(){
        Scanner sc= new Scanner(System.in);
        System.out.println("nhập a :");
        int a= sc.nextInt();

        System.out.println("nhập b :");
        int b= sc.nextInt();

        int c = a+b;
        System.out.println("tổng : "+ c);
    }

    public void minus(int a , int b){
        System.out.println("Trừ :"+ (a-b));

    }
}
