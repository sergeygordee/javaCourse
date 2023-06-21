package oop36;

public class Program {
    public static void main(String[] args) {
        Account<Integer> account3 = new Account<Integer>(123, 10000);
        Account<String> account4 = new Account<String>("123", 10000);
        System.out.println(account3.getId());
        System.out.println(account4.getId());
    }
}
