package day_05.classroom.demo_book;

import java.util.Scanner;

public class Book {
    public int id;
    public String title;
    public String description;
    public String author;
    public String category;
    public int publishingingYear;

    public Book() {
    }

    public Book(int id, String title, String description, String author, String category, int publishingingYear) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.author = author;
        this.category = category;
        this.publishingingYear = publishingingYear;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập id");
        this.id = Integer.parseInt(sc.nextLine());
        System.out.println("nhập tiêu đề ");
        this.title = sc.nextLine();
        System.out.println("nhập mô tả ");
        this.description = sc.nextLine();
        System.out.println("nhập tác giả  ");
        this.author = sc.nextLine();
        System.out.println("nhập thể loại  ");
        this.category = sc.nextLine();
        System.out.println("nhập năm xuất bản  ");
        this.publishingingYear = sc.nextInt();

    }
}
