package lesson28__17_12_24Testirovanie_JUnitJupiter.classwork28.persons;

public class Person {

    private String email;
    private String password;

    public Person(String email, String password) {
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
    private boolean isPasswordValid(String password) {
        if (password == null || password.length() < 8){
            System.out.println("Password should be at least 8 characteers");
            return false;
        }
//       2. Должна быть мин 1 маленькая буква
//       3. Должна быть мин 1 большая буква
//       4. Должна быть мин 1 цифра
//       5. Должен быть мни 1 спец. символ "! % $ @ & * () []
        boolean isDigit = false;

        // Альтернативный способ объявления переменных
        boolean[] result = new boolean[4];// Все 4 переменные будут иметь по умолчанию false

        String symbols = "! % $ @ & * () []";

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isDigit(ch)) result[0] = true;
            if (Character.isUpperCase(ch)) result[1] = true;
            if (Character.isLowerCase(ch)) result[2] = true;
            if (symbols.indexOf(ch) >= 0) result[3] = true;
        }
        // Если хотя бы в одной переменной останется значение false,
        // то весь пароль не будет признан валидным и из метода вернется false
        return  result[0] && result[1] && result[2] && result[3];


    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (isPasswordValid(password)){
            this.password = password;
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
