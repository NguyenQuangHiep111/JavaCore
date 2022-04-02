package day_03.classroom;

import java.util.Scanner;

public class vongLap {
    public static void main(String[] args) {
//        for (int i = 1; i <= 10; i++) {
//            System.out.println("Xin chào các bạn lần : "+i);
//        }
// vòng lặp for (biết số lần lặp)
//        for (int i = 10; i >=0; i--) {
//           if (i % 2 ==0) {
//               System.out.println(i);
//           }
//        }

// vòng lặp while ( chưa biết số lần lặp)
//        int i = 0;
//        while (i < 10){
//            System.out.println("xin chào");
//            i++;
//        }

//        Scanner sc = new Scanner(System.in);
//        int age = 0;
//        int count = 0;
//        boolean isContinue = true;
//        while (isContinue) {
//            System.out.println("Nhập tuổi");
//            age = sc.nextInt();
//            count++;
//
//            if (age > 0) {
//                isContinue = false;
//            }
//            if (count >= 3) {
//                System.out.println("bạn nhập quá nhiều");
//                System.exit(0);
//            }
//        }
//        System.out.println("Tuổi của bạn là : " + age);

//        int i =11 ;
//        do {
//            System.out.println("xin chào ");
//            i++;
//        }while (i<10);


//        for (int i = 1; i < 101; i++) {     ///
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("Fizz Buzz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else {
//                System.out.println(i);
//            }
//        }


        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                if (i % 5 == 0) {
                    System.out.println("Fizz Buzz");
                } else {
                    System.out.println("Fizz");
                }
            } else {
                if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }
        }

    }
}
