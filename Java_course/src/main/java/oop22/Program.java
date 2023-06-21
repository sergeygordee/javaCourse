package oop22;

public class Program {
    public static void main(String[] args) {
        Printable printable = createPrinteble("Hello", false);
        printable.print();

        read(new Book("Ice and Fire","J. Martin"));
        read(new Magazin("Cars"));
    }
    static Printable createPrinteble(String name, boolean option){
        if (option){
            return new Book(name, "Undefined");
        }
        else {
            return new Magazin(name);
        }
    }
    static  void read(Printable printable){
        printable.print();
    }
}
