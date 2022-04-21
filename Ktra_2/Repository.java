package Ktra_2;
import java.util.ArrayList;
public class Repository {
    public static ArrayList<Account> getData() { //khởi tạo phương thức mới
        ArrayList<Account> listAcc = new ArrayList<>();
        listAcc.add(new Account("hiepnq", "NguyenQuangHiep@123", "hiep2001@gmail.com"));

        return listAcc;
    }
}
