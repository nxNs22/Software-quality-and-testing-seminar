package csie.ase.ro.design.patterns.factory.drinks;



public class Matcha extends BrandDrink{

    public Matcha(){
        this.name = "Matcha";
        this.price = 4.55;
    }

    @Override
    public String describe() {
        return name + ": " + price;
    }

    @Override
    public String toString() {
        return "Matcha{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
