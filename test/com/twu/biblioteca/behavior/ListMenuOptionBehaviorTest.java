package com.twu.biblioteca.behavior;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ListMenuOptionBehaviorTest {

    private Behavior behavior;

    @Before
    public void setUp() {
        behavior = new ListMenuOptionBehavior();
    }

    @Test
    public void should_be_waiting_for_input_behavior_of_next() throws Exception {
        // when
        Behavior nextBehavior = behavior.nextBehavior();

        // then
        assertTrue(nextBehavior instanceof WaitingForInputBehavior);
    }
}
