package csie.ase.ro.design.patterns.builder.lazy;

public class LazyCoffeeDrink {
    private String name;
    private String base;
    private String milk;
    private String topping;
    private boolean isIced;
    private String size;

    private LazyCoffeeDrink(){

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

    @Override
    public String toString() {
        return "LazyCoffeeDrink{" +
                "name='" + name + '\'' +
                ", base='" + base + '\'' +
                ", milk='" + milk + '\'' +
                ", topping='" + topping + '\'' +
                ", isIced=" + isIced +
                ", size='" + size + '\'' +
                '}';
    }

    public static class LazyCoffeeDrinkBuilder{
        private String name;
        private String base;
        private String milk;
        private String topping;
        private boolean isIced;
        private String size;

        public LazyCoffeeDrinkBuilder(String name){
            this.name = name;
        }

        public LazyCoffeeDrinkBuilder addBase(String base){
            this.base = base;
            return this;
        }

        public LazyCoffeeDrinkBuilder addMilk(String milk){
            this.milk = milk;
            return this;
        }

        public LazyCoffeeDrinkBuilder addTopping(String topping){
            this.topping = topping;
            return this;
        }

        public LazyCoffeeDrinkBuilder addSize(String size){
            this.size = size;
            return this;
        }

        public LazyCoffeeDrinkBuilder addIce(boolean isIced){
            this.isIced = isIced;
            return this;
        }

        public LazyCoffeeDrink build(){
            LazyCoffeeDrink lazyCoffeeDrink = new LazyCoffeeDrink();
            lazyCoffeeDrink.name = this.name;
            lazyCoffeeDrink.base = this.base;
            lazyCoffeeDrink.milk = this.milk;
            lazyCoffeeDrink.isIced = this.isIced;
            lazyCoffeeDrink.topping = this.topping;
            lazyCoffeeDrink.size = this.size;

            return lazyCoffeeDrink;

        }

    }
}
