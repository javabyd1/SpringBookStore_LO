package com.sda.springstarter.demo.service;

import com.sda.springstarter.demo.model.BookCategory;
import com.sda.springstarter.demo.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl {

    @Autowired
    private CategoryRepository categoryRepository;


    public List<BookCategory> getCategories(){
        return categoryRepository.findAll();
    }

}
