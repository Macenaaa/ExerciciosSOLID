package Exercicio02;
public class DiscountCalculator {
    
        private final DiscountPolicy policy;
    
        public DiscountCalculator(DiscountPolicy policy) {
            this.policy = policy;
        }
    
        public double calc(double amount) {
            return policy.apply(amount);
        }
    }
    

