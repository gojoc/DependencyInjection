package udemy.spring.dependencyinjection.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import udemy.spring.dependencyinjection.service.GreetingService;

@Controller
public class PropertyInjectedGreetingController {
    @Qualifier("propertyInjectedGreetingServiceImplementation")
    @Autowired
    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.getGreeting();
    }
}
