package com.twu.biblioteca.behavior;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;

public class WrongCommandBehaviorTest {

    private Behavior behavior;

    @Before
    public void setUp() {
        behavior = new WrongCommandBehavior();
    }

    @Test
    public void should_get_message() throws Exception {
        // when
        String message = behavior.getMessage();

        // then
        assertThat(message, is("Select a valid option!!"));
    }

    @Test
    public void should_be_waiting_for_input_behavior_of_next() throws Exception {
        // when
        Behavior nextBehavior = behavior.nextBehavior();

        // then
        assertTrue(nextBehavior instanceof WaitingForInputBehavior);
    }
}
