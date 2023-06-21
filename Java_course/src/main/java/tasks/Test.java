package tasks;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumMoney, year;
        float percent = 6;
        System.out.println("Введите сумму вклада: ");
        sumMoney = sc.nextInt();
        System.out.println("Введите количество лет вклада: ");
        year = sc.nextInt();
        if (year >= 1) {
            if (sumMoney >= 1000000) percent += 0.5;
            if (year >= 7) percent += 0.4;
            for (int i = 0; i < year; i++) {
                sumMoney += sumMoney * percent / 100;
                System.out.println(sumMoney);
            }
            System.out.println("Итоговая сумма вклада после " + year + " лет: " + sumMoney);
        } else {
            System.out.println("Минимальное количество лет для вклада - 1 год. ");
        }
        sc.close();
    }
}