package Exercicio09;


public class BrazilTaxPolicy implements TaxPolicy{


    @Override
    public double calcular(double base) {
        return base * 0.18 + base * 0.09;
    }
   
}
