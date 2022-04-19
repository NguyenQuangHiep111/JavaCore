package day_05.home.QLNV.model;

public class Book {
    public int id, publishingYear;
    public String title, description, author, category;

    @Override
    public String toString() {
        return "ID sách: " + id + " - Tên sách: " + title + " - Mô tả: " + description +
                " - Thể loại: " + category + " - Tác giả: " + author + " - Năm xuất bản: " + publishingYear;
    }

//    public void showBook(){
//        System.out.println("ID sách: " + id + " - Tên sách: " + title + " - Mô tả: " + description +
//                " - Thể loại: " + category + " - Tác giả: " + author + " - Năm xuất bản: " + publishingYear);
//    }
}
