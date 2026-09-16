/*     */ package nano.spook1998.rust.data;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import org.bukkit.Bukkit;
/*     */ import org.bukkit.ChatColor;
/*     */ import org.bukkit.Location;
/*     */ import org.bukkit.Material;
/*     */ import org.bukkit.World;
/*     */ import org.bukkit.entity.LivingEntity;
/*     */ import org.bukkit.inventory.ItemStack;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Settings
/*     */ {
/*  23 */   public static Location CENTER_LOCATION = ((World)Bukkit.getWorlds().get(0)).getSpawnLocation();
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  97 */   public static Map<String, String> MESSAGE = new HashMap();
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 173 */   public static Integer TIME_SAVE = Integer.valueOf(18000);
/*     */   public static Integer DAMAGE_BY_TNT;
/*     */   public static String PREFIX_OTHER;
/*     */   public static Integer REGION_SIZE;
/*     */   public static List<LivingEntity> LIVING_ENTITY;
/*     */   public static Integer REGION_DISTANCE;
/*     */   public static Integer TREE_AMOUNT;
/*     */   public static String WORDROBE_ONLINE;
/*     */   public static String PREFIX_TEAM;
/*     */   public static ItemStack WORDROBE;
/*     */   public static Integer STRUCTURAL_DEFAULT_HEALTH;
/*     */   public static Map<Integer, String> TABLIST_18;
/*     */   public static Integer TABLIST_PING;
/*     */   public static String TABLIST_FOOTER;
/*     */   public static Map<String, Integer> STRUCTURAL_HEALTH;
/*     */   public static Integer AIR_DROP_MAX;
/*     */   public static Integer AMOUNT_SCHEMATS;
/*     */   public static String SCOREBOARD_TITLE;
/*     */   public static Integer DAMAGE_TO_STRUCTURAL;
/*     */   public static Integer POINTS_CLAN;
/*     */   public static Integer SLOTS;
/*     */   public static String WORDROBE_NAME;
/*     */   public static Integer TAG_MAX;
/*     */   public static ItemStack TO_SCHEMAT;
/*     */   public static Integer WORDROBE_REMOVE_ALL;
/*     */   public static Integer TIME_OPEN;
/*     */   public static Integer WORDROBE_REMOVE;
/*     */   public static ItemStack WORDROBE_PLAYER;
/*     */   public static Long RAID_TIME_MAX;
/*     */   public static List<String> SCHEMATS_TO_FIND;
/*     */   public static Map<String, List<ItemStack>> FIRST_COST;
/*     */   public static String WORDROBE_OFFLINE;
/*     */   public static Map<String, Material> STRUCTURAL_MATERIAL;
/*     */   public static List<Material> DEFAULT_SCHEMATS;
/*     */   public static Integer DEFAULT_POINTS;
/*     */   public static ItemStack STRUCTURAL_PLAN;
/*     */   public static List<String> CLAN_INFO;
/*     */   public static Integer MAX_USER;
/*     */   public static Long RAID_TIME_MIN;
/*     */   public static Integer STONE_GENERATOR_HEALTH;
/*     */   public static List<Material> ALLOWED_BREAK_AT_REGION;
/*     */   public static Integer STONE_GENERAOTR_REBUILD;
/*     */   public static Integer TAG_MIN;
/*     */   public static List<String> CLANS_COMMAND;
/*     */   public static Integer WORDROBE_ADD;
/*     */   public static Map<Integer, ItemStack> WORDROBE_BUTTON;
/*     */   public static List<Material> ALLOWED_BREAK;
/*     */   public static List<Material> ALLOWED_PLACE;
/*     */   public static Integer IRON_DOOR_TIME;
/*     */   public static Integer AIR_DROP_MIN;
/*     */   public static Boolean RAID;
/*     */   public static Integer WORDROBE_DESTROY;
/*     */   public static Integer NAME_MAX;
/*     */   public static Integer MAP_SIZE;
/*     */   public static String TABLIST_HEADER;
/*     */   public static Integer NAME_MIN;
/*     */   public static Map<String, List<ItemStack>> STRUCTURAL_UPGRADE_COST;
/*     */   public static Integer VERSION;
/*     */   
/*     */   public static String ALLATORIxDEMO(String a)
/*     */   {
/*     */     int tmp23_20 = a.length();
/*     */     int tmp27_26 = 1;
/*     */     tmp27_26;
/*     */     int j;
/*     */     int ? = tmp27_26;
/*     */     int k = tmp23_20;
/*     */     int tmp37_33 = (j = new char[tmp23_20] - 1);
/*     */     tmp37_33;
/*     */     int i = 5 << 3 ^ 0x5;
/*     */     (2 << 3 ^ 0x2 ^ 0x5);
/*     */     if (tmp37_33 >= 0)
/*     */     {
/*     */       int tmp47_46 = j;
/*     */       j--;
/*     */       ?[tmp47_46] = ((char)(a.charAt(tmp47_46) ^ i));
/*     */       int tmp68_65 = (j--);
/*     */       ?[tmp68_65] = ((char)(a.charAt(tmp68_65) ^ k));
/*     */     }
/*     */     return new String(?);
/*     */   }
/*     */   
/*     */   static
/*     */   {
/* 164 */     REGION_SIZE = Integer.valueOf(50);REGION_DISTANCE = Integer.valueOf(110);ALLOWED_BREAK = new ArrayList();
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 171 */     ALLOWED_PLACE = new ArrayList();ALLOWED_BREAK_AT_REGION = new ArrayList();WORDROBE_NAME = ChatColor.RED + ALLATORIxDEMO("zx_s_xOr");WORDROBE_ONLINE = ChatColor.GREEN + ALLATORIxDEMO("bYa^cR");WORDROBE_PLAYER = new ItemStack(Material.STONE, 1);WORDROBE_OFFLINE = ChatColor.RED + ALLATORIxDEMO("XkQa^cR");WORDROBE_ADD = Integer.valueOf(41);WORDROBE_REMOVE = Integer.valueOf(42);WORDROBE_REMOVE_ALL = Integer.valueOf(43);WORDROBE_DESTROY = Integer.valueOf(44);WORDROBE = new ItemStack(Material.SPONGE, 1);WORDROBE_BUTTON = new HashMap();SCOREBOARD_TITLE = ChatColor.RED + ALLATORIxDEMO("`Tb^c");
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 182 */     STONE_GENERATOR_HEALTH = Integer.valueOf(200);STONE_GENERAOTR_REBUILD = Integer.valueOf(40);AMOUNT_SCHEMATS = Integer.valueOf(10);MAP_SIZE = Integer.valueOf(1000);DEFAULT_SCHEMATS = new ArrayList();SCHEMATS_TO_FIND = new ArrayList();STRUCTURAL_PLAN = new ItemStack(Material.BOOK, 1);STRUCTURAL_MATERIAL = new HashMap();STRUCTURAL_HEALTH = new HashMap();STRUCTURAL_UPGRADE_COST = new HashMap();STRUCTURAL_DEFAULT_HEALTH = Integer.valueOf(750);
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 194 */     FIRST_COST = new HashMap();DAMAGE_BY_TNT = Integer.valueOf(15);DEFAULT_POINTS = Integer.valueOf(1000);LIVING_ENTITY = new ArrayList();AIR_DROP_MIN = Integer.valueOf(1);AIR_DROP_MAX = Integer.valueOf(5);TO_SCHEMAT = new ItemStack(Material.EMPTY_MAP, 1);CLANS_COMMAND = new ArrayList();DAMAGE_TO_STRUCTURAL = Integer.valueOf(0);SLOTS = Integer.valueOf(0);VERSION = Integer.valueOf(0);TABLIST_HEADER = "&cMcRust.eu";TABLIST_FOOTER = "&cNajlepszy serwer rust!";TABLIST_PING = Integer.valueOf(35);TABLIST_18 = new HashMap();CLAN_INFO = new ArrayList();TREE_AMOUNT = Integer.valueOf(1000);POINTS_CLAN = Integer.valueOf(4000);TAG_MIN = Integer.valueOf(3);TAG_MAX = Integer.valueOf(5);NAME_MIN = Integer.valueOf(10);NAME_MAX = Integer.valueOf(20);MAX_USER = Integer.valueOf(15);PREFIX_OTHER = ChatColor.DARK_RED + ALLATORIxDEMO("L") + ChatColor.RED + ALLATORIxDEMO("lyVjj") + ChatColor.DARK_RED + ALLATORIxDEMO("J");PREFIX_TEAM = ChatColor.DARK_RED + ALLATORIxDEMO("L") + ChatColor.GREEN + ALLATORIxDEMO("lyVjj") + ChatColor.DARK_RED + ALLATORIxDEMO("J");IRON_DOOR_TIME = Integer.valueOf(600);TIME_OPEN = Integer.valueOf(2000);RAID = Boolean.valueOf(true);
/*     */   }
/*     */ }


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\data\Settings.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */