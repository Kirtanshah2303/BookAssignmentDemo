package com.example.SpringMongo.service;

import com.example.SpringMongo.model.Book;
import com.example.SpringMongo.model.Course;
import com.example.SpringMongo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public String createBook(Book book){
        bookRepository.save(book);
        return "Book added with ID ->."+book.getId();
    }

    public List<Book> getBookByCourse(Course course){
        return bookRepository.findByCourse(course);
    }

    public Integer getCountofAssignment(Course course){
        return bookRepository.countBookByCourse(course);
    }

    public String setComplete(Book book, Course course){
       book.setIsCompleted();
    }

}
