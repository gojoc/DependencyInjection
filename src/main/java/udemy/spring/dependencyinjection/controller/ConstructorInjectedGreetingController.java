package udemy.spring.dependencyinjection.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import udemy.spring.dependencyinjection.service.GreetingService;

@Controller
public class ConstructorInjectedGreetingController {
    private final GreetingService greetingService;

    public ConstructorInjectedGreetingController(@Qualifier("constructorInjectedGreetingServiceImplementation")
                                                         GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.getGreeting();
    }
}
