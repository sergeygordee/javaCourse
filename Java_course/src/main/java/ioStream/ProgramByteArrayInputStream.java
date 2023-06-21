package ioStream;

import java.io.ByteArrayInputStream;

public class ProgramByteArrayInputStream {
    public static void main(String[] args) {
        byte[] arr1 = new byte[]{1,2,3,4,56,7,8};
        ByteArrayInputStream byteArrayInputStream1 =
                new ByteArrayInputStream(arr1);
        int i;
        while ((i = byteArrayInputStream1.read()) != -1){
            System.out.println(i);
        }
        System.out.println("----------");
        String text = "Hello world";
        byte []arr2 = text.getBytes();
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(arr2,0,5);
        int j;
        while ((j = byteArrayInputStream2.read()) != -1){
            System.out.println((char)j);
        }

    }
}
