package patterns.structural.decorator;

public class UserRepositoryLogDecorator extends UserRepositoryDecorator{

    public UserRepositoryLogDecorator(UserRepository userRepository) {
        super(userRepository);
    }

    @Override
    public void save(String username) {
        long start = System.currentTimeMillis();
        try {
            System.out.println("[LOG] save() called for username: " + username);

            super.save(username);

            long duration = System.currentTimeMillis() - start;
            System.out.println("[LOG] save() completed in " + duration + " ms");
        } catch (Exception e) {
            long duration = System.currentTimeMillis() - start;
            System.out.println("[ERROR] save() failed after " + duration + " ms");
            System.out.println("[ERROR] message=" + e.getMessage());
        }
    }

    @Override
    public String findByUserName(String username) {
        long start = System.currentTimeMillis();

        try {
            System.out.println("[LOG] findByUserName() called for username: " + username);

            String result = super.findByUserName(username);

            long duration = System.currentTimeMillis() - start;
            System.out.println("[LOG] findByUserName() completed in " + duration + " ms");

            return result;
        } catch (Exception e) {
            long duration = System.currentTimeMillis() - start;
            System.out.println("[ERROR] findByUserName() failed after " + duration + " ms");
            System.out.println("[ERROR] message=" + e.getMessage());
            return null;
        }
    }
}