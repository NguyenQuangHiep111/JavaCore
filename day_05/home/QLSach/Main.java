package day_05.home.QLSach;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        System.out.println("Nhập số lượng sách: ");
        int n = sc.nextInt();

        Book[] arrBooks = new Book[n];
        BookService bookService = new BookService();
        do {
            menu();
            int choose = sc.nextInt();
            sc.nextLine();
            switch (choose) {
                case 1:
                    for (int i = 0; i < n; i++) {
                        arrBooks[i] = bookService.input();
                    }
                    break;
                case 2:
                    bookService.getAllBook(arrBooks);
                    break;
                case 3:
                    System.out.println("Nhập tên sách muốn tìm: ");
                    String findTitle = sc.nextLine();
                    bookService.findBooksByTitle(arrBooks, findTitle);
                    break;
                case 4:
                    System.out.println("Nhập thể loại sách muốn tìm: ");
                    String findCategory = sc.nextLine();
                    bookService.findBooksByCategory(arrBooks, findCategory);
                    break;
                case 5:
                    bookService.findBooksThisYear(arrBooks);
                    break;
                case 6:
                    System.out.println("Nhập tên nhà xuất bản cần tìm: ");
                    String findCompany = sc.nextLine();
                    bookService.findBooksByCompany(arrBooks, findCompany);
                    break;
                case 7:
                    bookService.sortBooksByYear(arrBooks);
                    break;
                case 0:
                    flag = false;
                    break;
                default:
                    System.out.println("Please reselect");
                    break;
            }
        } while (flag);
    }

    public static void menu() {
        System.out.println("====== Menu ======");
        System.out.println("1. Nhập danh sách các loại sách");
        System.out.println("2. Lấy thông tin toàn bộ sách");
        System.out.println("3. Tìm sách theo tên");
        System.out.println("4. Tìm sách theo thể loại");
        System.out.println("5. Tìm sách xuất bản trong năm nay");
        System.out.println("6. Tìm sách theo nhà xuất bản");
        System.out.println("7. Sắp xếp sách theo năm xuất bản");
        System.out.println("0. Exit");
    }
}
