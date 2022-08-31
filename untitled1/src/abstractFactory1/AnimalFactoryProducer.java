package abstractFactory1;

//необязательный класс, используется, чтобы отделить мейновй класс от интерфейса, в котором описана фабрика

public class AnimalFactoryProducer {
    public static   AnimalFactory getBigFactory()
    {
        return new BigFactory();
    }
    public static   AnimalFactory getSmallFactory()
    {
        return new SmallFactory();
    }
}
