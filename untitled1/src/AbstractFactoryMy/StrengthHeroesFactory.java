package AbstractFactoryMy;

public class StrengthHeroesFactory extends HeroesFactory  {
    @Override
    AgilityHeroes createAgi(String tooltip) {
        return null;
    }

    @Override
    public StrengthHeroes createStr(String tooltip)
    {
        final  String axe1="i want to play at red and strong";
        final  String axe2="AXE! AXE!";
        final String axe3 ="i want to slice enemies";
        final String axe4 ="axe";
        if(tooltip.equalsIgnoreCase(axe1)|| tooltip.equalsIgnoreCase(axe2)|| tooltip.equalsIgnoreCase(axe3) || tooltip.equalsIgnoreCase(axe4))
        {
            return  new Axe();
        }
        final  String dk1="i want to breathe with fire";
        final  String dk2="dragon knight";

          if(tooltip.equalsIgnoreCase(dk1)|| tooltip.equalsIgnoreCase(dk2))
        {
            return  new DragonKnight();
        }
        return null;

    }
}


