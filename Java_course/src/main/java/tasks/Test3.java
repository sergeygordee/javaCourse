package tasks;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        int size, number;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество элементов в массиве: ");
        size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Заполните массив целыми числами: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Введите натуральное число: ");
        number = sc.nextInt();
        digitNumber(arr, number);
        sc.close();
    }

    static void digitNumber(int arr[], int number) {

        int count = 0, sumEl = 0, copyNumber, countDigit = 0;
        System.out.println("Числа, сумма цифр которого равна " + number + ":");
        for (int i = 0; i < arr.length; i++) {
            copyNumber = arr[i];
            while (copyNumber != 0) {
                sumEl += copyNumber % 10;
                copyNumber /= 10;
                countDigit++;
            }
            if (sumEl == number && countDigit == 3) {
                System.out.println("Arr[" + i + "] = " + arr[i]);
                count++;
            }
            sumEl = 0;
            countDigit = 0;
        }
        System.out.println("Количество чисел: " + count);

    }
}
