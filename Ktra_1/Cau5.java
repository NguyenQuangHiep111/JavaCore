package Ktra_1;

import java.util.Scanner;

public class Cau5 {
    public static void main(String[] args) {
//        Tạo mảng 2 chiều với số dòng và cột nhập vào từ bàn phím. Thực hiện:
//        Nhập các phần tử mảng
//        In thông tin mảng ra màn hình
//        Liệt kê các phần tử nằm trên đường chéo chính
//        Tạo thêm 1 mảng hai chiều có cùng số dòng và số cột thực hiện cộng hai mảng với

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số hàng: ");
        int h = sc.nextInt();
        System.out.println("Nhập số cột: ");
        int c = sc.nextInt();

        int[][] arr = new int[h][c];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Nhập phần tử ở vị trí [" + i + "," + j + "]: ");
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Gtri của ma trận 1: ");
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.print("\n");
        }

        //ĐƯỜNG CHÉO CHÍNH
        System.out.println("\nCác phần tử trên đường chéo chính của ma trận 1: ");
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < c; j++) {
                if (i == j) {
                    System.out.print(arr[i][j] + "\t");
                }
            }
        }

        //CỘNG 2 MẢNG:

        System.out.println("\n\nNhập giá trị cho ma trận thứ 2");
        int[][] arr2 = new int[h][c];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Nhập phần tử ở vị trí [" + i + "," + j + "]: ");
                arr2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Gtri của ma trận thứ 2: ");
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr2[i][j] + "\t");
            }
            System.out.print("\n");
        }


        int[][] result = new int[h][c];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < c; j++) {
                result[i][j] = arr[i][j] + arr2[i][j];
            }
        }

        System.out.println("\nTổng 2 ma trận: ");
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(result[i][j] + "\t");
            }
            System.out.print("\n");
        }


    }

}

