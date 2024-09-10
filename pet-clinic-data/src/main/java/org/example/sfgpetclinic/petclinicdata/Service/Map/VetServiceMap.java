package org.example.sfgpetclinic.petclinicdata.Service.Map;

import org.example.sfgpetclinic.petclinicdata.Service.VetService;
import org.example.sfgpetclinic.petclinicdata.model.Vet;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    @Override
    public Set<Vet> findAll() {
        return super.findALl();
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }
}
