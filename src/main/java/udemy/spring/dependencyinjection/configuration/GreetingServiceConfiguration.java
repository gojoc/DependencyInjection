package udemy.spring.dependencyinjection.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import udemy.spring.dependencyinjection.repository.EnglishGreetingRepository;
import udemy.spring.dependencyinjection.repository.EnglishGreetingRepositoryImplementation;
import udemy.spring.dependencyinjection.service.I18nEnglishGreetingServiceImplementation;
import udemy.spring.dependencyinjection.service.I18nSpanishGreetingServiceImplementation;
import udemy.spring.dependencyinjection.service.PrimaryGreetingServiceImplementation;
import udemy.spring.dependencyinjection.service.PropertyInjectedGreetingServiceImplementation;
import udemy.spring.dependencyinjection.service.SetterInjectedGreetingServiceImplementation;
import udemy.spring.pet.service.PetService;
import udemy.spring.pet.service.PetServiceFactory;

@ImportResource("classpath:configuration.xml")
@Configuration
public class GreetingServiceConfiguration {
    @Bean
    EnglishGreetingRepository englishGreetingRepository() {
        return new EnglishGreetingRepositoryImplementation();
    }

    @Bean
    PropertyInjectedGreetingServiceImplementation propertyInjectedGreetingServiceImplementation() {
        return new PropertyInjectedGreetingServiceImplementation();
    }

    @Bean
    SetterInjectedGreetingServiceImplementation setterInjectedGreetingServiceImplementation() {
        return new SetterInjectedGreetingServiceImplementation();
    }

    @Primary
    @Bean
    PrimaryGreetingServiceImplementation primaryGreetingServiceImplementation() {
        return new PrimaryGreetingServiceImplementation();
    }

    @Profile("EN")
    @Bean("i18nService")
    I18nEnglishGreetingServiceImplementation i18nEnglishGreetingServiceImplementation(EnglishGreetingRepository
                                                                                              englishGreetingRepository) {
        return new I18nEnglishGreetingServiceImplementation(englishGreetingRepository);
    }

    @Profile({"ES", "default"})
    @Bean("i18nService")
    I18nSpanishGreetingServiceImplementation i18nSpanishGreetingServiceImplementation() {
        return new I18nSpanishGreetingServiceImplementation();
    }

    @Bean
    PetServiceFactory petServiceFactory() {
        return new PetServiceFactory();
    }

    @Profile({"dog", "default"})
    @Bean
    PetService dogPetServiceImplementation(PetServiceFactory petServiceFactory) {
        return petServiceFactory.getPetService("dog");
    }

    @Profile("cat")
    @Bean
    PetService catPetServiceImplementation(PetServiceFactory petServiceFactory) {
        return petServiceFactory.getPetService("cat");
    }
}
