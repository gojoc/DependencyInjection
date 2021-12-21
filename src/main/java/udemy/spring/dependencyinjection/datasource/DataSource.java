package udemy.spring.dependencyinjection.datasource;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class DataSource {
    private String username;
    private String password;
    private String url;
}
