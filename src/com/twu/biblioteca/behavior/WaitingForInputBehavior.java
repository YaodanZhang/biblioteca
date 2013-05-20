package com.twu.biblioteca.behavior;

import com.twu.biblioteca.instruction.Instruction;
import com.twu.biblioteca.instruction.InstructionFactory;

import java.util.List;
import java.util.Scanner;

public class WaitingForInputBehavior implements Behavior {
    private List<Instruction> instructions;
    private Instruction inputInstruction;

    public WaitingForInputBehavior() {
        this.instructions = InstructionFactory.getAllInstructions();
    }

    public WaitingForInputBehavior(List<Instruction> instructions) {
        this.instructions = instructions;
    }

    @Override
    public String getMessage() {
        return ">";
    }

    @Override
    public Behavior nextBehavior() {
        return null == inputInstruction ? new WrongCommandBehavior() : inputInstruction.getBehavior();
    }

    @Override
    public void execute() {
        inputInstruction = null;

        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (input.equals("")) {
            input = scanner.nextLine().trim();
        }

        for (Instruction c : instructions) {
            if (c.isThisInstruction(input)) {
                inputInstruction = c;
                inputInstruction.setInput(input);
                break;
            }
        }
    }
}
