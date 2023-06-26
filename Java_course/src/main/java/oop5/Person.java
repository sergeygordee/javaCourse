package oop5;

public class Person {
    private int id;
    private static int counter = 0;

    Person(){
        id = counter++;
        System.out.println("Это конструктор");
    }
    public static void displayCounter(){
        System.out.println(counter);
    }
    public void displayId(){
        System.out.println(id);
    }

}

