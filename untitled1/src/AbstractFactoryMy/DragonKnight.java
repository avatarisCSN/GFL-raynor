package AbstractFactoryMy;

public class DragonKnight implements StrengthHeroes {
    @Override
    public void Info() {
        System.out.println("I m  hero with shield and sword and i can transform into dragon and breathe with fire");
    }

    @Override
    public void Weapon() {
        System.out.println("Sword and Shield");

    }
}
