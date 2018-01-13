package com.sda.springstarter.demo;

import com.sda.springstarter.demo.interfaces.BookService;
import com.sda.springstarter.demo.model.Author;
import com.sda.springstarter.demo.model.Book;
import com.sda.springstarter.demo.model.Publisher;
import com.sda.springstarter.demo.repository.AuthorRepository;
import com.sda.springstarter.demo.repository.BookCategoryRepository;
import com.sda.springstarter.demo.repository.BookRepository;
import com.sda.springstarter.demo.repository.PublisherRepository;
import com.sda.springstarter.demo.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{

	@Autowired
	private BookServiceImpl bookService;

	@Autowired
	private BookRepository bookRepository;

	@Autowired
	private PublisherRepository publisherRepository;

	@Autowired
	private BookCategoryRepository bookCategoryRepository;

	@Autowired
	private AuthorRepository authorRepository;


	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//		Publisher publisher = publisherRepository.findById(1);
//
//		Book book = new Book();
//		book.setTitle("tytul nowy");
//		book.setPublisher(publisher);
//
//		bookRepository.save(book);

		Author author = authorRepository.findById(1);

		Book book = new Book();
		book.setTitle("JAVA dla Zaawansowanych");
		book.setBookAuthor(author);

		bookService.saveBook(book);

	}
}
