package udemy.spring.dependencyinjection.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import udemy.spring.dependencyinjection.service.GreetingService;

@Controller
@AllArgsConstructor
public class CustomController {
    private final GreetingService greetingService;

    public String getGreeting() {
        return greetingService.getGreeting();
    }
}
