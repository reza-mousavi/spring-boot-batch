package com.reza.sample.batchprocessing.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Person {
	private Long id;
	private String name;
	private String family;

	public static Person transform(Person person) {
		return Person.builder()
				.name(person.getName().toUpperCase())
				.family(person.getFamily().toUpperCase())
				.build();
	}
}
