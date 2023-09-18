package com.makeatable.makeatable.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "Booking")
public class  Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long uid = (long) 0;

    @Column(name="booking_id")
    private String booking_id;

    @Column(name="resto_id")
    private String resto_id;

    @Column(name="date_ms")
    private String date_ms;

    @Column(name="status")
    private String status;

    @Column(name="username")
    private String username;

    @Column(name="type")
    private String type;

    @Column(name="count")
    private String count;
}
