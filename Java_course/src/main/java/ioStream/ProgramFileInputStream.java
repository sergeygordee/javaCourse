package ioStream;

import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.IOException;

public class ProgramFileInputStream {
    public static void main(String[] args) {
        try(FileInputStream fileInputStream = new FileInputStream("text.txt")){
            int i;
            while ((i = fileInputStream.read()) != -1){
                System.out.println( (char)i);
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}

class ProgramFileInputStream1{
    public static void main(String[] args) {
        try(FileInputStream fileInputStream = new FileInputStream("text.txt")){
            byte[] buffer = new byte[256];
            char [] chars = new char[5];
            int i;
            while ((i = fileInputStream.read(buffer)) != -1){
                for (int j = 0;j < i; j++){
                    chars[j] = (char)buffer[j];
                    System.out.print((char)buffer[j]);
                }
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
