package com.example.BloggApp;

import com.example.BloggApp.data.model.User;
import com.example.BloggApp.data.repositories.UsersRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;


import static org.junit.jupiter.api.Assertions.*;

@DataMongoTest
public class BloggAppApplicationTest {

@Autowired
    private UsersRepository usersRepository;

    @Test
    public void saveTest(){
        User user = new User();
        usersRepository.save(user);
        assertEquals(1, usersRepository.count());
        }
    }




