/*    */ package nano.spook1998.rust.task;
/*    */ 
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import nano.spook1998.rust.data.Settings;
/*    */ import nano.spook1998.rust.object.utils.RegionUtil;
/*    */ import nano.spook1998.rust.utils.RandomUtil;
/*    */ import org.bukkit.Bukkit;
/*    */ import org.bukkit.Location;
/*    */ import org.bukkit.TreeType;
/*    */ import org.bukkit.World;
/*    */ import org.bukkit.block.Block;
/*    */ import org.bukkit.scheduler.BukkitRunnable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class TreeTask
/*    */   extends BukkitRunnable
/*    */ {
/*    */   public static String ALLATORIxDEMO(String a)
/*    */   {
/*    */     int tmp27_24 = a.length();
/*    */     int tmp31_30 = 1;
/*    */     tmp31_30;
/*    */     int j;
/*    */     int ? = tmp31_30;
/*    */     int k = tmp27_24;
/*    */     int tmp41_37 = (j = new char[tmp27_24] - 1);
/*    */     tmp41_37;
/*    */     int i = (0x2 ^ 0x5) << 4 ^ 3 << 2 ^ 0x1;
/*    */     (1 << 3 ^ 0x5);
/*    */     if (tmp41_37 >= 0)
/*    */     {
/*    */       int tmp51_50 = j;
/*    */       j--;
/*    */       ?[tmp51_50] = ((char)(a.charAt(tmp51_50) ^ i));
/*    */       int tmp72_69 = (j--);
/*    */       ?[tmp72_69] = ((char)(a.charAt(tmp72_69) ^ k));
/*    */     }
/*    */     return new String(?);
/*    */   }
/*    */   
/*    */   public void run()
/*    */   {
/* A1 */     World localWorld = (World)Bukkit.getWorlds().get(0);Integer localInteger1 = Integer.valueOf(-Settings.MAP_SIZE.intValue());Integer localInteger2 = Settings.MAP_SIZE;Integer localInteger3 = Integer.valueOf(-Settings.MAP_SIZE.intValue());Integer localInteger4 = Settings.MAP_SIZE;
/*    */     Integer localInteger5;
/* 96 */     for (goto 142; (localInteger5 = Integer.valueOf(localInteger5.intValue() + 1)).intValue() <= Settings.TREE_AMOUNT.intValue();)
/*    */     {
/*    */       Location localLocation;
/* 13 */       if (
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 32 */         RegionUtil.getRegionAtLocation(
/*    */         
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 92 */         localLocation = localWorld.getHighestBlockAt(RandomUtil.getInstance().getRandInt(localInteger3.intValue(), localInteger4.intValue()), RandomUtil.getInstance().getRandInt(localInteger1.intValue(), localInteger2.intValue())).getLocation()) == null)
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* @2 */         (localLocation = a.ALLATORIxDEMO(localLocation)).getWorld().generateTree(localLocation, TreeType.TREE);
/*    */       }
/*    */     }
/* 77 */     Bukkit.broadcastMessage((String)Settings.MESSAGE.get(ALLATORIxDEMO("\023h\n \t\030h")));
/*    */   }
/*    */ }


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\task\TreeTask.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */