package AbstractFactoryMy;

public class AgilityHeroesFactory extends HeroesFactory {
    @Override
    public AgilityHeroes createAgi(String tooltip)
    {
      final  String drow1="sexy and beauty girl with bow and blue hair";
      final  String drow2="agility hero with a bow";
       final String drow3 ="drow ranger";
        if(tooltip.equalsIgnoreCase(drow1)|| tooltip.equalsIgnoreCase(drow2)|| tooltip.equalsIgnoreCase(drow3))
        {
            return  new DrowRanger();
        }
        final  String meduza1="ugly and strange girl with bow and snake-hair";
        final  String meduza2="meduza";

          if(tooltip.equalsIgnoreCase(meduza1)|| tooltip.equalsIgnoreCase(meduza2))
        {
            return  new Meduza();
        }
         return null;

    }

    @Override
    StrengthHeroes createStr(String tooltip) {
        return null;
    }
}
