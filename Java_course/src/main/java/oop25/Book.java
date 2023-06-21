package oop25;

public class Book {
    String name;
    String author;
    Type bookType;
    Book(String name, String author, Type bookType){
        this.name = name;
        this.author = author;
        this.bookType = bookType;
    }
}

enum Type {
    SCIENCE,
    PHANTASY,
    TECHNICAL
}
