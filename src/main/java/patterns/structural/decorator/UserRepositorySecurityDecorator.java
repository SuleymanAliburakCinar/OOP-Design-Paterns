package patterns.structural.decorator;

public class UserRepositorySecurityDecorator extends UserRepositoryDecorator {

    public UserRepositorySecurityDecorator(UserRepository userRepository) {
        super(userRepository);
    }

    @Override
    public void save(String username) {
        if ("root".equalsIgnoreCase(username)) {
            System.out.println("[SECURITY] Access Denied");
            return;
        }
        System.out.println("[SECURITY] Grant Access");
        super.save(username);
    }

    @Override
    public String findByUserName(String username) {
        System.out.println("[SECURITY] Checking permissions for findByUserName...");
        return super.findByUserName(username);
    }
}