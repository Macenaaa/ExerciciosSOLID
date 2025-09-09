package Exercicio03;

public class Main {
    public static void main(String[] args) {

        
        Retangle retangle = new Retangle(5, 10);
        System.out.println("Retangle area: " + retangle.area());
        retangle.setWidth(20);
        System.out.println("Retangle area after setWidth(20): " + retangle.area());
        retangle.setHeight(30);
        System.out.println("Retangle area after setHeight(30): " + retangle.area());

        Square square = new Square(5);
        System.out.println("Square area: " + square.area());
        square.setSide(10);
        System.out.println("Square area after setSide(10): " + square.area());
    }
    
}
