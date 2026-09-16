/*     */ package nano.spook1998.rust.utils;
/*     */ 
/*     */ import java.util.List;
/*     */ import org.bukkit.Material;
/*     */ import org.bukkit.inventory.ItemStack;
/*     */ import org.bukkit.inventory.meta.ItemMeta;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ItemBuilder
/*     */ {
/*     */   public ItemStack getItemStack()
/*     */   {
/*  20 */     return a.ALLATORIxDEMO;
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
/*  45 */   private ItemStack ALLATORIxDEMO = null;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ItemBuilder setDisplayName(String a)
/*     */   {
/*  73 */     if ((!a.ALLATORIxDEMO.getType().equals(Material.AIR)) && (a != null))
/*     */     {
/*     */       ItemMeta localItemMeta;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 182 */       (localItemMeta = a.ALLATORIxDEMO.getItemMeta()).setDisplayName(ColorUtil.fixColor(a));a.ALLATORIxDEMO.setItemMeta(localItemMeta);
/*     */     }
/*  47 */     return a;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ItemBuilder setId(String a)
/*     */   {
/* 164 */     if ((a = a.split(ALLATORIxDEMO("\026"))).length == 2)
/*     */     {
/*  38 */       int i = a.getNumber(a[1]).intValue();
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 123 */       a;a.<init>(a.ALLATORIxDEMO(a[0]), 1, (byte)i);new org/bukkit/inventory/ItemStack.ALLATORIxDEMO = a;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 171 */       return a;throw a;
/*     */     }
/*  93 */     a.ALLATORIxDEMO = new ItemStack(a.ALLATORIxDEMO(a[0]), 1);
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 119 */     return a;
/*     */   }
/*     */   
/*     */   public ItemBuilder setLore(List<String> a)
/*     */   {
/*  68 */     if ((!a.ALLATORIxDEMO.getType().equals(Material.AIR)) && (a != null) && (a.size() > 0))
/*     */     {
/*     */       ItemMeta localItemMeta;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 180 */       (localItemMeta = a.ALLATORIxDEMO.getItemMeta()).setLore(ColorUtil.fixColor(a));a.ALLATORIxDEMO.setItemMeta(localItemMeta);
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
/* 194 */     return a;
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public Integer getNumber(String a)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: invokestatic 103	java/lang/Integer:parseInt	(Ljava/lang/String;)I
/*     */     //   4: invokestatic 107	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   7: areturn
/*     */     //   8: athrow
/*     */     //   9: astore_1
/*     */     //   10: iconst_0
/*     */     //   11: invokestatic 107	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   14: areturn
/*     */     // Line number table:
/*     */     //   Java source line #18	-> byte code offset #0
/*     */     //   Java source line #120	-> byte code offset #9
/*     */     //   Java source line #11	-> byte code offset #10
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	15	0	a	ItemBuilder
/*     */     //   0	15	1	a	String
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   0	7	9	java/lang/NumberFormatException
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public ItemBuilder setEnchants(List<String> a)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ifnull +12 -> 13
/*     */     //   4: aload_1
/*     */     //   5: invokeinterface 37 1 0
/*     */     //   10: ifne +6 -> 16
/*     */     //   13: aload_0
/*     */     //   14: areturn
/*     */     //   15: athrow
/*     */     //   16: aload_0
/*     */     //   17: getfield 11	nano/spook1998/rust/utils/ItemBuilder:ALLATORIxDEMO	Lorg/bukkit/inventory/ItemStack;
/*     */     //   20: invokevirtual 21	org/bukkit/inventory/ItemStack:getType	()Lorg/bukkit/Material;
/*     */     //   23: getstatic 27	org/bukkit/Material:AIR	Lorg/bukkit/Material;
/*     */     //   26: invokevirtual 31	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
/*     */     //   29: ifne +94 -> 123
/*     */     //   32: aload_0
/*     */     //   33: getfield 11	nano/spook1998/rust/utils/ItemBuilder:ALLATORIxDEMO	Lorg/bukkit/inventory/ItemStack;
/*     */     //   36: invokevirtual 41	org/bukkit/inventory/ItemStack:getItemMeta	()Lorg/bukkit/inventory/meta/ItemMeta;
/*     */     //   39: astore_2
/*     */     //   40: aload_1
/*     */     //   41: invokeinterface 128 1 0
/*     */     //   46: dup
/*     */     //   47: astore_1
/*     */     //   48: goto +58 -> 106
/*     */     //   51: athrow
/*     */     //   52: aload_1
/*     */     //   53: invokeinterface 134 1 0
/*     */     //   58: checkcast 70	java/lang/String
/*     */     //   61: ldc 65
/*     */     //   63: invokestatic 68	nano/spook1998/rust/utils/ItemBuilder:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
/*     */     //   66: invokevirtual 74	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
/*     */     //   69: astore_3
/*     */     //   70: invokestatic 140	nano/spook1998/rust/utils/EnchantmentsUtil:getInstance	()Lnano/spook1998/rust/utils/EnchantmentsUtil;
/*     */     //   73: aload_3
/*     */     //   74: iconst_0
/*     */     //   75: aaload
/*     */     //   76: invokevirtual 144	nano/spook1998/rust/utils/EnchantmentsUtil:getEnchant	(Ljava/lang/String;)Lorg/bukkit/enchantments/Enchantment;
/*     */     //   79: dup
/*     */     //   80: astore 4
/*     */     //   82: ifnull +23 -> 105
/*     */     //   85: aload_2
/*     */     //   86: aload 4
/*     */     //   88: aload_0
/*     */     //   89: aload_3
/*     */     //   90: iconst_1
/*     */     //   91: aaload
/*     */     //   92: invokevirtual 78	nano/spook1998/rust/utils/ItemBuilder:getNumber	(Ljava/lang/String;)Ljava/lang/Integer;
/*     */     //   95: invokevirtual 83	java/lang/Integer:intValue	()I
/*     */     //   98: iconst_0
/*     */     //   99: invokeinterface 148 4 0
/*     */     //   104: pop
/*     */     //   105: aload_1
/*     */     //   106: invokeinterface 152 1 0
/*     */     //   111: ifne -59 -> 52
/*     */     //   114: aload_0
/*     */     //   115: getfield 11	nano/spook1998/rust/utils/ItemBuilder:ALLATORIxDEMO	Lorg/bukkit/inventory/ItemStack;
/*     */     //   118: aload_2
/*     */     //   119: invokevirtual 56	org/bukkit/inventory/ItemStack:setItemMeta	(Lorg/bukkit/inventory/meta/ItemMeta;)Z
/*     */     //   122: pop
/*     */     //   123: aload_0
/*     */     //   124: areturn
/*     */     // Line number table:
/*     */     //   Java source line #160	-> byte code offset #0
/*     */     //   Java source line #89	-> byte code offset #16
/*     */     //   Java source line #72	-> byte code offset #32
/*     */     //   Java source line #5	-> byte code offset #40
/*     */     //   Java source line #86	-> byte code offset #61
/*     */     //   Java source line #29	-> byte code offset #70
/*     */     //   Java source line #163	-> byte code offset #82
/*     */     //   Java source line #193	-> byte code offset #85
/*     */     //   Java source line #5	-> byte code offset #105
/*     */     //   Java source line #21	-> byte code offset #114
/*     */     //   Java source line #112	-> byte code offset #123
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	125	0	a	ItemBuilder
/*     */     //   0	125	1	a	List
/*     */   }
/*     */   
/*     */   public static String ALLATORIxDEMO(String a)
/*     */   {
/*     */     int tmp11_10 = 1;
/*     */     int tmp23_20 = a.length();
/*     */     int tmp27_26 = 1;
/*     */     tmp27_26;
/*     */     int j;
/*     */     int ? = tmp27_26;
/*     */     int k = tmp23_20;
/*     */     (j = new char[tmp23_20] - 1);
/*     */     int i = (0x3 ^ 0x5) << 4;
/*     */     if (((0x2 ^ 0x5) << 4 ^ tmp11_10 << tmp11_10) >= 0)
/*     */     {
/*     */       int tmp46_45 = j;
/*     */       j--;
/*     */       ?[tmp46_45] = ((char)(a.charAt(tmp46_45) ^ i));
/*     */       int tmp67_64 = (j--);
/*     */       ?[tmp67_64] = ((char)(a.charAt(tmp67_64) ^ k));
/*     */     }
/*     */     return new String(?);
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public ItemBuilder setAmount(Integer a)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ifnonnull +14 -> 15
/*     */     //   4: aload_0
/*     */     //   5: dup
/*     */     //   6: getfield 11	nano/spook1998/rust/utils/ItemBuilder:ALLATORIxDEMO	Lorg/bukkit/inventory/ItemStack;
/*     */     //   9: iconst_1
/*     */     //   10: invokevirtual 171	org/bukkit/inventory/ItemStack:setAmount	(I)V
/*     */     //   13: areturn
/*     */     //   14: athrow
/*     */     //   15: aload_0
/*     */     //   16: dup
/*     */     //   17: getfield 11	nano/spook1998/rust/utils/ItemBuilder:ALLATORIxDEMO	Lorg/bukkit/inventory/ItemStack;
/*     */     //   20: aload_1
/*     */     //   21: invokevirtual 83	java/lang/Integer:intValue	()I
/*     */     //   24: invokevirtual 171	org/bukkit/inventory/ItemStack:setAmount	(I)V
/*     */     //   27: areturn
/*     */     // Line number table:
/*     */     //   Java source line #138	-> byte code offset #0
/*     */     //   Java source line #91	-> byte code offset #15
/*     */     //   Java source line #39	-> byte code offset #27
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	28	0	a	ItemBuilder
/*     */     //   0	28	1	a	Integer
/*     */   }
/*     */ }


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\utils\ItemBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */