package Ktra_2;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
//            ArrayList<Account> accounts = Repository.getData();
//            System.out.println("Thông tin tài khoản mới vừa đăng ký");
//            for (int i = 0; i < accounts.size(); i++) {
//                System.out.println(accounts.get(i));
//            }
            Controller controller = new Controller();
            controller.mainMenu();

    }
}
