package udemy.spring.dependencyinjection.service;

public class ConstructorInjectedGreetingServiceImplementation implements GreetingService {
    @Override
    public String getGreeting() {
        return "Hello (constructor)";
    }
}
