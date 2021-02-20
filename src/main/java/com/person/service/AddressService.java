package com.person.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.person.model.Address;
import com.person.model.Person;

public interface AddressService extends JpaRepository<Address, Integer>{
	
}

