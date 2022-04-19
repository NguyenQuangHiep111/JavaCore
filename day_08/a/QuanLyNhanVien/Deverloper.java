package day_08.a.QuanLyNhanVien;

public class Deverloper extends Employee {

    private String ot;

    public Deverloper() {
    }

    public Deverloper(int id, String name, String dob, String address, String gender, String mobie, String email, String salary, String ot) {
        super(id, name, dob, address, gender, mobie, email, salary);
        this.ot = ot;
    }

    public String getOt() {
        return ot;
    }

    public void setOt(String ot) {
        this.ot = ot;
    }
}
