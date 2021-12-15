package udemy.spring.dependencyinjection;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import udemy.spring.dependencyinjection.controller.ConstructorInjectedGreetingController;
import udemy.spring.dependencyinjection.controller.CustomController;
import udemy.spring.dependencyinjection.controller.I18nController;
import udemy.spring.dependencyinjection.controller.PetController;
import udemy.spring.dependencyinjection.controller.PropertyInjectedGreetingController;
import udemy.spring.dependencyinjection.controller.SetterInjectedGreetingController;

@Slf4j
@SpringBootApplication
public class DependencyInjectionApplication {
    public static void main(String[] arguments) {
        ApplicationContext applicationContext = SpringApplication.run(DependencyInjectionApplication.class, arguments);
        CustomController customController = (CustomController) applicationContext.getBean("customController");
        log.info("[DependencyInjectionApplication] CustomController: {}", customController.getGreeting());
        PropertyInjectedGreetingController propertyInjectedGreetingController = (PropertyInjectedGreetingController)
                applicationContext.getBean("propertyInjectedGreetingController");
        log.info("[DependencyInjectionApplication] PropertyInjectedController: {}", propertyInjectedGreetingController
                .getGreeting());
        SetterInjectedGreetingController setterInjectedGreetingController = (SetterInjectedGreetingController)
                applicationContext.getBean("setterInjectedGreetingController");
        log.info("[DependencyInjectionApplication] SetterInjectedController: {}", setterInjectedGreetingController
                .getGreeting());
        ConstructorInjectedGreetingController constructorInjectedGreetingController =
                (ConstructorInjectedGreetingController) applicationContext
                        .getBean("constructorInjectedGreetingController");
        log.info("[DependencyInjectionApplication] ConstructorInjectedController: {}",
                constructorInjectedGreetingController.getGreeting());
        I18nController i18nController = (I18nController) applicationContext.getBean("i18nController");
        log.info("[DependencyInjectionApplication] I18nController: {}", i18nController.getGreeting());
        PetController petController = (PetController) applicationContext.getBean("petController");
        log.info("[DependencyInjectionApplication] PetController: {}", petController.getPetType());
    }
}