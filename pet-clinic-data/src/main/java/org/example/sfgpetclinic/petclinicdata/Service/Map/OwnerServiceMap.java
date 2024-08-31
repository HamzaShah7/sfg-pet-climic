package org.example.sfgpetclinic.petclinicdata.Service.Map;

import org.example.sfgpetclinic.petclinicdata.Service.CrudService;
import org.example.sfgpetclinic.petclinicdata.model.Owner;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner , Long> implements CrudService<Owner, Long> {

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
        return super.save(object.getId() , object);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
