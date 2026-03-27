package csie.ase.ro.design.patterns.factory;

import csie.ase.ro.design.patterns.factory.abstractF.AbstractDrinkFactory;
import csie.ase.ro.design.patterns.factory.abstractF.EspressoDrinkFactory;
import csie.ase.ro.design.patterns.factory.abstractF.MatchaDrinkFactory;
import csie.ase.ro.design.patterns.factory.drinks.BrandDrink;
import csie.ase.ro.design.patterns.factory.simple.DrinkSimpleFactory;

public class TestApp {
    public static void placeOrder(AbstractDrinkFactory abstractDrinkFactory){
        BrandDrink drink = abstractDrinkFactory.createDrink();
        System.out.println("Order: " + drink.describe());
    }
    public static void main(String[] args){
        // simple factory
        BrandDrink drink = DrinkSimpleFactory.createDrink("matcha");
        System.out.println(drink);

        // abstract factory
        placeOrder(new EspressoDrinkFactory());
        placeOrder(new MatchaDrinkFactory());
    }
}
