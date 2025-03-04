package lesson26__10_12_24.classwork26.methods;

public class UtilsGeneric {

    // Метод возвращающий строковое представление массива

//    public static String printArray(Integer[] array) {// На вход пришел массив  Integer[] intergers = {1, 2, 3, 4, 5, 6};

    public static <T> String printArray(T[] array) {
        if (array == null || array.length == 0) return "[]";

        // input:  {1, 2, 3, 4, 5, 6};
        // output: [1, 2, 3, 4, 5, 6]

        // [2, 4, 6]
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            sb.append(i < array.length - 1 ? ", " : "]");
        }
        return sb.toString();
    }

    // ПЕРЕГРУЗКА МЕТОДОВ

//    public static String printArray(String[] array) {// На вход пришел массив  Integer[] intergers = {1, 2, 3, 4, 5, 6};
//
//        if (array == null || array.length == 0) return "[]";
//
//        // input:  {"a", "b", "c", "d"};
//        // output: ["a", "b", "c", "d"]
//
//        // [2, 4, 6]
//        StringBuilder sb = new StringBuilder("[");
//        for (int i = 0; i < array.length; i++) {
//            sb.append(array[i]);
//            sb.append(i < array.length - 1 ? ", " : "]");
//        }
//        return sb.toString();
//    }

    // Метод меняющий местами два элемента в массиве типа по индексам

    public static <T> void swap (T[] array, int idx1, int idx2){
        T temp = array[idx1];
        array[idx1] = array[idx2];
        array[idx2] = temp;
    }

    // Ограничения сверху Upper Bound
    // Написать метод, который считает сумму элементов в массиве.
    // тип Т должен быть классом Х, либо его потомком.

    public static <T extends Number> double sum (T[] array){

        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            T element = array[i];
            sum += element.doubleValue();
        }
        return sum;
    }
}
