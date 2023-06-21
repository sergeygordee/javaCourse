package Strings;

public class Program {
    public static void main(String[] args) {
        String string1 = "Hello";
        System.out.println(string1);
        String string2 = new String("Hello");
        System.out.println(string2);
        System.out.println(string1 == string2);
        System.out.println(string1.equals(string2));
        String string3 = new String();
        string3 = "asd";
        System.out.println(string3);
        String string4 = new String(new char[]{'H', 'E','L','L','O'});
        System.out.println(string4);
        System.out.println(string4.length());
        System.out.println(string1.length());
        System.out.println(string2.length());
        String string5 = new String(new char[]{'H', 'E','L','L','O'});
        char[] string5_1 = string5.toCharArray();
        System.out.println(string5_1);
        System.out.println(string5_1[0]);
        String string6 = "  ";
        if (string6.length() == 0){
            System.out.println("Строка пуста");
        }
        else {
            System.out.println("Строка что то имеет");
        }
        String string7 = "  ";
        if (string7.isEmpty()){
            System.out.println("Строка пуста");
        }
        else {
            System.out.println("Строка что то имеет");
        }
        //String string8 = null;
        //if (string8.length() == 0){
        //    System.out.println("Строка пуста");
        //}
        //else {
        //    System.out.println("Строка что то имеет");
        //}
        //System.out.println(string8);
        String string9 = "Hello";
        String string10 = "World";
        String string11 = string9  + string10;
        System.out.println(string11);
        String string12 = "Hello" + true;
        System.out.println(string12);
        String string13 = string9.concat(string10);
        System.out.println(string13);
        String string14 = String.join(" ", string9, string10, "My", "sakdashdsahid");
        System.out.println(string14);
        String string15 = "SuperPuperElephant";
        char char1 = string15.charAt(3);
        System.out.println(char1);
        int start = 1;
        int end = 5;
        char [] char2 = new char[end - start];
        string15.getChars(start, end, char2, 0);
        System.out.println(char2);
        String string17 = "Hello";
        String string18 = "hello";
        System.out.println(string17.equals(string18));
        System.out.println(string17.equalsIgnoreCase(string18));
        System.out.println("-------------------");
        String string19 = "elephant";
        String string20 = "ellepsoid";
        boolean result = string19.regionMatches(1, string20, 2, 3);
        System.out.println(result);
        String string21 = "Hello";
        int num1 = string21.indexOf("lo");
        int num2 = string21.lastIndexOf("lo");
        System.out.println(num1);
        System.out.println(num2);
        String string22 = "Gordeev";
        String string23 = "Goncharov";
        String string24 = "Gavrilov";
        boolean start1 = string24.startsWith("Go");
        boolean end1 = string22.endsWith("ov");
        System.out.println(start1);
        System.out.println(end1);
        String string25 = "Hello world";
        String stringReplace1 = string25.replace('l', '1');
        System.out.println(stringReplace1);
        String stringReplace2 = string24.replace('a', 'o');
        System.out.println(stringReplace2);
        string24 = stringReplace2;
        System.out.println(string24.startsWith("Go"));
        System.out.println();
        String stringReplace3 = string24.replace("Gov", "Dab");
        System.out.println(stringReplace3);
        String string26 = " Sergey ";
        String string27 = "Sergey";
        System.out.println(string26.equals(string27));
        System.out.println(string26.equalsIgnoreCase(string27));
        string26 = string26.trim();
        System.out.println(string26.equals(string27));
        System.out.println(string26.equalsIgnoreCase(string27));
        String string28 = "Hello";
        String string29 = "hELLO";
        string28 = string28.toLowerCase();
        System.out.println(string28);
        string29 = string29.toLowerCase();
        System.out.println(string29);
        System.out.println(string28.equals(string29));
        System.out.println(string28.equalsIgnoreCase(string29));
        String string30 = "Hello/my/beautiful/friend!";
        String[] string31 = string30.split("/", 2);
        for (String word: string31) {
            System.out.println(word);
        }
    }
}
