package io;

import java.io.FileWriter;
import java.io.IOException;

public class ProgramFileWriter {
    public static void main(String[] args) {
        try (FileWriter fileWriter = new FileWriter("note.txt", false)){
            String text = "Hello friend";
            fileWriter.write(text);
            fileWriter.write("           ");
            fileWriter.write(123);
            fileWriter.write('\n');
            fileWriter.write('G');
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
