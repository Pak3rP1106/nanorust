package nano.spook1998.rust.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.LivingEntity;
import org.bukkit.inventory.ItemStack;

public final class Settings {

    public static Location CENTER_LOCATION = Bukkit.getWorlds().isEmpty() ? new Location(null, 0, 64, 0) : Bukkit.getWorlds().get(0).getSpawnLocation();

    public static Map<String, String> MESSAGE = new HashMap<>();
    public static Integer TIME_SAVE = 18000;
    public static Integer DAMAGE_BY_TNT = 15;
    public static String PREFIX_OTHER = "";
    public static Integer REGION_SIZE = 50;
    public static List<LivingEntity> LIVING_ENTITY = new ArrayList<>();
    public static Integer REGION_DISTANCE = 110;
    public static Integer TREE_AMOUNT;
    public static String WORDROBE_ONLINE = ChatColor.GREEN + "Online";
    public static String PREFIX_TEAM = "";
    public static ItemStack WORDROBE = new ItemStack(Material.CHEST);
    public static Integer STRUCTURAL_DEFAULT_HEALTH = 100;
    public static Map<Integer, String> TABLIST_18 = new HashMap<>();
    public static Integer TABLIST_PING;
    public static String TABLIST_FOOTER = "";
    public static Map<String, Integer> STRUCTURAL_HEALTH = new HashMap<>();
    public static Integer AIR_DROP_MAX = 5;
    public static Integer AMOUNT_SCHEMATS = 10;
    public static String SCOREBOARD_TITLE = "NanoRust";
    public static Integer DAMAGE_TO_STRUCTURAL;
    public static Integer POINTS_CLAN = 1000;
    public static Integer SLOTS;
    public static String WORDROBE_NAME = ChatColor.RED + "[Rust]";
    public static Integer TAG_MAX = 8;
    public static ItemStack TO_SCHEMAT = new ItemStack(Material.CHEST);
    public static Integer WORDROBE_REMOVE_ALL;
    public static Integer TIME_OPEN = 1200;
    public static Integer WORDROBE_REMOVE;
    public static ItemStack WORDROBE_PLAYER = new ItemStack(Material.SKULL_ITEM);
    public static Long RAID_TIME_MAX = 300L;
    public static List<String> SCHEMATS_TO_FIND = new ArrayList<>();
    public static Map<String, List<ItemStack>> FIRST_COST = new HashMap<>();
    public static String WORDROBE_OFFLINE = ChatColor.RED + "Offline";
    public static Map<String, Material> STRUCTURAL_MATERIAL = new HashMap<>();
    public static List<Material> DEFAULT_SCHEMATS = new ArrayList<>();
    public static Integer DEFAULT_POINTS = 1000;
    public static ItemStack STRUCTURAL_PLAN = new ItemStack(Material.WOOD);
    public static List<String> CLAN_INFO = new ArrayList<>();
    public static Integer MAX_USER;
    public static Long RAID_TIME_MIN = 120L;
    public static Integer STONE_GENERATOR_HEALTH = 200;
    public static List<Material> ALLOWED_BREAK_AT_REGION = new ArrayList<>();
    public static Integer STONE_GENERAOTR_REBUILD = 40;
    public static Integer TAG_MIN = 2;
    public static List<String> CLANS_COMMAND = new ArrayList<>();
    public static Integer WORDROBE_ADD = 1;
    public static Map<Integer, ItemStack> WORDROBE_BUTTON = new HashMap<>();
    public static List<Material> ALLOWED_BREAK = new ArrayList<>();
    public static List<Material> ALLOWED_PLACE = new ArrayList<>();
    public static Integer IRON_DOOR_TIME = 5;
    public static Integer AIR_DROP_MIN = 1;
    public static Boolean RAID = false;
    public static Integer WORDROBE_DESTROY = 1;
    public static Integer NAME_MAX = 16;
    public static Integer MAP_SIZE = 1000;
    public static String TABLIST_HEADER = "";
    public static Integer NAME_MIN = 3;
    public static Map<String, List<ItemStack>> STRUCTURAL_UPGRADE_COST = new HashMap<>();
    public static Integer VERSION;

    static {
        WORDROBE_REMOVE = 1;
        WORDROBE_REMOVE_ALL = 1;
        TAG_MAX = 8;
        AIR_DROP_MAX = 5;
        WORDROBE_ADD = 1;
        WORDROBE_DESTROY = 1;
        FIRST_COST = new HashMap<>();
        MESSAGE = new HashMap<>();
        CLANS_COMMAND = new ArrayList<>();
        CLAN_INFO = new ArrayList<>();
        SCHEMATS_TO_FIND = new ArrayList<>();
        DEFAULT_SCHEMATS = new ArrayList<>();
        ALLOWED_BREAK = new ArrayList<>();
        ALLOWED_PLACE = new ArrayList<>();
        ALLOWED_BREAK_AT_REGION = new ArrayList<>();
    }

    private Settings() {
    }
}
