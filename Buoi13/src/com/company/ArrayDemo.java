package com.company;

public class ArrayDemo {
    public static void main(String[] args) {
        String[] sArr = {"a", "b", "c", "d"};
        showSArr(sArr);

        int[] iArr = {1, 2, 3, 4, 5};
        showIArr(iArr);

        Double[] dArr = {1.3, 4.5, 9d, 3.4};
        showArr(dArr);
    }

    public static void showSArr(String[] arr) {
        for (String s : arr) {
            System.out.println(s);
        }
    }

    public static void showIArr(int[] arr) {
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static <E> void showArr(E[] arr) {
        for (E e : arr) {
            System.out.println(e);
        }


    }
}
