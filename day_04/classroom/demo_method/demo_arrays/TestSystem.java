package day_04.classroom.demo_method.demo_arrays;

import java.util.Arrays;

public class TestSystem {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 7;
        arr[2] = 8;
        arr[3] = 2;
        arr[4] = 3;

        System.out.println("Số phần tử có trong mảng : " + arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("Dùng foeach");
        for (int i :arr){
            System.out.println(i);
        }

        Arrays.sort(arr);
        System.out.println("mảng sau khi sắp xếp ");
        for (int i :arr){
            System.out.println(i);
        }

        int []coppy = Arrays.copyOf(arr,10);
        System.out.println("mảng sao chép : ");
        for (int i : coppy){
            System.out.println(i);
        }

//        //tìm phần tử có index = 8
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == 8) {
//                System.out.println("index :" + i);
//            }
//        }
//        //Số lượng phần tử chẵn
//        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 == 0) {
////                System.out.println("Số lượng số chẵn là :" + i);
//                count++;
//            }
//        }
//        System.out.println("số phần tử chia hết cho 2 là: " + count);
//
//        //Tìm mảng lớn nhất và mảng nhỏ nhất
//        int max = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (max < arr[i]) {
//                max = arr[i];
//            }
//        }
//        System.out.println("Phần tử lớn nhất là :" + max);
//
//        //Sắp xếp tăng dần
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] > arr[j]) {
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        System.out.println("Mảng sau khi sắp xếp : ");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + "\t" + "\n");
//        }
//
//        //cắt chuỗi
//        String str = "nó chỉ dừng vòng lặp bên trong đó ";
//        String[] s = str.split("\\s");
//        System.out.println("Trong chuỗi có bao nhiêu phần tử : " + s.length);
//        for (int i = 0; i < s.length; i++) {
//            System.out.println(s[i]);
//        }
        ////////////////////////////////////////

        //////////////////////////////////////////

//        String[] languages = new String[5];
//        languages[0] = "java";
//        languages[1] = "html";
//        languages[4] = "js";
//        languages[2] = "php";
//        languages[3] = "ruby";
//
//        for (int i = 0; i < languages.length; i++) {
//            System.out.println(languages[i]);
//        }
//
//        //////////////////////////////////
//        String[] name = {"Hiep", "Nghia", "Dat"};
//        for (int i = 0; i < name.length; i++) {
//            System.out.println(name[i]);
//        }
//        /////////////////////////////////
//        //nhập mảng từ bàn phím
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập số phần tử mảng :");
//        int n = sc.nextInt();
//
//        double[] points = new double[n];
//        for (int i = 0; i < n; i++) {
//            System.out.printf("nhập phần tử thứ %d :", (i + 1));
//            points[i] = sc.nextDouble();
//        }
//
//        for (int i = 0; i < n; i++) {
//            System.out.print(points[i] + "\t");
//        }

        ///////////////////////////////////////////////////
    }
}
