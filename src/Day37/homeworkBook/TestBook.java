package Day37.homeworkBook;

import java.util.Arrays;

public class TestBook {
    public static void main(String[] args) {
        Book book1 = new Book("War and Peace", "Leo Tolstoi", 1800, 1215,
                "Library Berlin", "Ivanov", "02.11.2020", "30.11.2020");
        Book book2 = new Book("Pride and Prejudice", "Jane Austen", 1813, 367,
                "Library Berlin", "Petrov", "02.10.2020", "30.10.2020");
        Book book3 = new Book("Anna Karenina", "Leo Tolstoi",
                1878, 864, "Library Berlin", "Petrov", "02.10.2020", "30.10.2020");
        Book book4 = new Book("The Master and Margarita", "Mikhail Bulgakov",
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
        Book book10 = new Book("The Adventures of Pinocchio", "Carlo Collodi", 1883, 129, "italian");

        Library myLib = new Library(20);
        myLib.addBook(book1);
        myLib.addBook(book2);
        myLib.addBook(book3);
        myLib.addBook(book4);
        myLib.addBook(book5);
        myLib.addBook(book6);
        myLib.addBook(book7);
        myLib.addBook(book8);
        //Book[] arrayBook = new Book[]{book1, book2, book3, book4, book5, book6, book7, book8, book9, book10};

        myLib.haveBooksInTheLibrary();
        myLib.inputBookmark(book2, 25);
        myLib.getBookRead(book10, "Malinkin", "04.11.2020", "10.12.2020");
        myLib.printArray();
        System.out.println("______________insertionSort_________________");
        myLib.insertionSort();
        myLib.printArray();
        System.out.println("______________BinarySearch__________________");
        System.out.println(myLib.iterativeBinarySearch(book5));
        System.out.println(myLib.iterativeBinarySearch(book10));


    }
}
