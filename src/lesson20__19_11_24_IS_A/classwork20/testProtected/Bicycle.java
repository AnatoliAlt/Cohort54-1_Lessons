package lesson20__19_11_24_IS_A.classwork20.testProtected;

import lesson20__19_11_24_IS_A.classwork20.transport.Vehicle;

public class Bicycle extends Vehicle {

    // Добавляется конструктор по умолчанию
    private Bicycle(){
        super();
    }

    public void test(){
        System.out.println(model);
    }

}
