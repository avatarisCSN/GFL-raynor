package abstractFactory1;

public class Main {
    public static void main(String[] args) {
        AnimalFactory first = AnimalFactoryProducer.getSmallFactory();

       MilkAnimal MA =  first.createMilkAnimal();
       MA.getMilk();

    }
}
