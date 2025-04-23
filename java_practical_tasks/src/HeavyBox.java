public class HeavyBox extends Box implements Comparable<HeavyBox>{
    private int weight;
    public HeavyBox(double width, double height, double depth, int weight) {
        super(width, height, depth);
        this.weight=weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(HeavyBox other) {
        return Integer.compare(this.weight,other.weight);
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


}
