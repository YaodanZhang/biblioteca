package com.twu.biblioteca.behavior;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;

public class MembershipBehaviorTest {

    private Behavior behavior;

    @Before
    public void setUp() {
        behavior = new MembershipBehavior();
    }

    @Test
    public void should_get_message() throws Exception {
        // when
        String message = behavior.getMessage();

        // then
        assertThat(message, is("Please talk to a Librarian. Thank you."));
    }

    @Test
    public void should_be_waiting_for_input_behavior_of_next() throws Exception {
        // when
        Behavior next = behavior.nextBehavior();

        // then
        assertTrue(next instanceof WaitingForInputBehavior);
    }
}
