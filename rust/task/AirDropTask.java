/*     */ package nano.spook1998.rust.task;
/*     */ 
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import nano.spook1998.rust.data.Settings;
/*     */ import nano.spook1998.rust.utils.RandomUtil;
/*     */ import org.bukkit.Bukkit;
/*     */ import org.bukkit.Location;
/*     */ import org.bukkit.Material;
/*     */ import org.bukkit.World;
/*     */ import org.bukkit.block.Block;
/*     */ import org.bukkit.block.Chest;
/*     */ import org.bukkit.inventory.Inventory;
/*     */ import org.bukkit.inventory.ItemStack;
/*     */ import org.bukkit.scheduler.BukkitRunnable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class AirDropTask
/*     */   extends BukkitRunnable
/*     */ {
/*     */   public static String ALLATORIxDEMO(String a)
/*     */   {
/*     */     int tmp17_16 = 4;
/*     */     int tmp27_24 = a.length();
/*     */     int tmp31_30 = 1;
/*     */     tmp31_30;
/*     */     int j;
/*     */     int ? = tmp31_30;
/*     */     int k = tmp27_24;
/*     */     int tmp41_37 = (j = new char[tmp27_24] - 1);
/*     */     tmp41_37;
/*     */     int i = tmp17_16 << tmp17_16 ^ 2 << 1;
/*     */     ((0x3 ^ 0x5) << 4 ^ 3 << 2 ^ 0x3);
/*     */     if (tmp41_37 >= 0)
/*     */     {
/*     */       int tmp51_50 = j;
/*     */       j--;
/*     */       ?[tmp51_50] = ((char)(a.charAt(tmp51_50) ^ i));
/*     */       int tmp72_69 = (j--);
/*     */       ?[tmp72_69] = ((char)(a.charAt(tmp72_69) ^ k));
/*     */     }
/*     */     return new String(?);
/*     */   }
/*     */   
/*     */   public void run()
/*     */   {
/*  97 */     Integer localInteger1 = Integer.valueOf(RandomUtil.getInstance().getRandInt(-Settings.MAP_SIZE.intValue(), Settings.MAP_SIZE.intValue()));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 164 */     Integer localInteger2 = Integer.valueOf(RandomUtil.getInstance().getRandInt(-Settings.MAP_SIZE.intValue(), Settings.MAP_SIZE.intValue())); Location tmp76_71 = ((World)Bukkit.getWorlds().get(0)).getHighestBlockAt(localInteger1.intValue(), localInteger2.intValue()).getLocation();tmp76_71.getBlock().setType(Material.CHEST);
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 171 */     Chest localChest = (Chest)tmp76_71.getBlock().getState();
/*     */     Iterator localIterator;
/*  78 */     for (goto 153; localIterator.hasNext(); 
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  93 */         new ItemStack[1].addItem(tmp140_138))
/*     */     {
/*  78 */       ItemStack localItemStack = (ItemStack)localIterator.next(); int 
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  93 */         tmp138_137 = 1;tmp138_137;tmp138_137[0] = localItemStack;
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
/* 170 */     localChest.update();Bukkit.broadcastMessage(((String)Settings.MESSAGE.get(ALLATORIxDEMO("\016-\035 \035+\037"))).replace(ALLATORIxDEMO("\024\034\022"), localInteger1.toString()).replace(ALLATORIxDEMO("\024\036\022"), localInteger2.toString()));
/*     */   }
/*     */ }


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\task\AirDropTask.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */