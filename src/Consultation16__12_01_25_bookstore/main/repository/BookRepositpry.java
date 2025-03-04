package Consultation16__12_01_25_bookstore.main.repository;

import Consultation16__12_01_25_bookstore.lesson30_Consultation15_bookstore.main.model.Book;

import java.util.ArrayList;

public class BookRepositpry {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }
}
