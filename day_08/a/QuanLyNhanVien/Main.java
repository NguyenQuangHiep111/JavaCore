package day_08.a.QuanLyNhanVien;

import day_07.classroom.ArrayList.BaiTap.Person;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        QLNVService qlnvService = new QLNVService();
        ArrayList<Employee> list = qlnvService.getAllEmployees();
        qlnvService.show(list);
    }
}
