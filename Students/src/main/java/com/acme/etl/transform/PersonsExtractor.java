package com.acme.etl.transform;

import java.util.ArrayList;
import java.util.List;

import com.acme.etl.Person;

public class PersonsExtractor {

	public static List<Person> extractPersons(String fileName) {
		List<Person> persons = new ArrayList<>();
		// TODO add the logic to read one line at a time from the file with the name fileName
		// Convert each line into a Person
		// Add the Person object to the collection persons
		return persons;
	}
}
