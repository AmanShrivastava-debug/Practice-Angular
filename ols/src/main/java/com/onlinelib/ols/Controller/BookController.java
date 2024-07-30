package com.onlinelib.ols.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlinelib.ols.Entity.Book;
import com.onlinelib.ols.Service.BooksService;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BooksService booksService;
    @PostMapping
    public ResponseEntity<Book> create(@RequestBody Book book)
    {
        return new ResponseEntity<Book>(booksService.createBook(book), HttpStatus.OK);
    }
    @GetMapping("/{bookId}")
    public ResponseEntity<Book> get(@PathVariable long id)
    {
return new ResponseEntity<Book>(booksService.retrieveBook(id), HttpStatus.OK);
    }
}
