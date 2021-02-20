package com.person.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.person.model.Person;

public interface PersonService extends JpaRepository<Person, Integer>
{
	
}