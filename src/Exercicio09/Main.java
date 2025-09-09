package Exercicio09;


public class Main {
    public static void main(String[] args) {
       
        TaxPolicyResolver taxPolicyResolver = new TaxPolicyResolver();


        TaxCalculator taxCalculator = new TaxCalculator(taxPolicyResolver);


        double baseAmount = 100.0;


        System.out.println("Imposto no Brasil (BR): " + taxCalculator.calcular("BR", baseAmount));
        System.out.println("Imposto nos EUA (US): " + taxCalculator.calcular("US", baseAmount));
        System.out.println("Imposto na Alemanha (DE): " + taxCalculator.calcular("DE", baseAmount));
        System.out.println("Imposto no Japão (JP): " + taxCalculator.calcular("JP", baseAmount)); // País novo
        System.out.println("Imposto em França (FR): " + taxCalculator.calcular("FR", baseAmount)); // País desconhecido
    }
}
