package org.example.sfgpetclinic.petclinicweb.Bootstrap;

import org.example.sfgpetclinic.petclinicdata.Service.Map.OwnerServiceMap;
import org.example.sfgpetclinic.petclinicdata.Service.Map.VetServiceMap;
import org.example.sfgpetclinic.petclinicdata.Service.OwnerService;
import org.example.sfgpetclinic.petclinicdata.Service.VetService;
import org.example.sfgpetclinic.petclinicdata.model.Owner;
import org.example.sfgpetclinic.petclinicdata.model.Vet;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final VetService vetService;
    private final OwnerService ownerService;

    public DataLoader(VetService vetService, OwnerService ownerService) {
        this.vetService = vetService;
        this.ownerService = ownerService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner = new Owner();
        owner.setFirstName("John");
        owner.setLastName("Doe");
        ownerService.save(owner);

        Owner owner1 = new Owner();
        owner1.setFirstName("Jane");
        owner1.setLastName("Doe");
        ownerService.save(owner1);

        System.out.println("Loaded Owner...");

        Vet vet = new Vet();
        vet.setFirstName("Jane");
        vet.setLastName("Doe");
        vetService.save(vet);

        System.out.println("Loaded Vet...");
    }
}
