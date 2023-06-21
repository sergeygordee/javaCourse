package oop30;

public class Program {
    public static void main(String[] args) {
        Animal animal1 = new Cat();
        Animal animal2 = new Dog();
        Animal animal3 = new Human();
        Animal animal4 = new Tiger();

        animal1.voice();
        animal2.voice();
        animal3.voice();
        animal4.voice();
    }
}
