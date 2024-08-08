package list;

public class bigCat extends Cat{
    private String type;

    public bigCat(String name, int legs, String type) {
        super(name, legs);
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString()+ "bigCat{" +
                "type='" + type + '\'' +
                '}';
    }
}
