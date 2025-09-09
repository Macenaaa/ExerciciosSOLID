package Exercicio05;

public class MySqlUserRepository implements UserRepository {

    @Override
    public void saveUser(User user) {
        System.out.println("User " + user.getName() + " saved in MySQL database.");
    }
    
}
