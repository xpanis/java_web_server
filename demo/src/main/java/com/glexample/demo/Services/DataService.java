package com.glexample.demo.Services;

import com.glexample.demo.dto.Book;

import java.util.concurrent.ConcurrentHashMap;

public interface DataService {


    ConcurrentHashMap<String, Book> getBooks();
    Book getBook(String name);
    void setBook(Book book);

}
