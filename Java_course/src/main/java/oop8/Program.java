package oop8;

public class Program {
    public static void main(String[] args) {
        Person sergey = new Person("Sergey");
        System.out.println(sergey.getName());
        changePerson(sergey);
        System.out.println(sergey.getName());
    }

    static void changeName(Person p) {
        p.setName("asdasd");
    }

    static void changePerson(Person p){
        p = new Person("Alla");
        p.setName("Albert");
    }
}
