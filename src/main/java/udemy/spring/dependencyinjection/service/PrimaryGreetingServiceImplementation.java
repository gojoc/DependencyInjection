package udemy.spring.dependencyinjection.service;

public class PrimaryGreetingServiceImplementation implements GreetingService {
    @Override
    public String getGreeting() {
        return "Hello (primary)";
    }
}
