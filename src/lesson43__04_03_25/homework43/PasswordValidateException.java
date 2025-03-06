package lesson43__04_03_25.homework43;

public class PasswordValidateException extends Exception {
    public PasswordValidateException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Password проверить исключение | " + super.getMessage();
    }
}
