package com.makeatable.makeatable.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long uid = (long) 0;

    @Column(name="username")
    private String username;

    @Column(name="name")
    private String name;

    @Column(name="phone")
    private String phone;

    @Column(name="pro_img")
    private String pro_img;



}
