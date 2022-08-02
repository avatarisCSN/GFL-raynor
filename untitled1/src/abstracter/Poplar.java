package abstracter;

public class Poplar extends Trees {
    static final boolean canEatAnimalFruit = true;
    static final int fruitValue = 95;
    private String color;
    private String bloomMonth="june";
    public Poplar(int id, int branches, int leaf, String streetLocation, int height) {
        super(id, branches, leaf, streetLocation, height);
    }

    @Override
    public void bloom(String month) {
        if (month==bloomMonth) color="yellow";
        else color = "green";
    }

    @Override
    public void airConsumption() {
        inputAir ="carbon dioxide";
        inputAirValue= (float) (this.getBranches()*0.15+this.getLeaf()*0.08+this.getHeight()*0.35);
        outputAir="dioxide";
        inputAirValue= (float) (this.getBranches()*0.15+this.getLeaf()*0.05+this.getHeight()*0.24);
    }

}
