package Day37.homeworkBook;


public class TestBook {
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
                1842, 612, "Library Berlin", "", "", "", "russian");
        Book book6 = new Book("Romeo and Juliet", "William Shakespeare",
                1599, 700, "Library Berlin", "", "", "", "english");
        Book book7 = new Book("Jane Eyre", "Charlotte Brontë",
                1847, 553, "Library Berlin", "", "", "", "english");
        Book book8 = new Book("Hamlet", "William Shakespeare",
                1601, 713, "Library Berlin", "", "", "", "english");
        Book book9 = new Book("Divine Comedy", " Dante Alighieri",
                1321, 632, "Library Berlin", "", "", "", "italian");
        Book book10 = new Book("The Adventures of Pinocchio", "Carlo Collodi",
                1883, 129,"italian");


        Book[] arrayBook = new Book[]{book1, book2, book3, book4, book5, book6, book7, book8, book9, book10};

        haveBooksInTheLibrary(arrayBook);
        inputBookmark(book2, 25);
        getBookRead(book10, "Malinkin", "04.11.2020", "10.12.2020");
    }

    public static void getBookRead(Book inputBook, String userName, String issueDate, String returnDate) {
        inputBook.setUserBook(userName);
        inputBook.setIssueDate(issueDate);
        inputBook.setReturnDate(returnDate);
    }

    public static void inputBookmark(Book inputBook, int page) {
        inputBook.setBookmark(page);
        System.out.println("закладка на стр. " + inputBook.getBookmark());
    }

    public static void haveBooksInTheLibrary(Book[] arrayBook) {
        System.out.println("В наше библиотеке есть в наличие ");
        for (int i = 0; i < arrayBook.length; i++) {
            if (arrayBook[i].getUserBook().isEmpty()) {
                System.out.println(arrayBook[i].getTitle()
                        + "  автор  " + arrayBook[i].getAuthor());
            }
        }
    }
}
