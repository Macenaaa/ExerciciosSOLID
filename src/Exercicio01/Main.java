package Exercicio01;

import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
       
        InvoiceCalculator calculator = new InvoiceCalculator();
        InvoiceNotifier notifier = new InvoiceNotifier();
        InvoiceRepository repository = new InvoiceRepository();


        InvoiceService invoiceService = new InvoiceService(calculator, notifier, repository);


        Invoice invoice = new Invoice("INV-01", "julia@gmail.com", 100.5);


        List<Double> items = Arrays.asList(100.0, 50.0, 90.2);
        double tax = 0.1;


        invoiceService.processoInvoice(invoice, items, tax);
    }
}
