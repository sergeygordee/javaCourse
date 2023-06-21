package oop17;

public class TextBook implements Printable{
     String name;
     String author;
     int year;
     TextBook(String name, String author, int year){
         this.name = name;
         this.author = author;
         this.year = year;
     }
    @Override
    public void print() {
        System.out.println(name + " " + author + " " + year);
    }
}
