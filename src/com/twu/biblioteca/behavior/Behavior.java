package com.twu.biblioteca.behavior;

public interface Behavior {
    String getMessage();

    Behavior nextBehavior();

    void execute();
}
