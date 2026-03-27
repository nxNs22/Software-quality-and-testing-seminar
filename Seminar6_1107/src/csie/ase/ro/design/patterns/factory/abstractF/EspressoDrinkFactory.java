package csie.ase.ro.design.patterns.factory.abstractF;

import csie.ase.ro.design.patterns.factory.drinks.BrandDrink;
import csie.ase.ro.design.patterns.factory.drinks.EspressoEdge;

public class EspressoDrinkFactory extends AbstractDrinkFactory{
    @Override
    public BrandDrink createDrink() {
        return new EspressoEdge();
    }
}
