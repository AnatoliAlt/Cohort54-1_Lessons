package lesson43__04_03_25.classwork43;
// Свой класс исключения можно создать наследуясь
//    - от класса Exception для проверяемого исключения
//    - от класса RuntimeException для непроверяемого исключения

public class EmailValidateException extends RuntimeException {
    /*
    getMessage() - возвращает строку с описанием исключения
    toString() - возвращает строковое представление объекта исключения
    printStackTrace() - выводит трассировку стека исключений
     */
    public EmailValidateException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Email validate exception | " +  super.getMessage();
    }
}
