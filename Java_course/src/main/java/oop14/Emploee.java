package oop14;

public class Emploee  extends Person{
    private String bank;
    public Emploee(String name, String company) {
        super(name);
        this.bank = company;
    }

    public void display(){
        System.out.println(super.getName()+ " " + bank);
    }
}
