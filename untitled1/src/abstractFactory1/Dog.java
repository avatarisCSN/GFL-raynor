package abstractFactory1;

public class Dog implements PlayAnimal {
    @Override
    public void play() {
        voice();
    }

    private void voice() {
        System.out.println("Gav");
    }
}
