package day_06.classroom.QuanLyThuVien.service;

import day_06.classroom.QuanLyThuVien.model.SchoolBook;

import java.util.Scanner;

public class QuanLyThuVienService {
    public SchoolBook input(){
        Scanner sc= new Scanner(System.in);
        SchoolBook s= new SchoolBook();

        System.out.println("nhập id");
        s.setMaSach(Integer.parseInt(sc.nextLine()));
        System.out.println("nhập tên sách :");
       s.setTenSach(sc.nextLine());

        return s;
    }
    public int tonKho(int soluong, int tonkho){
        return soluong-tonkho;
    }

    public void show (SchoolBook schoolBook){

    }


}
