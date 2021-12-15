package udemy.spring.dependencyinjection.controller;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import udemy.spring.dependencyinjection.service.PropertyInjectedGreetingServiceImplementation;

@Slf4j
class PropertyInjectedGreetingControllerTest {
    PropertyInjectedGreetingController propertyInjectedGreetingController;

    @BeforeEach
    void setUp() {
        propertyInjectedGreetingController = new PropertyInjectedGreetingController();
        propertyInjectedGreetingController.greetingService = new PropertyInjectedGreetingServiceImplementation();
    }

    @Test
    void getGreeting() {
        log.info(propertyInjectedGreetingController.getGreeting());
    }
}