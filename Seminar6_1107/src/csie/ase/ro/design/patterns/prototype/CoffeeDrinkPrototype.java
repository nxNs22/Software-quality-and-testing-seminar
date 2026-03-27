package csie.ase.ro.design.patterns.prototype;

import java.util.ArrayList;

public class CoffeeDrinkPrototype implements Cloneable {
    private String name;
    private String base;
    private String milk;
    private ArrayList<String> extras;

    public CoffeeDrinkPrototype(String name, String base, String milk, ArrayList<String> extras){
        this.name = name;
        this.base = base;
        this.milk = milk;
        this.extras = new ArrayList<>();
        for(String s : extras){
            this.extras.add(s);
        }
    }

    private CoffeeDrinkPrototype(){

    }

    public void setMilk(String milk){
        this.milk = milk;
    }

    @Override
    public CoffeeDrinkPrototype clone() {
        CoffeeDrinkPrototype copy = new CoffeeDrinkPrototype();
        copy.name = this.name;
        copy.base = this.base;
        copy.milk = this.milk;
        copy.extras = new ArrayList<>();
        for (String s : this.extras){
            copy.extras.add(s);
        }
        return copy;
    }

    @Override
    public String toString() {
        return "CoffeeDrinkPrototype{" +
                "name='" + name + '\'' +
                ", base='" + base + '\'' +
                ", milk='" + milk + '\'' +
                ", extras=" + extras +
                '}';
    }
}
