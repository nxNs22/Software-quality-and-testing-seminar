package csie.ase.ro.patterns.flyweight;

import java.util.ArrayList;
import java.util.Random;

public class Model3DFlyweight implements Model3DFlyweightInterface{

    ArrayList<Integer> points = new ArrayList<>();
    String name;

    public Model3DFlyweight(String name) {
        this.name = name;
        System.out.println("Initializing " + this.name);
        Random random = new Random();
        for (int i = 0; i < 1000; i++){
            this.points.add(random.nextInt(5000));
        }
        System.out.println("Rendering done");
    }

    @Override
    public void displayOnScreen(Coordinates coordinates) {
        System.out.println("Displaying model on coordinates: ");
        for(int i = 0; i < 10;i++){
            System.out.println(this.points.get(i));
        }
        System.out.println("Placed model at: " + coordinates.getX() + ", " + coordinates.getY());
    }
}
