package collections;

import java.util.ArrayList;

public class ProgramArrayList {
    public static void main(String[] args) {
        ArrayList<String> people = new ArrayList<String>();
        people.add("Sergey");
        people.add("Andrey");
        people.add("Anton");
        people.add("Liza");
        people.add(2, "qwerty");
        System.out.println(people.get(0));
        System.out.println(people);
        for(String person:people){
            System.out.println(person);
        }
        if (people.contains("Sergey")){
            System.out.println("Человек с именем Сергей есть в списке");
        }
        people.remove(0);
        people.remove("Andrey");
        System.out.println(people);
        System.out.println(people.get(0));
        int peopleCount = people.size();
        System.out.println(peopleCount);
        ArrayList<String> animals = new ArrayList<String>(3);
     }
}
