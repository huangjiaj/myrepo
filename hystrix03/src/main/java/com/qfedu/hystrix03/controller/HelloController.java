package com.qfedu.hystrix03.controller;

import com.qfedu.demo.service.Book;
import com.qfedu.hystrix03.feign.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**

 */
@RestController
public class HelloController {
    @Autowired
    BookService bookService;
    @GetMapping("/test01")
    public Book getBookById() {
        return bookService.getBookById(99);
    }
}
