package oop1;

public class Person {
    //Модтфикатор по умолчанию
    String name;
    public String surname;
    private String patronomic;
    protected int age;

    public Person(String name, String surname, String patronomic, int age) {
        this.name = name;
        this.surname = surname;
        this.patronomic = patronomic;
        this.age = age;
    }

    public void displayName() {
        System.out.println(name);
    }


    private void displaySurname() {
        System.out.println(surname);
    }

    protected void displayPatronomic() {
        System.out.println(patronomic);
    }

    void displayAge() {
        System.out.println(age);
    }
}
