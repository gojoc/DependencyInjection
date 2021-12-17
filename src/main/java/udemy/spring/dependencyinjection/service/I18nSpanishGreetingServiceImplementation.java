package udemy.spring.dependencyinjection.service;

public class I18nSpanishGreetingServiceImplementation implements GreetingService {
    @Override
    public String getGreeting() {
        return "Hola";
    }
}
