package day_05.classroom.demo_person.model;

public class Person {
    //Tạo thuộc tính
    public String name;
    public int age;
    public String address;
    public static String school = "Techmaster";

    //Contructor mặc định
    public Person() {
        System.out.println("Gọi tới contructor mặc định");
    }

    //Contructor có tham số
    public Person(String ten, int tuoi, String diachi) {
        name = ten;
        age = tuoi;
        address = diachi;
    }

    //Phương thức
    public void study() {
        System.out.println(name + "Gọi tới phương thức study()");
    }

    public static void methor(){
        System.out.println("Phương thức static");
    }
    static {
        System.out.println("Khối static");
    }
}

