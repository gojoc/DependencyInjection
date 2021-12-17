package udemy.spring.pet.service;

public class CatPetServiceImplementation implements PetService {
    @Override
    public String getPetType() {
        return "cat";
    }
}
