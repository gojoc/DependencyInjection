package udemy.spring.dependencyinjection.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SingletonBean implements Bean {
    public SingletonBean() {
        log.info("[SingletonBean] constructor");
    }

    @Override
    public String getScope() {
        return "singleton";
    }
}
