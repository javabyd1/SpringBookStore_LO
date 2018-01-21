package com.sda.springstarter.demo.repository;

import com.sda.springstarter.demo.model.Book;
import com.sda.springstarter.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long>{

    User findByName(String name);
    User findByLastname(String name);
    User findById(int id);
    User findByEmail(String email);

}
