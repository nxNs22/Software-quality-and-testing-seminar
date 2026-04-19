package csie.ase.ro.patterns.decorator;

public class AbstractMealDecorator extends AbstractMeal{

    AbstractMeal abstractMeal;

    public AbstractMealDecorator(AbstractMeal meal) {
        super(meal.name, meal.basePrice);
        this.abstractMeal = meal;
    }

    @Override
    public void prepare() {
        this.abstractMeal.prepare();
    }

    @Override
    public double getPrice() {
        return this.abstractMeal.getPrice();
    }

    @Override
    public void serve() {
       this.abstractMeal.serve();
    }

    @Override
    public void printDescription() {
        this.abstractMeal.printDescription();
    }
}
