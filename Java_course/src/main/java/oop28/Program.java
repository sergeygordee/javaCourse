package oop28;

public class Program {
    public static void main(String[] args) {
        Operations operations1 = Operations.SUM;
        System.out.println(operations1.action(10,12));
        System.out.println();
        Operations operations2 = Operations.SUBTRACTION;
        System.out.println(operations2.action(10,12));
        System.out.println();
        Operations operations3 = Operations.MULTIPLY;
        System.out.println(operations3.action(10,12));
    }
}

enum Operations{
    SUM{
        public int action(int x, int y){
            return x + y;
        }
    },
    MULTIPLY{
        public int action(int x, int y){
            return x * y;
        }
    }
    ,
    SUBTRACTION{
        public int action(int x, int y){
            return x - y;
        }
    };

    protected abstract int action(int x, int y);
}