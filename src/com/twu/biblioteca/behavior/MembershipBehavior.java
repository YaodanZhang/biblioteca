package com.twu.biblioteca.behavior;

public class MembershipBehavior implements Behavior {
    @Override
    public String getMessage() {
        return "Please talk to a Librarian. Thank you.";
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
