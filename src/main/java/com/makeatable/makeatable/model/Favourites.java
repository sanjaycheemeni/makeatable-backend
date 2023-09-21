package com.makeatable.makeatable.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "favourites")
public class Favourites {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long uid = 0;

    @Column(name="foodid")
    private String foodid;

    @Column(name="username")
    private String username;


    public Object getFoodid() {
        return null;

    }
}
