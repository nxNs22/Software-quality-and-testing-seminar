package csie.ase.ro.patterns.flyweight;

import java.util.HashMap;

public class Model3DFlyweigthFactory {

    static HashMap<String, Model3DFlyweight> models = new HashMap<>();

    static{
        models.put("Tree", new Model3DFlyweight("Tree"));
        models.put("Building", new Model3DFlyweight("Building"));
        models.put("Spaceship", new Model3DFlyweight("Spaceship"));
    }

    public static Model3DFlyweightInterface getModel(String name){
        Model3DFlyweightInterface model = models.get(name);
        if(model == null){
            throw new UnsupportedOperationException();
        }
        return model;
    }
}
