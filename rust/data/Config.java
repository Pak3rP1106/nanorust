package nano.spook1998.rust.object.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import nano.spook1998.rust.object.User;

public class UserUtil {

    private static final Map<UUID, User> USERS = new HashMap<>();

    private UserUtil() {
    }

    public static User get(UUID uuid) {
        return USERS.get(uuid);
    }

    public static User get(String name) {
        if (name == null) {
            return null;
        }
        for (User user : USERS.values()) {
            if (user != null && user.getName() != null && user.getName().equalsIgnoreCase(name)) {
                return user;
            }
        }
        return null;
    }

    public static void add(User user) {
        if (user != null && user.getUuid() != null) {
            USERS.put(user.getUuid(), user);
        }
    }

    public static void remove(User user) {
        if (user != null && user.getUuid() != null) {
            USERS.remove(user.getUuid());
        }
    }

    public static Map<UUID, User> getUsers() {
        return USERS;
    }
}
