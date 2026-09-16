/*     */ package nano.spook1998.rust.utils;
/*     */ 
/*     */ import nano.spook1998.rust.NanoRust;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class IronDoorUtil
/*     */ {
/*     */   private static IronDoorUtil b;
/*     */   private static NanoRust ALLATORIxDEMO;
/*     */   
/*     */   public static IronDoorUtil getInstance()
/*     */   {
/*  78 */     if (b == null) { new IronDoorUtil();
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
/*  93 */     return b;
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public void start(org.bukkit.entity.Player a)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: invokeinterface 53 1 0
/*     */     //   6: invokestatic 59	nano/spook1998/rust/object/utils/UserUtil:get	(Ljava/lang/String;)Lnano/spook1998/rust/object/User;
/*     */     //   9: dup
/*     */     //   10: astore_2
/*     */     //   11: invokevirtual 65	nano/spook1998/rust/object/User:getBukkitTask	()Lorg/bukkit/scheduler/BukkitTask;
/*     */     //   14: ifnull +5 -> 19
/*     */     //   17: return
/*     */     //   18: athrow
/*     */     //   19: aload_1
/*     */     //   20: getstatic 71	org/bukkit/GameMode:ADVENTURE	Lorg/bukkit/GameMode;
/*     */     //   23: invokeinterface 75 2 0
/*     */     //   28: invokestatic 35	org/bukkit/Bukkit:getScheduler	()Lorg/bukkit/scheduler/BukkitScheduler;
/*     */     //   31: getstatic 27	nano/spook1998/rust/utils/IronDoorUtil:ALLATORIxDEMO	Lnano/spook1998/rust/NanoRust;
/*     */     //   34: new 7	nano/spook1998/rust/utils/K
/*     */     //   37: dup
/*     */     //   38: aload_0
/*     */     //   39: aload_2
/*     */     //   40: invokespecial 76	nano/spook1998/rust/utils/K:<init>	(Lnano/spook1998/rust/utils/IronDoorUtil;Lnano/spook1998/rust/object/User;)V
/*     */     //   43: getstatic 82	nano/spook1998/rust/data/Settings:IRON_DOOR_TIME	Ljava/lang/Integer;
/*     */     //   46: invokevirtual 88	java/lang/Integer:intValue	()I
/*     */     //   49: i2l
/*     */     //   50: invokeinterface 91 5 0
/*     */     //   55: astore_1
/*     */     //   56: aload_2
/*     */     //   57: aload_1
/*     */     //   58: invokevirtual 95	nano/spook1998/rust/object/User:setBukkiTask	(Lorg/bukkit/scheduler/BukkitTask;)V
/*     */     //   61: return
/*     */     // Line number table:
/*     */     //   Java source line #96	-> byte code offset #0
/*     */     //   Java source line #92	-> byte code offset #11
/*     */     //   Java source line #32	-> byte code offset #19
/*     */     //   Java source line #13	-> byte code offset #28
/*     */     //   Java source line #47	-> byte code offset #43
/*     */     //   Java source line #13	-> byte code offset #50
/*     */     //   Java source line #113	-> byte code offset #56
/*     */     //   Java source line #110	-> byte code offset #61
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	62	0	a	IronDoorUtil
/*     */     //   0	62	1	a	org.bukkit.entity.Player
/*     */   }
/*     */   
/*     */   public IronDoorUtil()
/*     */   {
/* 164 */     b = a;ALLATORIxDEMO = NanoRust.getInstance();
/*     */   }
/*     */ }


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\utils\IronDoorUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */