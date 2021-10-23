package com.mathhdb.designpatternprojectdio.controller;

import com.mathhdb.designpatternprojectdio.model.Person;
import com.mathhdb.designpatternprojectdio.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping
    public ResponseEntity<Iterable<Person>> findAllPerson() {
        return ResponseEntity.ok(personService.findAllPerson());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Person> findByIdPerson(@PathVariable Long id) {
        return ResponseEntity.ok(personService.findByIdPerson(id));
    }

    @PostMapping
    public ResponseEntity<Person> createPerson(@RequestBody Person person) {
        personService.createPerson(person);
        return ResponseEntity.ok(person);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Person> updatePerson(@PathVariable Long id, @RequestBody Person person) {
        personService.updatePerson(id, person);
        return ResponseEntity.ok(person);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePerson(@PathVariable Long id) {
        personService.deletePerson(id);
        return ResponseEntity.ok().build();
    }
}
