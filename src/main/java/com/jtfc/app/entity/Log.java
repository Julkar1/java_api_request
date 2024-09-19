package com.jtfc.app.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity(name = "jn_log")
public class Log {

    @Id
    @Column(name = "log_date")
    private Date logDate;

    @Column(name = "driver", length = 10)
    private String driver;

    @ManyToOne
    @JoinColumn(name = "licence", referencedColumnName = "licence")
    private Owns owns;

    public Log(String s, LocalDate of, String akter) {
    }

    public Log() {

    }

    public Date getLogDate() {
        return logDate;
    }

    public void setLogDate(Date logDate) {
        this.logDate = logDate;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public Owns getOwns() {
        return owns;
    }

    public void setOwns(Owns owns) {
        this.owns = owns;
    }
// Getters and Setters
}