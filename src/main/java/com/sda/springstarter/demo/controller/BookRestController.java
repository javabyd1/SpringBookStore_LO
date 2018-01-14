package com.sda.springstarter.demo.controller;

import com.sda.springstarter.demo.exception.BookNotFoundException;
import com.sda.springstarter.demo.model.Book;
import com.sda.springstarter.demo.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "books")
public class BookRestController {

    @Autowired
    private BookServiceImpl bookService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

    @GetMapping(value = "{id}")
    public ResponseEntity<Book> getBookById(@PathVariable int id){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(bookService.getBookById(id));
    }
}
