package abstracter;

public class Chestnut extends Trees {
    static final boolean canEatAnimalFruit = false;
    private String color;
    private String bloomMonth="jule";
    public Chestnut(int id, int branches, int leaf, String streetLocation, int height) {
        super(id, branches, leaf, streetLocation, height);
    }

    @Override
    public void bloom(String month) {
        if (month==bloomMonth) color="white";
        else color = "green";
    }

    @Override
    public void airConsumption() {
        inputAir ="carbon dioxide";
        inputAirValue= (float) (this.getBranches()*0.15+this.getLeaf()*0.1+this.getHeight()*0.35);
        outputAir="dioxide";
        inputAirValue= (float) (this.getBranches()*0.2+this.getLeaf()*0.05+this.getHeight()*0.2);
    }
}
