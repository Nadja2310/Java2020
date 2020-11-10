package Day37.homeworkBook;

public class Book {
    private static int exemplar = 0;
    String title;
    int year;
    String author;
    int page;
    String language;
    String genre;
    String library;
    String userBook = "";
    String issueDate = "";
    String returnDate = "";
    int bookmark;

/*public Book(){
    this("Azbuka","Marschak",123);
exemplar++;
}*/

    public static int getExemplar() {
        return exemplar;
    }

    public Book(String title, String author, int year, int page, String language) {
        this.title = title;
        this.year = year;
        this.author = author;
        this.page = page;
        this.language = language;
    }

    public Book(String title, int year, String author, int page) {
        this.title = title;
        this.year = year;
        this.author = author;
        this.page = page;
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

    public Book(String title, String author, String genre, String userBook, String issueDate, String returnDate) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.userBook = userBook;
        this.issueDate = issueDate;
        this.returnDate = returnDate;
    }

    public Book(String title, String author, int year, int page, String library,
                String userBook, String issueDate, String returnDate, String language) {
        this.title = title;
        this.year = year;
        this.author = author;
        this.page = page;
        this.library = library;
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

    public int getBookmark() {
        return bookmark;
    }

    public String getUserBook() {
        return userBook;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setUserBook(String userBook) {
        this.userBook = userBook;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    void checkOutTheBook() {
        if (!issueDate.isEmpty()) {
            System.out.println("Reading a book " + userBook);
            System.out.println("Return date " + returnDate);
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", author='" + author + '\'' +
                ", page=" + page +
                '}';
    }
}
