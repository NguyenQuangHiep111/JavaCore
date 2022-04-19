package day_08.a;

public class Student extends  Person{

    private float point;

    public Student() {
    }

    @Override
    public void show() {

    }


    public Student(int id, String name, String address, float point) {
        super(id, name, address);
        this.point = point;
    }

    public float getPoint() {
        return point;
    }

    public void setPoint(float point) {
        this.point = point;
    }
}
