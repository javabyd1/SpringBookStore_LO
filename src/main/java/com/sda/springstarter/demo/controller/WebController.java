package com.sda.springstarter.demo.controller;

import com.sda.springstarter.demo.interfaces.BookService;
import com.sda.springstarter.demo.model.Book;
import com.sda.springstarter.demo.service.BookServiceImpl;
import com.sda.springstarter.demo.service.CategoryServiceImpl;
import com.sda.springstarter.demo.service.PublisherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class WebController {

    @Autowired
    private BookServiceImpl bookService;

    @Autowired
    private CategoryServiceImpl categoryService;

    @Autowired
    private PublisherServiceImpl publisherService;

    @GetMapping(value = "lista")
    public ModelAndView showBooks(){
        ModelAndView model = new ModelAndView();
        model.addObject("books", bookService.getAllBooks());
        model.addObject("categories", categoryService.getCategories());
        model.addObject("publishers", publisherService.getPublishers());
        model.addObject("book", new Book());
        model.setViewName("booklist");

        return model;
    }

    @PostMapping(value = "addbook")
    public String addBook( @ModelAttribute("book") @Valid Book book,
                                 BindingResult userloginResult){
        bookService.saveBook(book);

        return "Dodalo";
    }




}
