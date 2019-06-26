package com.stefanalexnovak.snsfgpetclinic.services;

import com.stefanalexnovak.snsfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
