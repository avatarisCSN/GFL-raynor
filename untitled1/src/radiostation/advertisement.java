package radiostation;

public class advertisement implements Parts {
    private String name;
    private int length;
    static final int price =5;

    public advertisement(String name, int length) {
        this.name = name;
        this.length = length;
    }

    @Override
    public int calculate() {
        return length*price;
    }

    @Override
    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "advertisement{" +
                "name='" + name + '\'' +
                ", length=" + length +
                '}';
    }
}
