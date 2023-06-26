package oop;

class Person {
    String name;
    int age;

    {
        name = "Undefined";
        age = 22;
    }
    Person() {

    }

    Person(String n) {
        this.name = n;
    }


    Person(String n, int a) {
        this.name = n;
        this.age = a;
    }

    void info() {
        System.out.printf("Name: %s \t Age: %d\n", name, age);
    }
}


