package io;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class ProgramFileReader {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("note.txt")) {
            char [] buf = new char[256];
            int c;
            while ((c = fileReader.read(buf)) > 0){
                if (c < 256){
                    buf = Arrays.copyOf(buf, c);
                }
                System.out.println(buf);
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
