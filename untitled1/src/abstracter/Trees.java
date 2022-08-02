package abstracter;

public abstract class Trees {
    private int id;
    String inputAir;
    String outputAir;
    float  inputAirValue;
    float outputAirValue;
    private int branches;
    private int leaf;
    private String streetLocation;
    private int height;

    public Trees(int id, int branches, int leaf, String streetLocation, int height) {
        this.id = id;
        this.branches = branches;
        this.leaf = leaf;
        this.streetLocation = streetLocation;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }



    public int getId() {
        return id;
    }



    public int getBranches() {
        return branches;
    }

    public void setBranches(int branches) {
        this.branches = branches;
    }

    public int getLeaf() {
        return leaf;
    }

    public void setLeaf(int leaf) {
        this.leaf = leaf;
    }

    public String getStreet_location() {
        return streetLocation;
    }

    public void setStreet_location(String streetLocation) {
        this.streetLocation = streetLocation;
    }

    public int grow(int height)
    {
      return height+=this.height;
    }

    public void cutBranch (int branchCount)
    {

        if(branches> branchCount && branchCount>0) {
             branches = branches-branchCount;
        }
        else System.out.println("error");
    }

    public abstract void bloom(String month);

    public abstract void airConsumption ();

}