package AbstractFactoryMy;

public abstract class HeroesFactory {
    abstract AgilityHeroes createAgi(String tooltip);
    abstract StrengthHeroes createStr(String tooltip);
}
