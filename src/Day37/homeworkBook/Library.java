package Day37.homeworkBook;

import java.time.LocalDate;

public class Library {
    private Book[] books;
    private int size;

    public Library(int capacity) {
        books = new Book[capacity];
        size = 0;
    }

    public boolean addBook(Book newBook) {
        if (size < books.length) {
            books[size] = newBook;
            size++;
            return true;
        }
        return false;
    }

    public boolean deleteBookFromArray(Book newBook) {
        for (int i = 0; i < size; i++) {
            if (books[i].equals(newBook)) {
                books[i] = books[size - 1];
                books[size - 1] = null;
                size--;
                return true;
            }
        }
        return false;
    }

    public void printArray() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }

    public void haveBooksInTheLibrary() {
        System.out.println("В наше библиотеке есть в наличие ");
        for (int i = 0; i < size; i++) {
            if (books[i].getUserBook()==null) {
                System.out.println(books[i].getTitle()
                        + "  автор  " + books[i].getAuthor());
            }
        }
    }

    public void inputBookmark(Book inputBook, int page) {
        inputBook.setBookmark(page);
        System.out.println("закладка на стр. " + inputBook.getBookmark());
    }

    public void setTakenToReadBook(Book inputBook, String userName, LocalDate issueDate, LocalDate returnDate) {
        inputBook.setUserBook(userName);
        inputBook.setIssueDate(issueDate);
        inputBook.setReturnDate(returnDate);
    }

    public void insertionSort() {

        for (int i = 1; i < size; i++) {
            int location = i - 1;
            Book temp = books[i];
            while (location >= 0 && temp.getAuthor().compareTo(books[location].getAuthor()) < 0) {
                books[location + 1] = books[location];
                location = location - 1;
            }
            books[location + 1] = temp;
        }
    }

    public boolean iterativeBinarySearch(Book element) {
        int elementPosition = -1;
        int lowIndex = 0;
        int highIndex = size - 1;
        while (lowIndex <= highIndex) {
            int middleIndex = (lowIndex + highIndex) / 2;
            if (element.getAuthor().equals(books[middleIndex].getAuthor())) {
                elementPosition = middleIndex;
                break;
            } else if (element.getAuthor().compareTo(books[middleIndex].getAuthor()) < 0) {
                highIndex = middleIndex - 1;
            } else if (element.getAuthor().compareTo(books[middleIndex].getAuthor()) > 0) {
                lowIndex = middleIndex + 1;
            }
        }
        if (elementPosition != -1) {
            return true;
        }
        return false;
    }

    public void displayBooksByGenre(Genre genre) {
        System.out.println("Display books by genre - "+genre);
        for (int i = 0; i < size; i++) {
            if (books[i].getGenre() == genre) {
                System.out.println(books[i]);
            }
        }
    }

    public void displayBooksByAuthor(String author) {
        System.out.println("Display books by author - "+author);
        for (int i = 0; i < size; i++) {
            if (author.toLowerCase().equals(books[i].getAuthor().toLowerCase())) {
                System.out.println(books[i]);
            }
        }
    }

    public void displayBooksByCover(Cover cover) {
        System.out.println("Display books by cover - "+cover);
        for (int i = 0; i < size; i++) {
            if (books[i].getCover() == cover) {
                System.out.println(books[i]);
            }
        }
    }
}
