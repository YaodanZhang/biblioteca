package com.twu.biblioteca.instruction;

import com.twu.biblioteca.behavior.Behavior;
import com.twu.biblioteca.behavior.QuitBehavior;

public class QuitInstruction implements Instruction {
    private static final String COMMAND_STRING = "q";

    @Override
    public Behavior getBehavior() {
        return new QuitBehavior();
    }

    @Override
    public boolean isThisInstruction(String s) {
        return COMMAND_STRING.equalsIgnoreCase(s);
    }

    @Override
    public String getDescription() {
        return COMMAND_STRING + ": quit the application";
    }

    @Override
    public void setInput(String input) {
    }
}
