package io;

import java.io.*;
import java.util.Scanner;

public class ProgramBufferdRW {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("note.txt"))){
            String text;
            System.out.println("Введите строку: ");
            while (!(text = bufferedReader.readLine()).equals("quit")){
                System.out.println("Для выхода напишите quit: ");
                bufferedWriter.write(text + "\n");
                bufferedWriter.flush();
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
