package oop17;

public class Program {
    public static void main(String[] args) {
        //Book book1 = new Book("Game of thrones", "J. Martin");
        //book1.print();

        Printable printable1 = new Book("Game of thrones", "J. Martin");
        printable1.print();

        Printable printable2 = new Magazin("Russian trueth");
        printable2.print();

        Printable printable3 = new TextBook("Maths", "Peterson", 2018);
        printable3.print();

        Printable printable4 = new Magazin("Krasivo");
        printable4.print();
        String name = ((Magazin)printable4).getName();
        System.out.println(name);
    }
}
