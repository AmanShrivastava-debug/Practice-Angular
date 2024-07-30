package com.onlinelib.ols.Entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Author {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long authorid;
    private String firstName;
    private String lastName;
    private String email;
    @OneToMany(mappedBy = "author",cascade = CascadeType.ALL)
    private List<Book> books;
    public Author() {
    }
    public Author(long authorid, String firstName, String lastName, String email) {
        this.authorid = authorid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
    public long getAuthorid() {
        return authorid;
    }
    public void setAuthorid(long authorid) {
        this.authorid = authorid;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public List<Book> getBooks() {
        return books;
    }
    public void setBooks(List<Book> books) {
        this.books = books;
    }
    
    
}
