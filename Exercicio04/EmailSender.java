package Exercicio04;

interface EmailSender {
    void sendEmail(String to, String subject, String body);
}

interface SmsSender {
    void sendSms(String phone, String text);
}

interface PushSender {
    void sendPush(String deviceToken, String msg);
}
