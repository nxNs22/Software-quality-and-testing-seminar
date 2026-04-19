package csie.ase.ro.patterns.decorator;

public class ExtraSauceDecorator extends AbstractMealDecorator{

    String sauceType;
    float EXTRA_SAUCE_PRICE = 2.5f;

    public ExtraSauceDecorator(AbstractMeal meal, String sauceType) {
        super(meal);
        this.sauceType = sauceType;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + EXTRA_SAUCE_PRICE;
    }

    @Override
    public void printDescription() {
        super.printDescription();
        System.out.println("With extra sauce " + sauceType);
    }

    public void addSauce(){
        System.out.println("Adding " + this.sauceType + " to " + super.name);
    }
}
