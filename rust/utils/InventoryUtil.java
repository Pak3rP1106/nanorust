/*    */ package nano.spook1998.rust.utils;
/*    */ 
/*    */ import java.util.Iterator;
/*    */ import java.util.List;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.inventory.ItemStack;
/*    */ 
/*    */ public class InventoryUtil
/*    */ {
/*    */   /* Error */
/*    */   public static Boolean hasItemStack(Player a, List<ItemStack> a)
/*    */   {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: invokeinterface 13 1 0
/*    */     //   6: dup
/*    */     //   7: astore_2
/*    */     //   8: goto +39 -> 47
/*    */     //   11: athrow
/*    */     //   12: aload_2
/*    */     //   13: invokeinterface 19 1 0
/*    */     //   18: checkcast 21	org/bukkit/inventory/ItemStack
/*    */     //   21: astore_1
/*    */     //   22: aload_0
/*    */     //   23: aload_1
/*    */     //   24: dup
/*    */     //   25: invokevirtual 25	org/bukkit/inventory/ItemStack:getAmount	()I
/*    */     //   28: invokestatic 31	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*    */     //   31: invokestatic 34	nano/spook1998/rust/utils/InventoryUtil:hasItemStack	(Lorg/bukkit/entity/Player;Lorg/bukkit/inventory/ItemStack;Ljava/lang/Integer;)Ljava/lang/Boolean;
/*    */     //   34: invokevirtual 40	java/lang/Boolean:booleanValue	()Z
/*    */     //   37: ifne +9 -> 46
/*    */     //   40: iconst_0
/*    */     //   41: invokestatic 43	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
/*    */     //   44: areturn
/*    */     //   45: athrow
/*    */     //   46: aload_2
/*    */     //   47: invokeinterface 46 1 0
/*    */     //   52: ifne -40 -> 12
/*    */     //   55: iconst_1
/*    */     //   56: invokestatic 43	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
/*    */     //   59: areturn
/*    */     // Line number table:
/*    */     //   Java source line #38	-> byte code offset #0
/*    */     //   Java source line #123	-> byte code offset #22
/*    */     //   Java source line #38	-> byte code offset #46
/*    */     //   Java source line #78	-> byte code offset #55
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	signature
/*    */     //   0	60	0	a	Player
/*    */     //   0	60	1	a	List
/*    */   }
/*    */   
/*    */   /* Error */
/*    */   public static void removeItemStack(Player a, ItemStack a, Integer a)
/*    */   {
/*    */     // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: astore_2
/*    */     //   2: aload_0
/*    */     //   3: invokeinterface 59 1 0
/*    */     //   8: astore_3
/*    */     //   9: iconst_0
/*    */     //   10: invokestatic 31	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*    */     //   13: dup
/*    */     //   14: astore 4
/*    */     //   16: goto +152 -> 168
/*    */     //   19: athrow
/*    */     //   20: aload_3
/*    */     //   21: aload 4
/*    */     //   23: invokevirtual 62	java/lang/Integer:intValue	()I
/*    */     //   26: invokeinterface 68 2 0
/*    */     //   31: dup
/*    */     //   32: astore 5
/*    */     //   34: ifnull +121 -> 155
/*    */     //   37: aload 5
/*    */     //   39: invokevirtual 72	org/bukkit/inventory/ItemStack:getType	()Lorg/bukkit/Material;
/*    */     //   42: aload_1
/*    */     //   43: invokevirtual 72	org/bukkit/inventory/ItemStack:getType	()Lorg/bukkit/Material;
/*    */     //   46: invokevirtual 78	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
/*    */     //   49: ifeq +106 -> 155
/*    */     //   52: aload_2
/*    */     //   53: invokevirtual 62	java/lang/Integer:intValue	()I
/*    */     //   56: ifne +5 -> 61
/*    */     //   59: return
/*    */     //   60: athrow
/*    */     //   61: aload_2
/*    */     //   62: invokevirtual 62	java/lang/Integer:intValue	()I
/*    */     //   65: aload 5
/*    */     //   67: invokevirtual 25	org/bukkit/inventory/ItemStack:getAmount	()I
/*    */     //   70: if_icmplt +39 -> 109
/*    */     //   73: aload_2
/*    */     //   74: aload_0
/*    */     //   75: invokeinterface 59 1 0
/*    */     //   80: aload 4
/*    */     //   82: invokevirtual 62	java/lang/Integer:intValue	()I
/*    */     //   85: aconst_null
/*    */     //   86: invokeinterface 84 3 0
/*    */     //   91: invokevirtual 62	java/lang/Integer:intValue	()I
/*    */     //   94: aload 5
/*    */     //   96: invokevirtual 25	org/bukkit/inventory/ItemStack:getAmount	()I
/*    */     //   99: isub
/*    */     //   100: invokestatic 31	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*    */     //   103: astore_2
/*    */     //   104: aload 4
/*    */     //   106: goto +51 -> 157
/*    */     //   109: aload_2
/*    */     //   110: invokevirtual 62	java/lang/Integer:intValue	()I
/*    */     //   113: aload 5
/*    */     //   115: invokevirtual 25	org/bukkit/inventory/ItemStack:getAmount	()I
/*    */     //   118: if_icmpge +37 -> 155
/*    */     //   121: iconst_0
/*    */     //   122: aload_0
/*    */     //   123: invokeinterface 59 1 0
/*    */     //   128: aload 4
/*    */     //   130: invokevirtual 62	java/lang/Integer:intValue	()I
/*    */     //   133: invokeinterface 85 2 0
/*    */     //   138: aload 5
/*    */     //   140: invokevirtual 25	org/bukkit/inventory/ItemStack:getAmount	()I
/*    */     //   143: aload_2
/*    */     //   144: invokevirtual 62	java/lang/Integer:intValue	()I
/*    */     //   147: isub
/*    */     //   148: invokevirtual 89	org/bukkit/inventory/ItemStack:setAmount	(I)V
/*    */     //   151: invokestatic 31	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*    */     //   154: astore_2
/*    */     //   155: aload 4
/*    */     //   157: invokevirtual 62	java/lang/Integer:intValue	()I
/*    */     //   160: iconst_1
/*    */     //   161: iadd
/*    */     //   162: invokestatic 31	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*    */     //   165: dup
/*    */     //   166: astore 4
/*    */     //   168: invokevirtual 62	java/lang/Integer:intValue	()I
/*    */     //   171: aload_3
/*    */     //   172: invokeinterface 92 1 0
/*    */     //   177: iconst_1
/*    */     //   178: isub
/*    */     //   179: if_icmple -159 -> 20
/*    */     //   182: return
/*    */     // Line number table:
/*    */     //   Java source line #162	-> byte code offset #0
/*    */     //   Java source line #73	-> byte code offset #2
/*    */     //   Java source line #182	-> byte code offset #20
/*    */     //   Java source line #77	-> byte code offset #34
/*    */     //   Java source line #104	-> byte code offset #52
/*    */     //   Java source line #47	-> byte code offset #61
/*    */     //   Java source line #113	-> byte code offset #74
/*    */     //   Java source line #110	-> byte code offset #91
/*    */     //   Java source line #68	-> byte code offset #106
/*    */     //   Java source line #141	-> byte code offset #122
/*    */     //   Java source line #180	-> byte code offset #151
/*    */     //   Java source line #142	-> byte code offset #182
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	signature
/*    */     //   0	183	0	a	Player
/*    */     //   0	183	1	a	ItemStack
/*    */     //   0	183	2	a	Integer
/*    */   }
/*    */   
/*    */   /* Error */
/*    */   public static Boolean hasItemStack(Player a, ItemStack a, Integer a)
/*    */   {
/*    */     // Byte code:
/*    */     //   0: iconst_0
/*    */     //   1: invokestatic 31	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*    */     //   4: astore_3
/*    */     //   5: aload_0
/*    */     //   6: invokeinterface 59 1 0
/*    */     //   11: invokeinterface 103 1 0
/*    */     //   16: dup
/*    */     //   17: astore 7
/*    */     //   19: arraylength
/*    */     //   20: istore 6
/*    */     //   22: iconst_0
/*    */     //   23: dup
/*    */     //   24: istore 5
/*    */     //   26: goto +49 -> 75
/*    */     //   29: athrow
/*    */     //   30: aload 7
/*    */     //   32: iload 5
/*    */     //   34: aaload
/*    */     //   35: dup
/*    */     //   36: astore 4
/*    */     //   38: ifnull +32 -> 70
/*    */     //   41: aload 4
/*    */     //   43: invokevirtual 72	org/bukkit/inventory/ItemStack:getType	()Lorg/bukkit/Material;
/*    */     //   46: aload_1
/*    */     //   47: invokevirtual 72	org/bukkit/inventory/ItemStack:getType	()Lorg/bukkit/Material;
/*    */     //   50: invokevirtual 78	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
/*    */     //   53: ifeq +17 -> 70
/*    */     //   56: aload_3
/*    */     //   57: invokevirtual 62	java/lang/Integer:intValue	()I
/*    */     //   60: aload 4
/*    */     //   62: invokevirtual 25	org/bukkit/inventory/ItemStack:getAmount	()I
/*    */     //   65: iadd
/*    */     //   66: invokestatic 31	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*    */     //   69: astore_3
/*    */     //   70: iinc 5 1
/*    */     //   73: iload 5
/*    */     //   75: iload 6
/*    */     //   77: if_icmplt -47 -> 30
/*    */     //   80: aload_3
/*    */     //   81: invokevirtual 62	java/lang/Integer:intValue	()I
/*    */     //   84: aload_2
/*    */     //   85: invokevirtual 62	java/lang/Integer:intValue	()I
/*    */     //   88: if_icmplt +9 -> 97
/*    */     //   91: iconst_1
/*    */     //   92: invokestatic 43	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
/*    */     //   95: areturn
/*    */     //   96: athrow
/*    */     //   97: iconst_0
/*    */     //   98: invokestatic 43	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
/*    */     //   101: areturn
/*    */     // Line number table:
/*    */     //   Java source line #46	-> byte code offset #0
/*    */     //   Java source line #167	-> byte code offset #5
/*    */     //   Java source line #45	-> byte code offset #38
/*    */     //   Java source line #167	-> byte code offset #70
/*    */     //   Java source line #150	-> byte code offset #80
/*    */     //   Java source line #23	-> byte code offset #97
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	signature
/*    */     //   0	102	0	a	Player
/*    */     //   0	102	1	a	ItemStack
/*    */     //   0	102	2	a	Integer
/*    */   }
/*    */   
/*    */   public static void removeItemStack(Player a, List<ItemStack> a)
/*    */   {
/*    */     Iterator localIterator;
/* 96 */     for (goto 35; localIterator.hasNext(); removeItemStack(a, tmp25_24, Integer.valueOf(tmp25_24.getAmount())))
/*    */     {
/*    */ 
/*    */ 
/* 96 */       a = (ItemStack)localIterator.next();
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\utils\InventoryUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */