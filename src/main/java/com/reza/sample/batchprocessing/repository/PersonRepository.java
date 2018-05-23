package com.reza.sample.batchprocessing.repository;

import com.reza.sample.batchprocessing.model.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {
}
