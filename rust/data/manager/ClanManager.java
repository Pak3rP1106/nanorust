package nano.spook1998.rust.data.manager;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import nano.spook1998.rust.object.User;
import org.bukkit.entity.Player;

public class UserManager {

    private static final UserManager INSTANCE = new UserManager();

    private final Map<UUID, User> users = new HashMap<>();

    private UserManager() {
    }

    public static UserManager getInstance() {
        return INSTANCE;
    }

    public void load() {
        users.clear();
    }

    public void save() {
        // Simple in-memory storage placeholder.
    }

    public User get(UUID uuid) {
        return users.get(uuid);
    }

    public User get(String name) {
        for (User user : users.values()) {
            if (user != null && user.getName() != null && user.getName().equalsIgnoreCase(name)) {
                return user;
            }
        }
        return null;
    }

    public User getOrCreate(UUID uuid, String name) {
        User user = users.get(uuid);
        if (user == null) {
            user = new User(uuid, name);
            users.put(uuid, user);
        }
        if (name != null) {
            user.setName(name);
        }
        return user;
    }

    public User getOrCreate(Player player) {
        if (player == null) {
            return null;
        }
        return getOrCreate(player.getUniqueId(), player.getName());
    }

    public void put(User user) {
        if (user != null && user.getUuid() != null) {
            users.put(user.getUuid(), user);
        }
    }

    public void remove(UUID uuid) {
        users.remove(uuid);
    }

    public Map<UUID, User> getUsers() {
        return users;
    }
}
