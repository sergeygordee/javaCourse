package collections;

import java.util.ArrayDeque;

public class ProgramObjectsDeque {
    public static void main(String[] args) {
        ArrayDeque<Person> people = new ArrayDeque<>();
        people.addFirst(new Person("Sergey"));
        people.addFirst(new Person("Anton"));
        for (Person person: people){
            System.out.println(person.getName());
        }
    }
}

class Person{
    private String name;
    public Person(String value){
        name = value;
    }
    String getName(){
        return name;
    }
}
