package org.example.sfgpetclinic.petclinicdata.model.Service;

import org.example.sfgpetclinic.petclinicdata.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
