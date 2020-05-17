package com.acme.etl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;

public class PersonTest {

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
	public void testPerson() {
		// fail("Not yet implemented");
		// TODO: Create a Person Object
		// Ensure that the Person's object is created by verifying all attributes of the Person Object
		String name = "Hello";
		assertEquals(name, "Hello");
		
	}

}
