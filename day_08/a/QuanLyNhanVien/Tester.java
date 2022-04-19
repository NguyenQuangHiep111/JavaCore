package day_08.a.QuanLyNhanVien;

public class Tester extends Employee {

    private String bug;

    public Tester() {
    }

    public Tester(int id, String name, String dob, String address, String gender, String mobie, String email, String salary, String bug) {
        super(id, name, dob, address, gender, mobie, email, salary);
        this.bug = bug;
    }

    public String getBug() {
        return bug;
    }

    public void setBug(String bug) {
        this.bug = bug;
    }
}
