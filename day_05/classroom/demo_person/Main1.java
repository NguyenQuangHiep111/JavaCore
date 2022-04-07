package day_05.classroom.demo_person;

import day_05.classroom.demo_person.model.Dog;

public class Main1 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.breed = "Neapolitan Mastiff";
        d.size = "Large";
        d.age = "5 year";
        d.color = "black";
        System.out.println(d.breed + d.size + d.age + d.color);


    }
}
