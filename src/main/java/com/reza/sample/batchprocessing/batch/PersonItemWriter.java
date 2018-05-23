package com.reza.sample.batchprocessing.batch;

import com.reza.sample.batchprocessing.model.Person;
import com.reza.sample.batchprocessing.repository.PersonRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

import java.util.List;

public class PersonItemWriter implements ItemWriter<Person> {

	private static final Logger logger = LogManager.getLogger(PersonItemProcessor.class);

	@Autowired
	private PersonRepository personRepository;

	@Override
	public void write(List<? extends Person> list) throws Exception {
		if(!CollectionUtils.isEmpty(list)){
			logger.info("Persisting the list of size : " + list.size());
			personRepository.saveAll(list);
		}
	}
}
