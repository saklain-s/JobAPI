package com.saklain.firstjobapp.job;

import com.saklain.firstjobapp.company.Company;
import jakarta.persistence.*;

@Entity
// if you want an customized table@Table(name = "job_table")
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private String maxSalary;
    private String minSalary;
    private String location;

    public Job(Long id, String  title, String description, String maxSalary, String minSalary, String location) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.maxSalary = maxSalary;
        this.minSalary = minSalary;
        this.location = location;
    }
    @ManyToOne
    private Company company;

    public Job() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(String maxSalary) {
        this.maxSalary = maxSalary;
    }

    public String getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(String minSalary) {
        this.minSalary = minSalary;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
