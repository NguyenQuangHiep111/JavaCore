package Ktra_1;

public class Cau4 {
    public static void main(String[] args) {
        System.out.println("Câu 4");
        printFirst10PrimeNumber(10);
        System.out.println();
        printPrimeNumberLessThan10(10);
    }
    //Liệt kê 10 số nguyên tố đầu tiên
    public static void printFirst10PrimeNumber(int n){
        int number = 0;
        int count = 0;
        System.out.printf("\n%d số nguyên tố đầu tiên là: ", n);
        while(count < n){
            if(Cau3.isPrimeNumber(number)){
                System.out.print(number + "\t");
                count++;
            }
            number++;

        }
    }


    //Liệt kê các số nguyên tố nhỏ hơn 10
    public static void printPrimeNumberLessThan10(int n){
        System.out.printf("Các số nguyên tố nhỏ hơn %d: ", n);
        for(int i = 0; i < n; i++){
            if(Cau3.isPrimeNumber(i)){
                System.out.print(i+"\t");
            }
        }
    }
}
