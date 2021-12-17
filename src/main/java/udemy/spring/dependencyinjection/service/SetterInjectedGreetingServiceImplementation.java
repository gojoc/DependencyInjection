package udemy.spring.dependencyinjection.service;

public class SetterInjectedGreetingServiceImplementation implements GreetingService {
    @Override
    public String getGreeting() {
        return "Hello (setter)";
    }
}
