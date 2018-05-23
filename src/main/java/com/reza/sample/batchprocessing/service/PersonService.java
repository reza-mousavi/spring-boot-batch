package com.reza.sample.batchprocessing.service;

import com.reza.sample.batchprocessing.model.Person;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

	private static final Logger logger = LogManager.getLogger(PersonService.class);
	public Person transform(Person person) {
		logger.info("Converting (" + person + ")");
		return Person.builder()
				.name(person.getName().toUpperCase())
				.family(person.getFamily().toUpperCase())
				.build();
	}

}
