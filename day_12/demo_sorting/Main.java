package day_11.demo_sorting;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList <Integer>  numbers= new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(1);
        numbers.add(9);
        numbers.add(7);

        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println("Danh sách sau khi sắp xếp tăng dần :");
        System.out.println(numbers);

//        System.out.println("Danh sách sau khi sắp xếp giảm dần :");
//        Collections.reverse(numbers);
//        System.out.println(numbers);

//        System.out.println("Danh sách sau khi sắp xếp radom :");
//        Collections.shuffle(numbers);
//        System.out.println(numbers);

        Collections.swap(numbers,0,numbers.size()-1);
        System.out.println(numbers);


        ArrayList <String>  names= new ArrayList<>();
        names.add("Hoa");
        names.add("Tuấn");
        names.add("Quang");
        names.add("An ");
        names.add("Linh");
        names.add("Loan");
        names.add("Ân");
        System.out.println(names);

        Collections.sort(names);
        System.out.println(names);

    }
}
