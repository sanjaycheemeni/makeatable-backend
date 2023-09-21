package com.makeatable.makeatable.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "Booking")
public class  Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long uid = (long) 0;

    @Column(name="bookingid")
    private String booking_id;

    @Column(name="restoid")
    private String resto_id;

    @Column(name="datems")
    private Date date_ms;

    @Column(name="status")
    private String status;

    @Column(name="username")
    private String username;

    @Column(name="type")
    private String type;

    @Column(name="count")
    private String count;
}
