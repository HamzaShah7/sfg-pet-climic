package org.example.sfgpetclinic.petclinicweb.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/owners")
public class OwnerController {

    @GetMapping({"","/index"})
    public String showOwner() {
        return "owners/index.html";
    }
}
