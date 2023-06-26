package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ProgramBufferedWriter {
    public static void main(String[] args) {
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("note.txt"))) {
            String text = "Hello friend";
            bufferedWriter.write(text);
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
