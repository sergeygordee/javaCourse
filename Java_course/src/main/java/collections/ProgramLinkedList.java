package collections;

import java.util.LinkedList;

public class ProgramLinkedList {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList();
        animals.add("Lion");
        animals.addLast("Bear");
        animals.addFirst("Lama");
        animals.add("Rabbit");
        animals.add(1, "Mouse");
        System.out.println(animals);
        System.out.println(animals.get(0));
        if (animals.contains("Lion")){
            System.out.println("Лев Есть");
        }
        animals.remove();
        animals.remove("Sergey");
        animals.remove(1);
        animals.removeFirst();
        animals.removeLast();
    }
}
