package com.makeatable.makeatable.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "rating")
public class Rating {
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long uid = (long) 0;

    @Column(name="username")
    private String username;

    @Column(name="food_id")
    private String food_id;

    @Column(name="value")
    private String value;
    
}
