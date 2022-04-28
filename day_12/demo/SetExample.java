package day_11.demo;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetExample {
    public static void main(String[] args) {
        HashSet <Integer> hashSet = new HashSet<>();
        hashSet.add(5);
        hashSet.add(7);
        hashSet.add(6);
        hashSet.add(1);
        hashSet.add(9);
        hashSet.add(5);
        System.out.println(hashSet);

        //duy trì thứ tự
        LinkedHashSet <Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(5);
        linkedHashSet.add(1);
        linkedHashSet.add(4);
        linkedHashSet.add(8);
        linkedHashSet.add(7);
        linkedHashSet.add(5);
        System.out.println(linkedHashSet);
    }
}
