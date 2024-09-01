package main.java;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }

    public void borrowBook(String isbn) throws Exception {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                if (book.isBorrowed()) {
                    throw new Exception("Book is already borrowed");
                }
                book.setBorrowed(true);
                return;
            }
        }
        throw new Exception("Book not found");
    }

    public void returnBook(String isbn) throws Exception {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                if (!book.isBorrowed()) {
                    throw new Exception("Book was not borrowed");
                }
                book.setBorrowed(false);
                return;
            }
        }
        throw new Exception("Book not found");
    }

}
