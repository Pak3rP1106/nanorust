/*     */ package nano.spook1998.rust.structural;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import org.bukkit.Location;
/*     */ import org.bukkit.block.Block;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Roof
/*     */ {
/*     */   private Boolean F;
/*     */   private List<Block> g;
/*     */   private Location f;
/*     */   private List<Block> D;
/*     */   private Boolean M;
/*     */   private List<Block> b;
/*     */   private List<Block> ALLATORIxDEMO;
/*     */   
/*     */   public Roof(Location a)
/*     */   {
/*  92 */     
/*     */     
/*     */ 
/*     */ 
/*  96 */       a.f = a;a;a.<init>();new java/util/ArrayList.g = a;a.ALLATORIxDEMO = new ArrayList();
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 155 */     a.D = new ArrayList();
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 162 */     a.b = new ArrayList();1.F = Boolean.valueOf(a);1.M = Boolean.valueOf(a);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public Boolean isBuild()
/*     */   {
/* 104 */     return a.F;
/*     */   }
/*     */   
/*     */ 
/*     */   public List<Block> getFakeSpawn()
/*     */   {
/* 110 */     return a.D;
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
/*     */   public List<Block> getListBlock3()
/*     */   {
/* 160 */     return a.b;
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
/*     */   public List<Block> getListBlock1()
/*     */   {
/* 180 */     return a.ALLATORIxDEMO;
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
/*     */   public List<Block> getListBlock2()
/*     */   {
/* 194 */     return a.g;
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public void calculate(nano.spook1998.rust.object.User a)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: invokevirtual 57	nano/spook1998/rust/object/User:getName	()Ljava/lang/String;
/*     */     //   4: invokestatic 63	org/bukkit/Bukkit:getPlayer	(Ljava/lang/String;)Lorg/bukkit/entity/Player;
/*     */     //   7: dup
/*     */     //   8: astore_2
/*     */     //   9: invokeinterface 69 1 0
/*     */     //   14: invokevirtual 75	org/bukkit/Location:getBlock	()Lorg/bukkit/block/Block;
/*     */     //   17: getstatic 81	org/bukkit/block/BlockFace:DOWN	Lorg/bukkit/block/BlockFace;
/*     */     //   20: invokeinterface 87 2 0
/*     */     //   25: astore_3
/*     */     //   26: iconst_0
/*     */     //   27: invokestatic 90	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   30: astore_3
/*     */     //   31: iconst_0
/*     */     //   32: invokestatic 90	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   35: astore 4
/*     */     //   37: iconst_2
/*     */     //   38: invokestatic 90	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   41: astore 5
/*     */     //   43: iconst_2
/*     */     //   44: invokestatic 90	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   47: astore 6
/*     */     //   49: iconst_0
/*     */     //   50: invokestatic 90	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   53: astore 7
/*     */     //   55: aload_0
/*     */     //   56: getfield 92	nano/spook1998/rust/structural/Roof:f	Lorg/bukkit/Location;
/*     */     //   59: invokevirtual 96	org/bukkit/Location:getX	()D
/*     */     //   62: dconst_0
/*     */     //   63: dcmpg
/*     */     //   64: ifge +15 -> 79
/*     */     //   67: aload 5
/*     */     //   69: invokevirtual 46	java/lang/Integer:intValue	()I
/*     */     //   72: iconst_1
/*     */     //   73: iadd
/*     */     //   74: invokestatic 90	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   77: astore 5
/*     */     //   79: aload_0
/*     */     //   80: getfield 92	nano/spook1998/rust/structural/Roof:f	Lorg/bukkit/Location;
/*     */     //   83: invokevirtual 99	org/bukkit/Location:getZ	()D
/*     */     //   86: dconst_0
/*     */     //   87: dcmpg
/*     */     //   88: ifge +15 -> 103
/*     */     //   91: aload 6
/*     */     //   93: invokevirtual 46	java/lang/Integer:intValue	()I
/*     */     //   96: iconst_1
/*     */     //   97: iadd
/*     */     //   98: invokestatic 90	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   101: astore 6
/*     */     //   103: aload_0
/*     */     //   104: dup
/*     */     //   105: aload_2
/*     */     //   106: invokeinterface 69 1 0
/*     */     //   111: iconst_3
/*     */     //   112: invokestatic 90	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   115: iconst_1
/*     */     //   116: invokestatic 90	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   119: invokestatic 105	nano/spook1998/rust/utils/LocationUtil:getLocationStairs	(Lorg/bukkit/Location;Ljava/lang/Integer;Ljava/lang/Integer;)Lorg/bukkit/Location;
/*     */     //   122: putfield 92	nano/spook1998/rust/structural/Roof:f	Lorg/bukkit/Location;
/*     */     //   125: getfield 92	nano/spook1998/rust/structural/Roof:f	Lorg/bukkit/Location;
/*     */     //   128: invokevirtual 96	org/bukkit/Location:getX	()D
/*     */     //   131: d2i
/*     */     //   132: aload 5
/*     */     //   134: invokevirtual 46	java/lang/Integer:intValue	()I
/*     */     //   137: isub
/*     */     //   138: dup
/*     */     //   139: istore 5
/*     */     //   141: goto +508 -> 649
/*     */     //   144: athrow
/*     */     //   145: aload_0
/*     */     //   146: getfield 92	nano/spook1998/rust/structural/Roof:f	Lorg/bukkit/Location;
/*     */     //   149: invokevirtual 99	org/bukkit/Location:getZ	()D
/*     */     //   152: d2i
/*     */     //   153: aload 6
/*     */     //   155: invokevirtual 46	java/lang/Integer:intValue	()I
/*     */     //   158: isub
/*     */     //   159: dup
/*     */     //   160: istore 8
/*     */     //   162: goto +466 -> 628
/*     */     //   165: athrow
/*     */     //   166: new 71	org/bukkit/Location
/*     */     //   169: dup
/*     */     //   170: aload_0
/*     */     //   171: getfield 92	nano/spook1998/rust/structural/Roof:f	Lorg/bukkit/Location;
/*     */     //   174: invokevirtual 109	org/bukkit/Location:getWorld	()Lorg/bukkit/World;
/*     */     //   177: iload 5
/*     */     //   179: i2d
/*     */     //   180: aload_0
/*     */     //   181: getfield 92	nano/spook1998/rust/structural/Roof:f	Lorg/bukkit/Location;
/*     */     //   184: invokevirtual 112	org/bukkit/Location:getY	()D
/*     */     //   187: iload 8
/*     */     //   189: i2d
/*     */     //   190: invokespecial 116	org/bukkit/Location:<init>	(Lorg/bukkit/World;DDD)V
/*     */     //   193: invokevirtual 75	org/bukkit/Location:getBlock	()Lorg/bukkit/block/Block;
/*     */     //   196: dup
/*     */     //   197: astore 9
/*     */     //   199: invokeinterface 117 1 0
/*     */     //   204: invokestatic 123	nano/spook1998/rust/object/utils/RegionUtil:getRegionAtLocation	(Lorg/bukkit/Location;)Lnano/spook1998/rust/object/Region;
/*     */     //   207: dup
/*     */     //   208: astore 10
/*     */     //   210: ifnull +20 -> 230
/*     */     //   213: aload 10
/*     */     //   215: aload_1
/*     */     //   216: invokevirtual 129	nano/spook1998/rust/object/Region:checkUser	(Lnano/spook1998/rust/object/User;)Z
/*     */     //   219: ifne +11 -> 230
/*     */     //   222: aload_0
/*     */     //   223: iconst_0
/*     */     //   224: invokestatic 40	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
/*     */     //   227: putfield 29	nano/spook1998/rust/structural/Roof:F	Ljava/lang/Boolean;
/*     */     //   230: aload_3
/*     */     //   231: invokevirtual 46	java/lang/Integer:intValue	()I
/*     */     //   234: bipush 6
/*     */     //   236: if_icmplt +48 -> 284
/*     */     //   239: aload_3
/*     */     //   240: invokevirtual 46	java/lang/Integer:intValue	()I
/*     */     //   243: bipush 9
/*     */     //   245: if_icmpeq +39 -> 284
/*     */     //   248: aload_3
/*     */     //   249: invokevirtual 46	java/lang/Integer:intValue	()I
/*     */     //   252: bipush 10
/*     */     //   254: if_icmpeq +30 -> 284
/*     */     //   257: aload_3
/*     */     //   258: invokevirtual 46	java/lang/Integer:intValue	()I
/*     */     //   261: bipush 14
/*     */     //   263: if_icmpeq +21 -> 284
/*     */     //   266: aload_3
/*     */     //   267: invokevirtual 46	java/lang/Integer:intValue	()I
/*     */     //   270: bipush 15
/*     */     //   272: if_icmpeq +12 -> 284
/*     */     //   275: aload_3
/*     */     //   276: invokevirtual 46	java/lang/Integer:intValue	()I
/*     */     //   279: bipush 18
/*     */     //   281: if_icmple +31 -> 312
/*     */     //   284: aload 9
/*     */     //   286: invokeinterface 133 1 0
/*     */     //   291: getstatic 139	org/bukkit/Material:LOG	Lorg/bukkit/Material;
/*     */     //   294: invokevirtual 143	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
/*     */     //   297: ifeq +15 -> 312
/*     */     //   300: aload 4
/*     */     //   302: invokevirtual 46	java/lang/Integer:intValue	()I
/*     */     //   305: iconst_1
/*     */     //   306: iadd
/*     */     //   307: invokestatic 90	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   310: astore 4
/*     */     //   312: aload_3
/*     */     //   313: invokevirtual 46	java/lang/Integer:intValue	()I
/*     */     //   316: ifeq +29 -> 345
/*     */     //   319: aload_3
/*     */     //   320: invokevirtual 46	java/lang/Integer:intValue	()I
/*     */     //   323: iconst_4
/*     */     //   324: if_icmpeq +21 -> 345
/*     */     //   327: aload_3
/*     */     //   328: invokevirtual 46	java/lang/Integer:intValue	()I
/*     */     //   331: bipush 20
/*     */     //   333: if_icmpeq +12 -> 345
/*     */     //   336: aload_3
/*     */     //   337: invokevirtual 46	java/lang/Integer:intValue	()I
/*     */     //   340: bipush 24
/*     */     //   342: if_icmpne +67 -> 409
/*     */     //   345: aload 9
/*     */     //   347: invokeinterface 133 1 0
/*     */     //   352: getstatic 146	org/bukkit/Material:AIR	Lorg/bukkit/Material;
/*     */     //   355: invokevirtual 143	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
/*     */     //   358: ifne +39 -> 397
/*     */     //   361: aload 9
/*     */     //   363: invokeinterface 133 1 0
/*     */     //   368: getstatic 139	org/bukkit/Material:LOG	Lorg/bukkit/Material;
/*     */     //   371: invokevirtual 143	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
/*     */     //   374: ifeq +23 -> 397
/*     */     //   377: aload 9
/*     */     //   379: invokeinterface 150 1 0
/*     */     //   384: bipush 13
/*     */     //   386: if_icmpeq +11 -> 397
/*     */     //   389: aload_0
/*     */     //   390: iconst_0
/*     */     //   391: invokestatic 40	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
/*     */     //   394: putfield 29	nano/spook1998/rust/structural/Roof:F	Ljava/lang/Boolean;
/*     */     //   397: aload_0
/*     */     //   398: getfield 152	nano/spook1998/rust/structural/Roof:b	Ljava/util/List;
/*     */     //   401: aload 9
/*     */     //   403: invokeinterface 157 2 0
/*     */     //   408: pop
/*     */     //   409: aload 9
/*     */     //   411: invokeinterface 133 1 0
/*     */     //   416: getstatic 146	org/bukkit/Material:AIR	Lorg/bukkit/Material;
/*     */     //   419: invokevirtual 143	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
/*     */     //   422: ifeq +111 -> 533
/*     */     //   425: aload_3
/*     */     //   426: invokevirtual 46	java/lang/Integer:intValue	()I
/*     */     //   429: bipush 6
/*     */     //   431: if_icmplt +48 -> 479
/*     */     //   434: aload_3
/*     */     //   435: invokevirtual 46	java/lang/Integer:intValue	()I
/*     */     //   438: bipush 9
/*     */     //   440: if_icmpeq +39 -> 479
/*     */     //   443: aload_3
/*     */     //   444: invokevirtual 46	java/lang/Integer:intValue	()I
/*     */     //   447: bipush 10
/*     */     //   449: if_icmpeq +30 -> 479
/*     */     //   452: aload_3
/*     */     //   453: invokevirtual 46	java/lang/Integer:intValue	()I
/*     */     //   456: bipush 14
/*     */     //   458: if_icmpeq +21 -> 479
/*     */     //   461: aload_3
/*     */     //   462: invokevirtual 46	java/lang/Integer:intValue	()I
/*     */     //   465: bipush 15
/*     */     //   467: if_icmpeq +12 -> 479
/*     */     //   470: aload_3
/*     */     //   471: invokevirtual 46	java/lang/Integer:intValue	()I
/*     */     //   474: bipush 18
/*     */     //   476: if_icmple +19 -> 495
/*     */     //   479: aload_0
/*     */     //   480: getfield 25	nano/spook1998/rust/structural/Roof:ALLATORIxDEMO	Ljava/util/List;
/*     */     //   483: aload 9
/*     */     //   485: invokeinterface 157 2 0
/*     */     //   490: pop
/*     */     //   491: aload_3
/*     */     //   492: goto +122 -> 614
/*     */     //   495: aload_0
/*     */     //   496: dup
/*     */     //   497: getfield 20	nano/spook1998/rust/structural/Roof:g	Ljava/util/List;
/*     */     //   500: aload 9
/*     */     //   502: invokeinterface 157 2 0
/*     */     //   507: pop
/*     */     //   508: getfield 159	nano/spook1998/rust/structural/Roof:M	Ljava/lang/Boolean;
/*     */     //   511: invokevirtual 36	java/lang/Boolean:booleanValue	()Z
/*     */     //   514: ifeq +99 -> 613
/*     */     //   517: aload_3
/*     */     //   518: aload_0
/*     */     //   519: getfield 161	nano/spook1998/rust/structural/Roof:D	Ljava/util/List;
/*     */     //   522: aload 9
/*     */     //   524: invokeinterface 157 2 0
/*     */     //   529: pop
/*     */     //   530: goto +84 -> 614
/*     */     //   533: aload 9
/*     */     //   535: invokeinterface 133 1 0
/*     */     //   540: getstatic 139	org/bukkit/Material:LOG	Lorg/bukkit/Material;
/*     */     //   543: invokevirtual 143	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
/*     */     //   546: ifeq +43 -> 589
/*     */     //   549: aload 9
/*     */     //   551: invokeinterface 150 1 0
/*     */     //   556: bipush 13
/*     */     //   558: if_icmpne +15 -> 573
/*     */     //   561: aload 7
/*     */     //   563: invokevirtual 46	java/lang/Integer:intValue	()I
/*     */     //   566: iconst_1
/*     */     //   567: iadd
/*     */     //   568: invokestatic 90	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   571: astore 7
/*     */     //   573: aload_0
/*     */     //   574: getfield 25	nano/spook1998/rust/structural/Roof:ALLATORIxDEMO	Ljava/util/List;
/*     */     //   577: aload 9
/*     */     //   579: invokeinterface 157 2 0
/*     */     //   584: pop
/*     */     //   585: aload_3
/*     */     //   586: goto +28 -> 614
/*     */     //   589: aload 9
/*     */     //   591: invokeinterface 133 1 0
/*     */     //   596: getstatic 164	org/bukkit/Material:LADDER	Lorg/bukkit/Material;
/*     */     //   599: invokevirtual 143	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
/*     */     //   602: ifne +11 -> 613
/*     */     //   605: aload_0
/*     */     //   606: iconst_0
/*     */     //   607: invokestatic 40	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
/*     */     //   610: putfield 29	nano/spook1998/rust/structural/Roof:F	Ljava/lang/Boolean;
/*     */     //   613: aload_3
/*     */     //   614: invokevirtual 46	java/lang/Integer:intValue	()I
/*     */     //   617: iconst_1
/*     */     //   618: iinc 8 1
/*     */     //   621: iadd
/*     */     //   622: invokestatic 90	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   625: astore_3
/*     */     //   626: iload 8
/*     */     //   628: i2d
/*     */     //   629: aload_0
/*     */     //   630: getfield 92	nano/spook1998/rust/structural/Roof:f	Lorg/bukkit/Location;
/*     */     //   633: invokevirtual 99	org/bukkit/Location:getZ	()D
/*     */     //   636: ldc2_w 165
/*     */     //   639: dadd
/*     */     //   640: dcmpg
/*     */     //   641: ifle -475 -> 166
/*     */     //   644: iinc 5 1
/*     */     //   647: iload 5
/*     */     //   649: i2d
/*     */     //   650: aload_0
/*     */     //   651: getfield 92	nano/spook1998/rust/structural/Roof:f	Lorg/bukkit/Location;
/*     */     //   654: invokevirtual 96	org/bukkit/Location:getX	()D
/*     */     //   657: ldc2_w 165
/*     */     //   660: dadd
/*     */     //   661: dcmpg
/*     */     //   662: ifle -517 -> 145
/*     */     //   665: aload_0
/*     */     //   666: dup
/*     */     //   667: aload 4
/*     */     //   669: aload 7
/*     */     //   671: invokespecial 168	nano/spook1998/rust/structural/Roof:ALLATORIxDEMO	(Ljava/lang/Integer;Ljava/lang/Integer;)V
/*     */     //   674: getfield 92	nano/spook1998/rust/structural/Roof:f	Lorg/bukkit/Location;
/*     */     //   677: invokevirtual 112	org/bukkit/Location:getY	()D
/*     */     //   680: aload_2
/*     */     //   681: invokeinterface 69 1 0
/*     */     //   686: invokevirtual 112	org/bukkit/Location:getY	()D
/*     */     //   689: dcmpg
/*     */     //   690: ifge +22 -> 712
/*     */     //   693: aload_0
/*     */     //   694: getfield 29	nano/spook1998/rust/structural/Roof:F	Ljava/lang/Boolean;
/*     */     //   697: invokevirtual 36	java/lang/Boolean:booleanValue	()Z
/*     */     //   700: ifne +12 -> 712
/*     */     //   703: aload_0
/*     */     //   704: getfield 161	nano/spook1998/rust/structural/Roof:D	Ljava/util/List;
/*     */     //   707: invokeinterface 172 1 0
/*     */     //   712: return
/*     */     // Line number table:
/*     */     //   Java source line #5	-> byte code offset #0
/*     */     //   Java source line #86	-> byte code offset #9
/*     */     //   Java source line #29	-> byte code offset #26
/*     */     //   Java source line #163	-> byte code offset #31
/*     */     //   Java source line #193	-> byte code offset #37
/*     */     //   Java source line #60	-> byte code offset #43
/*     */     //   Java source line #129	-> byte code offset #49
/*     */     //   Java source line #21	-> byte code offset #55
/*     */     //   Java source line #175	-> byte code offset #79
/*     */     //   Java source line #112	-> byte code offset #103
/*     */     //   Java source line #70	-> byte code offset #125
/*     */     //   Java source line #158	-> byte code offset #145
/*     */     //   Java source line #138	-> byte code offset #166
/*     */     //   Java source line #91	-> byte code offset #199
/*     */     //   Java source line #39	-> byte code offset #210
/*     */     //   Java source line #59	-> byte code offset #213
/*     */     //   Java source line #19	-> byte code offset #230
/*     */     //   Java source line #18	-> byte code offset #284
/*     */     //   Java source line #11	-> byte code offset #312
/*     */     //   Java source line #176	-> byte code offset #345
/*     */     //   Java source line #66	-> byte code offset #397
/*     */     //   Java source line #173	-> byte code offset #409
/*     */     //   Java source line #139	-> byte code offset #425
/*     */     //   Java source line #71	-> byte code offset #479
/*     */     //   Java source line #80	-> byte code offset #492
/*     */     //   Java source line #106	-> byte code offset #495
/*     */     //   Java source line #64	-> byte code offset #508
/*     */     //   Java source line #74	-> byte code offset #530
/*     */     //   Java source line #27	-> byte code offset #549
/*     */     //   Java source line #132	-> byte code offset #573
/*     */     //   Java source line #186	-> byte code offset #586
/*     */     //   Java source line #57	-> byte code offset #605
/*     */     //   Java source line #99	-> byte code offset #613
/*     */     //   Java source line #158	-> byte code offset #626
/*     */     //   Java source line #70	-> byte code offset #644
/*     */     //   Java source line #157	-> byte code offset #665
/*     */     //   Java source line #50	-> byte code offset #674
/*     */     //   Java source line #124	-> byte code offset #712
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	713	0	a	Roof
/*     */     //   0	713	1	a	nano.spook1998.rust.object.User
/*     */   }
/*     */ }


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\structural\Roof.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */