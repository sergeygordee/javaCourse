package oop25;

public class Program {
    public static void main(String[] args) {
        Book book1 =
                new Book("Ice and fire", "J. Martin", Type.PHANTASY);
        System.out.println(book1.name + " " + book1.author + " " + book1.bookType);
        switch (book1.bookType) {
            case SCIENCE:
                System.out.println("Это научный жанр");
                break;
            case PHANTASY:
                System.out.println("Это жанр фентези");
                break;
            case TECHNICAL:
                System.out.println("Не лезь сюда!");
                break;
        }
    }
}
