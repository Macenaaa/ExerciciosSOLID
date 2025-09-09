package Exercicio01;

import java.util.List;


public class InvoiceCalculator {


    public double calcularTotal(List<Double> items,double tax) {
        double sum = 0;


    for(Double i : items) sum += i;
        return sum * (1 + tax);
    }
}

