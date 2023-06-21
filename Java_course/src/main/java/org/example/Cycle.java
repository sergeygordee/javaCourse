package org.example;

public class Cycle {
    public static void main(String[] args) {
        //Распечатать цифры от 1 до 5 включительно с шагом в единицу
        for (int i = 1; i <=9;i++){
            System.out.println(i);
        }
        System.out.println("Это обычный while: ");
        int j = 1;

        while (j >= 9){
            System.out.println(j);
            j++;
        }

        System.out.println("Это Do while: ");
        do {
            System.out.println(j);
            j++;
        }
        while (j>=9);


    }
}
