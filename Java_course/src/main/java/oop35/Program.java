package oop35;

public class Program {
    public static void main(String[] args) {
        Accountable<String> account1 = new Account("qwerty123", 10000);
        Account account2 = new Account("007", 10000);
        System.out.println(account1.getId());
        System.out.println(account2.getId());
    }
}
