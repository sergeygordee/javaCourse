package Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProgramPatternMatcher {
    public static void main(String[] args) {
        String string1 = "Hello";
        String string2 = "Hell";
        boolean boolean1 = Pattern.matches("Hello", string1);
        boolean boolean2 = Pattern.matches("Hello", string2);
        if (boolean1){
            System.out.println("Совпало");
        }
        else {
            System.out.println("Не совпало");
        }
        System.out.println("--------");
        Pattern pattern = Pattern.compile("aHello");
        Matcher matcher1 = pattern.matcher(string1);
        boolean found = matcher1.matches();
        if (found){
            System.out.println("Совпало");
        }
        else {
            System.out.println("Не совпало");
        }

    }
}
