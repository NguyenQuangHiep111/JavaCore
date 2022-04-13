package day_06.classroom;

import day_06.classroom.model.NhanVien;

import java.util.Scanner;

public class NhanVienService {
    public NhanVien inputNhanVien(){
        Scanner sc= new Scanner(System.in);
        NhanVien nv1= new NhanVien();
        NhanVien nv = new NhanVien();
        System.out.println("Nhập id: ");
        nv.setID(sc.nextInt());sc.nextLine();
//        nv.setID() = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên: ");
        nv.setName(sc.nextLine());
        System.out.println("Nhập sinh nhật: ");
        nv.setBirthday(sc.nextInt());sc.nextLine();
        System.out.println("Nhập địa chỉ: ");
        nv.setAddress(sc.nextLine());
        System.out.println("Nhập email: ");
        nv.setAddress(sc.nextLine());
//        nv.setName(); = sc.nextLine();


        return nv;
    }

    // In thông tin các sách
//    public void showBook(Book[] arrBook){
//        System.out.println("Thông tin sách:");
//        for(Book i : arrBook){
//            System.out.println(i);
//        }

}
