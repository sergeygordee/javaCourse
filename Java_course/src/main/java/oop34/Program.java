package oop34;

public class Program {
    public static void main(String[] args) {
        Account<String, Integer> account1 = new Account("12345", 10000);
        String accountId1 = account1.getId();
        System.out.println(accountId1);
        System.out.println();
        Account<Integer, Integer> account2 = new Account(12345, 10000);
        Integer sum = account2.getSum();
        Integer id = account2.getId();
        System.out.println(id);
    }
}
