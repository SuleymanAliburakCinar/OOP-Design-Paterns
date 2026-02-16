package patterns.structural.decorator;

public class Driver {
    public static void main(String[] args) {

        UserRepository baseRepo = new UserRepositoryImpl();
        UserRepository secureLogRepo = new UserRepositorySecurityDecorator(
                new UserRepositoryLogDecorator(baseRepo));

        System.out.println("--- Success 1 ---");
        secureLogRepo.save("john_doe");
        System.out.println();

        System.out.println("--- Access Denied ---");
        secureLogRepo.save("root");
        System.out.println();

        System.out.println("--- Error Simulation ---");
        secureLogRepo.save("error");
        System.out.println();

        System.out.println("--- Success 2 ---");
        String result = secureLogRepo.findByUserName("john_doe");
        System.out.println("Result: " + result);
        System.out.println();

        System.out.println("--- Error Simulation 2 ---");
        result = secureLogRepo.findByUserName("unknown");
        System.out.println("Result: " + result);
    }
}
