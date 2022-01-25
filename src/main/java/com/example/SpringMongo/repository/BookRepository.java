package com.example.SpringMongo.repository;

import com.example.SpringMongo.model.Book;
import com.example.SpringMongo.model.Course;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface BookRepository extends MongoRepository<Book,Integer> {

//    List<Book> findBookByCourseName(String courseName);

        List<Book> findByCourse(Course course);

        Integer countBookByCourse(Course course);

        Book findByName(String name);


}
