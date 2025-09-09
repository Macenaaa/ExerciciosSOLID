package Exercicio04;

class SmsSende implements SmsSender {
    @Override
    public void sendSms(String phone, String text) {
        System.out.println("SMS enviado para " + phone + ": " + text);
    }
}
