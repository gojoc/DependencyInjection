package udemy.spring.dependencyinjection.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"dog", "default"})
@Service
public class DogPetServiceImplementation implements PetService {
    @Override
    public String getPetType() {
        return "dog";
    }
}
