package oop21;

public class Magazin implements Printeble{
    String name;
    Magazin(String name){
        this.name = name;
    }
    @Override
    public void print() {
        System.out.println(name);
    }
}
