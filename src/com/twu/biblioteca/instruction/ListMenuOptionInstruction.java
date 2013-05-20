package com.twu.biblioteca.instruction;

import com.twu.biblioteca.behavior.Behavior;
import com.twu.biblioteca.behavior.ListMenuOptionBehavior;

public class ListMenuOptionInstruction implements Instruction {
    private final static String COMMAND_STRING = "list-menu";

    public Behavior getBehavior() {
        return new ListMenuOptionBehavior();
    }

    @Override
    public boolean isThisInstruction(String s) {
        return COMMAND_STRING.equalsIgnoreCase(s);
    }

    @Override
    public String getDescription() {
        return COMMAND_STRING + ": to list all instructions you can input";
    }

    @Override
    public void setInput(String input) {
    }
}
