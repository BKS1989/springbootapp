package com.parmar.bharat;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.parmar.bharat.models.Person;

@SpringBootApplication
@RestController
public class NginxPostRequestApplication {

	@Autowired
	private PersonRepository personRepo;

	@RequestMapping(method = RequestMethod.GET, value = "/person")
	public List<Person> getPersons() {
		return personRepo.findAll();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/person/{personId}")
	public Person getPerson(@PathVariable Integer personId) {
		return personRepo.findOne(personId);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/person")
	public Person postPerson(@RequestBody Person person) {
		return personRepo.save(person);
	}

	public static void main(String[] args) {
		SpringApplication.run(NginxPostRequestApplication.class, args);
	}
}
