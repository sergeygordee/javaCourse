package oop1;

public class PersonProgram {
    public static void main(String[] args) {
        Person sergey = new Person("Sergey", "Gordeev", "Alexeevich", 22);
        sergey.displayName();
        sergey.displayPatronomic();
        sergey.displayAge();
        //sergey.displaySurname();

        System.out.println("-------------------------");
        System.out.println(sergey.name);
        System.out.println(sergey.age);
        System.out.println(sergey.surname);
        //System.out.println(sergey.patronomic);
    }
}
