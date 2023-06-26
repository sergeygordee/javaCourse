package oop3;

public class Person {
    private int id;
    static int counter = 0;
    Person(){
        id = counter++;
    }
    public void displayId(){
        System.out.println(id);
    }
}
