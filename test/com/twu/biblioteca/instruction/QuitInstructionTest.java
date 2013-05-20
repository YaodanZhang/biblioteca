package com.twu.biblioteca.instruction;

import com.twu.biblioteca.behavior.Behavior;
import com.twu.biblioteca.behavior.QuitBehavior;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class QuitInstructionTest {

    private Instruction instruction;

    @Before
    public void setUp() {
        instruction = new QuitInstruction();
    }

    @Test
    public void should_get_quit_behavior() throws Exception {
        // when
        Behavior behavior = instruction.getBehavior();

        // then
        assertTrue(behavior instanceof QuitBehavior);
    }

    @Test
    public void should_return_true_when_get_valid_input() throws Exception {
        assertTrue(instruction.isThisInstruction("Q"));
    }
}
