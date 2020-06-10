package com.glexample.demo.Services;

import com.glexample.demo.dto.Book;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.concurrent.ConcurrentHashMap;

@Service
public class DataServiceLocalImpl implements DataService {
    private ConcurrentHashMap<String, Book> books;

    public DataServiceLocalImpl() {
        this.books = new ConcurrentHashMap<>();
    }

    public ConcurrentHashMap<String, Book> getBooks() {
        return books;
    }

    public Book getBook(String name) {
        if(books.containsKey(name))
        {
            return books.get(name);
        }

        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "entity not found");
    }

    public void setBook(Book book)
    {
        books.put(book.getName(),book);
        // databaza insert
        //LOG.info("addBook: {}", book.getName());
    }
}
