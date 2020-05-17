package com.acme.etl.transform;

import com.acme.etl.Person;

public interface IPersonCreator {
  public Person createPerson(String string);
}
