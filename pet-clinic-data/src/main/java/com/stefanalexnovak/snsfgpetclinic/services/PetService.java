package com.stefanalexnovak.snsfgpetclinic.services;

import com.stefanalexnovak.snsfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
