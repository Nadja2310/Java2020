package Day37.homeworkBook;


import java.time.LocalDate;

public class Book {
    private static int exemplar = 0;
    private String title;
    private int year;
    private String author;
    private int page;
    private String language;
    private Genre genre;
    private Cover cover;
    private String library;
    private String userBook;
    private LocalDate issueDate;
    private LocalDate returnDate;
    int bookmark;

    public static int getExemplar() {
        return exemplar;
    }

    public Book(String title, String author, int year, int page, Genre genre, Cover cover, String language) {
        this.title = title;
        this.year = year;
        this.author = author;
        this.page = page;
        this.language = language;
        this.genre = genre;
        this.cover = cover;
    }

    public void setLibrary(String library) {
        this.library = library;
    }

    public void setBookmark(int bookmark) {
        if (bookmark > 0) {
            this.bookmark = bookmark;
        } else System.out.println("Вы забыли указать номер страницы!");
    }

    public int getBookmark() {
        return bookmark;
    }

    public Genre getGenre() {
        return genre;
    }

    public Cover getCover() {
        return cover;
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

    public static void setExemplar(int exemplar) {
        Book.exemplar = exemplar;
    }

    public void setUserBook(String userBook) {
        this.userBook = userBook;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    void checkOutTheBook() {
        if (issueDate != null) {
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
