package csie.ase.ro.design.patterns.singleton.registry;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LogBookRegistry {
    private static final Set<String> ALLOWED_CATEGORIES = Set.of("ERROR", "INFO", "ORDERS", "STAFF");
    private static final Map<String, CategoryLogBook> registry = new HashMap<>();

    private LogBookRegistry(){

    }

    public static synchronized CategoryLogBook getInstance(String category){
        if(!ALLOWED_CATEGORIES.contains(category)){
            throw new IllegalArgumentException("Unkown category: " + category + ". Allowed categories: " + ALLOWED_CATEGORIES);
        }

        if (!registry.containsKey(category)){
            registry.put(category, new CategoryLogBook(category));
        }

        return registry.get(category);
    }
}
