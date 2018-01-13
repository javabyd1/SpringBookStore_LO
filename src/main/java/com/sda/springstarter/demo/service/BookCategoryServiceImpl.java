package com.sda.springstarter.demo.service;

import com.sda.springstarter.demo.model.Author;
import com.sda.springstarter.demo.model.BookCategory;
import com.sda.springstarter.demo.repository.BookCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookCategoryServiceImpl {

    @Autowired
    private BookCategoryRepository bookCategoryRepository;

    public List<BookCategory> getAllCategories() {
        return bookCategoryRepository.findAll();
    }

    public void saveCategory(BookCategory bookCategory) {
        bookCategoryRepository.save(bookCategory);
    }
}
