package com.ssmfr.test.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ssmfr.test.dao.PersonMapper;
import com.ssmfr.test.entity.Person;
import com.ssmfr.test.service.PersonService;
@Service("personService")
public class PersonServiceImpl implements PersonService {

	@Resource(name="personDao")
	private PersonMapper personDao;
	@Override
	public void addPerson(Person person) {
		// TODO Auto-generated method stub
		personDao.insert(person);
	}

	@Override
	public void deletePerson(Integer pid) {
		// TODO Auto-generated method stub
		personDao.deleteByPrimaryKey(pid);
	}

	@Override
	public void updatePerson(Person person) {
		// TODO Auto-generated method stub
		personDao.updateByPrimaryKey(person);
	}

	@Override
	public Person queryPerson(Integer pid) {
		// TODO Auto-generated method stub
		return personDao.selectByPrimaryKey(pid);
	}

	@Override
	public List<Person> queryAll() {
		// TODO Auto-generated method stub
		return personDao.selectAll();
	}

}
