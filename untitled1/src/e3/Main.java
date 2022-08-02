package e3;

public class Main {
    private Student s;
    private void run()
    {
        s = new Student("asda","111", "gehoo");
        System.out.println(s);
    }
    public static void main(String[] args)
    {
        Main main = new Main();
        main.run();
     //   s = new Student("asda","111", "gehoo");
     //   System.out.println(s);
    }
}
