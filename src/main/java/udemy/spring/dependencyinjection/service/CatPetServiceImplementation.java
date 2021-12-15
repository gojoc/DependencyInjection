package udemy.spring.dependencyinjection.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("cat")
@Service
public class CatPetServiceImplementation implements PetService {
    @Override
    public String getPetType() {
        return "cat";
    }
}
