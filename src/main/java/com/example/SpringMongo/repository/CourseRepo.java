package com.example.SpringMongo.repository;

import com.example.SpringMongo.model.Course;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CourseRepo extends MongoRepository<Course,String> {

    Course findByCourseName(String courseName);
}
