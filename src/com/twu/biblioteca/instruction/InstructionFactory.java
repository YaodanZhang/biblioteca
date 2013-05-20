package com.twu.biblioteca.instruction;

import com.google.common.collect.ImmutableList;

import java.util.List;

public class InstructionFactory {
    public static List<Instruction> getAllInstructions() {
        return ImmutableList.of(
                new ListBooksInstruction(),
                new ListMenuOptionInstruction(),
                new MembershipInstruction(),
                new ReserveInstruction(),
                new QuitInstruction()
        );
    }
}
