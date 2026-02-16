package patterns.structural.decorator;

public class UserRepositoryImpl implements UserRepository {

    @Override
    public void save(String username) {
        if ("error".equalsIgnoreCase(username)) {
            throw new RuntimeException("Database connection failed!");
        }
        System.out.println("Saving " + username + " user to database ...");
    }

    @Override
    public String findByUserName(String username) {
        if ("unknown".equalsIgnoreCase(username)) {
            throw new RuntimeException("User not found in database!");
        }
        System.out.println("Searching database for user: " + username);
        return "User: " + username;
    }
}