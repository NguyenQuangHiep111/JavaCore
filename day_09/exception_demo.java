package day_09;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exception_demo {
    public static void main(String[] args) {
//        int a = 0;
//        int b = 5;
//        try {
//            int c = b / a;
//            System.out.println(c);
//        }catch (Exception e){
//            System.out.println("Bạn đang chia 1 số cho 0");
//        }
//        System.out.println("done");

       Scanner sc = new Scanner(System.in);
//        boolean flag= true;
//        while (flag){
//            try {
//                System.out.println("nhập tuổi : ");
//                int age = Integer.parseInt(sc.nextLine());
//                System.out.println("Tuổi của bạn là : "+age);
//                flag= false;
//            } catch (NumberFormatException e){
//                System.out.println("Bạn phải nhập số !");
//                System.out.println("Mời bạn nhập lại ");
//            }finally {
//                System.out.println("Khối này luôn đc thực thi ");
//            }
//
//        }

//        int[] arr = new int[-1];
////        arr[10] = 8;
        boolean flag = true;
        while (flag){
            try {
                System.out.println("Nhập số  phần tử :");
                int n = Integer.parseInt(sc.nextLine());
                int[] arr= new int[n];
                flag= false;
            }catch (NumberFormatException e){
                System.out.println("Nhập sai kiểu dữ liệu");
                System.out.println(e.getMessage());
            }catch (NegativeArraySizeException e){
                System.out.println("Kích thước mảng k đc âm");
            }
        }


    }
}
