package nano.spook1998.rust.object.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import nano.spook1998.rust.object.OfflineUser;

public class OfflineUserUtil {

    private static final Map<UUID, OfflineUser> USERS = new HashMap<>();

    private OfflineUserUtil() {
    }

    public static OfflineUser get(UUID uuid) {
        return USERS.get(uuid);
    }

    public static void add(OfflineUser user) {
        if (user != null && user.getUuid() != null) {
            USERS.put(user.getUuid(), user);
        }
    }

    public static void remove(OfflineUser user) {
        if (user != null && user.getUuid() != null) {
            USERS.remove(user.getUuid());
        }
    }

    public static Map<UUID, OfflineUser> getUsers() {
        return USERS;
    }
}
