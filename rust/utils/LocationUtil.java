/*     */ package nano.spook1998.rust.utils;
/*     */ 
/*     */ import org.bukkit.Bukkit;
/*     */ import org.bukkit.Location;
/*     */ import org.bukkit.World;
/*     */ import org.bukkit.util.Vector;
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
/*     */ public class LocationUtil
/*     */ {
/*     */   public static Location getLocation(Location a)
/*     */   {
/*  46 */     Vector tmp8_5 = 
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
/* 146 */       a.getDirection().normalize(); Vector tmp9_8 = tmp8_5;double d1 = tmp9_8.getX() * 5.0D;
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
/* 167 */     double d2 = tmp8_5.getY() * 5.0D + 1.0D;double d3 = tmp9_8.getZ() * 5.0D;return a.clone().add(d1, d2, d3);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static String LocationToString(Location a)
/*     */   {
/*  56 */     return a.getWorld().getName() + ALLATORIxDEMO("d") + a.getX() + ALLATORIxDEMO("d") + a.getY() + ALLATORIxDEMO("d") + a.getZ() + ALLATORIxDEMO("d") + a.getYaw() + ALLATORIxDEMO("d") + a.getPitch();
/*     */   }
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
/*     */   public static Location StringToLocation(String a)
/*     */   {
/*     */     String[] arrayOfString;
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
/* 110 */     if (
/*     */     
/*     */ 
/* 113 */       (arrayOfString = a.split(ALLATORIxDEMO("e"))).length < 3) arrayOfString = a.split(ALLATORIxDEMO("d"));
/*  68 */     return new Location(Bukkit.getWorld(arrayOfString[0]), Double.parseDouble(arrayOfString[1]), Double.parseDouble(arrayOfString[2]), Double.parseDouble(arrayOfString[3]), Float.parseFloat(arrayOfString[4]), Float.parseFloat(arrayOfString[5]));
/*     */   }
/*     */   
/*     */   public static Location getLocationStairs(Location a, Integer a, Integer a)
/*     */   {
/*  73 */     Vector tmp8_5 = 
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
/* 162 */       a.getDirection().normalize(); Vector tmp9_8 = tmp8_5;double d1 = tmp9_8.getX() * a.intValue();double d2 = tmp8_5.getY() * a.intValue() + a.intValue();
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
/* 182 */     double d3 = tmp9_8.getZ() * a.intValue();return a.clone().add(d1, d2, d3);
/*     */   }
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
/*     */   public static Location getLocationWall(Location a)
/*     */   {
/* 170 */     Vector tmp8_5 = a.getDirection().normalize(); Vector tmp9_8 = tmp8_5;double d1 = tmp9_8.getX() * 3.0D;double d2 = tmp8_5.getY() * 3.0D + 2.0D;double d3 = tmp9_8.getZ() * 3.0D;return a.clone().add(d1, d2, d3);
/*     */   }
/*     */   
/*     */   public static Location getLocationSpecRoof(Location a)
/*     */   {
/* 164 */     Vector tmp8_5 = a.getDirection().normalize(); Vector tmp9_8 = tmp8_5;double d1 = tmp9_8.getX() * 6.0D;double d2 = tmp8_5.getY() * 6.0D + 1.0D;double d3 = tmp9_8.getZ() * 6.0D;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 171 */     return a.clone().add(d1, d2, d3);
/*     */   }
/*     */   
/*     */   public static String ALLATORIxDEMO(String a)
/*     */   {
/*     */     int tmp27_24 = a.length();
/*     */     int tmp31_30 = 1;
/*     */     tmp31_30;
/*     */     int j;
/*     */     int ? = tmp31_30;
/*     */     int k = tmp27_24;
/*     */     (j = new char[tmp27_24] - 1);
/*     */     int i = 4 << 3 ^ 0x3;
/*     */     if (((0x3 ^ 0x5) << 3 ^ 0x3 ^ 0x5) >= 0)
/*     */     {
/*     */       int tmp50_49 = j;
/*     */       j--;
/*     */       ?[tmp50_49] = ((char)(a.charAt(tmp50_49) ^ i));
/*     */       int tmp71_68 = (j--);
/*     */       ?[tmp71_68] = ((char)(a.charAt(tmp71_68) ^ k));
/*     */     }
/*     */     return new String(?);
/*     */   }
/*     */ }


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\utils\LocationUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */