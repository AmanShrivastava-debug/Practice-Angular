package com.onlinelib.ols.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long bookId;
    private String title;
    private String genre;
    private int publicationYear;
    @ManyToOne
    private Author author;
    public Book() {
    }
    public Book(long bookId, String title, String genre, int publicationYear, Author author) {
        this.bookId = bookId;
        this.title = title;
        this.genre = genre;
        this.publicationYear = publicationYear;
        this.author = author;
    }
    public long getBookId() {
        return bookId;
    }
    public void setBookId(long bookId) {
        this.bookId = bookId;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public int getPublicationYear() {
        return publicationYear;
    }
    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
    public Author getAuthor() {
        return author;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }
    

}
