package com.reza.sample.batchprocessing.batch;

import com.reza.sample.batchprocessing.model.Person;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.batch.item.ItemProcessor;

public class PersonItemProcessor implements ItemProcessor<Person, Person> {

	private static final Logger logger = LogManager.getLogger(PersonItemProcessor.class);

	@Override
	public Person process(final Person person) throws Exception {
		final Person transformedPerson = Person.transform(person);
		logger.info("Converting (" + person + ") into (" + transformedPerson + ")");
		return transformedPerson;
	}
}
