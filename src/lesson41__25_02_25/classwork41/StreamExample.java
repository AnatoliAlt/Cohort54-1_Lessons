package lesson41__25_02_25.classwork41;

import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        //      task1();
        //  }

        //  public static void task1(String[] args) {
        //      List<Integer> result = List.of(-1, 12, 0, 5, 6, 7, 8, 9, 10);
        //      for (Integer num : integers) {
        //          int (num : integers)
        //      }

          }

        public static void task2 () {
            List<Cat> cats = getListCats();

            Stream<Cat> catStream = cats.stream();


        }

        public static List<Cat> getListCats () {
            new Cat("Bear", 5, "braun");
            new Cat("Python", 7, "green");
            new Cat("Tiger", 3, "yellon");
            new Cat("Panda", 4, "black");
            return null;
        }

    }


