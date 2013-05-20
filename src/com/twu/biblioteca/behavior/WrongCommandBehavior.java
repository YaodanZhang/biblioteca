package com.twu.biblioteca.behavior;

public class WrongCommandBehavior implements Behavior {
    @Override
    public String getMessage() {
        return "Select a valid option!!";
    }

    @Override
    public Behavior nextBehavior() {
        return new WaitingForInputBehavior();
    }

    @Override
    public void execute() {
        System.out.println(getMessage());
    }
}
