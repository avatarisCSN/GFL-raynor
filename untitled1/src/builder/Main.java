package builder;


public class Main {
    public static void main(String[] args)
    {
        Car car = new Car.CarBuilder().wheels(4).color("red").model("toyota").country("Japan").horsePower(200).engineVolume(20).build();
        System.out.println(car);
    }
}
