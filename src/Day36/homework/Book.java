package Day36.homework;

public class Book {
    String title;
    int year;
    String author;
    int page;
    String library;
    String userBook;
    String issueDate;
    String returnDate;

    void displayInfo() {
        System.out.println("Author " + author + " title " + title);
        System.out.println(year + " year page " + page);
    }

    void givenToTheReader() {
        System.out.println("Return date " + returnDate);
    }

    void checkOutTheBook() {
        if (!issueDate.isEmpty()) {
            System.out.println("Reading a book " + userBook);
            System.out.println("Return date " + returnDate);
        }
    }
}

class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.title = "War and Peace 1";
        book1.author = "Tolstoi";
        book1.year = 1800;
        book1.page = 400;
        book1.library = "Library Berlin";
        book1.userBook = "Ivanov";
        book1.issueDate = "02.11.2020";
        book1.returnDate = "30.11.2020";
        book1.displayInfo();
        book1.checkOutTheBook();

        Book book2 = new Book();
        book2.title = "Pride and Prejudice";
        book2.author = "Jane Austen";
        book2.year = 1813;
        book2.page = 450;
        book2.displayInfo();
        book2.givenToTheReader();
    }
}