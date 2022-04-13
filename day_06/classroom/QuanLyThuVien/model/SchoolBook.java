package day_06.classroom.QuanLyThuVien.model;

public class SchoolBook extends Library {
    private int SoTrang;
    private String TinhTrang;
    private int SoLuongmuon;

    public SchoolBook() {
    }

    public SchoolBook(int maSach, String tenSach, String nhaXuatBan, int namXuatBan, int soLuong, int soTrang, String tinhTrang, int soLuongmuon) {
        super(maSach, tenSach, nhaXuatBan, namXuatBan, soLuong);
        SoTrang = soTrang;
        TinhTrang = tinhTrang;
        SoLuongmuon = soLuongmuon;
    }

    public int getSoTrang() {
        return SoTrang;
    }

    public void setSoTrang(int soTrang) {
        SoTrang = soTrang;
    }

    public String getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        TinhTrang = tinhTrang;
    }

    public int getSoLuongmuon() {
        return SoLuongmuon;
    }

    public void setSoLuongmuon(int soLuongmuon) {
        SoLuongmuon = soLuongmuon;
    }
}
