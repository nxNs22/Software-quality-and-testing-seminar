package csie.ase.ro.design.patterns.singleton.lazy;

public class TestApp {
    public static void main(String[] args){
        RecipeBoard espressoBoard = RecipeBoard.getInstance();
        RecipeBoard coldDrinkBoard = RecipeBoard.getInstance();

        coldDrinkBoard.setSpecialDrink("Iced coffee");

        System.out.println("Cold drinks: " + coldDrinkBoard.getSpecialDrink());
        System.out.println("Espresso drinks: " + espressoBoard.getSpecialDrink());
        System.out.println("Same instance?: " + (espressoBoard == coldDrinkBoard));
    }
}
