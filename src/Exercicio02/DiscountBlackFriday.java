package Exercicio02;


class DiscountBlackFriday implements DiscountPolicy {
    @Override
    public double apply(double amount) {
        return amount * 0.3;
    }
}
