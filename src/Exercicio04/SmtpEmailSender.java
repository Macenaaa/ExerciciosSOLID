package Exercicio04;

class SmtpEmailSender implements EmailSender {
    @Override
    public void sendEmail(String to, String subject, String body) {
        System.out.println("Email enviado para " + to + " com assunto: " + subject);
    }
}

class SmsSende implements SmsSender {
    @Override
    public void sendSms(String phone, String text) {
        System.out.println("SMS enviado para " + phone + ": " + text);
    }
}

class FirebasePushSender implements PushSender {
    @Override
    public void sendPush(String deviceToken, String msg) {
        System.out.println("Push enviado para " + deviceToken + ": " + msg);
    }
}
