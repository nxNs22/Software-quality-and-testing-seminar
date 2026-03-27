package csie.ase.ro.design.patterns.builder;

import csie.ase.ro.design.patterns.builder.eager.CoffeeDrink;
import csie.ase.ro.design.patterns.builder.lazy.LazyCoffeeDrink;

public class TestBuilder {
    public static void main(String[] args){
        CoffeeDrink coffeeDrink = new CoffeeDrink.EagerCoffeeDrinkBuilder("Cappuccino")
                .addMilk("oat milk")
                .addIce(false)
                .addTopping("vanilla")
                .addSize("large")
                .build();

        System.out.println(coffeeDrink);

        LazyCoffeeDrink lazyCoffeeDrink = new LazyCoffeeDrink.LazyCoffeeDrinkBuilder("Espresso")
                .addIce(false)
                .addSize("double")
                .addBase("espresso")
                .addTopping("caramel")
                .build();

        System.out.println(lazyCoffeeDrink);
    }
}
