package lesson43__04_03_25.homework43;

public class PersonPas {

    private String email;
    private String password;

    public PersonPas(String email, String password) {
        setEmail(email);
        setPassword(password);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (isEmailValid(email)) {
            this.email = email;
        }

    }
    /*
    vasya@gmail.com
    vasya@gmail.net.de
    @vasyagmail.net.de
    vas12121ya@gmail.net.de

    Требования к E-Mail.
    1. Должна присутствовать @ и только одна
    2. Точка после собаки
    3. После последней точки должно быть минимум 2-а символа
    4. В E-Mail допустимо вставлять " _ ", " - ", " . ", " , ", " @ "
    5. До собачки должен быть хотябы один символ.
    6. Первый элемент должен быть буквой алфавита.
     */


    private boolean isEmailValid(String email) {
        // 1. Должна присутствовать @ (done)
        // При использовании .indexOf('@'); - то нас возвращается -1.
        int indexAt = email.indexOf('@');
        if (indexAt == -1 || indexAt != email.lastIndexOf('@')) return false;

        // 2. Точка после собаки
        // index + 2 - Означает +2 индекса после @ собаки
        if (email.indexOf('.', indexAt + 2) == -1) return false;

        //  3. После последней точки должно быть минимум 2-а символа
        if (email.lastIndexOf('.') >= email.length() - 2) return false;

        // .toCharArray() - возвращает массив Char (тоесит массив символов " _ ", " - ", " . ", " , ", " @ ")

        for (int i = 0; i < email.length(); i++) {
            char ch = email.charAt(i);
            if (!(Character.isAlphabetic(ch)
                    || Character.isDigit(ch)
                    || ch == '_'
                    || ch == '-'
                    || ch == '.'
                    || ch == '@')) {

                // Символ НЕ подходит
                return false;
            }
            // else{
            //     // Символ подходит
            // }


        }
        if (indexAt == 0) return false;
        if ( ! Character.isAlphabetic(email.charAt(0))) return false;
        return true;
    }
    /*
    Требования к поролю
    1. Длина >= 8
    2. Должна быть мин 1 маленькая буква
    3. Должна быть мин 1 большая буква
    4. Должна быть мин 1 цифра
    5. Должен быть мни 1 спец. символ "! % $ @ & * () []
     */
    /*
    4 Переменные типа boolean
    boolean isLowerCase = false;
    Запускаем цикл
    И после цикла во всех 4-х должно быть true - тогда вернуть true
    Иначе пароль проверку не прошел - вернуть false
     */


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        try {
            PersonValidatePassword.validatePassword(password);
            System.out.println("Ваш пароль прошел проверку: " + password);
            this.password = password;
        } catch (PasswordValidateException e) {
            System.out.println("Вы ввели некорректный пароль: " + e.getMessage());
        }

    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("email='").append(email).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
