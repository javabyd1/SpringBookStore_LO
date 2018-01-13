package com.sda.springstarter.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "ksiazki")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String title;
    private String author;

    //relacje
    @OneToOne
    @JoinColumn(name = "book_publisher_id")
    private Publisher publisher;

    @ManyToOne
    private BookCategory bookCategory;

    @ManyToOne
    private Author bookAuthor;

    public Book() {
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Author getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(Author bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public BookCategory getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(BookCategory bookCategory) {
        this.bookCategory = bookCategory;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
