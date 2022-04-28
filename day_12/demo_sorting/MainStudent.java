package day_11.demo_sorting;

import java.util.*;

public class MainStudent {
    public static void main(String[] args) {
        ArrayList<Student> list= new ArrayList<>();
//        list.add(new Student(1,"Hiệp","A1",10));
//        list.add(new Student(2,"Đạt","A2",9.8));
//        list.add(new Student(3,"Thiện","A10",1.2));
//        list.add(new Student(4,"Tú","A5",8));
//        list.add(new Student(5,"Nghĩa","A3",9.2));

        list.add(new Student(1,"a","A1",10));
        list.add(new Student(2,"b","A2",9.8));
        list.add(new Student(3,"c","A5",1.2));
        list.add(new Student(4,"d","A5",8));
        list.add(new Student(5,"e","A3",9.2));

        Map<String, Integer> map = new HashMap<>();
        for (Student s: list){
            if (map.containsKey(s.getClassRoom())){
                map.put(s.getClassRoom(),map.get(s.getClassRoom()) +1);

            }else {
                map.put(s.getClassRoom(),1);
            }
        }
        System.out.println(map);


//        System.out.println("Danh sách ban đầu : ");
//        for (Student s:list){
//            System.out.println(s);
//        }
//
//        System.out.println("Sắp xếp theo tên :");
//        Collections.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });
//        for (Student s:list){
//            System.out.println(s);
//        }
//
//        System.out.println("Sắp xếp theo điểm :");

//        Map <String,Integer> map = new HashMap<>();
//        for (Student s:list){
//            if (map.containsKey(s.getClassRoom())){
//                map.put(s.getClassRoom(),map.get(s.getClassRoom()+1));
//            }else {
//                map.put(s.getClassRoom(),1);
//            }
//        }
//        System.out.println(map);



    }
}
