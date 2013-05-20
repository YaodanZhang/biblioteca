package com.twu.biblioteca;

import com.twu.biblioteca.behavior.Behavior;
import com.twu.biblioteca.behavior.QuitBehavior;
import com.twu.biblioteca.behavior.WelcomeBehavior;

public class BibliotecaApp {

    public static void main(String[] args) {
        Behavior behavior = new WelcomeBehavior();
        Library library = Library.getInstance();
        library.addBook(new Book().author("author").title("title"));
        library.addBook(new Book().author("author2").title("title2"));

        while (!(behavior instanceof QuitBehavior)) {
            behavior.execute();
            behavior = behavior.nextBehavior();
        }
    }

}
