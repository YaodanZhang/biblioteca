package com.twu.biblioteca.behavior;

public class WelcomeBehavior implements Behavior {
    private String message;

    public WelcomeBehavior() {
        message = "Welcome!";
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public Behavior nextBehavior() {
        return new ListMenuOptionBehavior();
    }

    @Override
    public void execute() {
        System.out.println(getMessage());
    }
}
