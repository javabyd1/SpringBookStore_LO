package com.sda.springstarter.demo.service;

import com.sda.springstarter.demo.model.BookCategory;
import com.sda.springstarter.demo.model.Publisher;
import com.sda.springstarter.demo.repository.CategoryRepository;
import com.sda.springstarter.demo.repository.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublisherServiceImpl {

    @Autowired
    private PublisherRepository publisherRepository;


    public List<Publisher> getPublishers(){
        return publisherRepository.findAll();
    }

}
