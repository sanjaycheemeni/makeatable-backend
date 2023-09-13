package com.makeatable.makeatable.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "manager")
public class Manager {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long uid = (long) 0;

    @Column(name="username")
    private String username;

    @Column(name="resto_id")
    private String resto_id;

    @Column(name="resto_name")
    private String resto_name;

    @Column(name="loc_name")
    private String loc_name;

    @Column(name="loc_long")
    private String loc_long;

    @Column(name="loc_lat")
    private String loc_lat;

    @Column(name="phone")
    private String phone;

    @Column(name="room_type")
    private String room_type;

    @Column(name="start_time")
    private String start_time;

    @Column(name="end_time")
    private String end_time;

    @Column(name="resto_type")
    private String resto_type;

    @Column(name="capacity")
    private String capacity;

    @Column(name="status")
    private String status;

    @Column(name="pro_img_url")
    private String pro_img_url;

}
