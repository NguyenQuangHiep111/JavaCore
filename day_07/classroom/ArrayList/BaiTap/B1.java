package day_07.classroom.ArrayList.BaiTap;

import java.util.ArrayList;

public class B1 {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (int i=1;i<=10;i++){
            integerArrayList.add(i);
        }
//        integerArrayList.add(1);
//        integerArrayList.add(2);
//        integerArrayList.add(3);
//        integerArrayList.add(4);
//        integerArrayList.add(5);
//        integerArrayList.add(6);
//        integerArrayList.add(7);
//        integerArrayList.add(8);
//        integerArrayList.add(9);
//        integerArrayList.add(10);
        System.out.println(integerArrayList);
        System.out.println("Các phần tử là biến chẵn :");
        int count = 0;
        for (int s : integerArrayList) {
            if (s % 2 == 0) {
                System.out.print(s + "\t");
                count++;
            }

        }
        System.out.println("\n Số lượng biến chẵn là : "+count);

    }
}
