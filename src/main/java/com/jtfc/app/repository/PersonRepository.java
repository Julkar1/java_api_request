package com.jtfc.app.repository;
import com.jtfc.app.entity.Person;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends CrudRepository<Person, String> {
    // Custom query: Find persons by address
 /*   @Query("SELECT p.name FROM Person p WHERE p.address = 'Rajshahi'")
    List<String> findNamesByAddress();

    // Custom query: Find names and addresses by car model
    @Query("SELECT p.name, p.address FROM Person p JOIN p.owns o JOIN o.car c WHERE c.model = 'Alto'")
    List<Object[]> findNameAndAddressByCarModel();*/
}

