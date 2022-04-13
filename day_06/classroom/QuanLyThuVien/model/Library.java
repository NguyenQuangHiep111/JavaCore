package day_06.classroom.QuanLyThuVien.model;

public class Library {
    private int MaSach;
    private String TenSach;
    private String NhaXuatBan;
    private int NamXuatBan;
    private int SoLuong;

    public Library() {
    }

    public Library(int maSach, String tenSach, String nhaXuatBan, int namXuatBan, int soLuong) {
        MaSach = maSach;
        TenSach = tenSach;
        NhaXuatBan = nhaXuatBan;
        NamXuatBan = namXuatBan;
        SoLuong = soLuong;
    }

    public int getMaSach() {
        return MaSach;
    }

    public void setMaSach(int maSach) {
        MaSach = maSach;
    }

    public String getTenSach() {
        return TenSach;
    }

    public void setTenSach(String tenSach) {
        TenSach = tenSach;
    }

    public String getNhaXuatBan() {
        return NhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        NhaXuatBan = nhaXuatBan;
    }

    public int getNamXuatBan() {
        return NamXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        NamXuatBan = namXuatBan;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int soLuong) {
        SoLuong = soLuong;
    }
}
