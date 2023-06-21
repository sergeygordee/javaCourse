package oop13;

//Наследует основные классы у персона
public class Emploee  extends Person{
    String company;
    public Emploee(String name, String company) {
        super(name);
        this.company = company;
    }
    public void work(){
        System.out.println(getName() + " " + company);
    }
}
