package com.jtfc.app.repository;

import com.jtfc.app.entity.Owns;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnsRepository extends CrudRepository<Owns, String> {
}
