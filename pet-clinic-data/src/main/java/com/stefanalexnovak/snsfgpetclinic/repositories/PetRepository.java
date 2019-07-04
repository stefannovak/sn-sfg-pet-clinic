package com.stefanalexnovak.snsfgpetclinic.repositories;

import com.stefanalexnovak.snsfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
