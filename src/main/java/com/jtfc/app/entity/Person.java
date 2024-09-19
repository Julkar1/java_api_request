package com.jtfc.app.entity;
import jakarta.persistence.*;

    @Entity(name = "jn_person")
    public class Person {

        @Id
        @Column(name = "nid", length = 255)
        private String nid;

        @Column(name = "name", length = 255)
        private String name;

        @Column(name = "address", length = 255)
        private String address;

        public Person(String number, String sajib, String chittagong) {
        }

        public Person() {

        }

        // Getters and Setters

        public String getNid() {
            return nid;
        }

        public void setNid(String nid) {
            this.nid = nid;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
    }

