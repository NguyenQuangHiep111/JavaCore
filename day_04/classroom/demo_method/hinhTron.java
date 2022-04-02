package day_04.classroom.demo_method;

import java.util.Scanner;

public class hinhTron {
    public void DienTich(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập bán kính ");
        double r = sc.nextDouble();
        double dt = (r*r)*3.14;
        System.out.println("diện tích là : "+dt);

    }

    public void ChuVi(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập bán kính ");
        double r = sc.nextDouble();

        double cv = (2*r)*3.14;
        System.out.println("chu vi  là : "+cv);
    }
}
