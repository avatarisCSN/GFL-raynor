package OOP.harder;

public class Vehicle {
    protected int speed;

    public Vehicle(int speed) {
        this.speed = speed;
    }

    public void move()
    {
        System.out.println("Транспортное средство движется со скоростью: " + speed + " км/ч.");
    }
}
