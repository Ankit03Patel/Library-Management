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
        Book book = new Book("123456", "Wings of Fire", "Abdul Kalam", 1948);
        library.addBook(book);
        assertTrue(library.getBooks().contains(book));
    }

    @Test
    public void testBorrowBook() throws Exception {
        Library library = new Library();
        Book book = new Book("123456", "Wings of Fire", "Abdul Kalam", 1948);
        library.addBook(book);

        library.borrowBook("123456");

        assertTrue(book.isBorrowed());
    }

    @Test
    public void testBorrowUnavailableBook() {
        Library library = new Library();
        Book book = new Book("123456", "Wings of Fire", "Abdul Kalam", 1948);
        library.addBook(book);

        assertThrows(Exception.class, () -> {
            library.borrowBook("123456");
            library.borrowBook("123456");
        });
    }

    @Test
    public void testReturnBook() throws Exception {
        Library library = new Library();
        Book book = new Book("123456", "Wings of Fire", "Abdul Kalam", 1948);
        library.addBook(book);
        library.borrowBook("123456");

        library.returnBook("123456");

        assertFalse(book.isBorrowed());
    }

    @Test
    public void testViewAvailableBooks() throws Exception {
        Library library = new Library();
        Book book1 = new Book("123456", "Wings of Fire", "F. Scott Fitzgerald", 1925);
        Book book2 = new Book("483929", "1984", "XYZ", 1987);
        library.addBook(book1);
        library.addBook(book2);
        library.borrowBook("123456");

        List<Book> availableBooks = library.getAvailableBooks();

        assertEquals(1, availableBooks.size());
        assertTrue(availableBooks.contains(book2));
        assertFalse(availableBooks.contains(book1));
    }

    @Test
    public void testname() throws Exception {
        Library library = new Library();

        Book book1 = new Book("123456", "java", "F. Scott Fitzgerald", 1925);
        library.addBook(book1);
        library.borrowBook("123456");
        assertFalse(book1.isBorrowed());

    }

}
