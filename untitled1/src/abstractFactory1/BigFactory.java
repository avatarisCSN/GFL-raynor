package abstractFactory1;

public class BigFactory implements AnimalFactory {
    @Override
        public MilkAnimal createMilkAnimal() {
        return new Cow();
    }

    @Override
    public PlayAnimal createPlayAnimal() {
        return new Dog();
    }
}
