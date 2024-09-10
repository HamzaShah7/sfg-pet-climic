package org.example.sfgpetclinic.petclinicdata.Service.Map;

import org.example.sfgpetclinic.petclinicdata.Service.OwnerService;
import org.example.sfgpetclinic.petclinicdata.model.Owner;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner , Long> implements OwnerService {

    @Override
    public Set<Owner> findAll() {
        return super.findALl();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
