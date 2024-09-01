package test.java;

import main.java.Book;
import main.java.Library;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {

    @Test
    public void testAddBook() {
        Library library = new Library();
        Book book = new Book("1234567890", "The Great Gatsby", "F. Scott Fitzgerald", 1925);
        library.addBook(book);
        assertTrue(library.getBooks().contains(book));
    }

    @Test
    public void testBorrowBook() throws Exception {
        Library library = new Library();
        Book book = new Book("1234567890", "The Great Gatsby", "F. Scott Fitzgerald", 1925);
        library.addBook(book);

        library.borrowBook("1234567890");

        assertTrue(book.isBorrowed());
    }

    @Test
    public void testBorrowUnavailableBook() {
        Library library = new Library();
        Book book = new Book("1234567890", "The Great Gatsby", "F. Scott Fitzgerald", 1925);
        library.addBook(book);

        assertThrows(Exception.class, () -> {
            library.borrowBook("1234567890");
            library.borrowBook("1234567890");
        });
    }

}
