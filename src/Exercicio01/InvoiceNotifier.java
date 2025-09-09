package Exercicio01;

public class InvoiceNotifier implements Notifier {


    @Override
    public void enviarEmail(Invoice inv) {
        System.out.println("Enviando email: " + inv);
    }
}

