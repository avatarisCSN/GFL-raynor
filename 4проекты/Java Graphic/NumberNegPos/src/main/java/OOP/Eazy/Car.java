package OOP.Eazy;

public class Car {
    private String model;
    private String make;
    private  int year;

    public Car(String model, String make, int year) {
        this.model = model;
        this.make = make;
        this.year = year;
    }
    public void displayInfo()
    {
        System.out.println("Марка: " + make + ", Модель: " + model + ", Год выпуска: " + year);
    }
}
