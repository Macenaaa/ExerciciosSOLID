package Exercicio09;


public class GermanyTaxPolicy implements TaxPolicy {


    @Override
    public double calcular(double base) {
        return base * 0.19;
    }
}
