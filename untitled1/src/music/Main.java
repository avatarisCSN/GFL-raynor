package music;

public class Main {
    Instrument first = new Guitar("Tommy");
    Guitar gut;

    {
        gut = new Guitar();
    }
    public static void main (String[] args)
    {
        Instrument first = new Guitar("Tommy");
        System.out.println(first.getName());
            Guitar gut = new Guitar();
        System.out.println( gut.getName());
        gut.play("Luizianna");

    }
}
