package nano.spook1998.rust.data.manager;

import java.util.HashMap;
import java.util.Map;
import nano.spook1998.rust.object.Clan;

public class ClanManager {

    private static final ClanManager INSTANCE = new ClanManager();

    private final Map<String, Clan> clans = new HashMap<>();

    private ClanManager() {
    }

    public static ClanManager getInstance() {
        return INSTANCE;
    }

    public void load() {
        clans.clear();
    }

    public void save() {
        // Simple in-memory storage placeholder.
    }

    public Clan get(String name) {
        return clans.get(name);
    }

    public Clan getByTag(String tag) {
        for (Clan clan : clans.values()) {
            if (clan != null && clan.getTag() != null && clan.getTag().equalsIgnoreCase(tag)) {
                return clan;
            }
        }
        return null;
    }

    public void put(Clan clan) {
        if (clan != null && clan.getName() != null) {
            clans.put(clan.getName(), clan);
        }
    }

    public void remove(String name) {
        clans.remove(name);
    }

    public Map<String, Clan> getClans() {
        return clans;
    }
}
