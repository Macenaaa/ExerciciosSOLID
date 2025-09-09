package Exercicio09;


import java.util.HashMap;
import java.util.Map;


public class TaxPolicyResolver {
    private Map<String, TaxPolicy> policies = new HashMap<>();


    public TaxPolicyResolver() {
        policies.put("BR", new BrazilTaxPolicy());
        policies.put("US", new USTaxPolicy());
        policies.put("DE", new GermanyTaxPolicy());
    }


    public TaxPolicy geTaxPolicy(String countryCode) {
        return policies.getOrDefault(countryCode, base -> 0);
    }
}



