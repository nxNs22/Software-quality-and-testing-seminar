package csie.ase.ro.patterns.flyweight;

public class TestApp {
    public static void main(String[] args){
        Model3DFlyweightInterface tree1 = Model3DFlyweigthFactory.getModel("Tree");
        Model3DFlyweightInterface tree2 = Model3DFlyweigthFactory.getModel("Tree");

        tree1.displayOnScreen(new Coordinates(10, 9));
        tree2.displayOnScreen(new Coordinates(5, 6));


    }
}
