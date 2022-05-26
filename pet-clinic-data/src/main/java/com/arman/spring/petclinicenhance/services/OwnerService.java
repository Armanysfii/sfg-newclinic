package com.arman.spring.petclinicenhance.services;

import com.arman.spring.petclinicenhance.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastname(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();


}
