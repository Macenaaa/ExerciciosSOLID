package Exercicio02;


class DiscountCoupon implements DiscountPolicy {
    @Override
    public double apply(double amount) {
        return amount * 0.1;
    }
}


