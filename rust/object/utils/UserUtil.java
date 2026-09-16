package nano.spook1998.rust.object.utils;

import java.util.ArrayList;
import java.util.List;
import nano.spook1998.rust.object.Structural;

public class StructuralUtil {

    private static final List<Structural> STRUCTURES = new ArrayList<>();

    private StructuralUtil() {
    }

    public static void addStructural(Structural structural) {
        if (structural != null && !STRUCTURES.contains(structural)) {
            STRUCTURES.add(structural);
        }
    }

    public static void removeStructural(Structural structural) {
        if (structural != null) {
            STRUCTURES.remove(structural);
        }
    }

    public static List<Structural> getStructures() {
        return STRUCTURES;
    }

    public static Structural getById(String id) {
        if (id == null) {
            return null;
        }
        for (Structural structural : STRUCTURES) {
            if (structural != null && id.equals(structural.getId())) {
                return structural;
            }
        }
        return null;
    }
}
