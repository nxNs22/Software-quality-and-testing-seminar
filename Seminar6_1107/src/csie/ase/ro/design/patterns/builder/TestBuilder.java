package csie.ase.ro.design.patterns.builder;

import csie.ase.ro.design.patterns.builder.eager.CoffeeDrink;

public class TestBuilder {
    public static void main(String[] args){
        CoffeeDrink coffeeDrink = new CoffeeDrink.EagerCoffeeDrinkBuilder("Cappuccino")
                .addMilk("oat milk")
                .addIce(false)
                .addTopping("vanilla")
                .addSize("large")
                .build();

        System.out.println(coffeeDrink);
    }
}
