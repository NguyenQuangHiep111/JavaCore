package day_06.classroom;

import day_06.classroom.model.Person;

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Hiệp");
        p.setAge(21);
        p.setAddres("Hà Nội");
        System.out.println(p.getName() +" "+p.getAge()+" "+p.getAddres());
    }


}
