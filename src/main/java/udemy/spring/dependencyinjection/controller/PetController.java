package udemy.spring.dependencyinjection.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import udemy.spring.dependencyinjection.service.PetService;

@Controller
@AllArgsConstructor
public class PetController {
    private final PetService petService;

    public String getPetType() {
        return petService.getPetType();
    }
}
