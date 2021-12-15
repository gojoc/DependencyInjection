package udemy.spring.dependencyinjection.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"ES", "default"})
@Service("i18nService")
public class I18nSpanishGreetingServiceImplementation implements GreetingService {
    @Override
    public String getGreeting() {
        return "Hola";
    }
}
