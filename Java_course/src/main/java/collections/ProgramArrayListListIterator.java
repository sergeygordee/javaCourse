package collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ProgramArrayListListIterator {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Crocodile");
        animals.add("Lion");
        animals.add("Mouse");
        animals.add("Bear");
        ListIterator<String> listIterator = animals.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
            //listIterator.set("Fox");
        }
        System.out.println("-----------------");
        System.out.println(listIterator.previous());
        listIterator.remove();

        System.out.println(listIterator.next());
        System.out.println("-----------------");
        //listIterator.set("Fox");
        //System.out.println(animals);
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
            //listIterator.set("Fox");
        }
    }
}
