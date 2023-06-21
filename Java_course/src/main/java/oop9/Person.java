package oop9;

public class Person {
    private String name;
    Account account;
    Person(String name, String password){
        this.name = name;
        account = new Account(password);
    }
    public void displayPerson(){
        System.out.println(name + account.password);
    }
    public class Account{
        private String password;

        Account(String pass){
            this.password = pass;
        }
        void displayAccount(){
            System.out.println(Person.this.name + " " + password);
        }
    }

}
