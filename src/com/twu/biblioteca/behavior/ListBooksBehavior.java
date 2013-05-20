package com.twu.biblioteca.behavior;

import com.twu.biblioteca.Book;
import com.twu.biblioteca.Library;

import java.util.List;

public class ListBooksBehavior implements Behavior {

    private Library library;

    public ListBooksBehavior() {
        this.library = Library.getInstance();
    }

    @Override
    public String getMessage() {
        StringBuilder message = new StringBuilder();
        for (Book book : getBooks()) {
            message.append(book.getInfo());
        }
        return message.toString();
    }

    @Override
    public Behavior nextBehavior() {
        return new WaitingForInputBehavior();
    }

    @Override
    public void execute() {
        System.out.println(getMessage());
    }

    List<Book> getBooks() {
        return library.getBooks();
    }
}
