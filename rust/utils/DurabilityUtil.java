/*     */ package nano.spook1998.rust.utils;
/*     */ 
/*     */ public class DurabilityUtil
/*     */ {
/*     */   public static DurabilityUtil instance;
/*     */   
/*     */   /* Error */
/*     */   public void recalculateDurability(org.bukkit.entity.Player a, org.bukkit.inventory.ItemStack a)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: ifnull +13 -> 14
/*     */     //   4: aload_2
/*     */     //   5: invokevirtual 25	org/bukkit/inventory/ItemStack:getType	()Lorg/bukkit/Material;
/*     */     //   8: invokevirtual 31	org/bukkit/Material:getMaxDurability	()S
/*     */     //   11: ifne +5 -> 16
/*     */     //   14: return
/*     */     //   15: athrow
/*     */     //   16: aload_2
/*     */     //   17: dup
/*     */     //   18: invokevirtual 34	org/bukkit/inventory/ItemStack:getDurability	()S
/*     */     //   21: istore_3
/*     */     //   22: getstatic 40	org/bukkit/enchantments/Enchantment:DURABILITY	Lorg/bukkit/enchantments/Enchantment;
/*     */     //   25: invokevirtual 44	org/bukkit/inventory/ItemStack:getEnchantmentLevel	(Lorg/bukkit/enchantments/Enchantment;)I
/*     */     //   28: dup
/*     */     //   29: istore 4
/*     */     //   31: ifle +83 -> 114
/*     */     //   34: bipush 100
/*     */     //   36: iload 4
/*     */     //   38: iconst_1
/*     */     //   39: iadd
/*     */     //   40: idiv
/*     */     //   41: invokestatic 49	nano/spook1998/rust/utils/RandomUtil:getInstance	()Lnano/spook1998/rust/utils/RandomUtil;
/*     */     //   44: iconst_0
/*     */     //   45: bipush 100
/*     */     //   47: invokevirtual 53	nano/spook1998/rust/utils/RandomUtil:getRandInt	(II)I
/*     */     //   50: if_icmple +124 -> 174
/*     */     //   53: iload_3
/*     */     //   54: aload_2
/*     */     //   55: invokevirtual 25	org/bukkit/inventory/ItemStack:getType	()Lorg/bukkit/Material;
/*     */     //   58: invokevirtual 31	org/bukkit/Material:getMaxDurability	()S
/*     */     //   61: if_icmpne +44 -> 105
/*     */     //   64: aload_1
/*     */     //   65: dup
/*     */     //   66: invokeinterface 59 1 0
/*     */     //   71: aload_1
/*     */     //   72: dup_x2
/*     */     //   73: invokeinterface 59 1 0
/*     */     //   78: invokeinterface 65 1 0
/*     */     //   83: invokeinterface 69 2 0
/*     */     //   88: invokeinterface 73 1 0
/*     */     //   93: getstatic 79	org/bukkit/Sound:ITEM_BREAK	Lorg/bukkit/Sound;
/*     */     //   96: fconst_1
/*     */     //   97: dup
/*     */     //   98: invokeinterface 83 5 0
/*     */     //   103: return
/*     */     //   104: athrow
/*     */     //   105: aload_2
/*     */     //   106: iload_3
/*     */     //   107: iconst_1
/*     */     //   108: iadd
/*     */     //   109: i2s
/*     */     //   110: invokevirtual 87	org/bukkit/inventory/ItemStack:setDurability	(S)V
/*     */     //   113: return
/*     */     //   114: iload_3
/*     */     //   115: aload_2
/*     */     //   116: invokevirtual 25	org/bukkit/inventory/ItemStack:getType	()Lorg/bukkit/Material;
/*     */     //   119: invokevirtual 31	org/bukkit/Material:getMaxDurability	()S
/*     */     //   122: if_icmpne +43 -> 165
/*     */     //   125: aload_1
/*     */     //   126: dup
/*     */     //   127: invokeinterface 59 1 0
/*     */     //   132: aload_1
/*     */     //   133: dup_x2
/*     */     //   134: invokeinterface 59 1 0
/*     */     //   139: invokeinterface 65 1 0
/*     */     //   144: invokeinterface 69 2 0
/*     */     //   149: invokeinterface 73 1 0
/*     */     //   154: getstatic 79	org/bukkit/Sound:ITEM_BREAK	Lorg/bukkit/Sound;
/*     */     //   157: fconst_1
/*     */     //   158: dup
/*     */     //   159: invokeinterface 83 5 0
/*     */     //   164: return
/*     */     //   165: aload_2
/*     */     //   166: iload_3
/*     */     //   167: iconst_1
/*     */     //   168: iadd
/*     */     //   169: i2s
/*     */     //   170: invokevirtual 87	org/bukkit/inventory/ItemStack:setDurability	(S)V
/*     */     //   173: return
/*     */     //   174: return
/*     */     // Line number table:
/*     */     //   Java source line #78	-> byte code offset #0
/*     */     //   Java source line #93	-> byte code offset #16
/*     */     //   Java source line #119	-> byte code offset #22
/*     */     //   Java source line #170	-> byte code offset #31
/*     */     //   Java source line #96	-> byte code offset #34
/*     */     //   Java source line #92	-> byte code offset #53
/*     */     //   Java source line #32	-> byte code offset #64
/*     */     //   Java source line #13	-> byte code offset #88
/*     */     //   Java source line #155	-> byte code offset #103
/*     */     //   Java source line #73	-> byte code offset #105
/*     */     //   Java source line #104	-> byte code offset #114
/*     */     //   Java source line #47	-> byte code offset #125
/*     */     //   Java source line #113	-> byte code offset #149
/*     */     //   Java source line #110	-> byte code offset #164
/*     */     //   Java source line #141	-> byte code offset #165
/*     */     //   Java source line #180	-> byte code offset #173
/*     */     //   Java source line #24	-> byte code offset #174
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	175	0	a	DurabilityUtil
/*     */     //   0	175	1	a	org.bukkit.entity.Player
/*     */     //   0	175	2	a	org.bukkit.inventory.ItemStack
/*     */   }
/*     */   
/*     */   public static DurabilityUtil getInstance()
/*     */   {
/* 164 */     if (instance == null) new DurabilityUtil();
/*  38 */     return instance;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public DurabilityUtil()
/*     */   {
/* 150 */     instance = a;
/*     */   }
/*     */ }


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\utils\DurabilityUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */