package oop4;

public class Person {
    private int id;
    static int counter;

    static {
        counter = 0;
        System.out.println("Это инициализатор");
    }
    Person(){
        id = counter++;
        System.out.println("Это конструктор");
    }
    public void displayId(){
        System.out.println(id);
    }

}
