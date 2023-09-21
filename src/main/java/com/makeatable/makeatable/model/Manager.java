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

    @Column(name="restoid")
    private String restoid;

    @Column(name="restoname")
    private String restoname;

    @Column(name="locname")
    private String locname;

    @Column(name="loclong")
    private String loclong;

    @Column(name="loclat")
    private String loclat;

    @Column(name="phone")
    private String phone;

    @Column(name="roomtype")
    private String roomtype;

    @Column(name="starttime")
    private String starttime;

    @Column(name="endtime")
    private String endtime;

    @Column(name="restotype")
    private String restotype;

    @Column(name="capacity")
    private String capacity;

    @Column(name="status")
    private String status;

    @Column(name="proimgurl")
    private String proimgurl;



}
