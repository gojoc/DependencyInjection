package udemy.spring.dependencyinjection.controller;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import udemy.spring.dependencyinjection.service.ConstructorInjectedGreetingServiceImplementation;

@Slf4j
class ConstructorInjectedGreetingControllerTest {
    ConstructorInjectedGreetingController constructorInjectedGreetingController;

    @BeforeEach
    void setUp() {
        constructorInjectedGreetingController =
                new ConstructorInjectedGreetingController(new ConstructorInjectedGreetingServiceImplementation());
    }

    @Test
    void getGreeting() {
        log.info(constructorInjectedGreetingController.getGreeting());
    }
}