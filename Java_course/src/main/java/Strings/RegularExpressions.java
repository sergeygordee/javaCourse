package Strings;

public class RegularExpressions {
    public static void main(String[] args) {
        /*

        \d — соответствует любой одной цифре и заменяет собой выражение [0-9];
\D — исключает все цифры и заменяет [^0-9];
\w — заменяет любую цифру, букву, а также знак нижнего подчёркивания;
\W — любой символ кроме латиницы, цифр или нижнего подчёркивания;
\s — поиск символов пробела;
\S — поиск любого непробельного символа.

         */
        String string1 = "!!Hello! my  !beautiful!       friend";
        String words1[] = string1.split("\\s*(|!|\\s\\.)\\s* ");
        for (String word:words1) {
            System.out.println(word);
        }
        System.out.println("------------");
        String string2 = "Hello. my ! beautiful       friend";
        String words2[] = string1.split(" ");
        for (String word:words2) {
            System.out.println(word);
        }
        String phoneNumber = "++++++55353533335asd";
        boolean result = phoneNumber.matches("(\\+*)\\d{11}(\\w*)");
        if (result){
            System.out.println("It is a phone");
        }
        else {
            System.out.println("it is not a phone");
        }
        System.out.println("asdad\sasdsada");

    }

}
