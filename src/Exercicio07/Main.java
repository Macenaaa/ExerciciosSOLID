package Exercicio07;


public class Main {
    public static void main(String[] args) {
       
        PaymentProcessor standardProcessor = new PaymentProcessor(new StandardPaymentGateway());
        standardProcessor.processPayment(100.0);


        PaymentProcessor freeTrialProcessor = new PaymentProcessor(new FreeTrialService());
        freeTrialProcessor.processPayment(0.0);


    }
}
