package day_05.classroom.demo_person.model;

public class Dog {
    //Tạo thuộc tính
    public String breed;
    public String size;
    public String age;
    public String color;

    public Dog() {

    }

    public Dog(String breed, String size, String age, String color) {
        this.breed = breed;
        this.size = size;
        this.age = age;
        this.color = color;
    }

    public void eat(){
        System.out.println("eat");
    }
    public void sleep(){
        System.out.println("sleep");
    }
    public void run(){
        System.out.println("run");
    }
}
