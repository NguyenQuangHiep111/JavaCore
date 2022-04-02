package day_03.classroom;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        Random rd = new Random();
        int randomNumber = rd.nextInt(100);
        System.out.println("Số ngẫu nhiên là : " + randomNumber);
        boolean isCheck = true;
        while (isCheck){
            Scanner sc = new Scanner(System.in);
            System.out.println("Mời bạn nhập số : ");
            int so = sc.nextInt();
            if (so > randomNumber){
                System.out.println("số lớn hơn rồi cho nhập lại : ");
            }else if (so <randomNumber){
                System.out.println("số nhỏ hơn rồi cho nhập lại :");
            }else {
                System.out.println("bạn đã nhập đúng");
                isCheck = false;
            }

        }


//        boolean isCheck = true;
//        while (isCheck) {
//            int randomNumber = rd.nextInt(100);
//            System.out.println("Số ngẫu nhiên là : " + randomNumber);
//
//            if (randomNumber > 90) {
//                isCheck = false;
//            }
//        }

//Viết chương trình sinh 1 số ngẫu nhiên từ 0 -> 100 rdNumber . Thực hiện nhập 1 số từ bàn phím number
        //So sánh hai số rdNumber với number
        // nếu number > rdNumber -> Bjan nhập số lớn hơn rồi , cho nhập lại
        // nếu number < rdNumber -> Bjan nhập số nhỏ hơn rồi , cho nhập lại
        // nếu number == rdNumber -> Chúc mừng bạn nhập đúng rồi
    }
}
