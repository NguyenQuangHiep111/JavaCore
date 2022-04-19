package day_07.classroom.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>();

        ArrayList<Integer> intList = new ArrayList<>();

        ArrayList<Double> doubleList = new ArrayList<>();

        ArrayList<Character> charList = new ArrayList<>();

         // ArrayList = new ArrayList();
        //Thêm phần tử vào Arraylist
        strList.add("Java");
        strList.add("HTML");
        strList.add("CSS");
        for (String s: strList){
            System.out.println(s);
        }

        // Sắp xếp
        Collections .sort(strList);
        System.out.println("Danh sách sau khi sắp xếp : ");
        for (String s: strList){
            System.out.println(s);
        }

        System.out.println("Phần tử có index = 2 : " + strList.get(2));

        for (int i = 0 ; i < strList.size();i++){
            if (strList.get(i).contains("H")){
                System.out.println("Tìm chữ H : "+strList.get(i));
            }
        }

        System.out.println(strList.contains("java"));

        ArrayList<String> strList2 = new ArrayList<>();

        strList2.add("C++");
        strList2.add("PHP");
        strList2.addAll(strList);
        System.out.println(strList2);

//        strList.set(1,"MySQL");
//        System.out.println("Danh sách sau khi cập nhật : ");
//        for (String s: strList){
//            System.out.println(s);
//        }
//
//        strList.remove("Java");
//        System.out.println("Danh sách sau khi xóa Java : ");
//        for (String s: strList){
//            System.out.println(s);
//        }
//
//        strList.remove(1);
//        System.out.println("Danh sách sau khi xóa inde x=1 : ");
//        for (String s: strList){
//            System.out.println(s);
//        }
//
//        System.out.println("Số phần tử :");


    }
}
