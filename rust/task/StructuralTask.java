/*    */ package nano.spook1998.rust.task;
/*    */ 
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import nano.spook1998.rust.data.Settings;
/*    */ import nano.spook1998.rust.object.Structural;
/*    */ import nano.spook1998.rust.object.utils.RegionUtil;
/*    */ import nano.spook1998.rust.object.utils.StructuralUtil;
/*    */ import org.bukkit.Bukkit;
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
/*    */ public class StructuralTask
/*    */   extends BukkitRunnable
/*    */ {
/*    */   public void run()
/*    */   {
/* 38 */     List localList = StructuralUtil.getList();
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
/* <3 */     Integer localInteger1 = Integer.valueOf(0);
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
/* @4 */     Bukkit.broadcastMessage((String)Settings.MESSAGE.get(ALLATORIxDEMO("M\bK\005\\IY\013\\\bJ")));
/* <3 */     for (goto 110; (localInteger1 = Integer.valueOf(localInteger1.intValue() + 1)).intValue() < localList.size();)
/*    */     {
/*    */       Structural localStructural;
/* 93 */       if (RegionUtil.getRegionAtLocation(
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
/* A1 */         (localStructural = (Structural)localList.get(localInteger1.intValue())).getBlock().getLocation()) == null)
/*    */       {
/*    */         Integer localInteger2;
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
/* A0 */         if ((localInteger2 = localStructural.getHealth()).intValue() > 0)
/*    */         {
/* 96 */           localInteger2 = Integer.valueOf(localInteger2.intValue() - Settings.DAMAGE_TO_STRUCTURAL.intValue());localStructural.setHealth(localInteger2);
/*    */         }
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */   public static String ALLATORIxDEMO(String a)
/*    */   {
/*    */     int tmp29_26 = a.length();
/*    */     int tmp33_32 = 1;
/*    */     tmp33_32;
/*    */     int j;
/*    */     int ? = tmp33_32;
/*    */     int k = tmp29_26;
/*    */     (j = new char[tmp29_26] - 1);
/*    */     int i = (0x3 ^ 0x5) << 4 ^ 2 << 1;
/*    */     if ((5 << 4 ^ 3 << 2 ^ 0x1) >= 0)
/*    */     {
/*    */       int tmp52_51 = j;
/*    */       j--;
/*    */       ?[tmp52_51] = ((char)(a.charAt(tmp52_51) ^ i));
/*    */       int tmp73_70 = (j--);
/*    */       ?[tmp73_70] = ((char)(a.charAt(tmp73_70) ^ k));
/*    */     }
/*    */     return new String(?);
/*    */   }
/*    */ }


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\task\StructuralTask.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */