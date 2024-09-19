package com.jtfc.app.entity;

import jakarta.persistence.Entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity(name = "jn_accident")
public class Accident {

    @Id
    @Column(name = "acc_date")
    private Date accDate;

    @Column(name = "driver", length = 10)
    private String driver;

    @Column(name = "ammount", precision = 10)
    private double amount;

    @OneToOne
    @JoinColumn(name = "acc_date", referencedColumnName = "log_date")
    private Log log;

    public Accident(LocalDate of, String arif, int i) {
    }

    public Accident() {

    }

    public Date getAccDate() {
        return accDate;
    }

    public void setAccDate(Date accDate) {
        this.accDate = accDate;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Log getLog() {
        return log;
    }

    public void setLog(Log log) {
        this.log = log;
    }
// Getters and Setters
}
