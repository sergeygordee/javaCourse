package tasks;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество элементов в массиве: ");
        size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Заполните массив целыми числами: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }
        //aver(arr);
        sum(arr);
        sc.close();
    }

    static void aver(int arr[]) {
        double aver = 0;
        for (int i = 0; i < arr.length; i++) {
            aver += (double) arr[i] / arr.length;
        }
        System.out.printf("Среднее арифметическое всех чисел массива: %.3f", aver);
    }

    static void sum(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            while (arr[i] != 0) {
                sum += arr[i] % 10;
                arr[i] /= 10;
            }
        }
        System.out.println("Сумма цифр: " + sum);
    }
}
