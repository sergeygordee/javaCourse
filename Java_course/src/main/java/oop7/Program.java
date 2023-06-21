package oop7;

public class Program {
    public static void main(String[] args) {
        Person sergey = new Person("Sergey");
        System.out.println(sergey.getName());
        changeName(sergey);
        System.out.println(sergey.getName());
    }
    static void changeName(Person p){
        p.setName("asdasd");
    }
}
