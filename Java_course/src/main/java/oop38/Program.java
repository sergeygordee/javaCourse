package oop38;

public class Program {
    public static void main(String[] args) {
        Account account1 = new Account("1234", 10000);
        Account account2 = new Account(1234, 10000);
        System.out.println(account1.getId());
        System.out.println(account2.getId());
        boolean test1 = account2.getId().equals(account1.getId());
        boolean test2 = account2.getId() == account1.getId();
        System.out.println(test1);
        System.out.println(test2);
    }
}
