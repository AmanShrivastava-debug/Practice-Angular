package com.onlinelib.ols.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onlinelib.ols.Entity.Author;


public interface AuthorRepo extends JpaRepository<Author,Long> {
    
}
