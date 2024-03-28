package com.example.BloggApp.data.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;
@Data
@Document
public class User {
    @Id
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String id;
@DBRef
    List<Post> post = new ArrayList<>();
}
