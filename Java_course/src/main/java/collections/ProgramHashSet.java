package collections;

import java.util.HashSet;

public class ProgramHashSet {
    public static void main(String[] args) {
        HashSet<String> animals = new HashSet<>();
        animals.add("Lion");
        animals.add("Rabbit");
        animals.add("Bear");
        boolean isAdded1 = animals.add("qw");
        boolean isAdded = animals.add("Mouse");
        boolean isAdded2 = animals.add("q");
        boolean isAdded3 = animals.add("Lion");
        System.out.println(isAdded1);
        System.out.println(isAdded);
        System.out.println(isAdded2);
        System.out.println(isAdded3);
        animals.remove("Lion");
        //animals.removeAll(animals);
        System.out.println(animals);


    }
}
