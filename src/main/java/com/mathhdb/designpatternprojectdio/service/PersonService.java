package com.mathhdb.designpatternprojectdio.service;

import com.mathhdb.designpatternprojectdio.model.Person;

public interface PersonService {

    Iterable<Person> findAllPerson();

    Person findByIdPerson(Long id);

    void createPerson(Person person);

    void updatePerson(Long id, Person person);

    void deletePerson(Long id);
}
