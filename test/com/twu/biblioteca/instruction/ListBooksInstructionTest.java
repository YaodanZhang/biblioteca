package com.twu.biblioteca.instruction;

import com.twu.biblioteca.behavior.Behavior;
import com.twu.biblioteca.behavior.ListBooksBehavior;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class ListBooksInstructionTest {

    private Instruction instruction;

    @Before
    public void setUp() {
        instruction = new ListBooksInstruction();
    }

    @Test
    public void should_get_list_books_behavior() throws Exception {
        // when
        Behavior behavior = instruction.getBehavior();

        // then
        assertTrue(behavior instanceof ListBooksBehavior);
    }

    @Test
    public void should_return_true_when_command_is_this_instruction() throws Exception {
        // when
        boolean isThisInstruction = instruction.isThisInstruction("LiSt-bOOk");

        // then
        assertThat(isThisInstruction, is(true));
    }

    @Test
    public void should_return_false_when_invalid_command() throws Exception {
        // when
        boolean isThisInstruction = instruction.isThisInstruction("list-books");

        // then
        assertThat(isThisInstruction, is(false));
    }

    @Test
    public void should_get_description() throws Exception {
        // when
        String description = instruction.getDescription();

        // then
        assertThat(description, is("list-book: to list all the books of this library"));
    }
}
