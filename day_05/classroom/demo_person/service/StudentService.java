package day_05.classroom.demo_person.service;

import day_05.classroom.demo_person.model.Student;

import java.util.Scanner;
//Class này sử dụng để xử lí các phương thức với Student
public class StudentService {
    //Tạo đối tượng với Contrutor mặc định
    public Student createStudent(){
        Scanner sc= new Scanner(System.in);
        Student s = new Student();
        System.out.println("nhập id");
        s.id = Integer.parseInt(sc.nextLine());
        System.out.println("nhập tên :");
        s.name = sc.nextLine();
        System.out.println("nhập điểm lí thuyết ");
        s.theoryPoint = sc.nextFloat();
        System.out.println("nhập điểm thực hành ");
        s.practicalPoint = sc.nextFloat();
        return s;
    }
// tạo đối tượng với Contructor có tham số
    public Student createNewStudent(){
        Scanner sc= new Scanner(System.in);
        System.out.println("nhập id");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("nhập tên :");
        String name = sc.nextLine();
        System.out.println("nhập điểm lí thuyết ");
        float theoryPoint = sc.nextFloat();
        System.out.println("nhập điểm thực hành ");
        float practicalPoint = sc.nextFloat();

        Student  s = new Student(id,name,theoryPoint,practicalPoint);
        return s;
    }

}
