package com.twu.biblioteca.behavior;

import com.twu.biblioteca.instruction.Instruction;
import com.twu.biblioteca.instruction.InstructionFactory;

import java.util.List;

public class ListMenuOptionBehavior implements Behavior {
    private List<Instruction> instructions;

    public ListMenuOptionBehavior() {
        instructions = InstructionFactory.getAllInstructions();
    }

    @Override
    public String getMessage() {
        StringBuilder message = new StringBuilder("Menu option:").append(System.getProperty("line.separator"));

        for (Instruction instruction : instructions) {
            message.append(instruction.getDescription()).append(System.getProperty("line.separator"));
        }
        return message.toString();
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
