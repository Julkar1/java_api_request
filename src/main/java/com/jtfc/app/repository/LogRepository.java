package com.jtfc.app.repository;

import org.springframework.data.jpa.repository.Query;
import com.jtfc.app.entity.Log;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface LogRepository extends CrudRepository<Log, Date> {

/*    // Custom query: Find driver by log date
    @Query("SELECT l.driver FROM Log l WHERE l.logDate = ?1")
    String findDriverByLogDate(Date logDate);

    // Custom query: Find number of accidents for a driver
    @Query("SELECT COUNT(a) FROM Accident a WHERE a.driver = ?1")
    long countAccidentsForDriver(String driver);*/
}

