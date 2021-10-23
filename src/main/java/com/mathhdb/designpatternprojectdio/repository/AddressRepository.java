package com.mathhdb.designpatternprojectdio.repository;

import com.mathhdb.designpatternprojectdio.model.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends CrudRepository<Address, String> {
}
