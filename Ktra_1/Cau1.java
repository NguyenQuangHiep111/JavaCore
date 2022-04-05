package Ktra_1;

public class Cau1 {
    public static void main(String[] args) {
        System.out.println("Hình vuông");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("* \t");
            }
            System.out.println();
        }

        System.out.println("Hình tam giác");
        for (int i = 1; i <= 4; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("Hình tam giác 2");
        int k = 0;
        for (int i = 1; i <= 4; ++i, k = 0) {
            for (int space = 1; space <= 4 - i; ++space) {
                System.out.print("  ");
            }
            while (k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }
            System.out.println();
        }
    }
}

