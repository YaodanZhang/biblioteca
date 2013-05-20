package com.twu.biblioteca.behavior;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.twu.biblioteca.Book;
import com.twu.biblioteca.Library;

import java.util.NoSuchElementException;

public class ReserveBehavior implements Behavior {
    private static final String SUCCESS_MESSAGE = "Thank You! Enjoy the book.";
    private static final String FAIL_MESSAGE = "Sorry we don't have that book yet.";

    private final String bookTitle;

    public ReserveBehavior(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    @Override
    public String getMessage() {
        return findBook() == null ? FAIL_MESSAGE : SUCCESS_MESSAGE;
    }

    @Override
    public Behavior nextBehavior() {
        return new WaitingForInputBehavior();
    }

    @Override
    public void execute() {
        Book book = findBook();
        if (null != book) {
            book.reserve();
            System.out.println(SUCCESS_MESSAGE);
        } else {
            System.out.println(FAIL_MESSAGE);
        }
    }

    Book findBook() {
        Book book = null;
        try {
            book = Iterables.find(Library.getInstance().getBooks(), new Predicate<Book>() {
                @Override
                public boolean apply(Book b) {
                    return !b.isReserved() && b.getTitle().equalsIgnoreCase(bookTitle);
                }
            });
        } catch (NoSuchElementException e) {
            // do noting
        }
        return book;
    }
}
