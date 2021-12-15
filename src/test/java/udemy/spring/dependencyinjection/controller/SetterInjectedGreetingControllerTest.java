package udemy.spring.dependencyinjection.controller;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import udemy.spring.dependencyinjection.service.SetterInjectedGreetingServiceImplementation;

@Slf4j
class SetterInjectedGreetingControllerTest {
    SetterInjectedGreetingController setterInjectedGreetingController;

    @BeforeEach
    void setUp() {
        setterInjectedGreetingController = new SetterInjectedGreetingController();
        setterInjectedGreetingController.setGreetingService(new SetterInjectedGreetingServiceImplementation());
    }

    @Test
    void getGreeting() {
        log.info(setterInjectedGreetingController.getGreeting());
    }
}