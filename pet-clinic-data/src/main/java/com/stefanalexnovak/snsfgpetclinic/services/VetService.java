package com.stefanalexnovak.snsfgpetclinic.services;

import com.stefanalexnovak.snsfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
