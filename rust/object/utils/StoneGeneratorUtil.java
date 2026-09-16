/*     */ package nano.spook1998.rust.object.utils;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import nano.spook1998.rust.object.StoneGenerator;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class StoneGeneratorUtil
/*     */ {
/*     */   public static void addStoneGenerator(StoneGenerator a)
/*     */   {
/*  38 */     if (!ALLATORIxDEMO.contains(a)) { ALLATORIxDEMO.add(a);
/*     */     }
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
/*     */   public static void removeStoneGenerator(StoneGenerator a)
/*     */   {
/*  78 */     if (ALLATORIxDEMO.contains(a)) { ALLATORIxDEMO.remove(a);
/*     */     }
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
/*  97 */   private static List<StoneGenerator> ALLATORIxDEMO = new ArrayList();
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static List<StoneGenerator> getList()
/*     */   {
/* 170 */     return ALLATORIxDEMO;
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public static StoneGenerator get(org.bukkit.block.Block a)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: getstatic 14	nano/spook1998/rust/object/utils/StoneGeneratorUtil:ALLATORIxDEMO	Ljava/util/List;
/*     */     //   3: invokeinterface 31 1 0
/*     */     //   8: dup
/*     */     //   9: astore_2
/*     */     //   10: goto +29 -> 39
/*     */     //   13: athrow
/*     */     //   14: aload_2
/*     */     //   15: invokeinterface 37 1 0
/*     */     //   20: checkcast 39	nano/spook1998/rust/object/StoneGenerator
/*     */     //   23: dup
/*     */     //   24: astore_1
/*     */     //   25: invokevirtual 43	nano/spook1998/rust/object/StoneGenerator:getBlock	()Lorg/bukkit/block/Block;
/*     */     //   28: aload_0
/*     */     //   29: invokevirtual 46	java/lang/Object:equals	(Ljava/lang/Object;)Z
/*     */     //   32: ifeq +6 -> 38
/*     */     //   35: aload_1
/*     */     //   36: areturn
/*     */     //   37: athrow
/*     */     //   38: aload_2
/*     */     //   39: invokeinterface 50 1 0
/*     */     //   44: ifne -30 -> 14
/*     */     //   47: aconst_null
/*     */     //   48: areturn
/*     */     // Line number table:
/*     */     //   Java source line #32	-> byte code offset #0
/*     */     //   Java source line #13	-> byte code offset #25
/*     */     //   Java source line #32	-> byte code offset #38
/*     */     //   Java source line #162	-> byte code offset #47
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	49	0	a	org.bukkit.block.Block
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public static void manager(org.bukkit.block.Block a)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokestatic 68	nano/spook1998/rust/object/utils/StoneGeneratorUtil:get	(Lorg/bukkit/block/Block;)Lnano/spook1998/rust/object/StoneGenerator;
/*     */     //   4: dup
/*     */     //   5: astore_1
/*     */     //   6: ifnonnull +33 -> 39
/*     */     //   9: aload_0
/*     */     //   10: invokeinterface 72 1 0
/*     */     //   15: getstatic 78	org/bukkit/Material:STONE	Lorg/bukkit/Material;
/*     */     //   18: invokevirtual 79	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
/*     */     //   21: ifne +5 -> 26
/*     */     //   24: return
/*     */     //   25: athrow
/*     */     //   26: new 39	nano/spook1998/rust/object/StoneGenerator
/*     */     //   29: dup
/*     */     //   30: aload_0
/*     */     //   31: invokespecial 81	nano/spook1998/rust/object/StoneGenerator:<init>	(Lorg/bukkit/block/Block;)V
/*     */     //   34: dup
/*     */     //   35: astore_1
/*     */     //   36: invokestatic 83	nano/spook1998/rust/object/utils/StoneGeneratorUtil:addStoneGenerator	(Lnano/spook1998/rust/object/StoneGenerator;)V
/*     */     //   39: aload_1
/*     */     //   40: dup
/*     */     //   41: dup_x1
/*     */     //   42: invokevirtual 87	nano/spook1998/rust/object/StoneGenerator:getHealth	()Ljava/lang/Integer;
/*     */     //   45: invokevirtual 93	java/lang/Integer:intValue	()I
/*     */     //   48: iconst_1
/*     */     //   49: isub
/*     */     //   50: invokestatic 97	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   53: invokevirtual 101	nano/spook1998/rust/object/StoneGenerator:setHealth	(Ljava/lang/Integer;)V
/*     */     //   56: invokevirtual 87	nano/spook1998/rust/object/StoneGenerator:getHealth	()Ljava/lang/Integer;
/*     */     //   59: invokevirtual 93	java/lang/Integer:intValue	()I
/*     */     //   62: ifge +9 -> 71
/*     */     //   65: aload_1
/*     */     //   66: invokestatic 104	nano/spook1998/rust/object/utils/StoneGeneratorUtil:removeStoneGenerator	(Lnano/spook1998/rust/object/StoneGenerator;)V
/*     */     //   69: return
/*     */     //   70: athrow
/*     */     //   71: invokestatic 110	org/bukkit/Bukkit:getScheduler	()Lorg/bukkit/scheduler/BukkitScheduler;
/*     */     //   74: invokestatic 116	nano/spook1998/rust/NanoRust:getInstance	()Lnano/spook1998/rust/NanoRust;
/*     */     //   77: new 7	nano/spook1998/rust/object/utils/i
/*     */     //   80: dup
/*     */     //   81: aload_0
/*     */     //   82: invokespecial 117	nano/spook1998/rust/object/utils/i:<init>	(Lorg/bukkit/block/Block;)V
/*     */     //   85: getstatic 123	nano/spook1998/rust/data/Settings:STONE_GENERAOTR_REBUILD	Ljava/lang/Integer;
/*     */     //   88: invokevirtual 93	java/lang/Integer:intValue	()I
/*     */     //   91: i2l
/*     */     //   92: invokeinterface 129 5 0
/*     */     //   97: pop
/*     */     //   98: return
/*     */     // Line number table:
/*     */     //   Java source line #77	-> byte code offset #0
/*     */     //   Java source line #104	-> byte code offset #6
/*     */     //   Java source line #47	-> byte code offset #9
/*     */     //   Java source line #113	-> byte code offset #26
/*     */     //   Java source line #110	-> byte code offset #36
/*     */     //   Java source line #141	-> byte code offset #39
/*     */     //   Java source line #180	-> byte code offset #56
/*     */     //   Java source line #56	-> byte code offset #65
/*     */     //   Java source line #24	-> byte code offset #69
/*     */     //   Java source line #142	-> byte code offset #71
/*     */     //   Java source line #86	-> byte code offset #85
/*     */     //   Java source line #142	-> byte code offset #92
/*     */     //   Java source line #29	-> byte code offset #98
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	99	0	a	org.bukkit.block.Block
/*     */   }
/*     */ }


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\object\utils\StoneGeneratorUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */