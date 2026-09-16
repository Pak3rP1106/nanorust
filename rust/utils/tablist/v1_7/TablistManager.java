/*     */ package nano.spook1998.rust.utils.tablist.v1_7;
/*     */ 
/*     */ import java.util.Iterator;
/*     */ import nano.spook1998.rust.object.User;
/*     */ import nano.spook1998.rust.object.utils.UserUtil;
/*     */ import org.bukkit.ChatColor;
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
/*     */ public class TablistManager
/*     */ {
/*     */   public static void scheme(String[] a)
/*     */   {
/*  71 */     String[] arrayOfString = (String[])a.clone();
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */     int i;
/*     */     
/*     */ 
/*     */ 
/*  80 */     for (goto 36; i < arrayOfString.length;)
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
/* 106 */       if (arrayOfString[i] != null)
/*     */       {
/*  64 */         String[] tmp25_24 = arrayOfString;tmp25_24[i] = ChatColor.translateAlternateColorCodes('&', tmp25_24[i]);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  80 */       i++;
/*     */     }
/*  27 */     b = arrayOfString;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   static
/*     */   {
/*  38 */     int tmp6_5 = 1;tmp6_5; } private static String[] b = tmp6_5;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private static int ALLATORIxDEMO;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static void updatePlayers()
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
/*  78 */     for (goto 38; localIterator.hasNext();)
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
/*  93 */       UserUtil.get(((Player)localIterator.next()).getName()).getTablist().send();
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
/*     */   public static String[] scheme()
/*     */   {
/* 121 */     return b;
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public static void send(Player a)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokeinterface 21 1 0
/*     */     //   6: invokestatic 27	nano/spook1998/rust/object/utils/UserUtil:get	(Ljava/lang/String;)Lnano/spook1998/rust/object/User;
/*     */     //   9: dup
/*     */     //   10: astore_1
/*     */     //   11: invokevirtual 33	nano/spook1998/rust/object/User:getTablist	()Lnano/spook1998/rust/utils/tablist/v1_7/Tablist;
/*     */     //   14: dup
/*     */     //   15: astore_2
/*     */     //   16: ifnonnull +12 -> 28
/*     */     //   19: new 35	nano/spook1998/rust/utils/tablist/v1_7/Tablist
/*     */     //   22: dup
/*     */     //   23: aload_1
/*     */     //   24: invokespecial 39	nano/spook1998/rust/utils/tablist/v1_7/Tablist:<init>	(Lnano/spook1998/rust/object/User;)V
/*     */     //   27: astore_2
/*     */     //   28: aload_0
/*     */     //   29: invokeinterface 43 1 0
/*     */     //   34: astore_1
/*     */     //   35: aload_2
/*     */     //   36: dup
/*     */     //   37: invokevirtual 46	nano/spook1998/rust/utils/tablist/v1_7/Tablist:getPrefix	()[Ljava/lang/String;
/*     */     //   40: astore_3
/*     */     //   41: invokevirtual 49	nano/spook1998/rust/utils/tablist/v1_7/Tablist:getSuffix	()[Ljava/lang/String;
/*     */     //   44: astore 4
/*     */     //   46: iconst_0
/*     */     //   47: dup
/*     */     //   48: istore 5
/*     */     //   50: goto +121 -> 171
/*     */     //   53: athrow
/*     */     //   54: getstatic 13	nano/spook1998/rust/utils/tablist/v1_7/TablistManager:b	[Ljava/lang/String;
/*     */     //   57: iload 5
/*     */     //   59: aaload
/*     */     //   60: ifnonnull +9 -> 69
/*     */     //   63: invokestatic 54	nano/spook1998/rust/utils/tablist/v1_7/TablistSchemats:uniqueFields	()[Ljava/lang/String;
/*     */     //   66: putstatic 13	nano/spook1998/rust/utils/tablist/v1_7/TablistManager:b	[Ljava/lang/String;
/*     */     //   69: getstatic 13	nano/spook1998/rust/utils/tablist/v1_7/TablistManager:b	[Ljava/lang/String;
/*     */     //   72: iload 5
/*     */     //   74: aaload
/*     */     //   75: dup
/*     */     //   76: astore 6
/*     */     //   78: ifnonnull +7 -> 85
/*     */     //   81: goto +85 -> 166
/*     */     //   84: athrow
/*     */     //   85: aload_1
/*     */     //   86: aload 6
/*     */     //   88: invokeinterface 60 2 0
/*     */     //   93: dup
/*     */     //   94: astore 7
/*     */     //   96: ifnonnull +32 -> 128
/*     */     //   99: aload_1
/*     */     //   100: aload 6
/*     */     //   102: invokeinterface 63 2 0
/*     */     //   107: astore 7
/*     */     //   109: new 65	nano/spook1998/rust/object/OfflineUser
/*     */     //   112: aload 7
/*     */     //   114: dup_x1
/*     */     //   115: dup
/*     */     //   116: pop2
/*     */     //   117: dup
/*     */     //   118: aload 6
/*     */     //   120: invokespecial 68	nano/spook1998/rust/object/OfflineUser:<init>	(Ljava/lang/String;)V
/*     */     //   123: invokeinterface 74 2 0
/*     */     //   128: aload_3
/*     */     //   129: iload 5
/*     */     //   131: aaload
/*     */     //   132: ifnull +14 -> 146
/*     */     //   135: aload 7
/*     */     //   137: aload_3
/*     */     //   138: iload 5
/*     */     //   140: aaload
/*     */     //   141: invokeinterface 77 2 0
/*     */     //   146: aload 4
/*     */     //   148: iload 5
/*     */     //   150: aaload
/*     */     //   151: ifnull +15 -> 166
/*     */     //   154: aload 7
/*     */     //   156: aload 4
/*     */     //   158: iload 5
/*     */     //   160: aaload
/*     */     //   161: invokeinterface 80 2 0
/*     */     //   166: iinc 5 1
/*     */     //   169: iload 5
/*     */     //   171: bipush 60
/*     */     //   173: if_icmplt -119 -> 54
/*     */     //   176: aload_2
/*     */     //   177: invokevirtual 84	nano/spook1998/rust/utils/tablist/v1_7/Tablist:getInit	()Z
/*     */     //   180: ifne +98 -> 278
/*     */     //   183: new 86	nano/spook1998/rust/utils/PlayerUtil
/*     */     //   186: dup
/*     */     //   187: invokespecial 89	nano/spook1998/rust/utils/PlayerUtil:<init>	()V
/*     */     //   190: invokevirtual 93	nano/spook1998/rust/utils/PlayerUtil:getOnlinePlayers	()Ljava/util/List;
/*     */     //   193: dup
/*     */     //   194: astore 5
/*     */     //   196: invokeinterface 99 1 0
/*     */     //   201: anewarray 101	java/lang/String
/*     */     //   204: iconst_1
/*     */     //   205: dup
/*     */     //   206: pop2
/*     */     //   207: astore 6
/*     */     //   209: iconst_0
/*     */     //   210: dup
/*     */     //   211: istore 7
/*     */     //   213: goto +29 -> 242
/*     */     //   216: aload 6
/*     */     //   218: aload 5
/*     */     //   220: iload 7
/*     */     //   222: dup_x1
/*     */     //   223: invokeinterface 104 2 0
/*     */     //   228: checkcast 17	org/bukkit/entity/Player
/*     */     //   231: invokeinterface 107 1 0
/*     */     //   236: iinc 7 1
/*     */     //   239: aastore
/*     */     //   240: iload 7
/*     */     //   242: aload 5
/*     */     //   244: invokeinterface 99 1 0
/*     */     //   249: if_icmplt -33 -> 216
/*     */     //   252: aload_0
/*     */     //   253: dup
/*     */     //   254: aload_2
/*     */     //   255: iconst_1
/*     */     //   256: invokevirtual 111	nano/spook1998/rust/utils/tablist/v1_7/Tablist:init	(Z)V
/*     */     //   259: aload 6
/*     */     //   261: iconst_0
/*     */     //   262: invokestatic 114	nano/spook1998/rust/utils/tablist/v1_7/TablistManager:ALLATORIxDEMO	([Ljava/lang/String;Z)[Ljava/lang/Object;
/*     */     //   265: invokestatic 120	nano/spook1998/rust/utils/tablist/v1_7/reflection/PacketSender:sendPacket	(Lorg/bukkit/entity/Player;[Ljava/lang/Object;)V
/*     */     //   268: getstatic 13	nano/spook1998/rust/utils/tablist/v1_7/TablistManager:b	[Ljava/lang/String;
/*     */     //   271: iconst_1
/*     */     //   272: invokestatic 114	nano/spook1998/rust/utils/tablist/v1_7/TablistManager:ALLATORIxDEMO	([Ljava/lang/String;Z)[Ljava/lang/Object;
/*     */     //   275: invokestatic 120	nano/spook1998/rust/utils/tablist/v1_7/reflection/PacketSender:sendPacket	(Lorg/bukkit/entity/Player;[Ljava/lang/Object;)V
/*     */     //   278: return
/*     */     // Line number table:
/*     */     //   Java source line #32	-> byte code offset #0
/*     */     //   Java source line #13	-> byte code offset #11
/*     */     //   Java source line #155	-> byte code offset #16
/*     */     //   Java source line #162	-> byte code offset #19
/*     */     //   Java source line #182	-> byte code offset #35
/*     */     //   Java source line #77	-> byte code offset #41
/*     */     //   Java source line #104	-> byte code offset #46
/*     */     //   Java source line #47	-> byte code offset #54
/*     */     //   Java source line #113	-> byte code offset #63
/*     */     //   Java source line #68	-> byte code offset #69
/*     */     //   Java source line #141	-> byte code offset #78
/*     */     //   Java source line #180	-> byte code offset #81
/*     */     //   Java source line #24	-> byte code offset #85
/*     */     //   Java source line #194	-> byte code offset #96
/*     */     //   Java source line #142	-> byte code offset #99
/*     */     //   Java source line #3	-> byte code offset #109
/*     */     //   Java source line #89	-> byte code offset #128
/*     */     //   Java source line #72	-> byte code offset #135
/*     */     //   Java source line #86	-> byte code offset #146
/*     */     //   Java source line #29	-> byte code offset #154
/*     */     //   Java source line #104	-> byte code offset #166
/*     */     //   Java source line #60	-> byte code offset #176
/*     */     //   Java source line #129	-> byte code offset #183
/*     */     //   Java source line #21	-> byte code offset #196
/*     */     //   Java source line #175	-> byte code offset #209
/*     */     //   Java source line #112	-> byte code offset #216
/*     */     //   Java source line #175	-> byte code offset #240
/*     */     //   Java source line #158	-> byte code offset #254
/*     */     //   Java source line #138	-> byte code offset #259
/*     */     //   Java source line #91	-> byte code offset #268
/*     */     //   Java source line #59	-> byte code offset #278
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	279	0	a	Player
/*     */   }
/*     */ }


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\utils\tablist\v1_7\TablistManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */