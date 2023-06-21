package collections;

import java.util.ArrayDeque;

public class ProgramArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<String> animals = new ArrayDeque<String>();
        animals.addLast("Tiger");
        animals.add("Elephant");
        animals.addFirst("Lion");
        animals.add("Bear");
        System.out.println(animals);
        System.out.println("-------------------");
        System.out.println(animals.getLast());
        System.out.println(animals.getFirst());

        System.out.println("-------------------");
        for (String animal: animals){
            System.out.println(animal);
        }
        System.out.println();
        System.out.println(animals.peekFirst());
        System.out.println();
        animals.removeLast();
        System.out.println("-------------------");
        while (animals.peek()!= null){
            System.out.println(animals.pop());
        }

    }
}
