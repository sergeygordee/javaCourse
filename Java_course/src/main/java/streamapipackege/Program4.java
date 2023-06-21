package streamapipackege;

import streamapipackege.Animal;

import java.util.stream.Stream;

public class Program4 {
    public static void main(String[] args) {
        Stream<Animal> animalStream =
                Stream.of(new Animal("Elephant", 120 ),
        new Animal("Lion", 70 ),
        new Animal("Mouse", 10 ));

        animalStream
                .map(n->"Животное: " +  n.getName() + " Цена: " +  + n.getPrice())
                .forEach(s -> System.out.println(s));

    }
}
