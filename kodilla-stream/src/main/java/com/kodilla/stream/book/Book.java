package com.kodilla.stream.book;

public final class Book {
    private final String author;
    private final String title;
    private final int yearOfPublication;
    private final String sygnature;

    public Book(final String author, final String title, final int yearOfPublication, final String sygnature) {
        this.author = author;
        this.title = title;
        this.yearOfPublication = yearOfPublication;
        this.sygnature = sygnature;
    }
    public String getAuthor() {
        return author;
    }
    public String getTitle() {
        return title;
    }
    public int getYearOfPublication() {
        return yearOfPublication;
    }
    public String getSygnature() {
        return sygnature;
    }
    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                ", sygnature='" + sygnature + '\'' +
                '}';
    }
}
