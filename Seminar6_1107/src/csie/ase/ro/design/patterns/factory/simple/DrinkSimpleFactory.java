package csie.ase.ro.design.patterns.factory.simple;

import csie.ase.ro.design.patterns.factory.drinks.BrandDrink;
import csie.ase.ro.design.patterns.factory.drinks.EspressoEdge;
import csie.ase.ro.design.patterns.factory.drinks.Matcha;

public class DrinkSimpleFactory {
    public static BrandDrink createDrink(String type){
        return switch (type.toLowerCase()){
            case "espresso" -> new EspressoEdge();
            case "matcha" -> new Matcha();
            default -> throw new IllegalStateException("Unexpected value: " + type.toLowerCase());
        };
    }
}
