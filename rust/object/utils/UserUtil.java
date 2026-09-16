package nano.spook1998.rust.object.utils;

import java.util.ArrayList;
import java.util.List;
import nano.spook1998.rust.object.Clan;
import nano.spook1998.rust.object.User;

public class ClanUtil {

    private static final List<Clan> CLANS = new ArrayList<>();

    private ClanUtil() {
    }

    public static Clan createClan(String name, String tag, User owner) {
        if (name == null || tag == null || owner == null) {
            return null;
        }
        if (getByName(name) != null || getByTag(tag) != null) {
            return null;
        }

        Clan clan = new Clan(name, tag, owner);
        CLANS.add(clan);
        return clan;
    }

    public static List<Clan> getClans() {
        return CLANS;
    }

    public static Clan getByName(String name) {
        if (name == null) {
            return null;
        }
        for (Clan clan : CLANS) {
            if (clan != null && clan.getName() != null && clan.getName().equalsIgnoreCase(name)) {
                return clan;
            }
        }
        return null;
    }

    public static Clan getByTag(String tag) {
        if (tag == null) {
            return null;
        }
        for (Clan clan : CLANS) {
            if (clan != null && clan.getTag() != null && clan.getTag().equalsIgnoreCase(tag)) {
                return clan;
            }
        }
        return null;
    }

    public static void addClan(Clan clan) {
        if (clan != null && !CLANS.contains(clan)) {
            CLANS.add(clan);
        }
    }

    public static void removeClan(Clan clan) {
        if (clan != null) {
            CLANS.remove(clan);
        }
    }
}
