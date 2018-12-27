package com.lambda.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lambda.bookstore.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

}