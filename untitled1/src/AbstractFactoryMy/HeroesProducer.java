package AbstractFactoryMy;

public class HeroesProducer {
    static final  String str1 ="strength";
    static final String str2 ="str";
    static final String agi1="agility";
    static final String agi2 ="agiliti";
    static final String agi3="agi";

    public static HeroesFactory createHero(String heroAttr)
    {
        if(heroAttr.equalsIgnoreCase(str1)||heroAttr.equalsIgnoreCase(str2) )
        {
return  new AgilityHeroesFactory();
        }
        if(heroAttr.equalsIgnoreCase(agi1)||heroAttr.equalsIgnoreCase(agi2)||heroAttr.equalsIgnoreCase(agi3) )
        {
            System.out.println("create strength hero");
            return  new StrengthHeroesFactory();
        }
return null;
    }
}
