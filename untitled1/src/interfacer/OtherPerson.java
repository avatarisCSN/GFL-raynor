package interfacer;

public class OtherPerson implements Owner {

    private String name;
    public OtherPerson(String name) {
        this.name = name;

    }


    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }
}
