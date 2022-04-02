package day_04.classroom.demo_method;

public class Bmi {
    public void bmiCaculator() {
        double height = 1.5;
        double weight = 40;

        double bmi = weight / (height * height);
        System.out.println("Chỉ số bmi : " + bmi);
    }

    public void bmiCaculator2(double height, double weight) {
        double bmi = weight / (height * height);
        System.out.println("Chỉ số bmi : " + bmi);
    }

    public double bmiCaculator3 (double height, double weight){
        double bmi = weight / (height * height);
        return bmi;
    }

//    public void result(double bmi ){
//        if (bmi<18.5){
//            System.out.println("gầy");
//        }else if (bmi >= 18.5 && bmi <= 24.5){
//            System.out.println("bình thường");
//        }else {
//            System.out.println("béo");
//        }
//
//    }


    public String result(double bmi ){
        String rs = "";
        if (bmi<18.5){
            rs = "gầy";
        }else if (bmi >= 18.5 && bmi <= 24.5){
            rs= "bình thường ";
        }else {
            rs= "béo";
        }
        return rs;

    }
}
