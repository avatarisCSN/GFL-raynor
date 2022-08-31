package abstractFactory1;

public class SmallFactory implements AnimalFactory {
    @Override
    public MilkAnimal createMilkAnimal() {
        return new Goat();
    }

    @Override
    public PlayAnimal createPlayAnimal() {
        return new Cat();
    }
}
