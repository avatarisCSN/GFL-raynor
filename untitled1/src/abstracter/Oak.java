package abstracter;

public class Oak extends Trees  {

  static final boolean canEatAnimalFruit = true;
    static final int fruitValue = 150;



    private String color;
private String bloomMonth="may";

    public Oak(int id, int branches, int leaf, String streetLocation, int height) {
        super(id, branches, leaf, streetLocation, height);
    }

    @Override
    public void bloom(String month) {
if (month==bloomMonth) color="red";
else color = "green";
    }

    @Override
    public void airConsumption() {
         inputAir ="carbon dioxide";
         inputAirValue= (float) (this.getBranches()*0.2+this.getLeaf()*0.05+this.getHeight()*0.4);
        outputAir="dioxide";
        inputAirValue= (float) (this.getBranches()*0.25+this.getLeaf()*0.07+this.getHeight()*0.3);
    }


}
