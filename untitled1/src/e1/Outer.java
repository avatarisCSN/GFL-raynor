package e1;

public class Outer {
    public String outer = "outer";
    public static class Inner{
        public String inner ="inner";
    }
    public static void main(String[] args)
    {
       // Outer outer = new Outer();
      //  System.out.println(outer.outer);
        Outer.Inner inner = new Outer.Inner();
        System.out.println(inner.inner);

    }
}
