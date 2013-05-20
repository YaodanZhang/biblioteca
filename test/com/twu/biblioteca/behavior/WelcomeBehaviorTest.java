package com.twu.biblioteca.behavior;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;

public class WelcomeBehaviorTest {

    private Behavior behavior;

    @Before
    public void setUp() {
        behavior = new WelcomeBehavior();
    }

    @Test
    public void should_get_welcome_msg() throws Exception {
        // when
        String welcomeMsg = behavior.getMessage();

        // then
        assertThat(welcomeMsg, is("Welcome!"));
    }

    @Test
    public void should_be_list_menu_option_behavior_of_next_behavior() throws Exception {
        // when
        Behavior nextBehavior = behavior.nextBehavior();

        // then
        assertTrue(nextBehavior instanceof ListMenuOptionBehavior);
    }
}
