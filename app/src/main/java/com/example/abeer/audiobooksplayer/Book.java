package com.example.abeer.audiobooksplayer;

public class Book {

    private String bookName;
    private String authorName;

    public Book(String bookName, String authorName) {
        this.bookName = bookName;
        this.authorName = authorName;
    }

    public String getAuthor() {
        return authorName;
    }

    public String getBookName() {
        return bookName;
    }
}
