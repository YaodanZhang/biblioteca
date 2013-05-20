package com.twu.biblioteca.instruction;

import com.twu.biblioteca.behavior.Behavior;
import com.twu.biblioteca.behavior.ReserveBehavior;

import java.util.regex.Pattern;

public class ReserveInstruction implements Instruction {
    private static final String COMMAND_PATTERN = "^reserve\\s+.+$";
    private String input;

    @Override
    public Behavior getBehavior() {
        return new ReserveBehavior(getBookTitle());
    }

    @Override
    public boolean isThisInstruction(String s) {
        return Pattern.compile(COMMAND_PATTERN).matcher(s.toLowerCase().trim()).matches();
    }

    @Override
    public String getDescription() {
        return "reserve: reserve a book. " +
                "If there is a book whose title is Head First Java, " +
                "then you can use this command like this: \"reserve Head First Java\"";
    }

    @Override
    public void setInput(String input) {
        this.input = input.trim();
    }

    String getBookTitle() {
        return input.replaceAll("^(r|R)(e|E)(s|S)(e|E)(r|R)(v|V)(e|E)\\s+", "");
    }
}
