package com.makeatable.makeatable.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.makeatable.makeatable.model.Auth;

public interface AuthRepo extends JpaRepository<Auth,Long>{
    
}
