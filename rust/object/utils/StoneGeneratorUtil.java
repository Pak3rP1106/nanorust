package nano.spook1998.rust.object.utils;

import java.util.ArrayList;
import java.util.List;
import nano.spook1998.rust.object.Schemat;

public class SchematsUtil {

    private static final List<Schemat> SCHEMATS = new ArrayList<>();

    private SchematsUtil() {
    }

    public static void addSchemat(Schemat schemat) {
        if (schemat != null && !SCHEMATS.contains(schemat)) {
            SCHEMATS.add(schemat);
        }
    }

    public static void removeSchemat(Schemat schemat) {
        if (schemat != null) {
            SCHEMATS.remove(schemat);
        }
    }

    public static List<Schemat> getSchemats() {
        return SCHEMATS;
    }

    public static Schemat getById(String id) {
        if (id == null) {
            return null;
        }
        for (Schemat schemat : SCHEMATS) {
            if (schemat != null && id.equals(schemat.getId())) {
                return schemat;
            }
        }
        return null;
    }
}
