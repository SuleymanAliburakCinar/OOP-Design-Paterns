package patterns.structural.decorator;

public abstract class UserRepositoryDecorator implements UserRepository{

    protected UserRepository decoratedRepository;

    UserRepositoryDecorator(UserRepository userRepository) {
        this.decoratedRepository = userRepository;
    }

    @Override
    public void save(String username) {
        decoratedRepository.save(username);
    }

    @Override
    public String findByUserName(String username) {
        return decoratedRepository.findByUserName(username);
    }
}