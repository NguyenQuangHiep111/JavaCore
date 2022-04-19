package day_08.a.QuanLyNhanVien;

import day_07.classroom.ArrayList.BaiTap.Person;

import java.util.ArrayList;

public class QLNVService {
    public ArrayList<Employee> getAllEmployees(){
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee(1,"Hiệp","2001","Hà Nội","Nam","0943407266","hiep@gmail.com","1000"));
        list.add(new Employee(1,"Hiệp","2001","Hà Nội","Nam","0943407266","hiep@gmail.com","1000"));
        list.add(new Employee(1,"Hiệp","2001","Hà Nội","Nam","0943407266","hiep@gmail.com","1000"));
        list.add(new Employee(1,"Hiệp","2001","Hà Nội","Nam","0943407266","hiep@gmail.com","1000"));
        return list;
    }
    public void show(ArrayList<Employee> list){
        for(Employee p : list){
            System.out.println(p);
        }
    }
}
