package com.glexample.demo;

import org.springframework.stereotype.Service;

import java.util.concurrent.ConcurrentHashMap;

@Service
public class DataService {
    private ConcurrentHashMap<String,Book> books;

    public DataService() {
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
        //todo error 404
        return new Book("Harry Potter", 250);
    }

    public void setBook(Book book)
    {
        books.put(book.getName(),book);
        // databaza insert
        //LOG.info("addBook: {}", book.getName());
    }
}
