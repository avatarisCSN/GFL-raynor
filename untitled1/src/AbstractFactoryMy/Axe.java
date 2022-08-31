package AbstractFactoryMy;

public class Axe implements StrengthHeroes {

    @Override
    public void Info() {
        System.out.println("i m red hero with muscles and axe");
    }

    @Override
    public void Weapon() {
        System.out.println("Axe");
    }
}
