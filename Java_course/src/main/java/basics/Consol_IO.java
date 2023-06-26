package basics;

public class Consol_IO {
    public static void main(String[] args) {
        //Для взаимодействия с консолью в Java применяется класс System
        //Для создания потока вывода в класс System определен объект out
        //Метод println  позволяет вывести на консоль некоторое значение
        // с последующим переводом на следующую строку
        System.out.println("Hello world");

        //Для вывода сложной контсрукции в двойных ковычках пишется текст,
        //который будет всегда отображаться. Знак + ставится для объединения элементов между собой
        int a = 12;
        int b = 4;
        System.out.println("a = " + a + " b = " + b);

        //Так же вывод может быть представлен в виде
        int x = 13;
        int y = 7;
        //Символы %d обозначают спецификатор, вместо которого подставляет один из аргументов
        System.out.printf("x = %d; y = %d \n", x, y);

        // %d - целочисленные
        // %f: для вывода чисел с плавающей точкой
        // %c: для вывода одиночного символа
        // %s: для вывода строковых значений
        String name = "Tom";
        int age = 30;
        float height = 1.7f;
        char gender = 'M';
        System.out.printf("Name: %s  Age: %d  Height: %.2f Gender: %c \n", name, age, height, gender);



        //
    }
}
