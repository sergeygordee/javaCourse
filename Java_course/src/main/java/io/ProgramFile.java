package io;

import java.io.File;
import java.io.IOException;

public class ProgramFile {
    public static void main(String[] args) throws IOException {
        File directory1 = new File("c://d1");
        boolean created = directory1.mkdir();
        if (created){
            System.out.println("Папка создана");
        }
        File file1 = new File("c://d1", "note.txt");
        boolean createdFile = file1.createNewFile();
        if (createdFile){
            System.out.println("Файл создан");
        }
        File file2 = new File("c://d1/note1.txt");
        System.out.println("File name: " + file2.getName());
        System.out.println("Находится в :" + file2.getParent());

        if (file2.exists()){
            System.out.println("Файл существует");


        }
        else {
            System.out.println("Файл не существует");
        }
        System.out.println("Размер файла: " + file2.length());
        try {
            boolean created1 = file2.createNewFile();
            if (created1){
                System.out.println("Файл создан");
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
        System.out.println(directory1.delete());

        File directory2 = new File("c://d2");
        boolean created3 = directory2.mkdir();
        // deleted  = directory2.delete();
        //if (deleted){
        //    System.out.println("Папка удалена");
        //}
        //File newNameDir = new File("c://d4");
        //directory1.renameTo(newNameDir);
        System.out.println(directory2.canRead());
        System.out.println(directory2.canWrite());
        System.out.println(file1.isDirectory());
        //System.out.println(file1.delete());
        System.out.println("-------------");
        System.out.println(file1.canExecute());
        System.out.println(file1.getAbsolutePath());
        System.out.println(file1.getCanonicalPath());
        System.out.println(file1.lastModified());
        System.out.println(directory1.list());
        for (String data:directory1.list()) {
            System.out.println(data);
        }
        System.out.println(directory1);
    }
}
