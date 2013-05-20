package com.twu.biblioteca.instruction;

import com.twu.biblioteca.behavior.Behavior;
import com.twu.biblioteca.behavior.ListMenuOptionBehavior;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class ListMenuOptionInstructionTest {

    private Instruction instruction;

    @Before
    public void setUp() {
        instruction = new ListMenuOptionInstruction();
    }

    @Test
    public void should_get_menu_option_list_behavior() throws Exception {
        // when
        Behavior behavior = instruction.getBehavior();

        // then
        assertTrue(behavior instanceof ListMenuOptionBehavior);
    }

    @Test
    public void should_return_true_with_valid_command() throws Exception {
        // when
        boolean isThisInstruction = instruction.isThisInstruction("LisT-mENu");

        // then
        assertThat(isThisInstruction, is(true));
    }

    @Test
    public void should_return_false_with_invalid_command() throws Exception {
        // when
        boolean isThisInstruction = instruction.isThisInstruction("listMenu");

        // then
        assertThat(isThisInstruction, is(false));
    }

    @Test
    public void should_get_description() throws Exception {
        // when
        String description = instruction.getDescription();

        // then
        assertThat(description, is("list-menu: to list all instructions you can input"));
    }
}
