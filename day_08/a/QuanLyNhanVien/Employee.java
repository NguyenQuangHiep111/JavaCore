package day_08.a.QuanLyNhanVien;

public class Employee {
    private int id;
    private String name;
    private String dob;
    private String address;
    private String gender;
    private String mobie;
    private String email;
    private String salary;

    public Employee() {
    }

    public Employee(int id, String name, String dob, String address, String gender, String mobie, String email, String salary) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.gender = gender;
        this.mobie = mobie;
        this.email = email;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMobie() {
        return mobie;
    }

    public void setMobie(String mobie) {
        this.mobie = mobie;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
