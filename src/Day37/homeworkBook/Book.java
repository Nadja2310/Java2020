package Day37.homeworkBook;

public class Book {
    String title;
    int year;
    String author;
    int page;
    String language;
    String genre;
    String library;
    String userBook="";
    String issueDate="";
    String returnDate="";
    int bookmark;

    public Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    public Book(String title, int year, String author, int page) {
        this.title = title;
        this.year = year;
        this.author = author;
        this.page = page;
    }

    public Book(String title, String author, int year, int page, String language) {
        this.title = title;
        this.year = year;
        this.author = author;
        this.page = page;
        this.language = language;
    }

    public Book(String title, String author, int year, int page, String language, int bookmark) {
        this.title = title;
        this.year = year;
        this.author = author;
        this.page = page;
        this.language = language;
        this.bookmark = bookmark;
    }

    public Book(String title, String author, int year, int page, String language, String genre) {
        this.title = title;
        this.year = year;
        this.author = author;
        this.page = page;
        this.language = language;
        this.genre = genre;
    }

    public Book(String title, int year, String author, String genre) {
        this.title = title;
        this.year = year;
        this.author = author;
        this.genre = genre;
    }

    public Book(String title, String author, int year, String library) {
        this.title = title;
        this.year = year;
        this.author = author;
        this.library = library;
    }

    public Book(String title, int year, String author, String library, String userBook) {
        this.title = title;
        this.year = year;
        this.author = author;
        this.library = library;
        this.userBook = userBook;
    }

    public Book(String title, String author, int year, int page, String library, String userBook, String issueDate, String returnDate) {
        this.title = title;
        this.year = year;
        this.author = author;
        this.page = page;
        this.library = library;
        this.userBook = userBook;
        this.issueDate = issueDate;
        this.returnDate = returnDate;
    }

    public Book(String title, String author, String userBook, String issueDate, String returnDate) {
        this.title = title;
        this.author = author;
        this.userBook = userBook;
        this.issueDate = issueDate;
        this.returnDate = returnDate;
    }

    public Book(String title, String author, String genre, String userBook, String issueDate, String returnDate) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.userBook = userBook;
        this.issueDate = issueDate;
        this.returnDate = returnDate;
    }
    public Book(String title, String author, int year, int page,String library,
                String userBook,String issueDate,String returnDate,String language) {
        this.title = title;
        this.year = year;
        this.author = author;
        this.page = page;
        this.library=library;
        this.userBook = userBook;
        this.issueDate = issueDate;
        this.returnDate = returnDate;
        this.language = language;
    }
    public void setBookmark(int bookmark) {
        if (bookmark > 0) {
            this.bookmark = bookmark;
        } else System.out.println("Вы забыли указать номер страницы!");
    }


    void setUserBook(String newUserBook) {
        this.returnDate = userBook;
    }

    void setReturnDate(String newReturnDate) {
        this.returnDate = newReturnDate;
    }

    void setIssueDate(String newIssueDate) {
        this.returnDate = newIssueDate;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setLibrary(String library) {
        this.library = library;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPage() {
        return page;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getLanguage() {
        return language;
    }

    public String getLibrary() {
        return library;
    }

    public String getUserBook() {
        return userBook;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public int getYear() {
        return year;
    }

    public int getBookmark() {
        return bookmark;
    }

    void displayInfo() {
        System.out.println("Author " + author + " title " + title);
        System.out.println(year + " year page " + page);
    }

    void checkOutTheBook() {
        if (!issueDate.isEmpty()) {
            System.out.println("Reading a book " + userBook);
            System.out.println("Return date " + returnDate);
        }
    }

}

/*
class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book("War and Peace", "Leo Tolstoi", 1800, 1215,
                "Library Berlin", "Ivanov", "02.11.2020", "30.11.2020");

        Book book2 = new Book("Pride and Prejudice", "Jane Austen", 1813, 367,
                "Library Berlin", "Petrov", "02.10.2020", "30.10.2020");
        Book book3 = new Book("Anna Karenina", "Leo Tolstoi",
                1878, 864, "Library Berlin", "Petrov", "02.10.2020", "30.10.2020");
        Book book4 = new Book("The Master and Margarita", " Mikhail Bulgakov",
                1966, 480, "Library Berlin", "Katz", "02.10.2020", "30.10.2020");
        Book book5 = new Book("Dead Souls", "Nikolai Gogol",
                1842, 612,"Library Berlin","","","", "russian");
        Book book6 = new Book("Romeo and Juliet", "William Shakespeare",
                1599, 700, "Library Berlin","","","","english");
        Book book7 = new Book("Jane Eyre", "Charlotte Brontë",
                1847, 553, "Library Berlin","","","","english");
        Book book8 = new Book("Hamlet", "William Shakespeare",
                1601, 713, "Library Berlin","","","","english");
        Book book9 = new Book("Divine Comedy", " Dante Alighieri",
                1321, 632,"Library Berlin","","","", "italian");
        Book book10 = new Book("The Adventures of Pinocchio", "Carlo Collodi",
                1883, 129, "Library Berlin","","","","italian");


        Book[] arrayBook = new Book[]{book1, book2, book3, book4, book5, book6, book7, book8, book9, book10};
        haveBooksInTheLibrary(arrayBook);

        System.out.println("В наше библиотеке есть книга ");
        for (int i = 0; i < arrayBook.length; i++) {
            if (arrayBook[i].getUserBook().isEmpty()) {
                System.out.println(arrayBook[i].getTitle()
                        + "  автор  " + arrayBook[i].getAuthor());
            }
        }
    }
}*/
