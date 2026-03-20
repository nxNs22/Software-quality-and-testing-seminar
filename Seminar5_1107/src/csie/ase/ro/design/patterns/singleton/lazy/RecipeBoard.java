package csie.ase.ro.design.patterns.singleton.lazy;

public class RecipeBoard {
    private static RecipeBoard board = null;

    private String specialDrink;
    private double drinkPrice;
    private int dailyTarget;

    private RecipeBoard(){
        System.out.println("Loading recipe board");
        this.specialDrink = "Flat white";
        this.drinkPrice = 6.5;
        this.dailyTarget = 200;
    }

    public static synchronized RecipeBoard getInstance(){
        if(RecipeBoard.board == null){
            RecipeBoard.board = new RecipeBoard();
        }
        return RecipeBoard.board;
    }

    public String getSpecialDrink() {
        return specialDrink;
    }

    public void setSpecialDrink(String specialDrink) {
        this.specialDrink = specialDrink;
    }

    public double getDrinkPrice() {
        return drinkPrice;
    }

    public void setDrinkPrice(double drinkPrice) {
        this.drinkPrice = drinkPrice;
    }

    public int getDailyTarget() {
        return dailyTarget;
    }

    public void setDailyTarget(int dailyTarget) {
        this.dailyTarget = dailyTarget;
    }
}
