package com.makeatable.makeatable.services;

import org.springframework.stereotype.Service;

import com.makeatable.makeatable.model.User;
import com.makeatable.makeatable.repository.UserRepo;

// import lombok.extern.slf4j.Slf4j;

@Service
// @Slf4j
public class UserService {
    
     public final UserRepo userRepo;

    UserService(UserRepo userRepo){
        this.userRepo=userRepo;
    }


    public User addUser(User user){
        return userRepo.save(user);
    }
}
