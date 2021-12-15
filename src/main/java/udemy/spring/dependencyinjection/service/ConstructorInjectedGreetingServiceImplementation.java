package udemy.spring.dependencyinjection.service;

import org.springframework.stereotype.Service;

@Service
public class ConstructorInjectedGreetingServiceImplementation implements GreetingService {
    @Override
    public String getGreeting() {
        return "Hello (constructor)";
    }
}
