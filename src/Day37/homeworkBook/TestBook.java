package Day37.homeworkBook;

import java.time.LocalDate;

public class TestBook {
    public static void main(String[] args) {
        Book book1 = new Book("War and Peace", "Leo Tolstoi", 1800, 1215, Genre.CLASSIC, Cover.POCKET, "russian");
        Book book2 = new Book("Pride and Prejudice", "Jane Austen", 1813, 367, Genre.CLASSIC, Cover.HARD, "russian");
        Book book3 = new Book("Anna Karenina", "Leo Tolstoi", 1878, 864, Genre.CLASSIC, Cover.HARD, "russian");
        Book book4 = new Book("The Master and Margarita", "Mikhail Bulgakov", 1966, 480, Genre.DRAMA, Cover.HARD, "russian");
        Book book5 = new Book("Dead Souls", "Nikolai Gogol", 1842, 612, Genre.SATIRE, Cover.EBOOK, "russian");
        Book book6 = new Book("Romeo and Juliet", "William Shakespeare", 1599, 700, Genre.SATIRE, Cover.POCKET, "english");
        Book book7 = new Book("Jane Eyre", "Charlotte Brontë", 1847, 553, Genre.NOVEL, Cover.HARD, "english");
        Book book8 = new Book("Hamlet", "William Shakespeare", 1601, 713, Genre.DRAMA, Cover.HARD, "english");
        Book book9 = new Book("Divine Comedy", " Dante Alighieri", 1321, 632, Genre.CLASSIC, Cover.EBOOK, "italian");
        Book book10 = new Book("The Adventures of Pinocchio", "Carlo Collodi", 1883, 129, Genre.CHILDRENS, Cover.HARD, "italian");
        book1.setLibrary("Library Berlin");
        book2.setLibrary("Library Berlin");

        Library myLib = new Library(20);
        myLib.addBook(book1);
        myLib.addBook(book2);
        myLib.addBook(book3);
        myLib.addBook(book4);
        myLib.addBook(book5);
        myLib.addBook(book6);
        myLib.addBook(book7);
        myLib.addBook(book8);
        myLib.addBook(book9);
        myLib.addBook(book10);
        // myLib.inputBookmark(book2, 25);

        myLib.setTakenToReadBook(book1, "Ivanov",
                LocalDate.of(2020, 11, 2),
                LocalDate.of(2020, 11, 30));
        myLib.setTakenToReadBook(book5, "Petrov",
                LocalDate.of(2020, 11, 2),
                LocalDate.of(2020, 11, 30));
        myLib.setTakenToReadBook(book10, "Malinkin",
                LocalDate.of(2020, 11, 4),
                LocalDate.of(2020, 12, 18));
        //myLib.haveBooksInTheLibrary();
        myLib.displayBooksByAuthor("William shakespeare");
        myLib.displayBooksByCover(Cover.HARD);
        myLib.displayBooksByGenre(Genre.CLASSIC);
    }
}
