package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private static Library instance;

    static {
        instance = new Library();
    }

    private Library() {
        books = new ArrayList<Book>();
    }

    public static Library getInstance() {
        return instance;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void addBook(Book book) {
        books.add(book);
    }
}
