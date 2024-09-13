package OOP.harder;

public class Car extends Vehicle{
    public Car(int speed) {
          super(speed);
    }
    public void playMusic()
    {
        System.out.println("В автомобиле играет музыка.");
    }
    @Override
    public void move()
    {
        System.out.println("Автомобиль едет со скоростью: " + speed + " км/ч.");
    }
}
