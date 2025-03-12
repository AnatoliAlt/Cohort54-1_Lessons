package lesson44__06_03_25.homework44.file_io.hwTask1.hwTask1_from_Teacher;
/*

Дан файл text.txt:

Ваша задача используя классы пакета java.io
создать файл с именем 'text.txt' и скопировать в него все данные из файла 'text.txt'
 */


import java.io.*;

public class Task1CopyFile {
    public static void main(String[] args) {

        File path = new File("src/lesson44__06_03_25/homework44/file_io/hwtask1/HW44_from_Teacher");

        String inputFile = "text.txt";
        String outputFile = "copy.txt";

        // Создаем поток для чтения из файла
        try (FileReader fileReader = new FileReader(new File(path, inputFile));
             BufferedReader bufferedReader = new BufferedReader(fileReader);
             // Создам поток для записи
             FileWriter fileWriter = new FileWriter(new File(path, outputFile));
             BufferedWriter writer = new BufferedWriter(fileWriter);
        ) {

            // Читаю строки из файла в цикле (пока строки есть). Каждую прочитанную строку сразу записываю в другой файл
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
