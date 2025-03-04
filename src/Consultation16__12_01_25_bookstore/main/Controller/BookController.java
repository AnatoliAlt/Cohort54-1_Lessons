package Consultation16__12_01_25_bookstore.main.Controller;


import Consultation16__12_01_25_bookstore.lesson30_Consultation15_bookstore.main.model.Book;

//import consultations.lesson30__09_01_25_Consultation15.bookstore.main.model.Book;
import Consultation16__12_01_25_bookstore.lesson30_Consultation15_bookstore.main.repository.BookRepositpry;
import Consultation16__12_01_25_bookstore.lesson30_Consultation15_bookstore.main.service.BookService;

import java.util.Scanner;

public class BookController {
    private BookRepositpry bookRepositpry;
    private BookService bookService;
    public BookController() {
        bookRepositpry = new BookRepositpry();
        bookService = new BookService(bookRepositpry);
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add book"); // Добавить книгу
            System.out.println("2. Get info the book"); // Получить информацию о книге
            System.out.println("3. Update book"); // Обновить книгу
            System.out.println("4. Delete book"); // Удалить книгу
            System.out.println("5. Print all books"); // Печать всех книг
            System.out.println("6. Exit");
            System.out.println();

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Add book: "); // Введите название книги
                    addBook(scanner);
                    break;
                case 2:
                    System.out.println("Get info the book"); // Получить информацию о книге
                    break;
                case 3:
                    System.out.println("Update book"); // Обновить книгу
                    break;
                case 4:
                    System.out.println("Delete book"); // Удалить книгу
                    break;
                case 5:
                    System.out.println("Print all books"); // Печать всех книг
                    break;
                case 6:
                    System.out.println("Exit");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again."); // Неверный выбор. Попробуйте еще раз.
                    break;

            }

        }
    }

    private void addBook(Scanner scanner) {
        System.out.println("Enter book title: ");  // Введите название книги
        String title = scanner.nextLine();
        System.out.println("Enter book author: ");
        String author = scanner.nextLine();
        System.out.println("Enter book year: ");
        int year = scanner.nextInt();
        System.out.println("Enter book price: ");
        double price = scanner.nextDouble();


        //Add book from data
        Book book = new Book(title, author, year, price);
//        bookRepositpry.addBook(book);
        bookService.addBook(book);
        System.out.println();

    }
}
