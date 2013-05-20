package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class BookTest {

    private Book book;

    @Before
    public void setUp() {
        book = new Book();
    }

    @Test
    public void should_equals_of_same_title_and_author() throws Exception {
        // given
        book.author("author").title("title");

        // then
        assertTrue(book.equals(new Book().author("author").title("title")));
    }

    @Test
    public void should_set_and_get_author_and_title() throws Exception {
        // given
        book.author("author").title("title");

        // when
        String author = book.getAuthor();
        String title = book.getTitle();

        // then
        assertThat(author, is("author"));
        assertThat(title, is("title"));
    }

    @Test
    public void should_set_and_get_reserve_one() throws Exception {
        assertFalse(book.isReserved());

        // when
        book.reserve();

        // then
        assertTrue(book.isReserved());
    }
}
