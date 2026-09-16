/*     */ package nano.spook1998.rust.listeners;
/*     */ 
/*     */ import org.bukkit.entity.Player;
/*     */ 
/*     */ public class PlayerJoinEvent implements org.bukkit.event.Listener { public static String ALLATORIxDEMO(String a) { int tmp12_11 = 4;
/*     */     int tmp23_20 = a.length();
/*     */     int tmp27_26 = 1;
/*     */     tmp27_26;
/*     */     int j;
/*     */     int ? = tmp27_26;
/*     */     int k = tmp23_20;
/*     */     int tmp37_33 = (j = new char[tmp23_20] - 1);
/*     */     tmp37_33;
/*     */     int i = 3;
/*     */     (tmp12_11 << tmp12_11 ^ 0x2 ^ 0x5);
/*     */     if (tmp37_33 >= 0) { int tmp47_46 = j;
/*     */       j--;
/*     */       ?[tmp47_46] = ((char)(a.charAt(tmp47_46) ^ i));
/*     */       int tmp68_65 = (j--);
/*     */       ?[tmp68_65] = ((char)(a.charAt(tmp68_65) ^ k));
/*     */     }
/*     */     return new String(?); }
/*     */   
/*     */   @org.bukkit.event.EventHandler(priority=org.bukkit.event.EventPriority.MONITOR, ignoreCancelled=true)
/*  13 */   public void onJoin(org.bukkit.event.player.PlayerJoinEvent a) { if (!
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  32 */       (a = a.getPlayer()).hasPermission(ALLATORIxDEMO("m&m(q2p3-%o(`,"))) { a.setGameMode(org.bukkit.GameMode.SURVIVAL);
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 155 */     org.bukkit.event.player.PlayerJoinEvent tmp29_28 = a;tmp29_28.setScoreboard(org.bukkit.Bukkit.getScoreboardManager().getNewScoreboard());
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 162 */     if (!tmp29_28.hasPlayedBefore()) { org.bukkit.event.player.PlayerJoinEvent tmp52_51 = a;tmp52_51.teleport(tmp52_51.getWorld().getHighestBlockAt(nano.spook1998.rust.utils.RandomUtil.getInstance().getRandInt(-nano.spook1998.rust.data.Settings.MAP_SIZE.intValue(), nano.spook1998.rust.data.Settings.MAP_SIZE.intValue()), nano.spook1998.rust.utils.RandomUtil.getInstance().getRandInt(-nano.spook1998.rust.data.Settings.MAP_SIZE.intValue(), nano.spook1998.rust.data.Settings.MAP_SIZE.intValue())).getLocation()); } a.ALLATORIxDEMO(a);
/*     */   }
/*     */ }


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\listeners\PlayerJoinEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */