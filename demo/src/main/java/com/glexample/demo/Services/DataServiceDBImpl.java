package com.glexample.demo.Services;

import com.glexample.demo.dto.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataServiceDBImpl  extends JpaRepository<Book, String> , DataService {

    public Book findByName(String name);
}
