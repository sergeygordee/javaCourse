package oop20;

public class Book implements Printable, Searcheble{


    String name;
    String author;
    Book(String name, String author){
        this.author = author;
        this.name = name;
    }
    @Override
    public void print() {
        System.out.println(name + " " + author);
    }

    @Override
    public void search() {
        //Что то есть
    }
}
