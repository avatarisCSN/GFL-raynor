package interfacer;

public class Home2 {
    private String color;
    private int window_number;
    private String window_form;
    private int floors;
    private String owner;

    public Home2(String color, int window_number, String window_form, int floors, String owner) {
        this.color = color;
        this.window_number = window_number;
        this.window_form = window_form;
        this.floors = floors;
        this.owner = owner;
    }

    public String getColor() {
        return color;
    }

    public int getWindow_number() {
        return window_number;
    }

    public String getWindow_form() {
        return window_form;
    }

    public int getFloors() {
        return floors;
    }

    public String getOwner() {
        return owner;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWindow_number(int window_number) {
        this.window_number = window_number;
    }

    public void setWindow_form(String window_form) {
        this.window_form = window_form;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }
// для получения данных нужно знать тип обьекта, из которого получаем данные, еще и имя данного, кто так придумал?
    public void setOwner(Person person) {
        this.owner = person.getName();
    }

}
