package oop16;

public class Client extends Person{

    private int sum;
    private String bank;
    public Client(String name, String bank, int sum) {
        super(name);
        this.bank = bank;
        this.sum = sum;
    }
    public void display(){
        System.out.println(super.getName() + " " + bank + " " + sum);
    }
    public String getBank(){
        return bank;
    }
    public int getSum(){
        return sum;
    }
}
