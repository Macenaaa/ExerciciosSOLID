package Exercicio04;

public class Main {

    public static void main(String[] args) {
        
        EmailSender emailSender = new SmtpEmailSender();
        SmsSender smsSender = new SmsSende();
        PushSender pushSender = new FirebasePushSender();

        PasswordRecoveryService recovery = new PasswordRecoveryService(emailSender);
        recovery.recoverPassword("user@mail.com");

        MarketingService marketing = new MarketingService(smsSender);
        marketing.sendPromotion("+55 47 99999-9999");

        pushSender.sendPush("Usuario123", "Você tem uma nova notificação!");
    }
}

