package test;

public class Main {
    public static void main(String[] args) {
        System.out.println(sum(10,12, 15));
    }
    public static int sum(int x, int y){
        return x + y;
    }
    public static int sum(int x, int y, int z){
        return x + y + z;
    }
    public static int sum(int x, int y, int z, int a){
        return x + y + z + a;
    }
}
