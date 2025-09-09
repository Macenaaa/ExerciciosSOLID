package Exercicio05;

public class SmtpEmailService implements EmailService {

    @Override
    public void sendEmail(String email, String text) {
        System.out.println("Email sent to " + email + ": " + text);
    }
    
}
