package csie.ase.ro.design.patterns.factory.drinks;

public class EspressoEdge extends BrandDrink{

    public EspressoEdge(){
        this.name = "Espresso Edge";
        this.price = 5.55;
    }

    @Override
    public String describe() {
        return name + ": " + price;
    }

    @Override
    public String toString() {
        return "EspressoEdge{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
