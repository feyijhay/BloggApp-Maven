package com.example.BloggApp.data.repositories;

import com.example.BloggApp.data.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsersRepository extends MongoRepository<User, String> {
}
