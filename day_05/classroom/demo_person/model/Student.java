package day_05.classroom.demo_person.model;

import java.util.Scanner;

public class Student {
    //    id, tên, điểm lý
//    thuyết, điểm thực hành, trường
    public int id;
    public String name;
    public float theoryPoint;
    public float practicalPoint;
    public static String school = "Techmaster";

    public Student() {
    }

    public Student(int id, String name, float theoryPoint, float practicalPoint) {
        this.id = id;
        this.name = name;
        this.theoryPoint = theoryPoint;
        this.practicalPoint = practicalPoint;
    }
//    Tạo phương thức để nhập thông tin các học viên
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập id");
        this.id = Integer.parseInt(sc.nextLine());
        System.out.println("nhập tên :");
        this.name = sc.nextLine();
        System.out.println("nhập điểm lí thuyết ");
        this.theoryPoint = sc.nextFloat();
        System.out.println("nhập điểm thực hành ");
        this.practicalPoint = sc.nextFloat();
    }


    //    Tạo phương thức để tính điểm trung bình (biết điểm
//    trung bình = (điểm lý thuyết + điểm thực hành)/2
    public float avg() {
        float dtb = (this.theoryPoint + this.practicalPoint) / 2;
        return dtb;
    }

    //    Tạo phương thức để in thông tin ra màn hình
    public void output() {
        System.out.println(this.id + " - " +this.name + " - " +this.theoryPoint + " - " +this.practicalPoint + " - "+ avg());
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", theoryPoint=" + theoryPoint +
                ", practicalPoint=" + practicalPoint +
                '}';
    }
}
