package oop16;

public class Program {
    public static void main(String[] args) {
        //Восходящее преобразование
        Object sergey0 = new Person("Sergey");
        Person sergey1 = new Person("Sergey");
        sergey1.display();
        System.out.println("--------");
        Person sergey2 = new Emploee("Segey" , "ITIS");
        sergey2.display();
        System.out.println("--------");
        Person sergey3 = new Client("Sergey", "ITIS", 12);
        sergey3.display();
        Object sergey4 = new Emploee("Segey" , "ITIS");
        Object sergey5 = new Client("Sergey", "ITIS", 12);
        //Нисходящее преобразование
        Object anton = new Emploee("Anton", "VMK");
        Emploee emp = (Emploee) anton;
        emp.display();
        System.out.println(emp.getCompany());
        System.out.println("--------");
        Object albert = new Client("Albert", "MATHS", 10);
        if ( albert instanceof Emploee){
            Emploee emploeeAlbert = (Emploee)albert;
            emploeeAlbert.display();
        }
        else {
            System.out.println("Приведение класса невозможно");
        }
        System.out.println("--------");

        Object albert1 = new Client("Albert", "MATHS", 10);
        if ( albert1 instanceof Client){
            Client clientAlbert = (Client) albert;
            clientAlbert.display();
        }
        else {
            System.out.println("Приведение класса невозможно");
        }

        System.out.println("--------");
        Object albert2 = new Client("Albert", "MATHS", 10);
        if ( albert2 instanceof Client clientAlbert2){
            clientAlbert2.display();
        }
        else {
            System.out.println("Приведение класса невозможно");
        }
    }
}
