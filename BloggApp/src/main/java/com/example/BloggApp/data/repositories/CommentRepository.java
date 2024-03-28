package com.example.BloggApp.data.repositories;

import com.example.BloggApp.data.model.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CommentRepository extends MongoRepository<Comment,String> {
}
