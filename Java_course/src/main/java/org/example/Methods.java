package org.example;

public class Methods {
    public static void main(String[] args) {
        //hello();
        //bye();
        //int num1 = 13;
        //int num2 = 17;
        //summa(17,13);
        //minus(2,5,3);
        //info("Sergey", "Gordeev",
        //        "Alexeevich", 123);
        //summa1("Sergey",12,28,3);

        //int res1 = summa2(12,28);
        //System.out.println(res1);
        //res1++;
        //res1 +=20;
        //res1 *= 2;
        //System.out.println(res1);
        //summa3();
        System.out.println(summa4(12,3,5));
    }
     static void hello(){
         System.out.println("Hello");
    }

    static  void bye(){
        System.out.println("BYE!");
    }

    static void summa(int num1, int num2){
        int res1 = num1 + num2;
        System.out.println(res1);
    }
    static void  minus(int num1, int num2, int num3){
        int res1 = num1 - num2 - num3;
        System.out.println(res1);
    }
    static void info(String name, String surname,
                     String patronimoc, int age){
        System.out.println(name + surname + patronimoc +age);

    }
    static void summa1(String name,int ...nums){
        int res1 = 0;
        for (int n:nums){
            res1 = res1 + n;
        }
        System.out.println(name + " " + res1);
    }

    static int summa2(int num1, int num2){
        int res1 = num1 + num2;
        return res1;
    }
    static void summa3(){
        int res1 = summa2(12,28);
        System.out.println(res1);
        //res1++;
        //res1 +=20;
        res1 *= 2;
        System.out.println(res1);
    }

    static int summa4(int num1, int num2){
        return num1 + num2;
    }
    static double summa4(double num1, double num2){
        return num1 + num2;
    }
    static int summa4(int num1, int num2, int num3){
        return num1 + num2 +num3;
    }

}
