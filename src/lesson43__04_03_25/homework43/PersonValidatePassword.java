package lesson43__04_03_25.homework43;

public class PersonValidatePassword {
    /*
    Task 1
Добавить в класс валидацию пароля.
При провале валидации выбросить исключение: PasswordValidateException
     */
    public static void validatePassword(String password) throws PasswordValidateException {
        if (password == null || password.length() < 8) {
            //   System.out.println("Password should be at least 8 characteers");
            throw new PasswordValidateException("Пароль должен быть не менее 8 символов");
        }
//       2. Должна быть мин 1 маленькая буква
//       3. Должна быть мин 1 большая буква
//       4. Должна быть мин 1 цифра
//       5. Должен быть мни 1 спец. символ "! % $ @ & * () []
        boolean isDigit = false;

        // Альтернативный способ объявления переменных
        boolean[] result = new boolean[4];// Все 4 переменные будут иметь по умолчанию false

        String symbols = "!%$@&*()[]";

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isDigit(ch)) result[0] = true; // Цифра
            if (Character.isUpperCase(ch)) result[1] = true; // Большая буква
            if (Character.isLowerCase(ch)) result[2] = true; // Маленькая букв
            if (symbols.indexOf(ch) >= 0) result[3] = true; // Спец. символ
        }

            // Если хотя бы в одной переменной останется значение false,
            // то весь пароль не будет признан валидным и из метода вернется false
            //   return  result[0] && result[1] && result[2] && result[3];
            if (!result[0]) {
                throw new PasswordValidateException(" error: Пароль должен содержать хотя бы одну цифру");
            }
            if (!result[1]) throw new PasswordValidateException("A error: Пароль должен содержать хотя бы одну большую букву");


            if (!result[2]) throw new PasswordValidateException("d error: Пароль должен содержать хотя бы одну маленькую букву");


            if (!result[3]) throw new PasswordValidateException("!%$@&*()[] error: Пароль должен содержать хотя бы один спец. символ (!%$@&*()[])");


        }
    }




