package list;

public class Cat {
    private String name;
    private int legs;

    public Cat(String name, int legs) {
        this.name = name;
        this.legs = legs;
    }

    public String getName() {
        return name;
    }

    public int getLegs() {
        return legs;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", legs=" + legs +
                '}';
    }
}
