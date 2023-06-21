package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ProgramMap {
    public static void main(String[] args) {
        Map<Integer, String> animals = new HashMap<>();
        animals.put(1, "Lion");
        animals.put(2, "Mouse");
        animals.put(13, "Crocodile");
        animals.put(4, "Bear");
        System.out.println(animals);
        System.out.println(animals.get(2));
        Set<Integer> keys = animals.keySet();
        System.out.println(keys);
        Collection<String> values = animals.values();
        System.out.println(values);
        animals.replace(2, "Duck");
        System.out.println(animals);
        for (Map.Entry<Integer, String> animal :animals.entrySet()) {
            System.out.println(animal);
        }
        System.out.println(animals.get(4).hashCode());
        System.out.println(animals.get(2).hashCode());
        animals.remove(13);
        System.out.println(animals);
        System.out.println(animals.size());
        //animals.clear();
        //System.out.println(animals);
        System.out.println();
        System.out.println(animals.containsKey(1));
        System.out.println(animals.containsValue("lion"));
        Map<String, Person1> people = new HashMap<>();
        people.put("1234", new Person1("Sergey"));
        people.put("1235", new Person1("Anton"));
        people.put("1236", new Person1("Liza"));
        people.put("1237", new Person1("Artem"));
        System.out.println(people);
        for (Map.Entry<String, Person1> human :people.entrySet()) {
            System.out.println(human.getKey()+ " " + human.getValue().getName() +" " + human.hashCode());
        }
        System.out.println("----------------------");
        people.remove("1234");
        for (Map.Entry<String, Person1> human :people.entrySet()) {
            System.out.println(human.getKey()+ " " + human.getValue().getName() +" " + human.hashCode());
        }

    }
}

class Person1{
    private String name;
    public Person1(String value){
        name = value;
    }
    String getName(){
        return name;
    }
}
