package collections;

import java.util.Map;
import java.util.TreeMap;

public class ProgramTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> animals = new TreeMap<>();
        animals.put(12, "Bear");
        animals.put(15, "Mouse");
        animals.put(7, "Fox");
        animals.put(14, "Crocodile");
        animals.put(13, "Rabbit");
        System.out.println(animals);
        System.out.println(animals.get(12));
        for (Map.Entry<Integer, String> animal :animals.entrySet()) {
            System.out.println(animal);
        }
        Map<Integer,String> beforeMap = animals.headMap(13);
        System.out.println(beforeMap);
        Map<Integer,String> afterMap = animals.tailMap(13);
        System.out.println(afterMap);
        Map.Entry<Integer, String> lastEntry = animals.lastEntry();
        System.out.println(lastEntry);
        int last = animals.lastKey();
        System.out.println(last);
        int first = animals.firstKey();
        System.out.println(first);

    }
}
