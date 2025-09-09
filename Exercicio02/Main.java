package Exercicio02;

public class Main {
    public static void main(String[] args) {
        
        DiscountCalculator blackFridayCalc = new DiscountCalculator(new DiscountBlackFriday());
        DiscountCalculator couponCalc = new DiscountCalculator(new DiscountCoupon());
        DiscountCalculator vipCalc = new DiscountCalculator(new DiscountVip());

        double price = 200;

        System.out.println("Black Friday: " + blackFridayCalc.calc(price));
        System.out.println("Coupon10: " + couponCalc.calc(price));
        System.out.println("VIP: " + vipCalc.calc(price));
    }
}
