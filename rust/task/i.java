/*     */ package nano.spook1998.rust.task;
/*     */ 
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import nano.spook1998.rust.utils.HumanBuilder;
/*     */ import org.bukkit.entity.Player;
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
/*     */ class i
/*     */   extends BukkitRunnable
/*     */ {
/*     */   i(OfflineTask paramOfflineTask, List paramList) {}
/*     */   
/*     */   public void run()
/*     */   {
/*     */     Iterator localIterator1;
/*  77 */     for (goto 72; localIterator1.hasNext(); 
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 104 */         localIterator2.hasNext())
/*     */     {
/*  77 */       Player localPlayer = (Player)localIterator1.next();
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       Iterator localIterator2;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 104 */       continue;throw (localIterator2 = a.b.iterator());HumanBuilder localHumanBuilder = (HumanBuilder)localIterator2.next(); HumanBuilder tmp55_54 = localHumanBuilder;tmp55_54.removeFrom(localPlayer);tmp55_54
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 113 */         .sendTo(localPlayer);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\task\i.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */