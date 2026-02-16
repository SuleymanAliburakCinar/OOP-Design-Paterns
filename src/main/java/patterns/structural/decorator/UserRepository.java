package patterns.structural.decorator;

public interface UserRepository {
    void save(String username);
    String findByUserName(String username);
}