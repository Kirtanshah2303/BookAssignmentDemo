package com.example.SpringMongo.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "demo")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Demo {

    @Id
    private String Id;

    private String demoName;
    private String courseName;

}
