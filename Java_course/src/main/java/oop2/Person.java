package oop2;

public class Person {
    private String name;
    private int age = 22;

    public Person(String name, int age){
        setName(name);
        setAge(age);
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        if (age > 0 && age < 100){
            this.age = age;
        }
    }
}
