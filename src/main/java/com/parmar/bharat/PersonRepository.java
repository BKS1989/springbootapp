package com.parmar.bharat;

import org.springframework.data.jpa.repository.JpaRepository;

import com.parmar.bharat.models.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {
	
	
}
