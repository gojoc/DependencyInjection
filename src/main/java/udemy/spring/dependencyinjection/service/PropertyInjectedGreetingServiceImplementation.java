package udemy.spring.dependencyinjection.service;

public class PropertyInjectedGreetingServiceImplementation implements GreetingService {
    @Override
    public String getGreeting() {
        return "Hello (property)";
    }
}
