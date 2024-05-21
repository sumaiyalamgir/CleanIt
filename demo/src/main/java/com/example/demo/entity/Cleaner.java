package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class Cleaner {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cleanerid;
    private String cleanerName;
    private String gender;
    @Column(unique = true)
    private String contact;
    private String wage;
    private String area;

    public Cleaner() {
    }

    public Cleaner(int cleanerid, String cleanerName, String gender, String contact, String wage, String area) {
        this.cleanerid = cleanerid;
        this.cleanerName = cleanerName;
        this.gender = gender;
        this.contact = contact;
        this.wage = wage;
        this.area = area;
    }

    public int getCleanerid() {
        return cleanerid;
    }

    public void setCleanerid(int cleanerid) {
        this.cleanerid = cleanerid;
    }

    public String getCleanerName() {
        return cleanerName;
    }

    public void setCleanerName(String cleanerName) {
        this.cleanerName = cleanerName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getWage() {
        return wage;
    }

    public void setWage(String wage) {
        this.wage = wage;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
