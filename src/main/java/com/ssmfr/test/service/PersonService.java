package com.ssmfr.test.service;

import java.util.List;

import com.ssmfr.test.entity.Person;

public interface PersonService {
	void addPerson(Person person);
	void deletePerson(Integer pid);
	void updatePerson(Person person);
	Person queryPerson(Integer pid);
	List<Person>queryAll();
}
