package day_03.classroom;

import java.util.Scanner;

public class swichCasse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("nhập số : ");
//        int number = sc.nextInt();
//        switch (number){
//            case 2 :
//                System.out.println("Thứ 2");
//                break;
//            case 3 :
//                System.out.println("Thứ 3");
//                break;
//            case 4 :
//                System.out.println("Thứ 4");
//                break;
//            case 5 :
//                System.out.println("Thứ 5");
//                break;
//            case 6 :
//                System.out.println("Thứ 6");
//                break;
//            case 7 :
//                System.out.println("Thứ 7");
//                break;
//            case 8 :
//                System.out.println("Chủ nhật");
//                break;
//            case 9,10,11 :
//                System.out.println("abc");
//            default:
//                System.out.println("k có ngày này ");
//        }

        /// xem tháng bao nhiêu ngày
        System.out.println("nhập số : ");
        int number = sc.nextInt();
        switch (number) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("Tháng có 31 ngày");
                break;
            case 2:
                System.out.println("Tháng có 28 hoặc 29 ngày");
                break;
            case 4, 6, 9, 11:
                System.out.println("Tháng có 30 ngày");
                break;
            default:
                System.out.println("k có tháng này");
        }
    }
}
