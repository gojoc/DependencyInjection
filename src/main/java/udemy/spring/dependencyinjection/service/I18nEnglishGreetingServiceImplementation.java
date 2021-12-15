package udemy.spring.dependencyinjection.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18nService")
public class I18nEnglishGreetingServiceImplementation implements GreetingService {
    @Override
    public String getGreeting() {
        return "Hello";
    }
}
