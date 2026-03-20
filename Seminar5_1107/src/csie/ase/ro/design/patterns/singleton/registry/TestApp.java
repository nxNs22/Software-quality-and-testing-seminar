package csie.ase.ro.design.patterns.singleton.registry;

public class TestApp {
    public static void main(String[] args){
        LogBookRegistry.getInstance("INFO").log("Shop opened");
        LogBookRegistry.getInstance("ERROR").log("Machine broken");
        LogBookRegistry.getInstance("STAFF").log("Barista came in");


        CategoryLogBook categoryLogBook1 = LogBookRegistry.getInstance("ERROR");
        CategoryLogBook categoryLogBook2 = LogBookRegistry.getInstance("ERROR");

        System.out.println("Same category? " + (categoryLogBook1 == categoryLogBook2));
    }
}
