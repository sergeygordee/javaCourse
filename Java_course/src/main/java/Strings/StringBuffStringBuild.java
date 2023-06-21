package Strings;

public class StringBuffStringBuild {
    public static void main(String[] args) {
        String string1  = "Hello";
        StringBuffer stringBuffer = new StringBuffer(string1);
        stringBuffer.ensureCapacity(32);
        System.out.println(stringBuffer.capacity());
        System.out.println("--------------------");
        String string2 = "Elephant";
        StringBuffer stringBuffer1 = new StringBuffer(string2);

        System.out.println(stringBuffer.capacity());
        System.out.println(stringBuffer1.capacity());
        stringBuffer1.ensureCapacity(32);
        System.out.println(stringBuffer1.capacity());

        System.out.println(stringBuffer1.length());
        System.out.println("--------------------");
        StringBuffer stringBuffer2 = new StringBuffer("Hello");
        char c = stringBuffer2.charAt(0);
        System.out.println(c);
        stringBuffer2.setCharAt(0, 'G');
        System.out.println(stringBuffer2);
        StringBuffer stringBuffer3 = new StringBuffer("Hello");
        //int start = 1;
        //int end = 4;
        char[] buffer = new char[3];
        stringBuffer.getChars(1 , 4, buffer, 0);
        System.out.println(buffer);
        StringBuffer stringBuffer4 = new StringBuffer("Hello");
        stringBuffer4.append("World");
        System.out.println(stringBuffer4);
        stringBuffer4.insert(5, "D");
        System.out.println(stringBuffer4);
        stringBuffer4.delete(2,3);
        System.out.println(stringBuffer4);
        stringBuffer4.deleteCharAt(2);
        System.out.println(stringBuffer4);
        String s1 = stringBuffer4.substring(5);
        System.out.println(s1);
        System.out.println("--------------------");

        StringBuffer stringBuffer5 = new StringBuffer("Hello World");
        String s2 = stringBuffer5.substring(1,5);
        System.out.println(s2);
        System.out.println("--------------------");
        StringBuffer stringBuffer6 = new StringBuffer("Hello World");
        stringBuffer6.replace(3,5, "Mouse");
        System.out.println(stringBuffer6);
        System.out.println(stringBuffer6.reverse());
    }
}
