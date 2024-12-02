package lesson17__07_11_24_Incapsulation.persons;

public class PersonsApp {
    public static void main(String[] args) {

        Person garry = new Person("Garry", 31, "Photo");
        System.out.println(garry.toString());

        Person john = new Person("John", 75, "Reading, music");
        System.out.println(john.toString());

        Person[] people = new Person[5];// Создается массив для 5 ссылок на объект типа Person

        people[0] = garry;
        people[3] = john;
        people[1] = new Person("Tom", 5, "crying");

        System.out.println("========================================");

        System.out.println(people[0].toString());// Распечатываем данные на объект [0]
        System.out.println(people[0].getName());// Распечамываем имя
        people[0].setName("Peter");// Меняем имя объекта
        System.out.println("people[0].setName: " + people[0].toString());// Распечатываем данные на объект [0] с новым именем
        System.out.println("garry: " + garry.toString());// Распечатываем данные на объект [0] с новым именем

        System.out.println("==========================================");

        // Перебираем и распечатываем все имена в массиве
        for (int i = 0; i < people.length; i++) {
            if (people[i] != null) {// Проверка на наличие Null в массиве
                // Распечатываем
                System.out.println(people[i].toString());
                System.out.println("people[i].getName: " + people[i].getName());
            } else {
                System.out.println("peoplr[" + i + "] is null");
            }
        }
        System.out.println("=========================================");

        // Создаем новый объек в массиве
        Person test = new Person("Test", 50, "coding");// Данные нового объекта
        people[2] = test;// Присваиваем данные нового объекта в массив под индексом [2]
        System.out.println("people[2].toString(): " + people[2].toString());

        people[2].setName("TestNew");// Меняем имя объекта [2] Test
        test.setAge(60);// Меняем возраст объекта [2] Test
        System.out.println("people[2].toString(): " + people[2].toString());

        test = null;// Ссылка нового объекта пропадет но будет работать ссылка с массива
        // Например:
        System.out.println("people[2].getName(): " + people[2].getName());
        // Теперь переменная хранит ссылку на Toma
        test = people[1];
        System.out.println("test.toString(): " + test.toString());

    }
}
