package com.arman.spring.petclinicenhance.services;

import com.arman.spring.petclinicenhance.model.Owner;
import com.arman.spring.petclinicenhance.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
