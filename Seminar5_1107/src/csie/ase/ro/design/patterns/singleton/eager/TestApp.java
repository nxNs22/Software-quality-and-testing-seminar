package csie.ase.ro.design.patterns.singleton.eager;

public class TestApp {
    public static void main(String[] args){
        OrderLogBook.getInstance().log("1st order: double espresso");
        OrderLogBook.getInstance().log("2nd order: mint tea");
        OrderLogBook.getInstance().log("Espressor broken");


    }
}
