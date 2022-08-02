package music;

public class Guitar extends Instrument {
    public Guitar(String name) {
        super(name);
    }

    public Guitar()
    {
        this("noname");
    }

    @Override
    protected void play(char note) {
        System.out.print("  g:" + note);
    }
}
