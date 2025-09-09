package Exercicio01;

import java.util.List;


public class InvoiceService {
   
    private InvoiceCalculator calculator;
    private InvoiceNotifier notifier;
    private InvoiceRepository repository;


    public InvoiceService(InvoiceCalculator calculator, InvoiceNotifier notifier, InvoiceRepository repository) {
        this.calculator = calculator;
        this.notifier = notifier;
        this.repository = repository;
    }


    public void processoInvoice(Invoice inv, List<Double> items, double tax) {
       
        double total = calculator.calcularTotal(items, tax);


        inv =  new Invoice(inv.getId(), inv.getCustomerEmail(), total);
        repository.salvarNoBanco(inv);


        try {
            notifier.enviarEmail(inv);
        } catch (Exception e) {
            System.out.println("Falha ao enviar o e-mail para: " + e.getMessage());
        }


    }
}


