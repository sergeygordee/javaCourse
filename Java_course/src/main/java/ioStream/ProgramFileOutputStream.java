package ioStream;
import java.io.*;

public class ProgramFileOutputStream {
    public static void main(String[] args) {
        String text = "Hello world";
        try(FileOutputStream fileOutputStream = new FileOutputStream("text.txt")) {
            byte[] buffer = text.getBytes();
            fileOutputStream.write(buffer,0, buffer.length );
            //fileOutputStream.write(buffer[2]);
            System.out.println("Все сработало");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
