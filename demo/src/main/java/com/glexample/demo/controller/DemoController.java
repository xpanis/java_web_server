package com.glexample.demo.controller;

import com.glexample.demo.dto.Book;
import com.glexample.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@RestController
@RequestMapping(path="/services")
public class DemoController {
    private static final Logger LOG = LoggerFactory.getLogger(Book.class);

    @Autowired
    private BookRepository bookRepository;

    @GetMapping(path="/data")
    public String getData() {
        return "Hello World!";
    }

    @GetMapping(path="/book")
    public Book getBook(@RequestParam String name) {
        return bookRepository.findByName(name);
    }

    @GetMapping(path="/allBooks")
    public List<Book> getBook() {
        return bookRepository.findAll();
    }

    @PostMapping(path="/postBook")
    public void addBook(@RequestBody Book book) {
        LOG.info("addBook: {}", book.getName());
        bookRepository.save(book);
    }
}