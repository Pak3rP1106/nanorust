/*     */ package nano.spook1998.rust.utils.crafting.scoreboard;
/*     */ 
/*     */ import java.util.Iterator;
/*     */ import org.bukkit.entity.Player;
/*     */ import org.bukkit.scoreboard.DisplaySlot;
/*     */ import org.bukkit.scoreboard.Scoreboard;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ScoreboardUtil
/*     */ {
/*     */   public static String ALLATORIxDEMO(String a)
/*     */   {
/*     */     int tmp11_10 = 3;
/*     */     int tmp19_16 = a.length();
/*     */     int tmp23_22 = 1;
/*     */     tmp23_22;
/*     */     int j;
/*     */     int ? = tmp23_22;
/*     */     int k = tmp19_16;
/*     */     int tmp33_29 = (j = new char[tmp19_16] - 1);
/*     */     tmp33_29;
/*     */     int i = (0x2 ^ 0x5) << 3 ^ tmp11_10 ^ 0x5;
/*     */     tmp11_10;
/*     */     if (tmp33_29 >= 0)
/*     */     {
/*     */       int tmp43_42 = j;
/*     */       j--;
/*     */       ?[tmp43_42] = ((char)(a.charAt(tmp43_42) ^ i));
/*     */       int tmp64_61 = (j--);
/*     */       ?[tmp64_61] = ((char)(a.charAt(tmp64_61) ^ k));
/*     */     }
/*     */     return new String(?);
/*     */   }
/*     */   
/*     */   public static void despawn(Player a)
/*     */   {
/*  60 */     if (a.getScoreboard().getObjective(DisplaySlot.SIDEBAR) != null) { a.getScoreboard().clearSlot(DisplaySlot.SIDEBAR);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static void updateAll()
/*     */   {
/*     */     Iterator localIterator;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 164 */     for (goto 27; localIterator.hasNext();) {
/*  38 */       update(
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 164 */         (Player)localIterator.next());
/*     */     }
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public static void update(Player a)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokeinterface 86 1 0
/*     */     //   6: invokestatic 92	nano/spook1998/rust/object/utils/UserUtil:get	(Ljava/lang/String;)Lnano/spook1998/rust/object/User;
/*     */     //   9: dup
/*     */     //   10: astore_1
/*     */     //   11: invokevirtual 98	nano/spook1998/rust/object/User:getCrafting	()Ljava/util/List;
/*     */     //   14: ifnonnull +9 -> 23
/*     */     //   17: aload_0
/*     */     //   18: invokestatic 100	nano/spook1998/rust/utils/crafting/scoreboard/ScoreboardUtil:despawn	(Lorg/bukkit/entity/Player;)V
/*     */     //   21: return
/*     */     //   22: athrow
/*     */     //   23: aload_1
/*     */     //   24: invokevirtual 98	nano/spook1998/rust/object/User:getCrafting	()Ljava/util/List;
/*     */     //   27: dup
/*     */     //   28: astore_2
/*     */     //   29: invokeinterface 105 1 0
/*     */     //   34: ifne +9 -> 43
/*     */     //   37: aload_0
/*     */     //   38: invokestatic 100	nano/spook1998/rust/utils/crafting/scoreboard/ScoreboardUtil:despawn	(Lorg/bukkit/entity/Player;)V
/*     */     //   41: return
/*     */     //   42: athrow
/*     */     //   43: aload_1
/*     */     //   44: invokevirtual 108	nano/spook1998/rust/object/User:updateCrafting	()V
/*     */     //   47: iconst_0
/*     */     //   48: invokestatic 114	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   51: astore_3
/*     */     //   52: new 116	nano/spook1998/rust/utils/crafting/scoreboard/SimpleScoreboard
/*     */     //   55: dup
/*     */     //   56: aload_0
/*     */     //   57: getstatic 121	nano/spook1998/rust/data/Settings:SCOREBOARD_TITLE	Ljava/lang/String;
/*     */     //   60: invokespecial 124	nano/spook1998/rust/utils/crafting/scoreboard/SimpleScoreboard:<init>	(Lorg/bukkit/entity/Player;Ljava/lang/String;)V
/*     */     //   63: astore 4
/*     */     //   65: iconst_0
/*     */     //   66: invokestatic 114	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   69: dup
/*     */     //   70: astore 5
/*     */     //   72: goto +238 -> 310
/*     */     //   75: aload_2
/*     */     //   76: aload 5
/*     */     //   78: invokevirtual 127	java/lang/Integer:intValue	()I
/*     */     //   81: invokeinterface 130 2 0
/*     */     //   86: checkcast 132	nano/spook1998/rust/object/Crafting
/*     */     //   89: dup
/*     */     //   90: astore 6
/*     */     //   92: invokevirtual 136	nano/spook1998/rust/object/Crafting:getTime	()Ljava/lang/Integer;
/*     */     //   95: invokevirtual 127	java/lang/Integer:intValue	()I
/*     */     //   98: ifle +178 -> 276
/*     */     //   101: aload_3
/*     */     //   102: invokevirtual 127	java/lang/Integer:intValue	()I
/*     */     //   105: aload 4
/*     */     //   107: swap
/*     */     //   108: ifne +82 -> 190
/*     */     //   111: new 138	java/lang/StringBuilder
/*     */     //   114: aload 4
/*     */     //   116: dup
/*     */     //   117: pop2
/*     */     //   118: dup
/*     */     //   119: ldc -116
/*     */     //   121: invokestatic 142	nano/spook1998/rust/utils/crafting/scoreboard/ScoreboardUtil:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
/*     */     //   124: invokespecial 145	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
/*     */     //   127: invokestatic 151	nano/spook1998/rust/utils/RandomUtil:getInstance	()Lnano/spook1998/rust/utils/RandomUtil;
/*     */     //   130: iconst_0
/*     */     //   131: bipush 9
/*     */     //   133: invokevirtual 155	nano/spook1998/rust/utils/RandomUtil:getRandInt	(II)I
/*     */     //   136: invokevirtual 159	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
/*     */     //   139: ldc -116
/*     */     //   141: invokestatic 142	nano/spook1998/rust/utils/crafting/scoreboard/ScoreboardUtil:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
/*     */     //   144: invokevirtual 162	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   147: invokestatic 151	nano/spook1998/rust/utils/RandomUtil:getInstance	()Lnano/spook1998/rust/utils/RandomUtil;
/*     */     //   150: iconst_0
/*     */     //   151: bipush 9
/*     */     //   153: invokevirtual 155	nano/spook1998/rust/utils/RandomUtil:getRandInt	(II)I
/*     */     //   156: invokevirtual 159	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
/*     */     //   159: ldc -92
/*     */     //   161: invokestatic 142	nano/spook1998/rust/utils/crafting/scoreboard/ScoreboardUtil:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
/*     */     //   164: invokevirtual 162	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   167: aload 6
/*     */     //   169: invokevirtual 165	nano/spook1998/rust/object/Crafting:getName	()Ljava/lang/String;
/*     */     //   172: invokevirtual 162	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   175: invokevirtual 168	java/lang/StringBuilder:toString	()Ljava/lang/String;
/*     */     //   178: aload 6
/*     */     //   180: invokevirtual 136	nano/spook1998/rust/object/Crafting:getTime	()Ljava/lang/Integer;
/*     */     //   183: invokevirtual 172	nano/spook1998/rust/utils/crafting/scoreboard/SimpleScoreboard:add	(Ljava/lang/String;Ljava/lang/Integer;)V
/*     */     //   186: aload_3
/*     */     //   187: goto +75 -> 262
/*     */     //   190: new 138	java/lang/StringBuilder
/*     */     //   193: dup
/*     */     //   194: ldc -116
/*     */     //   196: invokestatic 142	nano/spook1998/rust/utils/crafting/scoreboard/ScoreboardUtil:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
/*     */     //   199: invokespecial 145	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
/*     */     //   202: invokestatic 151	nano/spook1998/rust/utils/RandomUtil:getInstance	()Lnano/spook1998/rust/utils/RandomUtil;
/*     */     //   205: iconst_0
/*     */     //   206: bipush 9
/*     */     //   208: invokevirtual 155	nano/spook1998/rust/utils/RandomUtil:getRandInt	(II)I
/*     */     //   211: invokevirtual 159	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
/*     */     //   214: ldc -116
/*     */     //   216: invokestatic 142	nano/spook1998/rust/utils/crafting/scoreboard/ScoreboardUtil:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
/*     */     //   219: invokevirtual 162	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   222: invokestatic 151	nano/spook1998/rust/utils/RandomUtil:getInstance	()Lnano/spook1998/rust/utils/RandomUtil;
/*     */     //   225: iconst_0
/*     */     //   226: bipush 9
/*     */     //   228: invokevirtual 155	nano/spook1998/rust/utils/RandomUtil:getRandInt	(II)I
/*     */     //   231: invokevirtual 159	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
/*     */     //   234: ldc -82
/*     */     //   236: invokestatic 142	nano/spook1998/rust/utils/crafting/scoreboard/ScoreboardUtil:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
/*     */     //   239: invokevirtual 162	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   242: aload 6
/*     */     //   244: invokevirtual 165	nano/spook1998/rust/object/Crafting:getName	()Ljava/lang/String;
/*     */     //   247: invokevirtual 162	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   250: invokevirtual 168	java/lang/StringBuilder:toString	()Ljava/lang/String;
/*     */     //   253: aload 6
/*     */     //   255: invokevirtual 136	nano/spook1998/rust/object/Crafting:getTime	()Ljava/lang/Integer;
/*     */     //   258: invokevirtual 172	nano/spook1998/rust/utils/crafting/scoreboard/SimpleScoreboard:add	(Ljava/lang/String;Ljava/lang/Integer;)V
/*     */     //   261: aload_3
/*     */     //   262: invokevirtual 127	java/lang/Integer:intValue	()I
/*     */     //   265: iconst_1
/*     */     //   266: iadd
/*     */     //   267: invokestatic 114	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   270: astore_3
/*     */     //   271: aload 5
/*     */     //   273: goto +26 -> 299
/*     */     //   276: invokestatic 179	nano/spook1998/rust/utils/ItemToInventory:getInstance	()Lnano/spook1998/rust/utils/ItemToInventory;
/*     */     //   279: aload_0
/*     */     //   280: aload 6
/*     */     //   282: invokevirtual 183	nano/spook1998/rust/object/Crafting:getItemStack	()Lorg/bukkit/inventory/ItemStack;
/*     */     //   285: invokevirtual 188	org/bukkit/inventory/ItemStack:clone	()Lorg/bukkit/inventory/ItemStack;
/*     */     //   288: invokevirtual 192	nano/spook1998/rust/utils/ItemToInventory:addItem	(Lorg/bukkit/entity/Player;Lorg/bukkit/inventory/ItemStack;)V
/*     */     //   291: aload 5
/*     */     //   293: aload_1
/*     */     //   294: aload 6
/*     */     //   296: invokevirtual 196	nano/spook1998/rust/object/User:removeCrafting	(Lnano/spook1998/rust/object/Crafting;)V
/*     */     //   299: invokevirtual 127	java/lang/Integer:intValue	()I
/*     */     //   302: iconst_1
/*     */     //   303: iadd
/*     */     //   304: invokestatic 114	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   307: dup
/*     */     //   308: astore 5
/*     */     //   310: invokevirtual 127	java/lang/Integer:intValue	()I
/*     */     //   313: aload_2
/*     */     //   314: invokeinterface 105 1 0
/*     */     //   319: if_icmplt -244 -> 75
/*     */     //   322: aload_3
/*     */     //   323: invokevirtual 127	java/lang/Integer:intValue	()I
/*     */     //   326: ifle +13 -> 339
/*     */     //   329: aload_0
/*     */     //   330: aload 4
/*     */     //   332: dup_x1
/*     */     //   333: invokevirtual 199	nano/spook1998/rust/utils/crafting/scoreboard/SimpleScoreboard:build	()V
/*     */     //   336: invokevirtual 202	nano/spook1998/rust/utils/crafting/scoreboard/SimpleScoreboard:send	(Lorg/bukkit/entity/Player;)V
/*     */     //   339: return
/*     */     // Line number table:
/*     */     //   Java source line #93	-> byte code offset #0
/*     */     //   Java source line #119	-> byte code offset #11
/*     */     //   Java source line #170	-> byte code offset #17
/*     */     //   Java source line #96	-> byte code offset #21
/*     */     //   Java source line #32	-> byte code offset #23
/*     */     //   Java source line #13	-> byte code offset #29
/*     */     //   Java source line #155	-> byte code offset #37
/*     */     //   Java source line #162	-> byte code offset #41
/*     */     //   Java source line #182	-> byte code offset #47
/*     */     //   Java source line #77	-> byte code offset #52
/*     */     //   Java source line #104	-> byte code offset #65
/*     */     //   Java source line #47	-> byte code offset #75
/*     */     //   Java source line #113	-> byte code offset #92
/*     */     //   Java source line #110	-> byte code offset #101
/*     */     //   Java source line #68	-> byte code offset #111
/*     */     //   Java source line #141	-> byte code offset #187
/*     */     //   Java source line #180	-> byte code offset #190
/*     */     //   Java source line #24	-> byte code offset #261
/*     */     //   Java source line #194	-> byte code offset #273
/*     */     //   Java source line #142	-> byte code offset #276
/*     */     //   Java source line #3	-> byte code offset #293
/*     */     //   Java source line #104	-> byte code offset #299
/*     */     //   Java source line #72	-> byte code offset #322
/*     */     //   Java source line #5	-> byte code offset #329
/*     */     //   Java source line #86	-> byte code offset #336
/*     */     //   Java source line #163	-> byte code offset #339
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	340	0	a	Player
/*     */   }
/*     */ }


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\utils\crafting\scoreboard\ScoreboardUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */