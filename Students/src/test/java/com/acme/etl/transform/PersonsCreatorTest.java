package com.acme.etl.transform;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.acme.etl.Person;

public class PersonsCreatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
		// TODO: Declare a String
		// Using the PersonsExtractor extract a Person 
		// Ensure that the Persons attributes are set correctly
		IPersonCreator personCreator = new CvsTransformer();
		String string = "<Line similar to the line expected in a file>";
		Person person = personCreator.createPerson(string);
		// TODO test person's attributes
		
	}

}
