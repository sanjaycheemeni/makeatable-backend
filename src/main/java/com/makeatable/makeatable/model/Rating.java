package com.makeatable.makeatable.model;

import jakarta.persistence.*;
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

    @Column(name="foodid")
    private String food_id;

    @Column(name="value")
    private Double value;


}
