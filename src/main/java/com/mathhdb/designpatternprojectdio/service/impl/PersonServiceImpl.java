package com.mathhdb.designpatternprojectdio.service.impl;

import com.mathhdb.designpatternprojectdio.model.Address;
import com.mathhdb.designpatternprojectdio.model.Person;
import com.mathhdb.designpatternprojectdio.repository.AddressRepository;
import com.mathhdb.designpatternprojectdio.repository.PersonRepository;
import com.mathhdb.designpatternprojectdio.service.PersonService;
import com.mathhdb.designpatternprojectdio.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;
    @Autowired
    private AddressRepository addressRepository;
    @Autowired
    private ViaCepService viaCepService;

    @Override
    public Iterable<Person> findAllPerson() {
        return personRepository.findAll();
    }

    @Override
    public Person findByIdPerson(Long id) {
        return personRepository.findById(id).orElseThrow();
    }

    @Override
    public void createPerson(Person person) {
        Address verifyAddress = verifyCep(person);
        person.setAddress(verifyAddress);
        personRepository.save(person);
    }

    @Override
    public void updatePerson(Long id, Person person) {

        personRepository.findById(person.getId()).orElseThrow();
        personRepository.save(person);

    }

    @Override
    public void deletePerson(Long id) {

        personRepository.deleteById(id);
    }

    private Address verifyCep(Person person){
        Address addressCep = addressRepository.findById(person.getAddress().getCep()).orElseGet(() -> {
            Address newAddress = viaCepService.getCep(person.getAddress().getCep());
            addressRepository.save(newAddress);
            return newAddress;
            });

        return addressCep;
    }

}
