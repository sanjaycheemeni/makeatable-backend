package com.makeatable.makeatable.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@Entity
@Table(name = "user_auth")
@NoArgsConstructor
@ToString
public class Auth {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long uid = (long) 0;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "usertype")
    private String usertype;
}
