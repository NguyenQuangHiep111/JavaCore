package day_05.classroom.demo_person;

import day_05.classroom.demo_person.model.Student;

public class App {
    public static void main(String[] args) {
        Student s1 = new Student();

        // gọi tới phương thúc nhập dữ liệu
        s1.input();

//        System.out.println(s1.avg());
        // gọi tới phương thúc in dữ liệu
        s1.output();
        System.out.println(s1);
    }
}
