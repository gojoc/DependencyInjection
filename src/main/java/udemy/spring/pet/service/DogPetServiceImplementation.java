package udemy.spring.pet.service;

public class DogPetServiceImplementation implements PetService {
    @Override
    public String getPetType() {
        return "dog";
    }
}
