package Exercicio05;

public class Main {

    public static void main(String[] args) {
        
         UserRepository userRepository = new MySqlUserRepository();
        EmailService emailService = new SmtpEmailService();


        UserController userController = new UserController(userRepository, emailService);
        User user = new User("juliamacena@gmail.com");
        userController.registrar(user);
        
    }
    
}
