package day_06.classroom.model;

public class NhanVien {
    private int ID;
    private String name;
    private int birthday;
    private String address;
    private String email;
    private int probile;

    public NhanVien() {
    }

    public NhanVien(int ID, String name, int birthday, String address, String email, int probile) {
        this.ID = ID;
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.email = email;
        this.probile = probile;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getProbile() {
        return probile;
    }

    public void setProbile(int probile) {
        this.probile = probile;
    }
}
