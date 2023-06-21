package ioStream;

import java.io.FileInputStream;
import java.io.IOException;

public class ProgramIOClose {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream =
                    new FileInputStream("c://folder/text.txt");
            int i = -1;
            while ((i = fileInputStream.read()) != -1){
                System.out.println((char)i);
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
            System.out.println("Это Catch");
        }
        finally {
            System.out.println("Finally");
            try {
                if (fileInputStream != null){
                    fileInputStream.close();
                }
                System.out.println("Закрыл");
            }
            catch (IOException e){
                System.out.println(e.getMessage());
                System.out.println("Это Finally");
            }
        }
    }
}
