package csie.ase.ro.design.patterns.prototype;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestApp {
    public static void main(String[] args){
        Map<String, CoffeeDrinkPrototype> popularMenu = new HashMap<>();
        popularMenu.put("Special Flat white", new CoffeeDrinkPrototype("Flat white", "espresso", "almond milk", new ArrayList<>(List.of("vanilla flavour"))));

        CoffeeDrinkPrototype myDrink = popularMenu.get("Special Flat white").clone();
        myDrink.setMilk("oat milk");
        System.out.println(myDrink);

    }
}
