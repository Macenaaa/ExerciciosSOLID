package Exercicio05;


public class UserController {
     
    private final UserRepository repository;
    private final EmailService email;


    public UserController(UserRepository repository, EmailService email) {
        this.repository = repository;
        this.email = email;
    }


    public void registrar(User user) {
        repository.salvar(user);
        email.enviarEmail(user.getEmail());
    }
}



    
