import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PersonMain {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Hiệp",21,"Hà Nội"));
        people.add(new Person("Dũng",21,"Hà Nội"));
        people.add(new Person("Hòa",21,"Hà Nội"));
        people.add(new Person("Đạt",21,"Hà Nội"));
        people.add(new Person("Nghĩa",21,"Hà Nội"));
        people.add(new Person("Đăng",21,"Hà Nội"));
        people.add(new Person("Nhân",21,"Hà Nội"));

      //sắp xếp theo tên
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        for (Person p : people){
            System.out.println(p.getName()+" - "+p.getAge()+" - "+p.getAddress());
        }
        System.out.println("///lambda");
        ///lambda
        people.sort((p1,p2) ->{
            return p1.getName().compareTo(p2.getName());
        });
        people.forEach(p -> System.out.println(p.getName()+" - "+p.getAge()+" - "+p.getAddress()));
        //list.forEach((n)->System.out.print(n+"\t"));


    }
}
