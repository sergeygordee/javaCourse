package tasks;

import java.util.Scanner;

public class Max_min {
    public static void main(String[] args) {
        //На вход поступает какое то количество чисел.
        //Найти минимальное и максимальное значение.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел в массиве: ");
        int size = scanner.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Введите число: ");
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        min_max(array);
        average(array);
        sum_num(array);
    }
    //Метод по поиску минимального и  максимального значения
    static void min_max(int array[]) {
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);

    }
    //Метод по поиску среднего значения
    static void average(int array[]){
        double average_result = 0;
        int summa = 0;
        if (array.length == 0){
            System.out.println(average_result);
        }
        else {
            System.out.println("Работа с числителем");
            for (int i =0; i< array.length; i++){
                summa = summa + array[i];
                System.out.println(summa);

            }
            average_result = (double) summa / (double) array.length;
            System.out.printf("%.2f", average_result);
        }
    }

    static void sum_num(int array[]){
        int b = 0;
        for (int i = 0; i< array.length; i++){
            while (array[i] != 0){

                b = b + array[i] % 10;
                System.out.println(b);
                array[i] = array[i] / 10;
                System.out.println(array[i]);
            }
            System.out.println("Сумма цифр = " + b);
        }
    }
}