package com.onlinelib.ols.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinelib.ols.Entity.Book;
import com.onlinelib.ols.Repo.BookRepo;

@Service
public class BooksService {
    @Autowired
    private BookRepo bookRepo;
    public Book createBook(Book book)
    {
        return bookRepo.save(book);
    }
    public Book retrieveBook(long bookId)
    {
        return bookRepo.findById(bookId).orElse(null);
    }
}
