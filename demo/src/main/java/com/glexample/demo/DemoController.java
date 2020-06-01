package com.glexample.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/services")
public class DemoController {
    @Autowired
    private DataService dataService;

    @GetMapping(path="/data")
    public String getData() {
        return "Hello World!";
    }

    @GetMapping(path="/data1")
    public String getData1() {
        return "Hi Zuzanka!";
    }

    @GetMapping(path="/book")
    public Book getBook() {
        return dataService.getBook();
    }
}