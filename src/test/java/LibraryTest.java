package test.java;

import main.java.Book;
import main.java.Library;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

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

    @Test
    public void testReturnBook() throws Exception {
        Library library = new Library();
        Book book = new Book("1234567890", "The Great Gatsby", "F. Scott Fitzgerald", 1925);
        library.addBook(book);
        library.borrowBook("1234567890");

        library.returnBook("1234567890");

        assertFalse(book.isBorrowed());
    }

    @Test
    public void testViewAvailableBooks() throws Exception {
        Library library = new Library();
        Book book1 = new Book("1234567890", "The Great Gatsby", "F. Scott Fitzgerald", 1925);
        Book book2 = new Book("0987654321", "1984", "George Orwell", 1949);
        library.addBook(book1);
        library.addBook(book2);
        library.borrowBook("1234567890");

        List<Book> availableBooks = library.getAvailableBooks();

        assertEquals(1, availableBooks.size());
        assertTrue(availableBooks.contains(book2));
        assertFalse(availableBooks.contains(book1));
    }

}
