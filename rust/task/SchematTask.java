/*     */ package nano.spook1998.rust.task;
/*     */ 
/*     */ import java.util.Collection;
/*     */ import nano.spook1998.rust.data.Settings;
/*     */ import nano.spook1998.rust.utils.RandomUtil;
/*     */ import org.bukkit.Bukkit;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SchematTask
/*     */   extends BukkitRunnable
/*     */ {
/*     */   public static Integer getAmount()
/*     */   {
/* 110 */     return Integer.valueOf(Bukkit.getOnlinePlayers().size() * Settings.AMOUNT_SCHEMATS.intValue());
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public static void schemat(Integer a, Integer a)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: invokestatic 54	org/bukkit/Bukkit:getWorlds	()Ljava/util/List;
/*     */     //   3: iconst_0
/*     */     //   4: invokeinterface 60 2 0
/*     */     //   9: checkcast 62	org/bukkit/World
/*     */     //   12: aload_0
/*     */     //   13: invokevirtual 34	java/lang/Integer:intValue	()I
/*     */     //   16: aload_1
/*     */     //   17: invokevirtual 34	java/lang/Integer:intValue	()I
/*     */     //   20: invokeinterface 66 3 0
/*     */     //   25: invokeinterface 72 1 0
/*     */     //   30: dup
/*     */     //   31: astore_1
/*     */     //   32: invokevirtual 78	org/bukkit/Location:getBlock	()Lorg/bukkit/block/Block;
/*     */     //   35: dup
/*     */     //   36: astore_2
/*     */     //   37: invokeinterface 82 1 0
/*     */     //   42: ifne +62 -> 104
/*     */     //   45: aload_2
/*     */     //   46: invokeinterface 86 1 0
/*     */     //   51: getstatic 92	org/bukkit/Material:GRASS	Lorg/bukkit/Material;
/*     */     //   54: invokevirtual 96	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
/*     */     //   57: ifne +33 -> 90
/*     */     //   60: aload_2
/*     */     //   61: invokeinterface 86 1 0
/*     */     //   66: getstatic 99	org/bukkit/Material:DIRT	Lorg/bukkit/Material;
/*     */     //   69: invokevirtual 96	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
/*     */     //   72: ifne +18 -> 90
/*     */     //   75: aload_2
/*     */     //   76: invokeinterface 86 1 0
/*     */     //   81: getstatic 102	org/bukkit/Material:SAND	Lorg/bukkit/Material;
/*     */     //   84: invokevirtual 96	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
/*     */     //   87: ifeq +17 -> 104
/*     */     //   90: aload_1
/*     */     //   91: invokevirtual 78	org/bukkit/Location:getBlock	()Lorg/bukkit/block/Block;
/*     */     //   94: getstatic 105	org/bukkit/Material:DRAGON_EGG	Lorg/bukkit/Material;
/*     */     //   97: invokeinterface 109 2 0
/*     */     //   102: return
/*     */     //   103: athrow
/*     */     //   104: aload_1
/*     */     //   105: invokevirtual 113	org/bukkit/Location:getY	()D
/*     */     //   108: d2i
/*     */     //   109: invokestatic 18	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   112: dup
/*     */     //   113: astore_2
/*     */     //   114: goto +134 -> 248
/*     */     //   117: athrow
/*     */     //   118: aload_1
/*     */     //   119: invokevirtual 116	org/bukkit/Location:clone	()Lorg/bukkit/Location;
/*     */     //   122: aload_1
/*     */     //   123: invokevirtual 116	org/bukkit/Location:clone	()Lorg/bukkit/Location;
/*     */     //   126: invokevirtual 113	org/bukkit/Location:getY	()D
/*     */     //   129: aload_2
/*     */     //   130: invokevirtual 34	java/lang/Integer:intValue	()I
/*     */     //   133: i2d
/*     */     //   134: dsub
/*     */     //   135: dconst_0
/*     */     //   136: dup2_x2
/*     */     //   137: invokevirtual 120	org/bukkit/Location:subtract	(DDD)Lorg/bukkit/Location;
/*     */     //   140: invokevirtual 78	org/bukkit/Location:getBlock	()Lorg/bukkit/block/Block;
/*     */     //   143: dup
/*     */     //   144: astore_3
/*     */     //   145: getstatic 126	org/bukkit/block/BlockFace:DOWN	Lorg/bukkit/block/BlockFace;
/*     */     //   148: invokeinterface 130 2 0
/*     */     //   153: dup
/*     */     //   154: astore 4
/*     */     //   156: invokeinterface 82 1 0
/*     */     //   161: ifne +76 -> 237
/*     */     //   164: aload 4
/*     */     //   166: invokeinterface 86 1 0
/*     */     //   171: getstatic 92	org/bukkit/Material:GRASS	Lorg/bukkit/Material;
/*     */     //   174: invokevirtual 96	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
/*     */     //   177: ifne +35 -> 212
/*     */     //   180: aload 4
/*     */     //   182: invokeinterface 86 1 0
/*     */     //   187: getstatic 99	org/bukkit/Material:DIRT	Lorg/bukkit/Material;
/*     */     //   190: invokevirtual 96	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
/*     */     //   193: ifne +19 -> 212
/*     */     //   196: aload 4
/*     */     //   198: invokeinterface 86 1 0
/*     */     //   203: getstatic 102	org/bukkit/Material:SAND	Lorg/bukkit/Material;
/*     */     //   206: invokevirtual 96	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
/*     */     //   209: ifeq +28 -> 237
/*     */     //   212: aload_3
/*     */     //   213: invokeinterface 86 1 0
/*     */     //   218: getstatic 133	org/bukkit/Material:AIR	Lorg/bukkit/Material;
/*     */     //   221: invokevirtual 96	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
/*     */     //   224: ifeq +12 -> 236
/*     */     //   227: aload_3
/*     */     //   228: getstatic 105	org/bukkit/Material:DRAGON_EGG	Lorg/bukkit/Material;
/*     */     //   231: invokeinterface 109 2 0
/*     */     //   236: return
/*     */     //   237: aload_2
/*     */     //   238: invokevirtual 34	java/lang/Integer:intValue	()I
/*     */     //   241: iconst_1
/*     */     //   242: isub
/*     */     //   243: invokestatic 18	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   246: dup
/*     */     //   247: astore_2
/*     */     //   248: invokevirtual 34	java/lang/Integer:intValue	()I
/*     */     //   251: ifgt -133 -> 118
/*     */     //   254: return
/*     */     // Line number table:
/*     */     //   Java source line #93	-> byte code offset #0
/*     */     //   Java source line #119	-> byte code offset #32
/*     */     //   Java source line #170	-> byte code offset #37
/*     */     //   Java source line #96	-> byte code offset #90
/*     */     //   Java source line #92	-> byte code offset #102
/*     */     //   Java source line #13	-> byte code offset #104
/*     */     //   Java source line #155	-> byte code offset #118
/*     */     //   Java source line #162	-> byte code offset #145
/*     */     //   Java source line #73	-> byte code offset #156
/*     */     //   Java source line #182	-> byte code offset #236
/*     */     //   Java source line #13	-> byte code offset #237
/*     */     //   Java source line #47	-> byte code offset #254
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	255	0	a	Integer
/*     */     //   0	255	1	a	Integer
/*     */   }
/*     */   
/*     */   public void run()
/*     */   {
/*     */     Integer localInteger1;
/*     */     Integer localInteger2;
/*     */     Integer localInteger3;
/*  23 */     for (goto 72; (localInteger1 = Integer.valueOf(
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 164 */           localInteger1.intValue() + 1)).intValue() < getAmount().intValue(); 
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  38 */         schemat(localInteger2, localInteger3))
/*     */     {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  97 */       localInteger2 = Integer.valueOf(RandomUtil.getInstance().getRandInt(-Settings.MAP_SIZE.intValue(), Settings.MAP_SIZE.intValue()));
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 164 */       localInteger3 = Integer.valueOf(RandomUtil.getInstance().getRandInt(-Settings.MAP_SIZE.intValue(), Settings.MAP_SIZE.intValue()));
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\task\SchematTask.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */