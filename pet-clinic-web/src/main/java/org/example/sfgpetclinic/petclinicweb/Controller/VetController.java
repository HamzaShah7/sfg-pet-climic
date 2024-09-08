package org.example.sfgpetclinic.petclinicweb.Controller;

import org.example.sfgpetclinic.petclinicdata.Service.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @GetMapping({"/vets","/vets/index"})
    public String ListVets(Model model){
        model.addAttribute("vets", vetService.findAll());

        return "vets/index";
    }
}
