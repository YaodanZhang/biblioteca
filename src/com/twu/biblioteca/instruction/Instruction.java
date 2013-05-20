package com.twu.biblioteca.instruction;

import com.twu.biblioteca.behavior.Behavior;

public interface Instruction {
    Behavior getBehavior();

    boolean isThisInstruction(String s);

    String getDescription();

    void setInput(String input);
}
