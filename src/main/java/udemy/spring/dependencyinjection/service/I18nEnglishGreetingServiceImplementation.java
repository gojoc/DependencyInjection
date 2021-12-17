package udemy.spring.dependencyinjection.service;

import lombok.AllArgsConstructor;
import udemy.spring.dependencyinjection.repository.EnglishGreetingRepository;

@AllArgsConstructor
public class I18nEnglishGreetingServiceImplementation implements GreetingService {
    private final EnglishGreetingRepository englishGreetingRepository;

    @Override
    public String getGreeting() {
        return englishGreetingRepository.getGreeting();
    }
}
