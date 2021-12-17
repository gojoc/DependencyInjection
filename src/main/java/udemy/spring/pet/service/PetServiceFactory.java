package udemy.spring.pet.service;

public class PetServiceFactory {
    public PetService getPetService(String petType) {
        if (petType.equals("cat")) {
            return new CatPetServiceImplementation();
        }
        return new DogPetServiceImplementation();
    }
}
