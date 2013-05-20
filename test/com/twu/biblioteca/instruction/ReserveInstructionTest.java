package com.twu.biblioteca.instruction;

import com.twu.biblioteca.behavior.Behavior;
import com.twu.biblioteca.behavior.ReserveBehavior;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class ReserveInstructionTest {

    private Instruction instruction;
    private String validInput;
    private String bookName;

    @Before
    public void setUp() {
        bookName = "Head First Java";
        validInput = "  reservE\t \t \t" + bookName + "   \t   ";
        instruction = new ReserveInstruction();
        instruction.setInput(validInput);
    }

    @Test
    public void should_return_true_when_get_valid_input() throws Exception {
        assertTrue(instruction.isThisInstruction(validInput));
    }

    @Test
    public void should_get_book_name() throws Exception {
        // when
        String bookName = ((ReserveInstruction) instruction).getBookTitle();

        // then
        assertThat(bookName, is(this.bookName));
    }

    @Test
    public void should_be_reserve_behavior_of_next_behavior() throws Exception {
        // when
        Behavior behavior = instruction.getBehavior();

        // then
        assertTrue(behavior instanceof ReserveBehavior);
    }
}
