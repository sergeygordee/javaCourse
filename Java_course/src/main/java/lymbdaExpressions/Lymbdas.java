package lymbdaExpressions;

public class Lymbdas {
    //Сами обьекты -> где они выполняются
    public static void main(String[] args) {
        Operationable operationable;
        Operationable operationable1;
        Operationable operationable2;
        Operationable operationable3;

        operationable = (x,y,z) ->x + y +z;
        operationable1 =(x,y,z) -> (x - y) *z;
        operationable2 =(x,y,z) -> (x / y) -z;
        operationable3 =(x,y,z) -> (x - y) +z;

        int result = operationable.calculate(17, 10, 2);
        int result1 = operationable1.calculate(17, 10, 2);
        int result2 = operationable2.calculate(17, 10, 2);
        int result3 = operationable3.calculate(17, 10, 2);

        System.out.println(result + " " + result1);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        /*
        x + y
        x - y
        x / y
        x * y
         */

    }
}
