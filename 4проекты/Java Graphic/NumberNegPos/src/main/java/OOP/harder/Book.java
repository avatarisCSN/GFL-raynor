package OOP.harder;

public class Book {
    private String title;
    private String author;
    private int pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }
    public void display()
    {
        System.out.println("Название книги: " +title);
        System.out.println("Автор книги: " +author);
        System.out.println("Количество страниц в книге: " +pages);
    }



}
