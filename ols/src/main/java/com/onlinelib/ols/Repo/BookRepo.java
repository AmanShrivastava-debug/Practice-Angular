package com.onlinelib.ols.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onlinelib.ols.Entity.Book;

public interface BookRepo extends JpaRepository<Book,Long> {
    
    
}
