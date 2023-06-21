package oop15;

public class Program {
    public static void main(String[] args) {
        //Создание объекта класса Circle
        Circle circle1 = new Circle(12,12, 10, 7);
        //Вывод площади круга
        System.out.println(circle1.getArea());
        //Вывод периметра круга
        System.out.println(circle1.getPerimetr());
        System.out.println("-----------------------");
        Rectangle rectangle1 = new Rectangle(12,12, 5, 10);
        System.out.println(rectangle1.getArea());
        System.out.println(rectangle1.getPerimetr());
    }
}
