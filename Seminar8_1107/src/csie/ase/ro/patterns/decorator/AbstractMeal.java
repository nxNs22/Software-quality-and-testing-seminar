package csie.ase.ro.patterns.decorator;


public abstract class AbstractMeal {
    String name;
    double basePrice;

    public AbstractMeal(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }

    public void serve(){
        System.out.println(this.name + " is served");
    }

    public void printDescription(){
        System.out.println("A meal: " + this.name + " with base price " + this.basePrice);
    }

    public abstract void prepare();
    public abstract double getPrice();
}
