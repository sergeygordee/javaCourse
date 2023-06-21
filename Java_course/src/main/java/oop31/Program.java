package oop31;

public class Program {
    public static void main(String[] args) {
        Person sergey1 = new Person("Sergey1");
        System.out.println(sergey1.hashCode());
        System.out.println();
        Person sergey2 = new Person("23");
        System.out.println(sergey2.hashCode());
        System.out.println();
        System.out.println(sergey2.getClass());

    }
}
