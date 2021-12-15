package udemy.spring.dependencyinjection.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingServiceImplementation implements GreetingService {
    @Override
    public String getGreeting() {
        return "Hello (primary)";
    }
}
