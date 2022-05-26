package com.arman.spring.petclinicenhance.services;

import com.arman.spring.petclinicenhance.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastname(String lastName);

}
