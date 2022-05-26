package com.arman.spring.petclinicenhance.services;

import com.arman.spring.petclinicenhance.model.Owner;
import com.arman.spring.petclinicenhance.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
