package radiostation;

public class song implements Parts {
    private String name;
    private String autor;
    private int length;

    public song(String name, String autor, int length) {
        this.name = name;
        this.autor = autor;
        this.length = length;
    }

    @Override
    public int calculate() {
        return 0;
    }

    @Override
    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "song{" +
                "name='" + name + '\'' +
                ", autor='" + autor + '\'' +
                ", length=" + length +
                '}';
    }
}
