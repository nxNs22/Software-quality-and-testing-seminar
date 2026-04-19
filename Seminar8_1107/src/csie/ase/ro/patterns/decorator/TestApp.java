package csie.ase.ro.patterns.decorator;

public class TestApp {
    public static void main(String[] args){
        AbstractMeal grilledChicken = new GrilledChicken("Rice grilled chicken", 19);

        grilledChicken.prepare();

        // adding sauce
        grilledChicken = new ExtraSauceDecorator(grilledChicken, "mayo");
        grilledChicken.printDescription();
        System.out.println(grilledChicken.getPrice());

    }
}
