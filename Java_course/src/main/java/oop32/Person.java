package oop32;

public class Person {
    private String name;
    public Person(String name){
        this.name = name;
    }
    @Override
    public boolean equals(Object object){
        if (!(object instanceof Person))
            return false;
        Person person = (Person)object;
        return this.name.equals(person.name);
    }
}
