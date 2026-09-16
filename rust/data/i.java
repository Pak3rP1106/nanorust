package nano.spook1998.rust.data;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class LicenseSystem {

    private static final Map<UUID, Boolean> LICENSES = new HashMap<>();

    private LicenseSystem() {
    }

    public static void grant(UUID uuid) {
        if (uuid != null) {
            LICENSES.put(uuid, true);
        }
    }

    public static void revoke(UUID uuid) {
        if (uuid != null) {
            LICENSES.remove(uuid);
        }
    }

    public static boolean has(UUID uuid) {
        return uuid != null && Boolean.TRUE.equals(LICENSES.get(uuid));
    }

    public static Map<UUID, Boolean> getLicenses() {
        return LICENSES;
    }
}
