package day_05.classroom.demo_person;

import day_05.classroom.demo_person.model.Person;

public class Main {
    public static void main(String[] args) {
        //Tạo đối tượng p1
        Person p1 = new Person();
        p1.name = "Hiệp";
        p1.age = 21;
        p1.address = "Hà Nội";
        System.out.println(p1);
        System.out.println(p1.name + " - " + p1.age + " - " + p1.address+ " - " + Person.school);
        p1.study();
        Person.methor();


//        Person p2 = new Person();
//        p2.name = "Nghĩa";
//        p2.age = 20;
//        p2.address = "Hà Nam";
////        System.out.println(p1);
//        System.out.println(p2.name + " - " + p2.age + " - " + p2.address);
//        p2.study();
//
//        Person p3 = new Person("Tuan", 25, "Hà Nội");
//        System.out.println(p3.name + " - " + p3.age + " - " + p3.address);
//        System.out.println("Cập nhật tuổi");
//        p3.age = 56;
//        System.out.println(p3.name + " - " + p3.age + " - " + p3.address);

    }
}
