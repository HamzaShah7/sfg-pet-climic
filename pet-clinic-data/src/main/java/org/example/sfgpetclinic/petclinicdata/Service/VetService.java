package org.example.sfgpetclinic.petclinicdata.Service;

import org.example.sfgpetclinic.petclinicdata.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();

}
