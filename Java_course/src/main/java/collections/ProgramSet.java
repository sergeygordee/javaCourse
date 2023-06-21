package collections;

import java.util.TreeSet;

public class ProgramSet {
    public static void main(String[] args) {
        TreeSet<String> animals = new TreeSet<>();
        animals.add("Rabbit");
        animals.add("Lion");
        animals.add("Bear");
        animals.add("Mouse");
        animals.add("Aist");
        animals.remove("Lion");
        System.out.println(animals);
        for (String animal:animals){
            System.out.println(animal);
        }

    }
}
