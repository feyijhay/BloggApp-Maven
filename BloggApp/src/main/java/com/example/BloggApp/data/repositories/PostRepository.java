package com.example.BloggApp.data.repositories;

import com.example.BloggApp.data.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {
}
