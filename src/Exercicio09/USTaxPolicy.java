package Exercicio09;


public class USTaxPolicy implements TaxPolicy {


    @Override
    public double calcular(double base) {
        return base * 0.7;
    }
   
}


