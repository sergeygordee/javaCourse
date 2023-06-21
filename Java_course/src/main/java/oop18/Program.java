package oop18;

public class Program {
    public static void main(String[] args) {
        Calculatable calculatable = new Calculation();
        System.out.println(calculatable.sum(10,12));
        System.out.println(calculatable.sum(12,12,13));
    }
}
