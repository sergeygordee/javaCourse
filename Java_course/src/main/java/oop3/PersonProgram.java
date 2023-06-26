package oop3;

public class PersonProgram {
    public static void main(String[] args) {
        Person sergey1 = new Person();
        Person sergey2 = new Person();

        sergey1.displayId();
        sergey2.displayId();
        System.out.println(Person.counter);
        Person.counter = 10;

        Person sergey3 = new Person();
        sergey3.displayId();

        Person sergey4 = new Person();
        sergey4.displayId();
    }
}
