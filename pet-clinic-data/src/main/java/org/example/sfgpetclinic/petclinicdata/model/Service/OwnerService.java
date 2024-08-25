package org.example.sfgpetclinic.petclinicdata.model.Service;

import org.example.sfgpetclinic.petclinicdata.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
