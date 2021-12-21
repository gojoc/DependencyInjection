package udemy.spring.dependencyinjection.configuration;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@AllArgsConstructor
@Getter
@ToString
@ConfigurationProperties("udemy.spring")
@ConstructorBinding
public class DataSourceConstructorConfiguration {
    private final String username;
    private final String password;
    private final String url;
}
