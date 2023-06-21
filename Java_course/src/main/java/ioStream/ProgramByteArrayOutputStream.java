package ioStream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ProgramByteArrayOutputStream {
    public static void main(String[] args) {
        ByteArrayOutputStream byteArrayOutputStream =
                new ByteArrayOutputStream();
        String text = "Hello world";
        byte []arr2 = text.getBytes();
        try {
            byteArrayOutputStream.write(arr2);
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
        System.out.println(byteArrayOutputStream.toString());
        byte[] array = byteArrayOutputStream.toByteArray();
        for (byte b:array) {
            System.out.println((char) b);
        }

    }
}
