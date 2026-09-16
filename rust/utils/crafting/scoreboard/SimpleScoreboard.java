/*     */ package nano.spook1998.rust.utils.crafting.scoreboard;
/*     */ 
/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import org.bukkit.entity.Player;
/*     */ import org.bukkit.scoreboard.Scoreboard;
/*     */ import org.bukkit.scoreboard.Team;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SimpleScoreboard
/*     */ {
/*     */   private Map<String, Integer> D;
/*     */   private Scoreboard M;
/*     */   private List<Team> b;
/*     */   private String ALLATORIxDEMO;
/*     */   
/*     */   public SimpleScoreboard(Player a, String a)
/*     */   {
/*  73 */     a.M = a.getScoreboard();
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 182 */     a.ALLATORIxDEMO = a;a.D = Maps.newLinkedHashMap();a.b = Lists.newArrayList();
/*     */   }
/*     */   
/*     */ 
/*     */   public void blankLine()
/*     */   {
/* 110 */     a.add(g("\032"));
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
/*     */   public void add(String a)
/*     */   {
/* 180 */     a.add(a, null);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Scoreboard getScoreboard()
/*     */   {
/* 328 */     return a.M;
/*     */   }
/*     */   
/*     */   public void reset()
/*     */   {
/* 308 */     a.ALLATORIxDEMO = null;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/* 313 */     a.D.clear();
/*     */     Iterator localIterator;
/* 227 */     for (goto 44; localIterator.hasNext();)
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 333 */       ((Team)localIterator.next()).unregister();
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 357 */     a.b.clear();
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public void add(String a, Integer a)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: invokevirtual 33	java/lang/String:length	()I
/*     */     //   4: bipush 48
/*     */     //   6: if_icmpge +8 -> 14
/*     */     //   9: iconst_1
/*     */     //   10: goto +5 -> 15
/*     */     //   13: athrow
/*     */     //   14: iconst_0
/*     */     //   15: ldc 35
/*     */     //   17: invokestatic 39	nano/spook1998/rust/utils/crafting/scoreboard/SimpleScoreboard:g	(Ljava/lang/String;)Ljava/lang/String;
/*     */     //   20: invokestatic 45	com/google/common/base/Preconditions:checkArgument	(ZLjava/lang/Object;)V
/*     */     //   23: aload_0
/*     */     //   24: getfield 47	nano/spook1998/rust/utils/crafting/scoreboard/SimpleScoreboard:D	Ljava/util/Map;
/*     */     //   27: aload_0
/*     */     //   28: aload_1
/*     */     //   29: invokespecial 49	nano/spook1998/rust/utils/crafting/scoreboard/SimpleScoreboard:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
/*     */     //   32: aload_2
/*     */     //   33: invokeinterface 53 3 0
/*     */     //   38: pop
/*     */     //   39: return
/*     */     // Line number table:
/*     */     //   Java source line #194	-> byte code offset #0
/*     */     //   Java source line #142	-> byte code offset #23
/*     */     //   Java source line #3	-> byte code offset #39
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	40	0	a	SimpleScoreboard
/*     */     //   0	40	1	a	String
/*     */     //   0	40	2	a	Integer
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public void send(Player a)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield 63	nano/spook1998/rust/utils/crafting/scoreboard/SimpleScoreboard:M	Lorg/bukkit/scoreboard/Scoreboard;
/*     */     //   4: ifnonnull +20 -> 24
/*     */     //   7: aload_0
/*     */     //   8: getfield 63	nano/spook1998/rust/utils/crafting/scoreboard/SimpleScoreboard:M	Lorg/bukkit/scoreboard/Scoreboard;
/*     */     //   11: getstatic 71	org/bukkit/scoreboard/DisplaySlot:SIDEBAR	Lorg/bukkit/scoreboard/DisplaySlot;
/*     */     //   14: invokeinterface 77 2 0
/*     */     //   19: ifnonnull +5 -> 24
/*     */     //   22: return
/*     */     //   23: athrow
/*     */     //   24: aload_1
/*     */     //   25: aload_0
/*     */     //   26: getfield 63	nano/spook1998/rust/utils/crafting/scoreboard/SimpleScoreboard:M	Lorg/bukkit/scoreboard/Scoreboard;
/*     */     //   29: invokeinterface 83 2 0
/*     */     //   34: return
/*     */     // Line number table:
/*     */     //   Java source line #289	-> byte code offset #0
/*     */     //   Java source line #279	-> byte code offset #24
/*     */     //   Java source line #236	-> byte code offset #34
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	35	0	a	SimpleScoreboard
/*     */     //   0	35	1	a	Player
/*     */   }
/*     */   
/*     */   public static String g(String a)
/*     */   {
/*     */     int tmp8_7 = 4;
/*     */     int tmp14_13 = 1;
/*     */     int tmp21_18 = a.length();
/*     */     int tmp25_24 = 1;
/*     */     tmp25_24;
/*     */     int j;
/*     */     int ? = tmp25_24;
/*     */     int k = tmp21_18;
/*     */     (j = new char[tmp21_18] - 1);
/*     */     int i = 5 << 4 ^ tmp14_13 << tmp14_13;
/*     */     if (tmp8_7 << tmp8_7 >= 0)
/*     */     {
/*     */       int tmp44_43 = j;
/*     */       j--;
/*     */       ?[tmp44_43] = ((char)(a.charAt(tmp44_43) ^ i));
/*     */       int tmp65_62 = (j--);
/*     */       ?[tmp65_62] = ((char)(a.charAt(tmp65_62) ^ k));
/*     */     }
/*     */     return new String(?);
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public void build()
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield 47	nano/spook1998/rust/utils/crafting/scoreboard/SimpleScoreboard:D	Ljava/util/Map;
/*     */     //   4: invokeinterface 146 1 0
/*     */     //   9: invokestatic 149	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   12: dup
/*     */     //   13: astore_1
/*     */     //   14: invokevirtual 152	java/lang/Integer:intValue	()I
/*     */     //   17: ifgt +32 -> 49
/*     */     //   20: aload_0
/*     */     //   21: getfield 63	nano/spook1998/rust/utils/crafting/scoreboard/SimpleScoreboard:M	Lorg/bukkit/scoreboard/Scoreboard;
/*     */     //   24: getstatic 71	org/bukkit/scoreboard/DisplaySlot:SIDEBAR	Lorg/bukkit/scoreboard/DisplaySlot;
/*     */     //   27: invokeinterface 77 2 0
/*     */     //   32: ifnull +15 -> 47
/*     */     //   35: aload_0
/*     */     //   36: getfield 63	nano/spook1998/rust/utils/crafting/scoreboard/SimpleScoreboard:M	Lorg/bukkit/scoreboard/Scoreboard;
/*     */     //   39: getstatic 71	org/bukkit/scoreboard/DisplaySlot:SIDEBAR	Lorg/bukkit/scoreboard/DisplaySlot;
/*     */     //   42: invokeinterface 156 2 0
/*     */     //   47: return
/*     */     //   48: athrow
/*     */     //   49: aload_0
/*     */     //   50: getfield 63	nano/spook1998/rust/utils/crafting/scoreboard/SimpleScoreboard:M	Lorg/bukkit/scoreboard/Scoreboard;
/*     */     //   53: invokeinterface 160 1 0
/*     */     //   58: invokeinterface 166 1 0
/*     */     //   63: dup
/*     */     //   64: astore_3
/*     */     //   65: goto +38 -> 103
/*     */     //   68: athrow
/*     */     //   69: aload_3
/*     */     //   70: invokeinterface 172 1 0
/*     */     //   75: checkcast 174	org/bukkit/scoreboard/Team
/*     */     //   78: dup
/*     */     //   79: astore_2
/*     */     //   80: invokeinterface 177 1 0
/*     */     //   85: ldc -77
/*     */     //   87: invokestatic 39	nano/spook1998/rust/utils/crafting/scoreboard/SimpleScoreboard:g	(Ljava/lang/String;)Ljava/lang/String;
/*     */     //   90: invokevirtual 183	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
/*     */     //   93: ifeq +9 -> 102
/*     */     //   96: aload_2
/*     */     //   97: invokeinterface 186 1 0
/*     */     //   102: aload_3
/*     */     //   103: invokeinterface 190 1 0
/*     */     //   108: ifne -39 -> 69
/*     */     //   111: aload_0
/*     */     //   112: dup
/*     */     //   113: getfield 63	nano/spook1998/rust/utils/crafting/scoreboard/SimpleScoreboard:M	Lorg/bukkit/scoreboard/Scoreboard;
/*     */     //   116: swap
/*     */     //   117: getfield 192	nano/spook1998/rust/utils/crafting/scoreboard/SimpleScoreboard:ALLATORIxDEMO	Ljava/lang/String;
/*     */     //   120: invokevirtual 33	java/lang/String:length	()I
/*     */     //   123: bipush 16
/*     */     //   125: if_icmple +16 -> 141
/*     */     //   128: aload_0
/*     */     //   129: getfield 192	nano/spook1998/rust/utils/crafting/scoreboard/SimpleScoreboard:ALLATORIxDEMO	Ljava/lang/String;
/*     */     //   132: iconst_0
/*     */     //   133: bipush 15
/*     */     //   135: invokevirtual 134	java/lang/String:substring	(II)Ljava/lang/String;
/*     */     //   138: goto +7 -> 145
/*     */     //   141: aload_0
/*     */     //   142: getfield 192	nano/spook1998/rust/utils/crafting/scoreboard/SimpleScoreboard:ALLATORIxDEMO	Ljava/lang/String;
/*     */     //   145: invokeinterface 195 2 0
/*     */     //   150: dup
/*     */     //   151: astore_2
/*     */     //   152: ifnonnull +48 -> 200
/*     */     //   155: aload_0
/*     */     //   156: dup
/*     */     //   157: getfield 63	nano/spook1998/rust/utils/crafting/scoreboard/SimpleScoreboard:M	Lorg/bukkit/scoreboard/Scoreboard;
/*     */     //   160: swap
/*     */     //   161: getfield 192	nano/spook1998/rust/utils/crafting/scoreboard/SimpleScoreboard:ALLATORIxDEMO	Ljava/lang/String;
/*     */     //   164: invokevirtual 33	java/lang/String:length	()I
/*     */     //   167: bipush 16
/*     */     //   169: if_icmple +16 -> 185
/*     */     //   172: aload_0
/*     */     //   173: getfield 192	nano/spook1998/rust/utils/crafting/scoreboard/SimpleScoreboard:ALLATORIxDEMO	Ljava/lang/String;
/*     */     //   176: iconst_0
/*     */     //   177: bipush 15
/*     */     //   179: invokevirtual 134	java/lang/String:substring	(II)Ljava/lang/String;
/*     */     //   182: goto +7 -> 189
/*     */     //   185: aload_0
/*     */     //   186: getfield 192	nano/spook1998/rust/utils/crafting/scoreboard/SimpleScoreboard:ALLATORIxDEMO	Ljava/lang/String;
/*     */     //   189: ldc -59
/*     */     //   191: invokestatic 39	nano/spook1998/rust/utils/crafting/scoreboard/SimpleScoreboard:g	(Ljava/lang/String;)Ljava/lang/String;
/*     */     //   194: invokeinterface 201 3 0
/*     */     //   199: astore_2
/*     */     //   200: aload_2
/*     */     //   201: dup
/*     */     //   202: dup_x1
/*     */     //   203: aload_0
/*     */     //   204: getfield 192	nano/spook1998/rust/utils/crafting/scoreboard/SimpleScoreboard:ALLATORIxDEMO	Ljava/lang/String;
/*     */     //   207: invokeinterface 206 2 0
/*     */     //   212: getstatic 71	org/bukkit/scoreboard/DisplaySlot:SIDEBAR	Lorg/bukkit/scoreboard/DisplaySlot;
/*     */     //   215: invokeinterface 209 2 0
/*     */     //   220: invokeinterface 211 1 0
/*     */     //   225: invokeinterface 214 1 0
/*     */     //   230: ifnonnull +167 -> 397
/*     */     //   233: aload_0
/*     */     //   234: dup
/*     */     //   235: getfield 47	nano/spook1998/rust/utils/crafting/scoreboard/SimpleScoreboard:D	Ljava/util/Map;
/*     */     //   238: invokeinterface 146 1 0
/*     */     //   243: istore_3
/*     */     //   244: getfield 47	nano/spook1998/rust/utils/crafting/scoreboard/SimpleScoreboard:D	Ljava/util/Map;
/*     */     //   247: invokeinterface 217 1 0
/*     */     //   252: invokeinterface 166 1 0
/*     */     //   257: dup
/*     */     //   258: astore 5
/*     */     //   260: goto +128 -> 388
/*     */     //   263: aload 5
/*     */     //   265: invokeinterface 172 1 0
/*     */     //   270: checkcast 12	java/util/Map$Entry
/*     */     //   273: astore 4
/*     */     //   275: aload_0
/*     */     //   276: aload 4
/*     */     //   278: invokeinterface 220 1 0
/*     */     //   283: checkcast 29	java/lang/String
/*     */     //   286: invokespecial 223	nano/spook1998/rust/utils/crafting/scoreboard/SimpleScoreboard:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/util/Map$Entry;
/*     */     //   289: astore 6
/*     */     //   291: aload 4
/*     */     //   293: invokeinterface 226 1 0
/*     */     //   298: ifnull +19 -> 317
/*     */     //   301: aload 4
/*     */     //   303: invokeinterface 226 1 0
/*     */     //   308: checkcast 59	java/lang/Integer
/*     */     //   311: invokevirtual 152	java/lang/Integer:intValue	()I
/*     */     //   314: goto +4 -> 318
/*     */     //   317: iload_3
/*     */     //   318: invokestatic 149	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   321: astore 7
/*     */     //   323: aload 6
/*     */     //   325: invokeinterface 226 1 0
/*     */     //   330: checkcast 29	java/lang/String
/*     */     //   333: invokestatic 232	org/bukkit/Bukkit:getOfflinePlayer	(Ljava/lang/String;)Lorg/bukkit/OfflinePlayer;
/*     */     //   336: astore 8
/*     */     //   338: aload 6
/*     */     //   340: invokeinterface 220 1 0
/*     */     //   345: ifnull +20 -> 365
/*     */     //   348: aload 6
/*     */     //   350: invokeinterface 220 1 0
/*     */     //   355: checkcast 174	org/bukkit/scoreboard/Team
/*     */     //   358: aload 8
/*     */     //   360: invokeinterface 236 2 0
/*     */     //   365: aload_2
/*     */     //   366: aload 8
/*     */     //   368: invokeinterface 240 2 0
/*     */     //   373: iinc 3 -1
/*     */     //   376: aload 7
/*     */     //   378: invokevirtual 152	java/lang/Integer:intValue	()I
/*     */     //   381: invokeinterface 246 2 0
/*     */     //   386: aload 5
/*     */     //   388: invokeinterface 190 1 0
/*     */     //   393: ifne -130 -> 263
/*     */     //   396: return
/*     */     //   397: aload_2
/*     */     //   398: invokeinterface 211 1 0
/*     */     //   403: invokeinterface 214 1 0
/*     */     //   408: dup
/*     */     //   409: astore_3
/*     */     //   410: invokeinterface 247 1 0
/*     */     //   415: invokestatic 149	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   418: dup
/*     */     //   419: astore 4
/*     */     //   421: invokevirtual 152	java/lang/Integer:intValue	()I
/*     */     //   424: ifle +636 -> 1060
/*     */     //   427: aload_1
/*     */     //   428: invokevirtual 152	java/lang/Integer:intValue	()I
/*     */     //   431: aload 4
/*     */     //   433: invokevirtual 152	java/lang/Integer:intValue	()I
/*     */     //   436: if_icmple +238 -> 674
/*     */     //   439: aload_3
/*     */     //   440: invokeinterface 166 1 0
/*     */     //   445: dup
/*     */     //   446: astore 6
/*     */     //   448: goto +52 -> 500
/*     */     //   451: aload 6
/*     */     //   453: invokeinterface 172 1 0
/*     */     //   458: checkcast 249	org/bukkit/OfflinePlayer
/*     */     //   461: astore 5
/*     */     //   463: aload_0
/*     */     //   464: getfield 63	nano/spook1998/rust/utils/crafting/scoreboard/SimpleScoreboard:M	Lorg/bukkit/scoreboard/Scoreboard;
/*     */     //   467: aload 5
/*     */     //   469: invokeinterface 253 2 0
/*     */     //   474: dup
/*     */     //   475: astore 7
/*     */     //   477: ifnull +10 -> 487
/*     */     //   480: aload 7
/*     */     //   482: invokeinterface 186 1 0
/*     */     //   487: aload_0
/*     */     //   488: getfield 63	nano/spook1998/rust/utils/crafting/scoreboard/SimpleScoreboard:M	Lorg/bukkit/scoreboard/Scoreboard;
/*     */     //   491: aload 5
/*     */     //   493: invokeinterface 256 2 0
/*     */     //   498: aload 6
/*     */     //   500: invokeinterface 190 1 0
/*     */     //   505: ifne -54 -> 451
/*     */     //   508: aload_0
/*     */     //   509: dup
/*     */     //   510: getfield 47	nano/spook1998/rust/utils/crafting/scoreboard/SimpleScoreboard:D	Ljava/util/Map;
/*     */     //   513: invokeinterface 146 1 0
/*     */     //   518: istore 5
/*     */     //   520: getfield 47	nano/spook1998/rust/utils/crafting/scoreboard/SimpleScoreboard:D	Ljava/util/Map;
/*     */     //   523: invokeinterface 217 1 0
/*     */     //   528: invokeinterface 166 1 0
/*     */     //   533: dup
/*     */     //   534: astore 7
/*     */     //   536: goto +129 -> 665
/*     */     //   539: aload 7
/*     */     //   541: invokeinterface 172 1 0
/*     */     //   546: checkcast 12	java/util/Map$Entry
/*     */     //   549: astore 6
/*     */     //   551: aload_0
/*     */     //   552: aload 6
/*     */     //   554: invokeinterface 220 1 0
/*     */     //   559: checkcast 29	java/lang/String
/*     */     //   562: invokespecial 223	nano/spook1998/rust/utils/crafting/scoreboard/SimpleScoreboard:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/util/Map$Entry;
/*     */     //   565: astore 8
/*     */     //   567: aload 6
/*     */     //   569: invokeinterface 226 1 0
/*     */     //   574: ifnull +19 -> 593
/*     */     //   577: aload 6
/*     */     //   579: invokeinterface 226 1 0
/*     */     //   584: checkcast 59	java/lang/Integer
/*     */     //   587: invokevirtual 152	java/lang/Integer:intValue	()I
/*     */     //   590: goto +5 -> 595
/*     */     //   593: iload 5
/*     */     //   595: invokestatic 149	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   598: astore 9
/*     */     //   600: aload 8
/*     */     //   602: invokeinterface 226 1 0
/*     */     //   607: checkcast 29	java/lang/String
/*     */     //   610: invokestatic 232	org/bukkit/Bukkit:getOfflinePlayer	(Ljava/lang/String;)Lorg/bukkit/OfflinePlayer;
/*     */     //   613: astore 10
/*     */     //   615: aload 8
/*     */     //   617: invokeinterface 220 1 0
/*     */     //   622: ifnull +20 -> 642
/*     */     //   625: aload 8
/*     */     //   627: invokeinterface 220 1 0
/*     */     //   632: checkcast 174	org/bukkit/scoreboard/Team
/*     */     //   635: aload 10
/*     */     //   637: invokeinterface 236 2 0
/*     */     //   642: aload_2
/*     */     //   643: aload 10
/*     */     //   645: invokeinterface 240 2 0
/*     */     //   650: iinc 5 -1
/*     */     //   653: aload 9
/*     */     //   655: invokevirtual 152	java/lang/Integer:intValue	()I
/*     */     //   658: invokeinterface 246 2 0
/*     */     //   663: aload 7
/*     */     //   665: invokeinterface 190 1 0
/*     */     //   670: ifne -131 -> 539
/*     */     //   673: return
/*     */     //   674: aload_1
/*     */     //   675: invokevirtual 152	java/lang/Integer:intValue	()I
/*     */     //   678: aload 4
/*     */     //   680: invokevirtual 152	java/lang/Integer:intValue	()I
/*     */     //   683: if_icmpge +238 -> 921
/*     */     //   686: aload_3
/*     */     //   687: invokeinterface 166 1 0
/*     */     //   692: dup
/*     */     //   693: astore 6
/*     */     //   695: goto +52 -> 747
/*     */     //   698: aload 6
/*     */     //   700: invokeinterface 172 1 0
/*     */     //   705: checkcast 249	org/bukkit/OfflinePlayer
/*     */     //   708: astore 5
/*     */     //   710: aload_0
/*     */     //   711: getfield 63	nano/spook1998/rust/utils/crafting/scoreboard/SimpleScoreboard:M	Lorg/bukkit/scoreboard/Scoreboard;
/*     */     //   714: aload 5
/*     */     //   716: invokeinterface 253 2 0
/*     */     //   721: dup
/*     */     //   722: astore 7
/*     */     //   724: ifnull +10 -> 734
/*     */     //   727: aload 7
/*     */     //   729: invokeinterface 186 1 0
/*     */     //   734: aload_0
/*     */     //   735: getfield 63	nano/spook1998/rust/utils/crafting/scoreboard/SimpleScoreboard:M	Lorg/bukkit/scoreboard/Scoreboard;
/*     */     //   738: aload 5
/*     */     //   740: invokeinterface 256 2 0
/*     */     //   745: aload 6
/*     */     //   747: invokeinterface 190 1 0
/*     */     //   752: ifne -54 -> 698
/*     */     //   755: aload_0
/*     */     //   756: dup
/*     */     //   757: getfield 47	nano/spook1998/rust/utils/crafting/scoreboard/SimpleScoreboard:D	Ljava/util/Map;
/*     */     //   760: invokeinterface 146 1 0
/*     */     //   765: istore 5
/*     */     //   767: getfield 47	nano/spook1998/rust/utils/crafting/scoreboard/SimpleScoreboard:D	Ljava/util/Map;
/*     */     //   770: invokeinterface 217 1 0
/*     */     //   775: invokeinterface 166 1 0
/*     */     //   780: dup
/*     */     //   781: astore 7
/*     */     //   783: goto +129 -> 912
/*     */     //   786: aload 7
/*     */     //   788: invokeinterface 172 1 0
/*     */     //   793: checkcast 12	java/util/Map$Entry
/*     */     //   796: astore 6
/*     */     //   798: aload_0
/*     */     //   799: aload 6
/*     */     //   801: invokeinterface 220 1 0
/*     */     //   806: checkcast 29	java/lang/String
/*     */     //   809: invokespecial 223	nano/spook1998/rust/utils/crafting/scoreboard/SimpleScoreboard:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/util/Map$Entry;
/*     */     //   812: astore 8
/*     */     //   814: aload 6
/*     */     //   816: invokeinterface 226 1 0
/*     */     //   821: ifnull +19 -> 840
/*     */     //   824: aload 6
/*     */     //   826: invokeinterface 226 1 0
/*     */     //   831: checkcast 59	java/lang/Integer
/*     */     //   834: invokevirtual 152	java/lang/Integer:intValue	()I
/*     */     //   837: goto +5 -> 842
/*     */     //   840: iload 5
/*     */     //   842: invokestatic 149	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   845: astore 9
/*     */     //   847: aload 8
/*     */     //   849: invokeinterface 226 1 0
/*     */     //   854: checkcast 29	java/lang/String
/*     */     //   857: invokestatic 232	org/bukkit/Bukkit:getOfflinePlayer	(Ljava/lang/String;)Lorg/bukkit/OfflinePlayer;
/*     */     //   860: astore 10
/*     */     //   862: aload 8
/*     */     //   864: invokeinterface 220 1 0
/*     */     //   869: ifnull +20 -> 889
/*     */     //   872: aload 8
/*     */     //   874: invokeinterface 220 1 0
/*     */     //   879: checkcast 174	org/bukkit/scoreboard/Team
/*     */     //   882: aload 10
/*     */     //   884: invokeinterface 236 2 0
/*     */     //   889: aload_2
/*     */     //   890: aload 10
/*     */     //   892: invokeinterface 240 2 0
/*     */     //   897: iinc 5 -1
/*     */     //   900: aload 9
/*     */     //   902: invokevirtual 152	java/lang/Integer:intValue	()I
/*     */     //   905: invokeinterface 246 2 0
/*     */     //   910: aload 7
/*     */     //   912: invokeinterface 190 1 0
/*     */     //   917: ifne -131 -> 786
/*     */     //   920: return
/*     */     //   921: aload_1
/*     */     //   922: aload 4
/*     */     //   924: if_acmpne +136 -> 1060
/*     */     //   927: aload_3
/*     */     //   928: invokeinterface 166 1 0
/*     */     //   933: dup
/*     */     //   934: astore 6
/*     */     //   936: goto +115 -> 1051
/*     */     //   939: aload 6
/*     */     //   941: invokeinterface 172 1 0
/*     */     //   946: checkcast 249	org/bukkit/OfflinePlayer
/*     */     //   949: astore 5
/*     */     //   951: aload_2
/*     */     //   952: aload 5
/*     */     //   954: invokeinterface 240 2 0
/*     */     //   959: dup
/*     */     //   960: astore 7
/*     */     //   962: dup
/*     */     //   963: invokeinterface 258 1 0
/*     */     //   968: invokestatic 149	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   971: dup
/*     */     //   972: astore 8
/*     */     //   974: invokevirtual 152	java/lang/Integer:intValue	()I
/*     */     //   977: iconst_1
/*     */     //   978: isub
/*     */     //   979: invokestatic 149	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   982: astore 8
/*     */     //   984: invokeinterface 258 1 0
/*     */     //   989: bipush 30
/*     */     //   991: if_icmpge +15 -> 1006
/*     */     //   994: aload 7
/*     */     //   996: aload 8
/*     */     //   998: invokevirtual 152	java/lang/Integer:intValue	()I
/*     */     //   1001: invokeinterface 246 2 0
/*     */     //   1006: aload 8
/*     */     //   1008: invokevirtual 152	java/lang/Integer:intValue	()I
/*     */     //   1011: ifne +38 -> 1049
/*     */     //   1014: aload_0
/*     */     //   1015: getfield 63	nano/spook1998/rust/utils/crafting/scoreboard/SimpleScoreboard:M	Lorg/bukkit/scoreboard/Scoreboard;
/*     */     //   1018: aload 5
/*     */     //   1020: invokeinterface 253 2 0
/*     */     //   1025: dup
/*     */     //   1026: astore 9
/*     */     //   1028: ifnull +10 -> 1038
/*     */     //   1031: aload 9
/*     */     //   1033: invokeinterface 186 1 0
/*     */     //   1038: aload_0
/*     */     //   1039: getfield 63	nano/spook1998/rust/utils/crafting/scoreboard/SimpleScoreboard:M	Lorg/bukkit/scoreboard/Scoreboard;
/*     */     //   1042: aload 5
/*     */     //   1044: invokeinterface 256 2 0
/*     */     //   1049: aload 6
/*     */     //   1051: invokeinterface 190 1 0
/*     */     //   1056: ifne -117 -> 939
/*     */     //   1059: return
/*     */     //   1060: aload 4
/*     */     //   1062: invokevirtual 152	java/lang/Integer:intValue	()I
/*     */     //   1065: ifne +225 -> 1290
/*     */     //   1068: aload_1
/*     */     //   1069: invokevirtual 152	java/lang/Integer:intValue	()I
/*     */     //   1072: ifle +218 -> 1290
/*     */     //   1075: aload_0
/*     */     //   1076: dup
/*     */     //   1077: getfield 47	nano/spook1998/rust/utils/crafting/scoreboard/SimpleScoreboard:D	Ljava/util/Map;
/*     */     //   1080: invokeinterface 146 1 0
/*     */     //   1085: istore 5
/*     */     //   1087: getfield 47	nano/spook1998/rust/utils/crafting/scoreboard/SimpleScoreboard:D	Ljava/util/Map;
/*     */     //   1090: invokeinterface 217 1 0
/*     */     //   1095: invokeinterface 166 1 0
/*     */     //   1100: dup
/*     */     //   1101: astore 7
/*     */     //   1103: goto +129 -> 1232
/*     */     //   1106: aload 7
/*     */     //   1108: invokeinterface 172 1 0
/*     */     //   1113: checkcast 12	java/util/Map$Entry
/*     */     //   1116: astore 6
/*     */     //   1118: aload_0
/*     */     //   1119: aload 6
/*     */     //   1121: invokeinterface 220 1 0
/*     */     //   1126: checkcast 29	java/lang/String
/*     */     //   1129: invokespecial 223	nano/spook1998/rust/utils/crafting/scoreboard/SimpleScoreboard:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/util/Map$Entry;
/*     */     //   1132: astore 8
/*     */     //   1134: aload 6
/*     */     //   1136: invokeinterface 226 1 0
/*     */     //   1141: ifnull +19 -> 1160
/*     */     //   1144: aload 6
/*     */     //   1146: invokeinterface 226 1 0
/*     */     //   1151: checkcast 59	java/lang/Integer
/*     */     //   1154: invokevirtual 152	java/lang/Integer:intValue	()I
/*     */     //   1157: goto +5 -> 1162
/*     */     //   1160: iload 5
/*     */     //   1162: invokestatic 149	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   1165: astore 9
/*     */     //   1167: aload 8
/*     */     //   1169: invokeinterface 226 1 0
/*     */     //   1174: checkcast 29	java/lang/String
/*     */     //   1177: invokestatic 232	org/bukkit/Bukkit:getOfflinePlayer	(Ljava/lang/String;)Lorg/bukkit/OfflinePlayer;
/*     */     //   1180: astore 10
/*     */     //   1182: aload 8
/*     */     //   1184: invokeinterface 220 1 0
/*     */     //   1189: ifnull +20 -> 1209
/*     */     //   1192: aload 8
/*     */     //   1194: invokeinterface 220 1 0
/*     */     //   1199: checkcast 174	org/bukkit/scoreboard/Team
/*     */     //   1202: aload 10
/*     */     //   1204: invokeinterface 236 2 0
/*     */     //   1209: aload_2
/*     */     //   1210: aload 10
/*     */     //   1212: invokeinterface 240 2 0
/*     */     //   1217: iinc 5 -1
/*     */     //   1220: aload 9
/*     */     //   1222: invokevirtual 152	java/lang/Integer:intValue	()I
/*     */     //   1225: invokeinterface 246 2 0
/*     */     //   1230: aload 7
/*     */     //   1232: invokeinterface 190 1 0
/*     */     //   1237: ifne -131 -> 1106
/*     */     //   1240: return
/*     */     //   1241: astore_1
/*     */     //   1242: invokestatic 262	org/bukkit/Bukkit:getConsoleSender	()Lorg/bukkit/command/ConsoleCommandSender;
/*     */     //   1245: new 96	java/lang/StringBuilder
/*     */     //   1248: dup
/*     */     //   1249: invokespecial 264	java/lang/StringBuilder:<init>	()V
/*     */     //   1252: getstatic 270	org/bukkit/ChatColor:RED	Lorg/bukkit/ChatColor;
/*     */     //   1255: invokevirtual 273	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*     */     //   1258: ldc_w 275
/*     */     //   1261: invokestatic 39	nano/spook1998/rust/utils/crafting/scoreboard/SimpleScoreboard:g	(Ljava/lang/String;)Ljava/lang/String;
/*     */     //   1264: invokevirtual 109	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   1267: getstatic 278	org/bukkit/ChatColor:GRAY	Lorg/bukkit/ChatColor;
/*     */     //   1270: invokevirtual 273	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*     */     //   1273: ldc_w 280
/*     */     //   1276: invokestatic 39	nano/spook1998/rust/utils/crafting/scoreboard/SimpleScoreboard:g	(Ljava/lang/String;)Ljava/lang/String;
/*     */     //   1279: invokevirtual 109	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   1282: invokevirtual 126	java/lang/StringBuilder:toString	()Ljava/lang/String;
/*     */     //   1285: invokeinterface 285 2 0
/*     */     //   1290: return
/*     */     // Line number table:
/*     */     //   Java source line #174	-> byte code offset #0
/*     */     //   Java source line #19	-> byte code offset #14
/*     */     //   Java source line #18	-> byte code offset #20
/*     */     //   Java source line #120	-> byte code offset #47
/*     */     //   Java source line #176	-> byte code offset #49
/*     */     //   Java source line #66	-> byte code offset #80
/*     */     //   Java source line #176	-> byte code offset #102
/*     */     //   Java source line #173	-> byte code offset #111
/*     */     //   Java source line #139	-> byte code offset #152
/*     */     //   Java source line #71	-> byte code offset #200
/*     */     //   Java source line #80	-> byte code offset #212
/*     */     //   Java source line #106	-> byte code offset #220
/*     */     //   Java source line #64	-> byte code offset #233
/*     */     //   Java source line #147	-> byte code offset #244
/*     */     //   Java source line #74	-> byte code offset #275
/*     */     //   Java source line #27	-> byte code offset #291
/*     */     //   Java source line #132	-> byte code offset #323
/*     */     //   Java source line #186	-> byte code offset #338
/*     */     //   Java source line #133	-> byte code offset #365
/*     */     //   Java source line #121	-> byte code offset #373
/*     */     //   Java source line #147	-> byte code offset #386
/*     */     //   Java source line #192	-> byte code offset #396
/*     */     //   Java source line #28	-> byte code offset #397
/*     */     //   Java source line #94	-> byte code offset #410
/*     */     //   Java source line #157	-> byte code offset #421
/*     */     //   Java source line #50	-> byte code offset #427
/*     */     //   Java source line #124	-> byte code offset #439
/*     */     //   Java source line #140	-> byte code offset #463
/*     */     //   Java source line #85	-> byte code offset #477
/*     */     //   Java source line #14	-> byte code offset #487
/*     */     //   Java source line #124	-> byte code offset #498
/*     */     //   Java source line #125	-> byte code offset #508
/*     */     //   Java source line #122	-> byte code offset #520
/*     */     //   Java source line #108	-> byte code offset #551
/*     */     //   Java source line #137	-> byte code offset #567
/*     */     //   Java source line #165	-> byte code offset #600
/*     */     //   Java source line #4	-> byte code offset #615
/*     */     //   Java source line #154	-> byte code offset #642
/*     */     //   Java source line #87	-> byte code offset #650
/*     */     //   Java source line #122	-> byte code offset #663
/*     */     //   Java source line #179	-> byte code offset #673
/*     */     //   Java source line #43	-> byte code offset #674
/*     */     //   Java source line #148	-> byte code offset #686
/*     */     //   Java source line #116	-> byte code offset #710
/*     */     //   Java source line #15	-> byte code offset #724
/*     */     //   Java source line #181	-> byte code offset #734
/*     */     //   Java source line #148	-> byte code offset #745
/*     */     //   Java source line #196	-> byte code offset #755
/*     */     //   Java source line #159	-> byte code offset #767
/*     */     //   Java source line #128	-> byte code offset #798
/*     */     //   Java source line #191	-> byte code offset #814
/*     */     //   Java source line #197	-> byte code offset #847
/*     */     //   Java source line #126	-> byte code offset #862
/*     */     //   Java source line #6	-> byte code offset #889
/*     */     //   Java source line #53	-> byte code offset #897
/*     */     //   Java source line #159	-> byte code offset #910
/*     */     //   Java source line #17	-> byte code offset #920
/*     */     //   Java source line #149	-> byte code offset #921
/*     */     //   Java source line #63	-> byte code offset #927
/*     */     //   Java source line #131	-> byte code offset #951
/*     */     //   Java source line #136	-> byte code offset #962
/*     */     //   Java source line #183	-> byte code offset #974
/*     */     //   Java source line #143	-> byte code offset #984
/*     */     //   Java source line #33	-> byte code offset #994
/*     */     //   Java source line #84	-> byte code offset #1006
/*     */     //   Java source line #44	-> byte code offset #1014
/*     */     //   Java source line #52	-> byte code offset #1028
/*     */     //   Java source line #114	-> byte code offset #1038
/*     */     //   Java source line #63	-> byte code offset #1049
/*     */     //   Java source line #198	-> byte code offset #1059
/*     */     //   Java source line #103	-> byte code offset #1060
/*     */     //   Java source line #115	-> byte code offset #1075
/*     */     //   Java source line #178	-> byte code offset #1087
/*     */     //   Java source line #65	-> byte code offset #1118
/*     */     //   Java source line #83	-> byte code offset #1134
/*     */     //   Java source line #79	-> byte code offset #1167
/*     */     //   Java source line #40	-> byte code offset #1182
/*     */     //   Java source line #188	-> byte code offset #1209
/*     */     //   Java source line #61	-> byte code offset #1217
/*     */     //   Java source line #178	-> byte code offset #1230
/*     */     //   Java source line #127	-> byte code offset #1240
/*     */     //   Java source line #69	-> byte code offset #1241
/*     */     //   Java source line #118	-> byte code offset #1242
/*     */     //   Java source line #340	-> byte code offset #1290
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	1291	0	a	SimpleScoreboard
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   0	47	1241	java/util/ConcurrentModificationException
/*     */     //   49	68	1241	java/util/ConcurrentModificationException
/*     */     //   69	396	1241	java/util/ConcurrentModificationException
/*     */     //   397	673	1241	java/util/ConcurrentModificationException
/*     */     //   674	920	1241	java/util/ConcurrentModificationException
/*     */     //   921	1059	1241	java/util/ConcurrentModificationException
/*     */     //   1060	1240	1241	java/util/ConcurrentModificationException
/*     */   }
/*     */ }


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\utils\crafting\scoreboard\SimpleScoreboard.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */