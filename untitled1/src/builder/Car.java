package builder;

public class Car {
    private int wheels;
    private String color;
    private String model;
    private String country;
    private int horsePower;
    private float engineVolume;

    private Car(CarBuilder builder){
        super();
        this.wheels = builder.wheels;
        this.color = builder.color;
        this.model = builder.model;
        this.country = builder.country;
        this.horsePower = builder.horsePower;
        this.engineVolume = builder.engineVolume;
    }
    public static class CarBuilder{
        private int wheels;
        private String color;
        private String model;
        private String country;
        private int horsePower;
        private float engineVolume;
        public CarBuilder(){}

        public CarBuilder wheels(int wheels)
        {
            this.wheels = wheels;
            return this;
        }
        public CarBuilder color(String color)
        {
            this.color = color;
            return this;
        }
        public CarBuilder model(String model )
        {
            this.model = model;
            return this;
        }
        public CarBuilder country( String country)
        {
            this.country = country;
            return this;
        }
        public CarBuilder horsePower(int horsePower)
        {
            this.horsePower = horsePower;
            return this;
        }
        public CarBuilder engineVolume(float engineVolume)
        {
            this.engineVolume = engineVolume;
            return this;
        }
        public Car build()
        {
           Car car = new Car(this);
          return car;
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheels=" + wheels +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", country='" + country + '\'' +
                ", horsePower=" + horsePower +
                ", engineVolume=" + engineVolume +
                '}';
    }
}
