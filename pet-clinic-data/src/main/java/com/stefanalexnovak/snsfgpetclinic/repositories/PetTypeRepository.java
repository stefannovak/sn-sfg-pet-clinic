package com.stefanalexnovak.snsfgpetclinic.repositories;

import com.stefanalexnovak.snsfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
