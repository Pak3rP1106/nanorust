/*     */ package nano.spook1998.rust.object.utils;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import nano.spook1998.rust.object.Schemat;
/*     */ import nano.spook1998.rust.utils.RandomUtil;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SchematsUtil
/*     */ {
/*  45 */   private static List<Schemat> ALLATORIxDEMO = new ArrayList();
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static List<Schemat> getFindSchemats()
/*     */   {
/* 119 */     return b;
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
/*     */   public static void addFindSchemat(Schemat a)
/*     */   {
/* 150 */     if (!b.contains(a)) { b.add(a);
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
/*     */   public static void addDefaultSchemat(Schemat a)
/*     */   {
/* 164 */     if (!ALLATORIxDEMO.contains(a)) ALLATORIxDEMO.add(a);
/*     */   }
/*     */   
/* 167 */   private static List<Schemat> b = new ArrayList();
/*     */   
/*     */   public static List<Schemat> getDefaultSchemats()
/*     */   {
/* 171 */     return ALLATORIxDEMO;
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public static Schemat get(org.bukkit.inventory.ItemStack a)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: invokestatic 15	nano/spook1998/rust/object/utils/SchematsUtil:getFindSchemats	()Ljava/util/List;
/*     */     //   3: invokeinterface 21 1 0
/*     */     //   8: dup
/*     */     //   9: astore_2
/*     */     //   10: goto +29 -> 39
/*     */     //   13: athrow
/*     */     //   14: aload_2
/*     */     //   15: invokeinterface 27 1 0
/*     */     //   20: checkcast 29	nano/spook1998/rust/object/Schemat
/*     */     //   23: dup
/*     */     //   24: astore_1
/*     */     //   25: invokevirtual 33	nano/spook1998/rust/object/Schemat:getIR	()Lorg/bukkit/inventory/ItemStack;
/*     */     //   28: aload_0
/*     */     //   29: invokevirtual 39	org/bukkit/inventory/ItemStack:isSimilar	(Lorg/bukkit/inventory/ItemStack;)Z
/*     */     //   32: ifeq +6 -> 38
/*     */     //   35: aload_1
/*     */     //   36: areturn
/*     */     //   37: athrow
/*     */     //   38: aload_2
/*     */     //   39: invokeinterface 43 1 0
/*     */     //   44: ifne -30 -> 14
/*     */     //   47: aconst_null
/*     */     //   48: areturn
/*     */     // Line number table:
/*     */     //   Java source line #92	-> byte code offset #0
/*     */     //   Java source line #32	-> byte code offset #25
/*     */     //   Java source line #92	-> byte code offset #38
/*     */     //   Java source line #155	-> byte code offset #47
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	49	0	a	org.bukkit.inventory.ItemStack
/*     */   }
/*     */   
/*     */   public static Schemat getRandomSchemat()
/*     */   {
/*     */     return (Schemat)b.get(RandomUtil.getInstance().getRandInt(0, b.size() - 1));
/*     */   }
/*     */ }


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\object\utils\SchematsUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */