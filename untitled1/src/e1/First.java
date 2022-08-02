package e1;

public class First {
    protected String sample = "helloo";
    public class Inner{
        public int c=10;
    }
    public void hello()
    {
        Inner inner = new Inner();
        System.out.print(inner.c);
        System.out.println(sample);

    }
    public static void main(String[] args)
    {
        First first = new First();
        first.hello();
        System.out.print("hello");
    }
}
