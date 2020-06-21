package com.glexample.demo.repository;
import com.glexample.demo.dto.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, String>{

    public Book findByName(String name);
}
