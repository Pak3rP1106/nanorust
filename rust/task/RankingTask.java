/*    */ package nano.spook1998.rust.task;
/*    */ 
/*    */ import nano.spook1998.rust.utils.RankUtil;
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
/*    */ public class RankingTask
/*    */   extends BukkitRunnable
/*    */ {
/*    */   public void run()
/*    */   {
/* 46 */     RankUtil.getInstance().update();
/*    */   }
/*    */ }


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\task\RankingTask.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */