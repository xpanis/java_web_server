package com.glexample.demo;

import org.springframework.stereotype.Service;

@Service
public class DataService {
    public Book getBook() {
        return new Book("Harry Potter", 250);
    }
}
