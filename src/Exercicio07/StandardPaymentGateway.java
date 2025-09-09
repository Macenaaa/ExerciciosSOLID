package Exercicio07;


public class StandardPaymentGateway implements PaymentGateway {


    @Override
    public PaymentResult charge(double amount) {
        String authCode = "AUTH - " + System.currentTimeMillis();
        return new PaymentResult(true, authCode);
    }
   
}
