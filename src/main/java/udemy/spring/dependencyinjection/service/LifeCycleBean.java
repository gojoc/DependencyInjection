package udemy.spring.dependencyinjection.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Slf4j
@Component
public class LifeCycleBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware,
        ApplicationContextAware {
    public LifeCycleBean() {
        log.info("[LifeCycleBean] constructor");
    }

    @Override
    public void destroy() {
        log.info("[LifeCycleBean] destroy");

    }

    @Override
    public void afterPropertiesSet() {
        log.info("[LifeCycleBean] afterPropertiesSet");

    }

    @Override
    public void setBeanName(String name) {
        log.info("[LifeCycleBean] setBeanName: {}", name);

    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) {
        log.info("[LifeCycleBean] setBeanFactory: {}", beanFactory);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) {
        log.info("[LifeCycleBean] setApplicationContext: {}", applicationContext);
    }

    @PostConstruct
    public void postConstruct() {
        log.info("[LifeCycleBean] postConstruct");
    }

    @PreDestroy
    public void preDestroy() {
        log.info("[LifeCycleBean] preDestroy");
    }

    public void beforeInit() {
        log.info("[LifeCycleBean] beforeInit");
    }

    public void afterInit() {
        log.info("[LifeCycleBean] afterInit");
    }
}
