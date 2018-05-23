package com.reza.sample.batchprocessing.batch;

import com.reza.sample.batchprocessing.model.Person;
import com.reza.sample.batchprocessing.service.PersonService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;

public class PersonItemProcessor implements ItemProcessor<Person, Person> {

	private static final Logger logger = LogManager.getLogger(PersonItemProcessor.class);

	@Autowired
	private PersonService personService;

	public PersonItemProcessor() {
		logger.info("Creating processor instance.");
	}

	@Override
	public Person process(final Person person) throws Exception {
		final Person transformedPerson = personService.transform(person);
		logger.info("Converted (" + person + ") into (" + transformedPerson + ")");
		return transformedPerson;
	}
}
