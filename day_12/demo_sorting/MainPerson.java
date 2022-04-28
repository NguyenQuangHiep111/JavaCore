package day_11.demo_sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainPerson {
    public static void main(String[] args) {
        ArrayList<Person> list= new ArrayList<>();
        list.add(new Person("Linh",25,"HN"));
        list.add(new Person("Quân",24,"HN"));
        list.add(new Person("Hoa",20,"HN"));
        list.add(new Person("An",19,"HN"));
        list.add(new Person("Thủy",18,"HN"));

//        Collections.sort(list);
//        for (Person p : list){
//            System.out.println(p);
//        }
        // sắp xếp theo tên sử dụng Comparator
        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println("Danh sách sau khi sắp xếp tên :");
        for (Person p : list){
            System.out.println(p);
        }

        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        System.out.println("Danh sách sau khi sắp xếp tuổi :");
        for (Person p : list){
            System.out.println(p);
        }
    }
}
