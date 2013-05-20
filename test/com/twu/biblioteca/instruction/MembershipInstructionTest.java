package com.twu.biblioteca.instruction;

import com.twu.biblioteca.behavior.Behavior;
import com.twu.biblioteca.behavior.MembershipBehavior;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class MembershipInstructionTest {

    private Instruction instruction;

    @Before
    public void setUp() {
        instruction = new MembershipInstruction();
    }

    @Test
    public void should_get_description() throws Exception {
        // when
        String description = instruction.getDescription();

        // then
        assertThat(description, is("membership: check the membership details"));
    }

    @Test
    public void should_get_behavior() throws Exception {
        // when
        Behavior behavior = instruction.getBehavior();

        // then
        assertTrue(behavior instanceof MembershipBehavior);
    }

    @Test
    public void should_return_true_for_valid_input() throws Exception {
        assertTrue(instruction.isThisInstruction("membERship"));
    }
}
