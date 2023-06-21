package oop16;

public class Emploee extends Person{
    String bank;
    public Emploee(String name, String bank) {
        super(name);
        this.bank = bank;
    }

    public Emploee(String bank) {
        super(bank);
    }


    public String getCompany(){
        return bank;
    }
    public void display(){
        System.out.println(super.getName() + " " + bank);
    }
}
