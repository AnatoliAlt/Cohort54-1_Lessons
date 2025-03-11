package lesson44__06_03_25.homework44;
/*
Task 1
Дан файл text.txt:

Lorem ipsum dolor sit amet, consectetur adipisicing.
Lorem ipsum dolor sit amet.
Lorem ipsum dolor sit amet, consectetur adipisicing elit.
Lorem, ipsum dolor.
Lorem ipsum dolor sit amet consectetur adipisicing elit. Officia.
Lorem, ipsum.
Lorem ipsum dolor sit amet consectetur adipisicing elit.
Lorem ipsum dolor sit.
Lorem ipsum dolor sit amet consectetur adipisicing elit. Nemo!
Copy
Ваша задача используя классы пакета java.io создать файл с именем 'copy.txt' и скопировать
в него все данные из файла 'text.txt'
 */

import lesson44__06_03_25.classwork44.cats.Cat;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        File dolor = new File("src/lesson44__06_03_25/homework44/file_io");
        System.out.println("dolor.mkdirs(): " + dolor.mkdirs());

        File dolDr = new File(dolor, "text.txt");
        System.out.println("Создаём новый файл text.txt: " + dolDr.mkdirs()); // Создаём новый файл
        System.out.println("Удаляем файл text.txt: " + dolDr.delete()); // Удаляем файл

        File fileDl = new File(dolor, "text.txt"); // Создаём файл text.txt
        try {
            System.out.println("Создаём файл text.txt - file.createNewFile(): " + fileDl.createNewFile());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Проверяем, файл существует или нет - file.exists(): " + fileDl.exists()); // Проверяем, этот файл существует или нет

        try {
            FileWriter fileWriter = new FileWriter(fileDl); // Загружаем список в файл
            fileWriter.write("Task 1\n" +
                    "Дан файл text.txt:\n" +
                    "\n" +
                    "Lorem ipsum dolor sit amet, consectetur adipisicing.\n" +
                    "Lorem ipsum dolor sit amet.\n" +
                    "Lorem ipsum dolor sit amet, consectetur adipisicing elit.\n" +
                    "Lorem, ipsum dolor.\n" +
                    "Lorem ipsum dolor sit amet consectetur adipisicing elit. Officia.\n" +
                    "Lorem, ipsum.\n" +
                    "Lorem ipsum dolor sit amet consectetur adipisicing elit.\n" +
                    "Lorem ipsum dolor sit.\n" +
                    "Lorem ipsum dolor sit amet consectetur adipisicing elit. Nemo!\n" +
                    "Copy\n" +
                    "Ваша задача используя классы пакета java.io создать файл с именем 'copy.txt' и скопировать\n" +
                    "в него все данные из файла 'text.txt'");
            fileWriter.close(); // Закрываем поток
        } catch (IOException e) {
            e.printStackTrace();
        }
        File fileDlr = new File(dolor, "copy.txt"); // Создаём новый файл "copy.txt"
        try {
            System.out.println("Создаём файл copy.txt - fileDlr.createNewFile(): " + fileDlr.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Проверяем, файлы fileDl и fileDlr существуют или нет
        if (fileDl.exists()) {
            System.out.println("Файл fileDl найден: " + fileDl.exists());
        } else {
            System.out.println("Файл fileDl не найден: " + fileDl.exists());
        }
        if (fileDlr.exists()) {
            System.out.println("Файл fileDlr найден: " + fileDlr.exists());
        } else {
            System.out.println("Файл fileDlr не найден: " + fileDlr.exists());
        }
        // Удаляем файл, если он уже есть
        if (fileDl.exists()) fileDlr.delete();
        // Создать файл, если его еще нет.
        try {
            System.out.println("fileDlr.createNewFile(): " + fileDlr.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(fileDl));
             BufferedWriter writer = new BufferedWriter(new FileWriter(fileDlr, true))) {
            String line;

            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("Файл text.txt был скопирован в файл copy.txt.: " + fileDlr.exists());
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }


    }
}

