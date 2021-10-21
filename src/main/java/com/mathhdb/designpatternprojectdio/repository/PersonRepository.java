package com.mathhdb.designpatternprojectdio.repository;

import com.mathhdb.designpatternprojectdio.model.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {
}
