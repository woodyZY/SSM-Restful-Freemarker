package com.ssmfr.test.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ssmfr.test.entity.Person;
import com.ssmfr.test.service.PersonService;

@Controller
@RequestMapping("/person")
public class PersonController {
	@Resource(name="personService")
	private PersonService personService;
	
	@RequestMapping("/add")
	public String addPersonPage(){
		return "addPersonPage";
	}
	
	@RequestMapping(value="/{pid}",method=RequestMethod.POST)
	public String addPerson(Person person){
		personService.addPerson(person);
		return "redirect:/person/";
	}
	
	@RequestMapping(value="/{pid}",method=RequestMethod.DELETE)
	public String deletePerson(@PathVariable Integer pid){
		personService.deletePerson(pid);
		return "redirect:/person/";
	}
	
	@RequestMapping(value="/{pid}/update")
	public String updatePersonPage(@PathVariable Integer pid,Model model){
		model.addAttribute("pid",pid);
		return "updatePersonPage";
	}
	
	@RequestMapping(value="/{pid}",method=RequestMethod.PUT)
	public String updatePerson(Person person){
		personService.updatePerson(person);
		return "redirect:/person/";
	}
	
	@RequestMapping(value="/{pid}",method=RequestMethod.GET)
	public String queryPerson(@PathVariable Integer pid,Model model){
		Person person = personService.queryPerson(pid);
		List<Person>persons = new ArrayList<Person>();
		persons.add(person);
		model.addAttribute("persons",persons);
		return "showPersons";
	}
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String queryAll(Model model){
		List<Person>persons = new ArrayList<Person>();
		persons = personService.queryAll();
		model.addAttribute("persons",persons);
		return "showPersons";
	}
}
