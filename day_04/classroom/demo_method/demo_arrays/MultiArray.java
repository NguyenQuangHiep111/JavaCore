package day_04.classroom.demo_method.demo_arrays;

public class MultiArray {
    public static void main(String[] args) {
//        int[][] arr = new int[3][4];

        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println(args.length);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
