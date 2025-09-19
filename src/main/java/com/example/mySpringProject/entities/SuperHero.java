package com.example.mySpringProject.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "SUPERHERO")
public class SuperHero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "DATE")
    private String date;

    @Column(name = "COUNTRY")
    private String country;

    @Column(name = "CITY")
    private String city;

    @Column(name = "STATE")
    private String state;

    @Column(name = "FIRSTNAME")
    private String firstName;

    @Column(name = "LASTNAME")
    private String lastName;

    @Column(name = "SUPERPOWER")
    private String superPower;

    @Column(name = "BLOG_COMPLETED")
    private Boolean blogCompleted;

    public Integer getId() {
        return this.id;
    }

    public String getDate() {
        return this.date;
    }

    public String getCountry() {
        return this.country;
    }

    public String getCity() {
        return this.city;
    }

    public String getState() {
        return this.state;
    }


    public Boolean getBlogCompleted() {
        return this.blogCompleted;
    }

    public void setBlogCompleted(Boolean blogCompleted) {
        this.blogCompleted = blogCompleted;
    }

}