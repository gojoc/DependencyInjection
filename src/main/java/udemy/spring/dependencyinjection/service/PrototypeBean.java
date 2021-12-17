package udemy.spring.dependencyinjection.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Slf4j
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class PrototypeBean implements Bean {
    public PrototypeBean() {
        log.info("[PrototypeBean] constructor");
    }

    @Override
    public String getScope() {
        return "prototype";
    }
}
