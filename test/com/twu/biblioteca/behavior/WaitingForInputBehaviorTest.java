package com.twu.biblioteca.behavior;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class WaitingForInputBehaviorTest {

    private Behavior behavior;

    @Before
    public void setUp() {
        behavior = new WaitingForInputBehavior();
    }

    @Test
    public void should_get_message() throws Exception {
        // when
        String message = behavior.getMessage();

        // then
        assertThat(message, is(">"));
    }

}
