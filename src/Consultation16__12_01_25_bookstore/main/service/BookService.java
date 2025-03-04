package Consultation16__12_01_25_bookstore.main.service;


import Consultation16__12_01_25_bookstore.lesson30_Consultation15_bookstore.main.model.Book;
import Consultation16__12_01_25_bookstore.lesson30_Consultation15_bookstore.main.repository.BookRepositpry;

public class BookService {
    private BookRepositpry bookRepositpry;

    public BookService(BookRepositpry bookRepositpry) {
        this.bookRepositpry = bookRepositpry;
    }
    public void addBook(Book book) {
        bookRepositpry.addBook(book);
    }
}
