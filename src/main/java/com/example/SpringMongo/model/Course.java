package com.example.SpringMongo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Collection;

@Getter
@Setter
@ToString

@Document(collection = "Course" )
public class Course {

    @Id
    private String Id;

    private String instructorName;
    private String courseName;

}
