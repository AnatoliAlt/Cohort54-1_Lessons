package lesson24__03_12_24_Interface.classwork24.interfaces;

public class Journal implements Printable{
    private  String name;
    private  int number;

    public Journal(String name, int number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public void print() {
        System.out.println("Journal: " + name + " #" + number);
    }

    @Override
    public void defoultMethod() {
        System.out.println("Defoult method from Journal");

        // Специфика обращения к интерфейсу в качестве "родителя (super)"
        Printable.super.defoultMethod();
    }
}




