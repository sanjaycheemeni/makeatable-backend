package com.makeatable.makeatable.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "manager")
public class Manager {
    

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long uid = (long) 0;


   

    

}
