package Exercicio02;

class DiscountVip implements DiscountPolicy {
    @Override
    public double apply(double amount) {
        return amount * 0.2;
    }
}
