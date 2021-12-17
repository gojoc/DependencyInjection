package udemy.spring.dependencyinjection.repository;

public class EnglishGreetingRepositoryImplementation implements EnglishGreetingRepository {
    @Override
    public String getGreeting() {
        return "Hello";
    }
}
