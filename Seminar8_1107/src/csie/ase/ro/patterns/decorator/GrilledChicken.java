package csie.ase.ro.patterns.decorator;

public class GrilledChicken extends AbstractMeal{

    public GrilledChicken(String name, double basePrice) {
        super(name, basePrice);
    }

    @Override
    public void prepare() {
        System.out.println("Grilled chicken is being prepared for " + this.name);
    }

    @Override
    public double getPrice() {
        return this.basePrice;
    }
}
