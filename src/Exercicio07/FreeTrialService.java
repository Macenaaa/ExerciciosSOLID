package Exercicio07;


public class FreeTrialService implements PaymentGateway{


    @Override
    public PaymentResult charge(double amount) {
       return new PaymentResult(true, null);
    }
   
}
