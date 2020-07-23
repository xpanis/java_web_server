package com.glexample.demo.repository;
import com.glexample.demo.dto.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, String>{

    public Author findByName(String name);
    public boolean existsByName(String name);
}
