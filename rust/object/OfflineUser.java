package nano.spook1998.rust.data.manager;

import java.util.HashMap;
import java.util.Map;
import nano.spook1998.rust.object.Structural;

public class StructuralManager {

    private static final StructuralManager INSTANCE = new StructuralManager();

    private final Map<String, Structural> structures = new HashMap<>();

    private StructuralManager() {
    }

    public static StructuralManager getInstance() {
        return INSTANCE;
    }

    public void load() {
        structures.clear();
    }

    public void save() {
        // Simple in-memory storage placeholder.
    }

    public Structural get(String id) {
        return structures.get(id);
    }

    public void put(Structural structural) {
        if (structural != null && structural.getId() != null) {
            structures.put(structural.getId(), structural);
        }
    }

    public void remove(String id) {
        structures.remove(id);
    }

    public Map<String, Structural> getStructures() {
        return structures;
    }
}
