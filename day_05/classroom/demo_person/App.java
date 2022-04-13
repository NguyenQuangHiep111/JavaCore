package day_05.classroom.demo_person;

import day_05.classroom.demo_person.model.Student;
import day_05.classroom.demo_person.service.StudentService;

public class App {
    public static void main(String[] args) {
//        Student s1 = new Student();
//
//        // gọi tới phương thúc nhập dữ liệu
//        s1.input();
//
////        System.out.println(s1.avg());
//        // gọi tới phương thúc in dữ liệu
//        s1.output();
//        System.out.println(s1);

        // Sử dụng class StudentService
//        StudentService  service = new StudentService();
//        Student s3= service.createStudent();
//        System.out.println(s3);

        Student [] arrStudent = new Student[3];
        Student s= new Student(1,"Hiệp",8,8);
        arrStudent [0]= s;
        arrStudent[1]= new Student(2,"Nghĩa",7,8);
        arrStudent[2]= new Student(3,"Đạt",8,9);

        for (int i =0; i<arrStudent.length;i++){
            System.out.println(arrStudent[i]);
        }
        /////
        System.out.println("-------------------");
        for (Student student : arrStudent){
            System.out.println(student);
        }
        System.out.println("Tìm theo tên ");
        for (Student student : arrStudent){
            if (student.name.equalsIgnoreCase("Hiệp")){
                System.out.println(student);
            }
        }
//        name.contain
        System.out.println("Tìm  ");
        for (Student student : arrStudent){
            if (student.name.equalsIgnoreCase("Hiệp")){
                System.out.println(student);
            }
        }

    }
}
