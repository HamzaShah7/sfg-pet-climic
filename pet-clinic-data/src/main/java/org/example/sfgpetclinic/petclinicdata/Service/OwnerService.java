package org.example.sfgpetclinic.petclinicdata.Service;

import org.example.sfgpetclinic.petclinicdata.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
