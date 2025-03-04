package lesson24__03_12_24_Interface.classwork24.interfaces;

public class Presentation implements ColorPrintable{
    private String title;
    private String author;
    private String theme;
    private int pages; // Количество страниц

    public Presentation(String title, String author, String theme, int pages) {
        this.title = title;
        this.author = author;
        this.theme = theme;
        this.pages = pages;
    }

    @Override
    public void colorPrint() {
        System.out.println("Отправляю призентацию в типографию!");
        System.out.println("Presentstion by " + author + "; title " + title);

    }

    @Override
    public void print() {
        System.out.println("Presentstion " + title + "; title" + pages);

    }
}
