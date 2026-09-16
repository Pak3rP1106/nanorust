/*     */ package nano.spook1998.rust.utils.crafting.actionbar;
/*     */ 
/*     */ import java.util.Iterator;
/*     */ import org.bukkit.entity.Player;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ActionBarUitl
/*     */ {
/*     */   public static String ALLATORIxDEMO(String a)
/*     */   {
/*     */     int tmp10_9 = 4;
/*     */     int tmp17_16 = 4;
/*     */     int tmp29_26 = a.length();
/*     */     int tmp33_32 = 1;
/*     */     tmp33_32;
/*     */     int j;
/*     */     int ? = tmp33_32;
/*     */     int k = tmp29_26;
/*     */     (j = new char[tmp29_26] - 1);
/*     */     int i = tmp17_16 << tmp17_16 ^ 3 << 2 ^ 0x3;
/*     */     if ((tmp10_9 << tmp10_9 ^ 4 << 1) >= 0)
/*     */     {
/*     */       int tmp52_51 = j;
/*     */       j--;
/*     */       ?[tmp52_51] = ((char)(a.charAt(tmp52_51) ^ i));
/*     */       int tmp73_70 = (j--);
/*     */       ?[tmp73_70] = ((char)(a.charAt(tmp73_70) ^ k));
/*     */     }
/*     */     return new String(?);
/*     */   }
/*     */   
/*     */   public static void updateAll()
/*     */   {
/*     */     Iterator localIterator;
/*  97 */     for (goto 27; localIterator.hasNext();)
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 164 */       update((Player)localIterator.next());
/*     */     }
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public static void update(Player a)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ifnonnull +5 -> 6
/*     */     //   4: return
/*     */     //   5: athrow
/*     */     //   6: aload_0
/*     */     //   7: invokeinterface 64 1 0
/*     */     //   12: invokestatic 70	nano/spook1998/rust/object/utils/UserUtil:get	(Ljava/lang/String;)Lnano/spook1998/rust/object/User;
/*     */     //   15: dup
/*     */     //   16: astore_1
/*     */     //   17: invokevirtual 76	nano/spook1998/rust/object/User:getCrafting	()Ljava/util/List;
/*     */     //   20: ifnonnull +5 -> 25
/*     */     //   23: return
/*     */     //   24: athrow
/*     */     //   25: aload_1
/*     */     //   26: invokevirtual 76	nano/spook1998/rust/object/User:getCrafting	()Ljava/util/List;
/*     */     //   29: dup
/*     */     //   30: astore_2
/*     */     //   31: invokeinterface 81 1 0
/*     */     //   36: ifne +4 -> 40
/*     */     //   39: return
/*     */     //   40: aload_1
/*     */     //   41: invokevirtual 84	nano/spook1998/rust/object/User:updateCrafting	()V
/*     */     //   44: getstatic 90	nano/spook1998/rust/data/Settings:MESSAGE	Ljava/util/Map;
/*     */     //   47: ldc 92
/*     */     //   49: invokestatic 94	nano/spook1998/rust/utils/crafting/actionbar/ActionBarUitl:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
/*     */     //   52: invokeinterface 99 2 0
/*     */     //   57: checkcast 15	java/lang/String
/*     */     //   60: astore_3
/*     */     //   61: aload_2
/*     */     //   62: iconst_0
/*     */     //   63: invokeinterface 102 2 0
/*     */     //   68: checkcast 104	nano/spook1998/rust/object/Crafting
/*     */     //   71: dup
/*     */     //   72: astore 4
/*     */     //   74: ifnonnull +4 -> 78
/*     */     //   77: return
/*     */     //   78: aload 4
/*     */     //   80: invokevirtual 108	nano/spook1998/rust/object/Crafting:getTime	()Ljava/lang/Integer;
/*     */     //   83: invokevirtual 113	java/lang/Integer:intValue	()I
/*     */     //   86: ifle +78 -> 164
/*     */     //   89: aload_3
/*     */     //   90: ldc 115
/*     */     //   92: invokestatic 94	nano/spook1998/rust/utils/crafting/actionbar/ActionBarUitl:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
/*     */     //   95: aload 4
/*     */     //   97: invokevirtual 116	nano/spook1998/rust/object/Crafting:getName	()Ljava/lang/String;
/*     */     //   100: invokevirtual 120	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
/*     */     //   103: ldc 122
/*     */     //   105: invokestatic 94	nano/spook1998/rust/utils/crafting/actionbar/ActionBarUitl:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
/*     */     //   108: aload 4
/*     */     //   110: invokevirtual 108	nano/spook1998/rust/object/Crafting:getTime	()Ljava/lang/Integer;
/*     */     //   113: invokevirtual 113	java/lang/Integer:intValue	()I
/*     */     //   116: sipush 1000
/*     */     //   119: imul
/*     */     //   120: i2l
/*     */     //   121: invokestatic 128	nano/spook1998/rust/utils/TimeUtil:getDurationBreakdown	(J)Ljava/lang/String;
/*     */     //   124: invokevirtual 120	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
/*     */     //   127: ldc -126
/*     */     //   129: invokestatic 94	nano/spook1998/rust/utils/crafting/actionbar/ActionBarUitl:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
/*     */     //   132: new 132	java/lang/StringBuilder
/*     */     //   135: dup
/*     */     //   136: invokespecial 133	java/lang/StringBuilder:<init>	()V
/*     */     //   139: aload_2
/*     */     //   140: invokeinterface 81 1 0
/*     */     //   145: invokevirtual 137	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
/*     */     //   148: invokevirtual 140	java/lang/StringBuilder:toString	()Ljava/lang/String;
/*     */     //   151: invokevirtual 120	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
/*     */     //   154: astore_3
/*     */     //   155: invokestatic 146	nano/spook1998/rust/utils/crafting/actionbar/ActionBar:getInstance	()Lnano/spook1998/rust/utils/crafting/actionbar/ActionBar;
/*     */     //   158: aload_0
/*     */     //   159: aload_3
/*     */     //   160: invokevirtual 150	nano/spook1998/rust/utils/crafting/actionbar/ActionBar:sendActionBar	(Lorg/bukkit/entity/Player;Ljava/lang/String;)V
/*     */     //   163: return
/*     */     //   164: invokestatic 155	nano/spook1998/rust/utils/ItemToInventory:getInstance	()Lnano/spook1998/rust/utils/ItemToInventory;
/*     */     //   167: aload_0
/*     */     //   168: aload 4
/*     */     //   170: invokevirtual 159	nano/spook1998/rust/object/Crafting:getItemStack	()Lorg/bukkit/inventory/ItemStack;
/*     */     //   173: invokevirtual 164	org/bukkit/inventory/ItemStack:clone	()Lorg/bukkit/inventory/ItemStack;
/*     */     //   176: invokevirtual 168	nano/spook1998/rust/utils/ItemToInventory:addItem	(Lorg/bukkit/entity/Player;Lorg/bukkit/inventory/ItemStack;)V
/*     */     //   179: aload_1
/*     */     //   180: aload 4
/*     */     //   182: invokevirtual 172	nano/spook1998/rust/object/User:removeCrafting	(Lnano/spook1998/rust/object/Crafting;)V
/*     */     //   185: return
/*     */     // Line number table:
/*     */     //   Java source line #78	-> byte code offset #0
/*     */     //   Java source line #93	-> byte code offset #6
/*     */     //   Java source line #119	-> byte code offset #17
/*     */     //   Java source line #170	-> byte code offset #25
/*     */     //   Java source line #96	-> byte code offset #31
/*     */     //   Java source line #92	-> byte code offset #40
/*     */     //   Java source line #32	-> byte code offset #44
/*     */     //   Java source line #13	-> byte code offset #61
/*     */     //   Java source line #155	-> byte code offset #74
/*     */     //   Java source line #162	-> byte code offset #78
/*     */     //   Java source line #73	-> byte code offset #89
/*     */     //   Java source line #182	-> byte code offset #163
/*     */     //   Java source line #77	-> byte code offset #164
/*     */     //   Java source line #104	-> byte code offset #179
/*     */     //   Java source line #113	-> byte code offset #185
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	186	0	a	Player
/*     */   }
/*     */ }


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\utils\crafting\actionbar\ActionBarUitl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */