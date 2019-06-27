package com.stefanalexnovak.snsfgpetclinic.services;

import com.stefanalexnovak.snsfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
