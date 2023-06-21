package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1 = 12;
        double num2 = 12.5;
        char symbol = '!';
        boolean n1 = true;
        boolean n2 = false;
        String stroka = "adsadasd";

        //System.out.println("Hello world!");

        Scanner scanner = new Scanner(System.in);
        //System.out.println("Введите число: ");
        //int number1 = scanner.nextInt();
        //System.out.println("Вы ввели число: " + number1);
        //
        //System.out.println("Введите число: ");
        //double number2 = scanner.nextDouble();
        //System.out.println("Вы ввели число: " + number2);

        int a = 12;
        int b = 8;
        //Первый способ
        //System.out.println(a);
        //System.out.println(b);
        //Второй способ
        //System.out.println(a + " " + b);
        //Третий способ
        //System.out.printf("a = %d \nb = %d ", a, b);
        //System.out.println();
        //String str1 = "Привет";
        //String str2 = "Здорова";
        //System.out.printf("%s \nstr2 = %s", str2, str1);
        System.out.println("Введите строку до пробела: ");
        String text1 = scanner.next();
        System.out.println("Вы ввели строку: " + text1);

        System.out.println("Введите целую строку с пробелом: ");
        String text2 = scanner.nextLine();
        System.out.println("Вы ввели строку: " + text2);

    }
}