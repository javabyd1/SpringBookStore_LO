package com.sda.springstarter.demo.repository;

import com.sda.springstarter.demo.model.Book;
import com.sda.springstarter.demo.model.BookCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategoryRepository extends JpaRepository<BookCategory, Long>{

}
