package Ktra_1;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Cau6 {
    public static void main(String[] args) {
        String sdt = getSDT1();
        String mail = getMail();
        System.out.println("SĐT bạn nhập là : " + sdt);
        System.out.println("Email bạn nhập là : " + mail);
    }

    public static String getSDT1() {
        Scanner sc = new Scanner(System.in);
        String sdt = "";
        while (true) {
            System.out.println("Mời bạn nhập sdt");
            sdt = sc.nextLine();
            Pattern p = Pattern.compile("0[0-9]{9,10}");
            if (p.matcher(sdt).find()) {
                System.out.println("Đúng định dạng SĐT");
                break;
            } else {
                System.err.println("Sai định dạng SĐT");
            }
        }
        return sdt;
    }

    public static String getMail() {
        Scanner sc = new Scanner(System.in);
        String mail = "";
        while (true) {
            System.out.println("Mời bạn nhập email");
            mail = sc.nextLine();

            Pattern p = Pattern.compile("\\w+@\\w+(\\.\\w){1,2}");
//            Pattern p = Pattern.compile("^[a-zA-Z] [a-zA-Z0-9]+@[a-zA-Z]+(\\.[a-zA-Z]+) {1,3}$");
            if (p.matcher(mail).find()) {
                System.out.println("Đúng định dạng email");
                break;
            } else {
                System.out.println("Sai định dạng email");
            }
        }
        return mail;
    }
}
