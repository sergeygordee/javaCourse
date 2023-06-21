package org.example;

public class Operations {
    public static void main(String[] args) {
        int a1 = 12;
        int b1 = 10;
        //Проверка на равенство
        boolean c11 = (a1 == (b1 +2));
        boolean c12 = a1 == 12;
        System.out.println(c11);
        System.out.println(c12);
        System.out.println( a1 == b1);
        System.out.println();
        int a2 = 12;
        int b2 = 10;
        //Проверка на неравенство
        boolean c21 = (a2 != (b2 +2));
        boolean c22 = a2 != 12;
        System.out.println(c21);
        System.out.println(c22);
        System.out.println( a2 != b2);
        System.out.println();
        boolean c31 = a2 > b2;
        boolean c32 = a2 < b2;
        System.out.println(c31);
        System.out.println(c32);
        System.out.println();
        int a4 = 15;
        int b4 = 15;
        boolean c41 = a4 <= b4;
        System.out.println(c41);

        //Логические опреации
        // | - или
        int a5 = 12;
        int b5 = 17;
        int c5 = a5 | b5;

        // &
        c5 = a5 & b5;

        System.out.println();
        int num1 = 80;
        int num2 = 12;
        if (num1 < num2 ){
            System.out.println(num1 + " < " + num2);
            System.out.println("Здорова");
        } else if (num1 == 17) {
            System.out.println(num1 + " > " + num2);
            System.out.println("Привет");
        }
        else if (num1 == 19) {
            System.out.println(num1 + " > " + num2);
            System.out.println("Привет");
        }
        else {
            System.out.println("Они равны");
        }
        System.out.println();

        int num3 = 16;
        switch (num3){
            case 1:
                System.out.println("Это число " + num3);
                break;
            case 4:
                System.out.println("Это число " + num3);
                break;
            case 16:
                System.out.println("Это число " + num3);
                num3++;
                break;
            case 17:
                System.out.println("Это число " + num3);
                num3++;
                break;
            default:
                System.out.println("Мы не нашли нужное число");
        }
        if (a5 > b5){
            System.out.println("Привет");
        }
        else {

        }
        a5++;


    }
}
