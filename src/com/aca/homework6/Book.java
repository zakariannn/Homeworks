package com.aca.homework6;

public class Book {
    private String title;
    private String author;

    public String getTitle() throws IllegalLoadException {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() throws IllegalLoadException {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
