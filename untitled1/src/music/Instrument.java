package music;

public abstract class Instrument {
    private String name;

    public Instrument(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public void play(String melody) {
        for (int i = 0; i < melody.length(); i++) {
            play(melody.charAt(i));
//            System.out.print(" i:" + melody.charAt(i));
        }
        System.out.println();
    }

    protected abstract void play(char note);
}
