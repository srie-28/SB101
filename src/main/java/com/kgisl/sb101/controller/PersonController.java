package com.kgisl.sb101.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.kgisl.sb101.entity.Person;
import com.kgisl.sb101.repository.PersonRepository;
import com.kgisl.sb101.service.PersonRequest;

import jakarta.validation.Valid;

@RequestMapping("/person")
@RestController
public class PersonController {

    @Autowired
    private PersonRepository personRepository;
    	@GetMapping
	public List<Person> getAllPersons() {
		// System.out.println("######################");
		// System.out.println(personRepository.findAll());
		return personRepository.findAll();
	}

    @PostMapping
    public ResponseEntity<String> createPerson(@Valid @RequestBody PersonRequest personRequest) {
        // Create and save the person record
        Person person = new Person(null, personRequest.getUname(), personRequest.getEmail());
        personRepository.save(person);
        return ResponseEntity.ok("Person created successfully");
    }
    @PutMapping("/{id}")
    public ResponseEntity<String> updatePerson(
            @PathVariable Long id,
            @Valid @RequestBody PersonRequest personRequest) {
        
        if (!personRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }

        Person person = new Person(id, personRequest.getUname(), personRequest.getEmail());
        personRepository.save(person);

        return ResponseEntity.ok("Person updated successfully");
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePerson(@PathVariable Long id) {
        if (!personRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }

        personRepository.deleteById(id);

        return ResponseEntity.ok("Person deleted successfully");
    }
}