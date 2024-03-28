package com.example.BloggApp.data.repositories;

import com.example.BloggApp.data.model.View;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface  ViewRepository extends MongoRepository<View, String> {
}
