package com.jtfc.app.repository;

import com.jtfc.app.entity.Accident;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface AccidentRepository extends CrudRepository<Accident, Date> {
}
