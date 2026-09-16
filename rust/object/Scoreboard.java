/*     */ package nano.spook1998.rust.object;
/*     */ 
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import org.bukkit.Bukkit;
/*     */ import org.bukkit.entity.Player;
/*     */ import org.bukkit.scoreboard.DisplaySlot;
/*     */ import org.bukkit.scoreboard.Score;
/*     */ import org.bukkit.scoreboard.ScoreboardManager;
/*     */ import org.bukkit.scoreboard.Team;
/*     */ 
/*     */ public class Scoreboard
/*     */ {
/*     */   private org.bukkit.scoreboard.Scoreboard D;
/*     */   private Player M;
/*     */   private Map<Score, Integer> b;
/*     */   private List<Team> ALLATORIxDEMO;
/*     */   
/*     */   /* Error */
/*     */   public Scoreboard(Player a)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: aload_0
/*     */     //   2: invokespecial 30	java/lang/Object:<init>	()V
/*     */     //   5: invokeinterface 36 1 0
/*     */     //   10: ifnonnull +20 -> 30
/*     */     //   13: aload_0
/*     */     //   14: dup
/*     */     //   15: invokestatic 42	org/bukkit/Bukkit:getScoreboardManager	()Lorg/bukkit/scoreboard/ScoreboardManager;
/*     */     //   18: invokeinterface 47 1 0
/*     */     //   23: putfield 49	nano/spook1998/rust/object/Scoreboard:D	Lorg/bukkit/scoreboard/Scoreboard;
/*     */     //   26: goto +15 -> 41
/*     */     //   29: athrow
/*     */     //   30: aload_0
/*     */     //   31: dup
/*     */     //   32: aload_1
/*     */     //   33: invokeinterface 36 1 0
/*     */     //   38: putfield 49	nano/spook1998/rust/object/Scoreboard:D	Lorg/bukkit/scoreboard/Scoreboard;
/*     */     //   41: aload_1
/*     */     //   42: putfield 51	nano/spook1998/rust/object/Scoreboard:M	Lorg/bukkit/entity/Player;
/*     */     //   45: aload_1
/*     */     //   46: new 53	java/util/ArrayList
/*     */     //   49: aload_0
/*     */     //   50: dup_x1
/*     */     //   51: dup_x2
/*     */     //   52: dup
/*     */     //   53: pop2
/*     */     //   54: dup
/*     */     //   55: invokespecial 54	java/util/ArrayList:<init>	()V
/*     */     //   58: putfield 56	nano/spook1998/rust/object/Scoreboard:ALLATORIxDEMO	Ljava/util/List;
/*     */     //   61: new 58	java/util/HashMap
/*     */     //   64: dup
/*     */     //   65: invokespecial 59	java/util/HashMap:<init>	()V
/*     */     //   68: putfield 61	nano/spook1998/rust/object/Scoreboard:b	Ljava/util/Map;
/*     */     //   71: invokeinterface 65 1 0
/*     */     //   76: invokestatic 71	nano/spook1998/rust/object/utils/UserUtil:get	(Ljava/lang/String;)Lnano/spook1998/rust/object/User;
/*     */     //   79: aload_0
/*     */     //   80: invokevirtual 77	nano/spook1998/rust/object/User:setScoreboard	(Lnano/spook1998/rust/object/Scoreboard;)V
/*     */     //   83: return
/*     */     // Line number table:
/*     */     //   Java source line #155	-> byte code offset #1
/*     */     //   Java source line #162	-> byte code offset #5
/*     */     //   Java source line #77	-> byte code offset #41
/*     */     //   Java source line #104	-> byte code offset #46
/*     */     //   Java source line #47	-> byte code offset #61
/*     */     //   Java source line #113	-> byte code offset #71
/*     */     //   Java source line #110	-> byte code offset #83
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	84	0	a	Scoreboard
/*     */     //   0	84	1	a	Player
/*     */   }
/*     */   
/*     */   public void destroy()
/*     */   {
/* 154 */     org.bukkit.scoreboard.Scoreboard localScoreboard = Bukkit.getScoreboardManager().getNewScoreboard();localScoreboard.clearSlot(DisplaySlot.SIDEBAR);a.M.setScoreboard(localScoreboard);
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public void setScores(Map<String, Integer> a)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ifnonnull +9 -> 10
/*     */     //   4: aload_0
/*     */     //   5: invokevirtual 180	nano/spook1998/rust/object/Scoreboard:destroy	()V
/*     */     //   8: return
/*     */     //   9: athrow
/*     */     //   10: aload_0
/*     */     //   11: getfield 49	nano/spook1998/rust/object/Scoreboard:D	Lorg/bukkit/scoreboard/Scoreboard;
/*     */     //   14: getstatic 88	org/bukkit/scoreboard/DisplaySlot:SIDEBAR	Lorg/bukkit/scoreboard/DisplaySlot;
/*     */     //   17: invokeinterface 184 2 0
/*     */     //   22: dup
/*     */     //   23: astore_2
/*     */     //   24: ifnonnull +23 -> 47
/*     */     //   27: aload_0
/*     */     //   28: getfield 49	nano/spook1998/rust/object/Scoreboard:D	Lorg/bukkit/scoreboard/Scoreboard;
/*     */     //   31: ldc -70
/*     */     //   33: invokestatic 116	nano/spook1998/rust/object/Scoreboard:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
/*     */     //   36: ldc -68
/*     */     //   38: invokestatic 116	nano/spook1998/rust/object/Scoreboard:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
/*     */     //   41: invokeinterface 192 3 0
/*     */     //   46: astore_2
/*     */     //   47: aload_2
/*     */     //   48: dup
/*     */     //   49: getstatic 197	nano/spook1998/rust/data/Settings:SCOREBOARD_TITLE	Ljava/lang/String;
/*     */     //   52: invokeinterface 202 2 0
/*     */     //   57: getstatic 88	org/bukkit/scoreboard/DisplaySlot:SIDEBAR	Lorg/bukkit/scoreboard/DisplaySlot;
/*     */     //   60: invokeinterface 205 2 0
/*     */     //   65: aload_1
/*     */     //   66: invokeinterface 208 1 0
/*     */     //   71: invokeinterface 209 1 0
/*     */     //   76: dup
/*     */     //   77: astore_3
/*     */     //   78: goto +151 -> 229
/*     */     //   81: athrow
/*     */     //   82: aload_3
/*     */     //   83: invokeinterface 161 1 0
/*     */     //   88: checkcast 12	java/util/Map$Entry
/*     */     //   91: astore_1
/*     */     //   92: aload_0
/*     */     //   93: aload_1
/*     */     //   94: invokeinterface 212 1 0
/*     */     //   99: checkcast 102	java/lang/String
/*     */     //   102: invokespecial 214	nano/spook1998/rust/object/Scoreboard:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/util/Map$Entry;
/*     */     //   105: dup
/*     */     //   106: astore 4
/*     */     //   108: invokeinterface 217 1 0
/*     */     //   113: checkcast 102	java/lang/String
/*     */     //   116: invokestatic 221	org/bukkit/Bukkit:getOfflinePlayer	(Ljava/lang/String;)Lorg/bukkit/OfflinePlayer;
/*     */     //   119: astore 5
/*     */     //   121: aload 4
/*     */     //   123: invokeinterface 212 1 0
/*     */     //   128: ifnull +20 -> 148
/*     */     //   131: aload 4
/*     */     //   133: invokeinterface 212 1 0
/*     */     //   138: checkcast 163	org/bukkit/scoreboard/Team
/*     */     //   141: aload 5
/*     */     //   143: invokeinterface 225 2 0
/*     */     //   148: aload_1
/*     */     //   149: invokeinterface 217 1 0
/*     */     //   154: checkcast 227	java/lang/Integer
/*     */     //   157: invokevirtual 230	java/lang/Integer:intValue	()I
/*     */     //   160: iconst_1
/*     */     //   161: if_icmpne +18 -> 179
/*     */     //   164: aload_3
/*     */     //   165: aload_0
/*     */     //   166: getfield 49	nano/spook1998/rust/object/Scoreboard:D	Lorg/bukkit/scoreboard/Scoreboard;
/*     */     //   169: aload 5
/*     */     //   171: invokeinterface 233 2 0
/*     */     //   176: goto +53 -> 229
/*     */     //   179: aload_2
/*     */     //   180: aload 5
/*     */     //   182: invokeinterface 237 2 0
/*     */     //   187: dup
/*     */     //   188: astore 4
/*     */     //   190: aload_1
/*     */     //   191: invokeinterface 217 1 0
/*     */     //   196: checkcast 227	java/lang/Integer
/*     */     //   199: invokevirtual 230	java/lang/Integer:intValue	()I
/*     */     //   202: invokeinterface 243 2 0
/*     */     //   207: aload_0
/*     */     //   208: getfield 61	nano/spook1998/rust/object/Scoreboard:b	Ljava/util/Map;
/*     */     //   211: aload 4
/*     */     //   213: aload_1
/*     */     //   214: invokeinterface 217 1 0
/*     */     //   219: checkcast 227	java/lang/Integer
/*     */     //   222: invokeinterface 247 3 0
/*     */     //   227: pop
/*     */     //   228: aload_3
/*     */     //   229: invokeinterface 251 1 0
/*     */     //   234: ifne -152 -> 82
/*     */     //   237: aload_0
/*     */     //   238: invokespecial 253	nano/spook1998/rust/object/Scoreboard:ALLATORIxDEMO	()V
/*     */     //   241: return
/*     */     // Line number table:
/*     */     //   Java source line #180	-> byte code offset #0
/*     */     //   Java source line #56	-> byte code offset #4
/*     */     //   Java source line #24	-> byte code offset #8
/*     */     //   Java source line #142	-> byte code offset #10
/*     */     //   Java source line #3	-> byte code offset #24
/*     */     //   Java source line #160	-> byte code offset #27
/*     */     //   Java source line #72	-> byte code offset #47
/*     */     //   Java source line #5	-> byte code offset #57
/*     */     //   Java source line #86	-> byte code offset #65
/*     */     //   Java source line #29	-> byte code offset #92
/*     */     //   Java source line #163	-> byte code offset #108
/*     */     //   Java source line #193	-> byte code offset #121
/*     */     //   Java source line #60	-> byte code offset #148
/*     */     //   Java source line #129	-> byte code offset #165
/*     */     //   Java source line #21	-> byte code offset #176
/*     */     //   Java source line #175	-> byte code offset #179
/*     */     //   Java source line #112	-> byte code offset #190
/*     */     //   Java source line #70	-> byte code offset #207
/*     */     //   Java source line #86	-> byte code offset #228
/*     */     //   Java source line #91	-> byte code offset #237
/*     */     //   Java source line #39	-> byte code offset #241
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	242	0	a	Scoreboard
/*     */     //   0	242	1	a	Map
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public void updateScores(Map<String, Integer> a)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ifnonnull +9 -> 10
/*     */     //   4: aload_0
/*     */     //   5: invokevirtual 180	nano/spook1998/rust/object/Scoreboard:destroy	()V
/*     */     //   8: return
/*     */     //   9: athrow
/*     */     //   10: aload_0
/*     */     //   11: dup
/*     */     //   12: getfield 49	nano/spook1998/rust/object/Scoreboard:D	Lorg/bukkit/scoreboard/Scoreboard;
/*     */     //   15: getstatic 88	org/bukkit/scoreboard/DisplaySlot:SIDEBAR	Lorg/bukkit/scoreboard/DisplaySlot;
/*     */     //   18: invokeinterface 184 2 0
/*     */     //   23: astore_2
/*     */     //   24: getfield 61	nano/spook1998/rust/object/Scoreboard:b	Ljava/util/Map;
/*     */     //   27: invokeinterface 208 1 0
/*     */     //   32: invokeinterface 209 1 0
/*     */     //   37: dup
/*     */     //   38: astore 4
/*     */     //   40: goto +208 -> 248
/*     */     //   43: athrow
/*     */     //   44: aload 4
/*     */     //   46: invokeinterface 161 1 0
/*     */     //   51: checkcast 12	java/util/Map$Entry
/*     */     //   54: dup
/*     */     //   55: astore_3
/*     */     //   56: invokeinterface 212 1 0
/*     */     //   61: checkcast 239	org/bukkit/scoreboard/Score
/*     */     //   64: dup
/*     */     //   65: astore 5
/*     */     //   67: invokeinterface 259 1 0
/*     */     //   72: astore 6
/*     */     //   74: new 111	java/lang/StringBuilder
/*     */     //   77: dup
/*     */     //   78: invokespecial 260	java/lang/StringBuilder:<init>	()V
/*     */     //   81: iconst_0
/*     */     //   82: aload 6
/*     */     //   84: invokevirtual 264	java/lang/StringBuilder:insert	(ILjava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   87: invokevirtual 135	java/lang/StringBuilder:toString	()Ljava/lang/String;
/*     */     //   90: invokestatic 268	org/bukkit/Bukkit:broadcastMessage	(Ljava/lang/String;)I
/*     */     //   93: pop
/*     */     //   94: aload_1
/*     */     //   95: aload 5
/*     */     //   97: invokeinterface 259 1 0
/*     */     //   102: invokeinterface 271 2 0
/*     */     //   107: ifeq +139 -> 246
/*     */     //   110: ldc_w 273
/*     */     //   113: invokestatic 116	nano/spook1998/rust/object/Scoreboard:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/lang/String;
/*     */     //   116: invokestatic 268	org/bukkit/Bukkit:broadcastMessage	(Ljava/lang/String;)I
/*     */     //   119: aload_0
/*     */     //   120: getfield 61	nano/spook1998/rust/object/Scoreboard:b	Ljava/util/Map;
/*     */     //   123: aload 5
/*     */     //   125: invokeinterface 277 2 0
/*     */     //   130: aload 6
/*     */     //   132: aload_0
/*     */     //   133: dup_x1
/*     */     //   134: getfield 51	nano/spook1998/rust/object/Scoreboard:M	Lorg/bukkit/entity/Player;
/*     */     //   137: invokeinterface 36 1 0
/*     */     //   142: aload 6
/*     */     //   144: invokeinterface 279 2 0
/*     */     //   149: invokespecial 214	nano/spook1998/rust/object/Scoreboard:ALLATORIxDEMO	(Ljava/lang/String;)Ljava/util/Map$Entry;
/*     */     //   152: astore 5
/*     */     //   154: pop2
/*     */     //   155: aload 5
/*     */     //   157: invokeinterface 217 1 0
/*     */     //   162: checkcast 102	java/lang/String
/*     */     //   165: invokestatic 221	org/bukkit/Bukkit:getOfflinePlayer	(Ljava/lang/String;)Lorg/bukkit/OfflinePlayer;
/*     */     //   168: astore 6
/*     */     //   170: aload 5
/*     */     //   172: invokeinterface 212 1 0
/*     */     //   177: ifnull +20 -> 197
/*     */     //   180: aload 5
/*     */     //   182: invokeinterface 212 1 0
/*     */     //   187: checkcast 163	org/bukkit/scoreboard/Team
/*     */     //   190: aload 6
/*     */     //   192: invokeinterface 225 2 0
/*     */     //   197: aload_2
/*     */     //   198: aload 6
/*     */     //   200: invokeinterface 237 2 0
/*     */     //   205: dup
/*     */     //   206: astore 5
/*     */     //   208: aload_3
/*     */     //   209: invokeinterface 217 1 0
/*     */     //   214: checkcast 227	java/lang/Integer
/*     */     //   217: invokevirtual 230	java/lang/Integer:intValue	()I
/*     */     //   220: invokeinterface 243 2 0
/*     */     //   225: aload_0
/*     */     //   226: getfield 61	nano/spook1998/rust/object/Scoreboard:b	Ljava/util/Map;
/*     */     //   229: aload 5
/*     */     //   231: aload_3
/*     */     //   232: invokeinterface 217 1 0
/*     */     //   237: checkcast 227	java/lang/Integer
/*     */     //   240: invokeinterface 247 3 0
/*     */     //   245: pop
/*     */     //   246: aload 4
/*     */     //   248: invokeinterface 251 1 0
/*     */     //   253: ifne -209 -> 44
/*     */     //   256: aload_0
/*     */     //   257: invokespecial 253	nano/spook1998/rust/object/Scoreboard:ALLATORIxDEMO	()V
/*     */     //   260: return
/*     */     // Line number table:
/*     */     //   Java source line #19	-> byte code offset #0
/*     */     //   Java source line #18	-> byte code offset #4
/*     */     //   Java source line #120	-> byte code offset #8
/*     */     //   Java source line #176	-> byte code offset #10
/*     */     //   Java source line #66	-> byte code offset #24
/*     */     //   Java source line #20	-> byte code offset #56
/*     */     //   Java source line #173	-> byte code offset #67
/*     */     //   Java source line #139	-> byte code offset #74
/*     */     //   Java source line #71	-> byte code offset #94
/*     */     //   Java source line #80	-> byte code offset #110
/*     */     //   Java source line #106	-> byte code offset #119
/*     */     //   Java source line #64	-> byte code offset #130
/*     */     //   Java source line #147	-> byte code offset #149
/*     */     //   Java source line #74	-> byte code offset #155
/*     */     //   Java source line #27	-> byte code offset #170
/*     */     //   Java source line #132	-> byte code offset #197
/*     */     //   Java source line #186	-> byte code offset #208
/*     */     //   Java source line #133	-> byte code offset #225
/*     */     //   Java source line #66	-> byte code offset #246
/*     */     //   Java source line #192	-> byte code offset #256
/*     */     //   Java source line #99	-> byte code offset #260
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	261	0	a	Scoreboard
/*     */     //   0	261	1	a	Map
/*     */   }
/*     */   
/*     */   public static String ALLATORIxDEMO(String a)
/*     */   {
/*     */     int tmp12_11 = 5;
/*     */     int tmp19_16 = a.length();
/*     */     int tmp23_22 = 1;
/*     */     tmp23_22;
/*     */     int j;
/*     */     int ? = tmp23_22;
/*     */     int k = tmp19_16;
/*     */     int tmp33_29 = (j = new char[tmp19_16] - 1);
/*     */     tmp33_29;
/*     */     int i = (0x3 ^ 0x5) << 3 ^ 0x3 ^ tmp12_11;
/*     */     tmp12_11;
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
/*     */ }


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\object\Scoreboard.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */