package com.twu.biblioteca.instruction;

import com.twu.biblioteca.behavior.Behavior;
import com.twu.biblioteca.behavior.ListBooksBehavior;

public class ListBooksInstruction implements Instruction {
    private final static String COMMAND_STRING = "list-book";

    @Override
    public Behavior getBehavior() {
        return new ListBooksBehavior();
    }

    @Override
    public boolean isThisInstruction(String s) {
        return COMMAND_STRING.equalsIgnoreCase(s);
    }

    @Override
    public String getDescription() {
        return COMMAND_STRING + ": to list all the books of this library";
    }

    @Override
    public void setInput(String input) {
    }
}
