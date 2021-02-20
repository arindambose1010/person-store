package com.person;

import com.person.model.Address;
import com.person.model.Person;
import com.person.service.AddressService;
import com.person.service.PersonService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@CrossOrigin(origins = "*",value = "*")
@RestController
public class PersonController {

    @Autowired
    private PersonService personService;
    
    @Autowired
    private AddressService addressService;

    @GetMapping(value = "/persons")
    List<Person> getallperson(){
        return  personService.findAll();
    }

    @GetMapping(value = "/persons-count")
    int getperson(){
        return  personService.findAll().size();
    }
    
    @GetMapping(value = "/person/{id}")
    Person getperson(@PathVariable Integer id){
        return  personService.findById(id).get();
    }
    @PostMapping(value = "/person")
    String addperson(@RequestBody Person person){
        Person savedperson = personService.save(person);
        return "SUCCESS";
    }

    @PutMapping(value = "/person")
    Person updateperson(@RequestBody Person person){
        Person updatedperson = personService.save(person);
        return updatedperson;
    }

    @DeleteMapping(value = "/person")
    Map<String, String> deleteperson(@RequestParam Integer id){
        Map<String, String> status = new HashMap<>();
        Optional<Person> person = personService.findById(id);
        if(person.isPresent()) {
            personService.delete(person.get());
            status.put("Status", "person deleted successfully");
        }
        else {
            status.put("Status", "person not exist");
        }
        return status;
    }

    @GetMapping(value = "/address/{id}")
    Address getaddress(@PathVariable Integer id){
        return  addressService.findById(id).get();
    }

    @PostMapping(value = "/address")
    String addaddress(@RequestBody Address address){
        Address addresssave = addressService.save(address);
        return "SUCCESS";
    }

    @PutMapping(value = "/address")
    Address updateaddress(@RequestBody Address address){
        Address updatedAddress = addressService.save(address);
        return updatedAddress;
    }

    @DeleteMapping(value = "/address")
    Map<String, String> deleteaddress(@RequestParam Integer id){
        Map<String, String> status = new HashMap<>();
        Optional<Address> address = addressService.findById(id);
        if(address.isPresent()) {
        	addressService.delete(address.get());
            status.put("Status", "address deleted successfully");
        }
        else {
            status.put("Status", "address not exist");
        }
        return status;
    }

}
