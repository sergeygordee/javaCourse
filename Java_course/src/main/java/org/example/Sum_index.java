package org.example;

import java.util.Scanner;

public class Sum_index {
    public static void main(String[] args) {
        /*
         * На вход поступает число - количество чисел в массиве.
         * Происходит заполнение этого массива числами с клавиатуры.
         * Задача: вывести сами числа и
         * сумму чисел всех нечетных индексов в массиве.
         * */

               /* 5 - количество символов в массиве
                0= 12; 1 = 54;2 = 2; 3 = 123; 4 = 765;
    }           12, 54, 2, 123, 765
                res = 54+ 123;
                */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов массива");
        int size = scanner.nextInt();
        int summa = 0;
        int array[] = new int[size];
        //Заполнение массива числами с клавиатуры
        for (int i = 0;i < size; i++){
            System.out.println("Введите число");
            array[i] = scanner.nextInt();
        }
        //Вывод введенного массива
        System.out.print("Исходный массив: ");
        for (int i = 0; i < size; i++){
            System.out.print(array[i]);
        }
        System.out.println();
        //Хождение по четным и нечетным индексам
        for (int j = 1; j < size; j++){
            if (j % 2 == 0){
                j++;
            }
            else {
                summa+=array[j];
                j++;
                //System.out.println(summa);
            }
        }
        System.out.println("Сумма нечетных индексов = "
                +summa);
    }
}
