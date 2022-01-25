package com.example.SpringMongo.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@ToString

@Document(collection = "Book" )
public class Book {
    @Id
    private String id;

//    private String demo;

    private String name;

    private String authorName;

    Map<Course,Boolean> isCompleted = new HashMap<>();

   @DBRef
    private Course course;

//    private String courseName;
//
//    private Map<String,Object> data;
//
//    @JsonAnySetter
//    public void add(String key, Object value) {
//        if (null == data) {
//            data = new HashMap<>();
//        }
//        data.put(key, value);
//    }

//    @JsonAnyGetter
//    public Map<String, Object> get() {
//        return schemalessData;
//    }

}
