package csie.ase.ro.design.patterns.builder.eager;

public class CoffeeDrink {
    private String name;
    private String base;
    private String milk;
    private String topping;
    private boolean isIced;
    private String size;

    private CoffeeDrink(){

    }

    // all setters must be PRIVATE!!

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getBase() {
        return base;
    }

    private void setBase(String base) {
        this.base = base;
    }

    public String getMilk() {
        return milk;
    }

    private void setMilk(String milk) {
        this.milk = milk;
    }

    public String getTopping() {
        return topping;
    }

    private void setTopping(String topping) {
        this.topping = topping;
    }

    public boolean isIced() {
        return isIced;
    }

    private void setIced(boolean iced) {
        isIced = iced;
    }

    public String getSize() {
        return size;
    }

    private void setSize(String size) {
        this.size = size;
    }


    public static class EagerCoffeeDrinkBuilder{
        CoffeeDrink coffeeDrink;

        public EagerCoffeeDrinkBuilder(String name){
            this.coffeeDrink = new CoffeeDrink();
            this.coffeeDrink.name = name;
        }
    }
}

