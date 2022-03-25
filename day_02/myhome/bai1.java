package day_02.myhome;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
//        1, Viết chương trình tính chu vi và diện tích của hình chữ nhật với chiều dài
//        và chiều rộng nhập vào từ bàn phím
        Scanner sc = new Scanner(System.in);
        float dai, rong;
        System.out.println("Mời bạn nhập chiều dài của hình chữ nhật :");
        dai= sc.nextFloat();
        System.out.println("Mời bạn nhập chiều rông của hình chữ nhật :");
        rong= sc.nextFloat();
        float chuVi= (dai+rong)*2;
        float dienTich= dai*rong;
        System.out.println("Chu Vi của hình chữ nhật là : "+chuVi);
        System.out.println("Diện tích của hình chữ nhật là : "+dienTich);


    }
}
