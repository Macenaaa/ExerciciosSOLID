package Exercicio04;

class PasswordRecoveryService {
    private final EmailSender emailSender;

    public PasswordRecoveryService(EmailSender emailSender) {
        this.emailSender = emailSender;
    }

    public void recoverPassword(String email) {
        
        emailSender.sendEmail(email, "Recuperação de senha", "Clique no link para resetar sua senha.");
    }
}

class MarketingService {
    private final SmsSender smsSender;

    public MarketingService(SmsSender smsSender) {
        this.smsSender = smsSender;
    }

    public void sendPromotion(String phone) {
        smsSender.sendSms(phone, "Promoção imperdível!");
    }
}

