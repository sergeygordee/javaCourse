package io;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;

public class ProgramBufferedInputStream {
    public static void main(String[] args) {
        String text = "Hello friend";
        byte[] buffer = text.getBytes();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(buffer);
        try(BufferedInputStream bufferedInputStream = new BufferedInputStream(byteArrayInputStream)){
            int c;
            while ((c = bufferedInputStream.read()) != -1){
                System.out.println((char) c);
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
