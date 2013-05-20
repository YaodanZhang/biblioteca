package com.twu.biblioteca.behavior;

import com.twu.biblioteca.Book;
import com.twu.biblioteca.Library;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static junit.framework.Assert.assertTrue;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.*;

public class ListBooksBehaviorTest {

    private ListBooksBehavior behavior;
    private Library library;

    @Before
    public void setUp() {
        behavior = new ListBooksBehavior();
        library = Library.getInstance();
        library.getBooks().clear();
    }

    @Test
    public void should_get_empty_book_list() throws Exception {
        // when
        List<Book> books = behavior.getBooks();

        // then
        assertTrue(books.isEmpty());
    }

    @Test
    public void should_get_2_elements_book_list() throws Exception {
        // given
        library.addBook((new Book()).author("author1").title("title1"));
        library.addBook((new Book()).author("author2").title("title2"));

        // when
        List<Book> books = behavior.getBooks();

        // then
        assertThat(books.size(), is(2));
    }

    @Test
    public void should_get_book_info_when_get_message() throws Exception {
        // given
        Book book1 = mock(Book.class);
        Book book2 = mock(Book.class);
        library.addBook(book1);
        library.addBook(book2);

        // when
        behavior.getMessage();

        // then
        verify(book1, times(1)).getInfo();
        verify(book2, times(1)).getInfo();
    }

    @Test
    public void should_be_waiting_for_input_behavior_of_next_behavior() throws Exception {
        // when
        Behavior nextBehavior = behavior.nextBehavior();

        // then
        assertTrue(nextBehavior instanceof WaitingForInputBehavior);
    }
}
