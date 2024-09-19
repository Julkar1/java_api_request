package com.jtfc.app.entity;

import jakarta.persistence.*;

@Entity(name = "jn_owns")
public class Owns {

    @Id
    @Column(name = "licence", length = 10)
    private String licence;

    @ManyToOne
    @JoinColumn(name = "nid", referencedColumnName = "nid")
    private Person person;

    public Owns(String number, String s) {
    }

    public Owns() {

    }

    // Getters and Setters

    public String getLicence() {
        return licence;
    }

    public void setLicence(String licence) {
        this.licence = licence;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
