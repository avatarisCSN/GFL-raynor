package OOP.harder;

public class Bike extends Vehicle{


    public Bike(int speed) {
        super(speed);
    }
    public void ringBell()
    {
        System.out.println("Велосипед звонит в колокольчик.");
    }
    @Override
    public void move()
    {
        System.out.println("Автомобиль едет со скоростью: " + speed + " км/ч.");
    }
}
