package lesson44__06_03_25.classwork44.file_io;

import java.io.*;
import java.util.Arrays;
/*
Java I/O (Input/Output) - часть Java Standard Edition, предоставляющая механизмы для работы с вводом-ввыводом данных,
например, чтение из и запись в файлы.
 */

public class FileIOExample {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("======== СОЗДОНИЕ ДИРЕКТОРИИ ==========");

        // СОЗДОНИЕ ДИРЕКТОРИИ

        // boolean mkdir() - создаёт директорию

        // ckass File - представляет абстракцию для работы с файлами и директориями (создание, удаление, проверка свойств, и т.д.)

        File pathDir = new File("files");

        // boolean mkdir() - создает директорию, если такой еще нет. Может создать только "конечную" директорию.
        System.out.println(pathDir.mkdir()); // Возвращает true - если директория (папка/files) создана.

        File pathDir2 = new File("files/db/v1");
        System.out.println(pathDir.mkdir()); // Возвращает true - если директория (папка/files/db/v1) создана.

        // boolean mkdirs() - создает директорию, включая все необходимые родительские (вложенные) директории.
        pathDir = new File("src/lesson44__06_03_25/classwork44/file_io/files/example");
        System.out.println(pathDir.mkdirs()); // true - если директория (папка/files/example) создана.

        // File(File/String parent, String child) - создает объект file с указанием родильского пути.
        File lessonDir = new File("src/lesson44__06_03_25/classwork44/file_io");
        File pathDb = new File(lessonDir, "db/v01");
        System.out.println("pathDb.mkdirs(): " + pathDb.mkdirs());

        System.out.println("========= УДАЛЕНИЕ ДИРЕКТОРИИ ==========");

        // УДАЛЕНИЕ ДИРЕКТОРИИ

        // boolean delete() - удаляет директорию или папку (конечную) и все ее содержимое.
        System.out.println("pathDir.delete(): " + pathDir.delete()); // Удаление директории (папки/example)

        System.out.println("Удаление deleteOnExit()");
        // deleteOnExit() - удаляет директорию или папку (конечную) и все ее содержимое при завершении работы программы
        pathDb.deleteOnExit();

        Thread.sleep(5); // Приостановка выполнения программы на n миллисекунд
        //  Thread.sleep - Бросается проверяемым исключением InterruptedException
        System.out.println("Программа завершила работу.");

        System.out.println("========== СОЗДАНИЕ НОВЫХ ПУСТЫХ ФАЙЛОВ ========================");

        // СОЗДАНИЕ НОВЫХ ПУСТЫХ ФАЙЛОВ

        // boolean creatNewFile() - создает новый пустой файл, если файл с таким именем еще не существует.
        File file = new File(lessonDir, "text.txt");// бросается проверяемым исключением
        try {
            System.out.println("file.createNewFile(): " + file.createNewFile());
        } catch (IOException e) {
            //   throw new RuntimeException(e);
            e.printStackTrace();
        }
        // boolean exists() - проверяет существует ли файл с указанным именем или нет.
        System.out.println("file.exists(): " + file.exists() + " | lessonDir.exists(): " + lessonDir.exists());

        // isFile, isDirectory - возвращает true, если указанный объект является файлом или директорией соответственно.
        System.out.println("file.isFile() " + file.isFile());
        System.out.println("file.isDirectory() " + file.isDirectory());

        System.out.println("file.length() " + file.length()); // Возвращает размер файла в байтах
        System.out.println("file.lastModified(): " + file.lastModified() + " (в миллисекундах)"); // Возвращает время последнего изменения файла в миллисекундах.

        System.out.println("file.getName(): " + file.getName()); // Возвращает имя файла или директории
        System.out.println("file.getPath(): " + file.getPath()); // Возвращает стоковое представление, полный путь к файлу

        // String[] list() - возвращает массив строк, содержащий имена всех файлов и директорий в директории.
        // Возвращает список имен - String.
        String[] names = lessonDir.list();
        System.out.println("Список имен файлов и директорий (names): " + Arrays.toString(names));

        // File[] listFiles() - возвращает массив всех файлов и директорий в директории для работы с ними.
        // Возвращает список сущностей.
        File[] files = lessonDir.listFiles();
        System.out.println("Список всех файлов и директорий (files): " + Arrays.toString(files));
        for (File currentFile : files) {
            System.out.println(currentFile.getName() + " | " + currentFile.getPath() + " | length: " + currentFile.length()
                    + " | isfile: " + currentFile.isFile());
        }
        System.out.println("=========== Базовое чтение и запись в файлы =========");
        System.out.println();
        System.out.println("===========  запись в файлы =========");

        // БАЗОВОЕ ЧТЕНИЕ И ЗАПИСЬ В ФАЙЛЫ

        try {
            // file - путь к файлу File  file = new File(lessonDir, "text.txt");
            //   FileWriter fileWriter = new FileWriter(file); // Даём команду, что мы будем делать запись в файл
            FileWriter fileWriter = new FileWriter(file, false); // флаг определяющий режим дозапись - false (append - присоединение) или перезапись - true в файл.
            fileWriter.write("Hello world!!!"); // Запись в файл
            //    fileWriter.write("\n"); // Перенос строки (перевод каретки)
            //     fileWriter.write("String2 ");
            fileWriter.close(); // Закрытие потока (ОБЯЗАТЕЛЬНО!!!)
        } catch (IOException e) {
            //   throw new RuntimeException(e);
            e.printStackTrace();
        }
        System.out.println("========= чтение из файлов ==========");

        // try с ресурсами

        try (FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader))
        {
            // Код который может вызвать исключения
            String line;
            line = bufferedReader.readLine();
            System.out.println("Чтение строки завершено: " + line);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
