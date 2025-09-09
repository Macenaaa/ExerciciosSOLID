package Exercicio07;


public class PaymentProcessor {
   
    private PaymentGateway paymentGateway;


    public PaymentProcessor(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }


    public void processPayment(double amount) {
        PaymentResult result = paymentGateway.charge(amount);


        if(result.sucesso) {
            System.out.println("Pagamento realizado com sucesso! AuthCode: " + result.authCode);
        } else {
            System.out.println("Pagamento falhou.");
        }
    }
}


