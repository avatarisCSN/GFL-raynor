package AbstractFactoryMy;

public class Main {
     static  final String uslovie="strength";
     static final String uslovie2="AXE! AXE!";
    public static void main(String[] args)
    {
        HeroesFactory hero = HeroesProducer.createHero(uslovie);
           hero.createStr(uslovie2);
    }
}
