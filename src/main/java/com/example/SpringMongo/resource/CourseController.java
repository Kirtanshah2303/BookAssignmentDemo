package com.example.SpringMongo.resource;

import com.example.SpringMongo.model.Course;
import com.example.SpringMongo.repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    CourseRepo courseRepo;

    @PostMapping("/addCourse")
    public String addCourse(@RequestBody Course course){

        courseRepo.save(course);

        return "Course has been created with id ->"+course.getId();

    }

    @GetMapping("/getAllCourse")
    public List<Course> allCourse(){
        return courseRepo.findAll();
    }

}
