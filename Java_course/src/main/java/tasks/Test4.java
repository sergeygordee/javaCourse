package tasks;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numb;
        System.out.println("Введите число: ");
        numb = sc.nextInt();
        divider(numb);
        sc.close();
    }

    static void divider(int number) {
        int countDiv = 0;
        System.out.println("Делители числа " + number + ": ");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
                countDiv++;
            }
        }
        System.out.println("Количество делителей числа " + number + ": " + countDiv);
    }
}
