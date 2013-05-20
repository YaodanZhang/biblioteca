package com.twu.biblioteca.instruction;

import com.twu.biblioteca.behavior.Behavior;
import com.twu.biblioteca.behavior.MembershipBehavior;

public class MembershipInstruction implements Instruction {
    private static final String COMMAND_STRING = "membership";

    @Override
    public Behavior getBehavior() {
        return new MembershipBehavior();
    }

    @Override
    public boolean isThisInstruction(String s) {
        return COMMAND_STRING.equalsIgnoreCase(s);
    }

    @Override
    public String getDescription() {
        return COMMAND_STRING + ": check the membership details";
    }

    @Override
    public void setInput(String input) {
    }
}
