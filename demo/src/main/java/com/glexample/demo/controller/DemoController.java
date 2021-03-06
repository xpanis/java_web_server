package com.glexample.demo.controller;

import com.glexample.demo.Services.DataService;
import com.glexample.demo.dto.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ConcurrentHashMap;

@RestController
@RequestMapping(path="/services")
public class DemoController {
    private static final Logger LOG = LoggerFactory.getLogger(Book.class);
    @Autowired
    private DataService dataService;

    @GetMapping(path="/data")
    public String getData() {
        return "Hello World!";
    }

    @GetMapping(path="/book")
    public Book getBook(@RequestParam String name) {
        return dataService.getBook(name);
    }

    @GetMapping(path="/allBooks")
    public ConcurrentHashMap getBook() {
        return dataService.getBooks();
    }

    @PostMapping(path="/postBook")
    public void addBook(@RequestBody Book book) {
        LOG.info("addBook: {}", book.getName());
        dataService.setBook(book);
    }
}