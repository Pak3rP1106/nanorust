/*     */ package nano.spook1998.rust.utils;
/*     */ 
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
/*     */ import org.bukkit.Material;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class DropUtil
/*     */ {
/*     */   private static Map<Material, Double> b;
/*     */   private static DropUtil ALLATORIxDEMO;
/*     */   
/*     */   public static DropUtil getInstance()
/*     */   {
/* 164 */     if (ALLATORIxDEMO == null) new DropUtil();
/*  38 */     return ALLATORIxDEMO;
/*     */   }
/*     */   
/*  41 */   public DropUtil() { ALLATORIxDEMO = 
/*     */     
/*     */ 
/*     */ 
/*  45 */       a;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 150 */     b = new HashMap();
/*     */   }
/*     */   
/*     */   public void put(Material a, Double a)
/*     */   {
/* 155 */     b.put(a, a);
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
/*     */   public void remove(Material a)
/*     */   {
/* 182 */     if (b.containsKey(a)) b.remove(a);
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public Material getDrop()
/*     */   {
/*     */     // Byte code:
/*     */     //   0: getstatic 19	nano/spook1998/rust/utils/DropUtil:b	Ljava/util/Map;
/*     */     //   3: invokeinterface 23 1 0
/*     */     //   8: invokeinterface 29 1 0
/*     */     //   13: dup
/*     */     //   14: astore_2
/*     */     //   15: goto +47 -> 62
/*     */     //   18: athrow
/*     */     //   19: aload_2
/*     */     //   20: invokeinterface 35 1 0
/*     */     //   25: checkcast 7	java/util/Map$Entry
/*     */     //   28: astore_1
/*     */     //   29: invokestatic 41	nano/spook1998/rust/utils/RandomUtil:getInstance	()Lnano/spook1998/rust/utils/RandomUtil;
/*     */     //   32: aload_1
/*     */     //   33: invokeinterface 44 1 0
/*     */     //   38: checkcast 46	java/lang/Double
/*     */     //   41: invokevirtual 50	java/lang/Double:doubleValue	()D
/*     */     //   44: invokevirtual 54	nano/spook1998/rust/utils/RandomUtil:getChance	(D)Z
/*     */     //   47: ifeq +14 -> 61
/*     */     //   50: aload_1
/*     */     //   51: invokeinterface 57 1 0
/*     */     //   56: checkcast 59	org/bukkit/Material
/*     */     //   59: areturn
/*     */     //   60: athrow
/*     */     //   61: aload_2
/*     */     //   62: invokeinterface 63 1 0
/*     */     //   67: ifne -48 -> 19
/*     */     //   70: getstatic 67	org/bukkit/Material:STONE	Lorg/bukkit/Material;
/*     */     //   73: areturn
/*     */     // Line number table:
/*     */     //   Java source line #78	-> byte code offset #0
/*     */     //   Java source line #93	-> byte code offset #29
/*     */     //   Java source line #119	-> byte code offset #50
/*     */     //   Java source line #78	-> byte code offset #61
/*     */     //   Java source line #92	-> byte code offset #70
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	74	0	a	DropUtil
/*     */   }
/*     */ }


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\utils\DropUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */