package music;

public class Piano extends Instrument {
    public Piano(String name) {
        super(name);
    }

    public Piano() {
        this("noname");
    }

    @Override
    protected void play(char note) {
        System.out.print("  p:" + note);
    }
}
