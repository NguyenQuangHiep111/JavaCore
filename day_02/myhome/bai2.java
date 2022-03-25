package day_02.myhome;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
//        2, Viết chương trình giới thiệu bản thân gồm các thông tin họ tên, tuổi,
//        giới tính, địa chỉ, với các thông tin cá nhân được nhập vào từ bàn phím
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập họ tên : ");
        String hoTen = sc.nextLine();
        System.out.println("Mời bạn nhập tuổi :");
        int tuoi = sc.nextInt();
        sc.nextLine();
        System.out.println("Mời bạn nhập giới tính : ");
        String gioiTinh = sc.nextLine();
        System.out.println("Mời bạn nhập địa chỉ :");
        String diaChi = sc.nextLine();
        System.out.println("Kết quả bạn vừa nhập là :");
        System.out.println("Họ và tên :"+hoTen);
        System.out.println("Tuổi : "+ tuoi);
        System.out.println("Giới tính :"+gioiTinh);
        System.out.println("Địa chỉ : "+ diaChi);
//        System.out.println("Chào tất cả các bạn , tôi tên là : "+hoTen + ",năm nay tôi : "+tuoi + ",tôi giớ tính : "+
//                gioiTinh + ",nhà tôi ở : "+diaChi);
    }
}
