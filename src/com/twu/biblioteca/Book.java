package com.twu.biblioteca;

import com.google.common.base.Objects;

import static com.google.common.base.Objects.equal;

public class Book {
    private String author;
    private String title;
    private boolean reserved;

    public Book() {
        reserved = false;
    }

    public Book author(String author) {
        this.author = author;
        return this;
    }

    public Book title(String title) {
        this.title = title;
        return this;
    }

    public String getInfo() {
        StringBuilder stringBuilder = new StringBuilder();

        String lineSeparator = System.getProperty("line.separator");
        stringBuilder.append("-------------------------------------------").append(lineSeparator);
        stringBuilder.append("title: " + getTitle()).append(lineSeparator);
        stringBuilder.append("author: " + getAuthor()).append(lineSeparator);
        stringBuilder.append(reserved ? "reserved" : "not reserved").append(lineSeparator);
        stringBuilder.append("-------------------------------------------").append(lineSeparator);

        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        return getInfo();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return equal(this.author, book.author) && equal(this.title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(author, title);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void reserve() {
        this.reserved = true;
    }

    public boolean isReserved() {
        return reserved;
    }
}
