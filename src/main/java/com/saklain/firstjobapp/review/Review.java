package com.saklain.firstjobapp.review;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.saklain.firstjobapp.company.Company;
import jakarta.persistence.*;

@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private double rating;

    @JsonIgnore//we'll be ha
    @ManyToOne
    private Company company;



    public void setCompany(Company company) {
        this.company = company;
    }

    public Review(){

    }
    public Company getCompany() {
        return company;
    }


    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
