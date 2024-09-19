package com.jtfc.app.entity;

import jakarta.persistence.*;

@Entity(name = "jn_car")
public class Car {

    @Id
    @Column(name = "licence", length = 10)
    private String licence;

    @Column(name = "year")
    private int year;

    @Column(name = "model", length = 10)
    private String model;

    @OneToOne
    @JoinColumn(name = "licence", referencedColumnName = "licence")
    private Owns owns;

    public Car(String s, int i, String axio) {
    }

    public Car() {

    }

    public String getLicence() {
        return licence;
    }

    public void setLicence(String licence) {
        this.licence = licence;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Owns getOwns() {
        return owns;
    }

    public void setOwns(Owns owns) {
        this.owns = owns;
    }
// Getters and Setters
}
