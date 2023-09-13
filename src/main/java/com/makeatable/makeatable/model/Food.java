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
@Table(name = "food")
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long uid = (long) 0;

    @Column(name="food_id")
    private String food_id;

    @Column(name="resto_id")
    private String resto_id;

    @Column(name="food_name")
    private String food_name;

    @Column(name="price")
    private String price;

    @Column(name="status")
    private String status;

    @Column(name="description")
    private String description;

    @Column(name="imageURL")
    private String imageURL;

   
}
