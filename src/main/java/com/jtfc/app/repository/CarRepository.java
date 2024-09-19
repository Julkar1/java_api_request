package com.jtfc.app.repository;

import com.jtfc.app.entity.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

@Repository
public interface CarRepository extends CrudRepository<Car, String> {

   /* // Custom query: Find car models by year
    @Query("SELECT c.model FROM Car c WHERE c.year = 2013")
    List<String> findModelsByYear(int year);*/
}
