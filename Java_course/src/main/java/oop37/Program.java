package oop37;

public class Program {
    public static void main(String[] args) {
        Printer printer = new Printer();
        String[] names = {"Julia", "Sergey", "Vladimir", "Anton"};
        Integer[] numbers = {33, 5, 78, 23,12,9};
        printer.<String>print(names);
        System.out.println();
        printer.<Integer>print(numbers);
        int a = 12;
        char b = '1';
        Integer c = 12;
    }
}
