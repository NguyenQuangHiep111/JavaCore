package day_07.classroom.ArrayList.BT1;

import day_07.classroom.ArrayList.BaiTap.Person;

import java.util.ArrayList;

public class StoreService {
    public ArrayList<Store> getAllStore(){
        ArrayList<Store> list = new ArrayList<>();
//        list.add(new Store(1,"SP1",);
//        list.add(new Person(1,"Huy", 28, "Hà Nội"));
//        list.add(new Person(2,"Quang", 20, "Hà Nội"));
//        list.add(new Person(3,"Thịnh", 24, "Hà Nội"));
//        list.add(new Person(4,"Linh", 27, "Hà Nội"));

        return list;
    }

    public void show(ArrayList<Person> list){
        for(Person p : list){
            System.out.println(p);
        }
    }
}
