package oop11;

public class Math {
    public  static class Factorial{
        private int result;
        private int key;
        public  Factorial(int number, int x){
            result = number;
            key = x;
        }
        public int getResult(){
            return result;
        }
        public int getKey(){
            return key;
        }
    }
    public static Factorial getFactorial(int x){
        int result = 1;
        for (int i = 1; i <=x;i++){
            result*=i;
        }
        return new Factorial(result,x);
    }

    public static void main(String[] args) {
        Math.Factorial factorial = Math.getFactorial(5);
        System.out.println(factorial.getResult());
        System.out.println(factorial.getKey());
    }

}
