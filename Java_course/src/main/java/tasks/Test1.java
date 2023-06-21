package tasks;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size, sumOdd = 0;
        System.out.println("Введите количество элементов массива: ");
        size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Введите числа: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Вывод массива: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr[" + i + "] = " + arr[i]);
            System.out.println();
            if (i % 2 == 1) sumOdd += arr[i];
        }
        System.out.println("Сумма чисел всех нечетных индексов: " + sumOdd);
        sc.close();
    }
}
