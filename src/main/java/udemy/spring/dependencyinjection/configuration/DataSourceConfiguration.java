package udemy.spring.dependencyinjection.configuration;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Getter
@Setter
@ToString
@ConfigurationProperties("udemy.spring")
@Configuration
public class DataSourceConfiguration {
    private String username;
    private String password;
    private String url;
}
