package Ktra_1;

public class Cau2 {
    public static void main(String[] args) {
        System.out.println("Câu 2");
        String str = "You only live once, but if you do it right, once is enough";
        System.out.println("Số từ có trong chuỗi: " + countWord(str));
        countCharater(str);
    }

    public static int countWord(String str) {
        String[] arr = str.split(" ");
        return arr.length;
    }

    //Đếm ký tự 'o' và lấy ra index
    public static void countCharater(String str) {
        int count = 0;
        System.out.print("Index của ký tự 'o': ");
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'o') { //charAt(i) lấy ra ký tự ở index i
                count++;
                System.out.print(i + ", ");
            }
        }
        System.out.println("\nSố lần ký tự 'o' xuất hiện là: " + count);
    }
}
