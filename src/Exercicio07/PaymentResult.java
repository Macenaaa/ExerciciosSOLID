package Exercicio07;


public class PaymentResult {
   
    boolean sucesso;
    String authCode;


    public PaymentResult(boolean sucesso, String authCode) {
        this.sucesso = sucesso;
        this.authCode = authCode;
    }
}


