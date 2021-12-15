package udemy.spring.dependencyinjection.service;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreetingServiceImplementation implements GreetingService {
    @Override
    public String getGreeting() {
        return "Hello (setter)";
    }
}
