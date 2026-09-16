/*   */ package nano.spook1998.rust.utils;
/*   */ 
/*   */ import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
/*   */ 
/*   */ public class PingUtil
/*   */ {
/*   */   public static Integer getPing(org.bukkit.entity.Player a) {
/* 8 */     return Integer.valueOf(((CraftPlayer)a).getHandle().ping);
/*   */   }
/*   */ }


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\utils\PingUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */