package com.example.BloggApp.data.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
@Data
@Document
public class View {
    @Id
    private String id;
    @DBRef
    private User viewer;


    private LocalDateTime timeOfView ;

}
