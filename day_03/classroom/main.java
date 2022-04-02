package day_03.classroom;

public class main {
    public static void main(String[] args) {
//// câu lệnh if else
        int a = 17;
        int b = 17;

        //System.out.println(a > b);
        if (a < b) {
            System.out.println("a nhỏ hơn b");
        }else if (a>b){
            System.out.println("a lớn hơn b");
        }else{
            System.out.println("a bằng b");
        }

        //lồng các câu lệnh if else
        if (a<b){
            System.out.println("a nhỏ hơn b");
        }else{
            if (a==b){
                System.out.println("a bằng b");
            }
        }
        //bmi <18.5 => gầy
        //bmi >=18.5 && bmi <=24.9 => bình thường
        //bmi >=25 => béo


    }
}
