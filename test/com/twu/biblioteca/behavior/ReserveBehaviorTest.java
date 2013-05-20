package com.twu.biblioteca.behavior;

import com.twu.biblioteca.Book;
import com.twu.biblioteca.Library;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ReserveBehaviorTest {

    private Behavior behavior;
    private Library library;

    @Before
    public void setUp() {
        behavior = new ReserveBehavior("title");
        library = Library.getInstance();
        library.getBooks().clear();
    }

    @Test
    public void should_be_waiting_for_input_behavior_of_next_behavior() throws Exception {
        // when
        Behavior nextBehavior = behavior.nextBehavior();

        // then
        assertTrue(nextBehavior instanceof WaitingForInputBehavior);
    }

    @Test
    public void should_return_null_if_have_not_that_book() throws Exception {
        // given
        library.addBook(new Book().title("title1").author("author1"));

        // when
        Book book = ((ReserveBehavior) behavior).findBook();

        // then
        assertNull(book);
    }

    @Test
    public void should_return_null_to_reserved_book() throws Exception {
        // given
        library.addBook(new Book().title("title").author("author"));

        // when
        behavior.execute();
        Book book = ((ReserveBehavior) behavior).findBook();

        // then
        assertNull(book);
    }

    @Test
    public void should_return_book() throws Exception {
        // given
        library.addBook(new Book().title("title").author("author"));

        // when
        Book book = ((ReserveBehavior) behavior).findBook();

        // then
        assertThat(book, is(new Book().title("title").author("author")));
    }
}
