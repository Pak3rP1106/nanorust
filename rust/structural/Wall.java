/*     */ package nano.spook1998.rust.structural; import org.bukkit.block.Block;
/*     */ 
/*   3 */ public class Wall { public java.util.List<Block> getListBlock3() { return a.M; }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public java.util.List<Block> getListBlock2()
/*     */   {
/*  24 */     return a.D;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private Boolean g;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private java.util.List<Block> f;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private java.util.List<Block> D;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private java.util.List<Block> M;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private java.util.List<Block> b;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private org.bukkit.Location ALLATORIxDEMO;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Boolean isBuild()
/*     */   {
/*  77 */     return a.g;
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
/*     */   public Wall(org.bukkit.Location a)
/*     */   {
/*  92 */     
/*     */     
/*     */ 
/*     */ 
/*  96 */       a.ALLATORIxDEMO = a;a;a.<init>();new java/util/ArrayList.D = a;a.f = new java.util.ArrayList();
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 155 */     a.b = new java.util.ArrayList();
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 162 */     a.M = new java.util.ArrayList();1.g = Boolean.valueOf(a);
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
/*     */   public java.util.List<Block> getFakeSpawn()
/*     */   {
/* 113 */     return a.b;
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
/*     */   public java.util.List<Block> getListBlock1()
/*     */   {
/* 141 */     return a.f;
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public void calculate(nano.spook1998.rust.object.User a)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: iconst_0
/*     */     //   1: invokestatic 23	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   4: astore_2
/*     */     //   5: aload_1
/*     */     //   6: invokevirtual 29	nano/spook1998/rust/object/User:getName	()Ljava/lang/String;
/*     */     //   9: invokestatic 35	org/bukkit/Bukkit:getPlayer	(Ljava/lang/String;)Lorg/bukkit/entity/Player;
/*     */     //   12: astore_3
/*     */     //   13: iconst_2
/*     */     //   14: aload_0
/*     */     //   15: dup_x1
/*     */     //   16: aload_3
/*     */     //   17: invokeinterface 41 1 0
/*     */     //   22: invokestatic 47	nano/spook1998/rust/utils/LocationUtil:getLocationWall	(Lorg/bukkit/Location;)Lorg/bukkit/Location;
/*     */     //   25: putfield 49	nano/spook1998/rust/structural/Wall:ALLATORIxDEMO	Lorg/bukkit/Location;
/*     */     //   28: invokestatic 23	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   31: astore 4
/*     */     //   33: iconst_2
/*     */     //   34: invokestatic 23	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   37: astore 5
/*     */     //   39: getfield 49	nano/spook1998/rust/structural/Wall:ALLATORIxDEMO	Lorg/bukkit/Location;
/*     */     //   42: invokevirtual 55	org/bukkit/Location:getX	()D
/*     */     //   45: dconst_0
/*     */     //   46: dcmpg
/*     */     //   47: ifge +15 -> 62
/*     */     //   50: aload 4
/*     */     //   52: invokevirtual 59	java/lang/Integer:intValue	()I
/*     */     //   55: iconst_1
/*     */     //   56: iadd
/*     */     //   57: invokestatic 23	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   60: astore 4
/*     */     //   62: aload_0
/*     */     //   63: getfield 49	nano/spook1998/rust/structural/Wall:ALLATORIxDEMO	Lorg/bukkit/Location;
/*     */     //   66: invokevirtual 62	org/bukkit/Location:getZ	()D
/*     */     //   69: dconst_0
/*     */     //   70: dcmpg
/*     */     //   71: ifge +15 -> 86
/*     */     //   74: aload 5
/*     */     //   76: invokevirtual 59	java/lang/Integer:intValue	()I
/*     */     //   79: iconst_1
/*     */     //   80: iadd
/*     */     //   81: invokestatic 23	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   84: astore 5
/*     */     //   86: aload_3
/*     */     //   87: invokestatic 68	nano/spook1998/rust/utils/DirectionUtil:getDirection	(Lorg/bukkit/entity/Player;)Lnano/spook1998/rust/utils/type/DirectionType;
/*     */     //   90: astore 6
/*     */     //   92: iconst_0
/*     */     //   93: invokestatic 23	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   96: astore 7
/*     */     //   98: aload 6
/*     */     //   100: getstatic 74	nano/spook1998/rust/utils/type/DirectionType:B	Lnano/spook1998/rust/utils/type/DirectionType;
/*     */     //   103: if_acmpne +453 -> 556
/*     */     //   106: aload_0
/*     */     //   107: getfield 49	nano/spook1998/rust/structural/Wall:ALLATORIxDEMO	Lorg/bukkit/Location;
/*     */     //   110: invokevirtual 55	org/bukkit/Location:getX	()D
/*     */     //   113: d2i
/*     */     //   114: aload 4
/*     */     //   116: invokevirtual 59	java/lang/Integer:intValue	()I
/*     */     //   119: isub
/*     */     //   120: dup
/*     */     //   121: istore 8
/*     */     //   123: goto +417 -> 540
/*     */     //   126: athrow
/*     */     //   127: aload_0
/*     */     //   128: getfield 49	nano/spook1998/rust/structural/Wall:ALLATORIxDEMO	Lorg/bukkit/Location;
/*     */     //   131: invokevirtual 77	org/bukkit/Location:getY	()D
/*     */     //   134: d2i
/*     */     //   135: iconst_2
/*     */     //   136: isub
/*     */     //   137: dup
/*     */     //   138: istore 9
/*     */     //   140: goto +379 -> 519
/*     */     //   143: athrow
/*     */     //   144: new 51	org/bukkit/Location
/*     */     //   147: dup
/*     */     //   148: aload_0
/*     */     //   149: getfield 49	nano/spook1998/rust/structural/Wall:ALLATORIxDEMO	Lorg/bukkit/Location;
/*     */     //   152: invokevirtual 81	org/bukkit/Location:getWorld	()Lorg/bukkit/World;
/*     */     //   155: iload 8
/*     */     //   157: i2d
/*     */     //   158: iload 9
/*     */     //   160: i2d
/*     */     //   161: aload_0
/*     */     //   162: getfield 49	nano/spook1998/rust/structural/Wall:ALLATORIxDEMO	Lorg/bukkit/Location;
/*     */     //   165: invokevirtual 62	org/bukkit/Location:getZ	()D
/*     */     //   168: invokespecial 85	org/bukkit/Location:<init>	(Lorg/bukkit/World;DDD)V
/*     */     //   171: invokevirtual 89	org/bukkit/Location:getBlock	()Lorg/bukkit/block/Block;
/*     */     //   174: dup
/*     */     //   175: astore 10
/*     */     //   177: invokeinterface 92 1 0
/*     */     //   182: invokestatic 98	nano/spook1998/rust/object/utils/RegionUtil:getRegionAtLocation	(Lorg/bukkit/Location;)Lnano/spook1998/rust/object/Region;
/*     */     //   185: dup
/*     */     //   186: astore 11
/*     */     //   188: ifnull +20 -> 208
/*     */     //   191: aload 11
/*     */     //   193: aload_1
/*     */     //   194: invokevirtual 104	nano/spook1998/rust/object/Region:checkUser	(Lnano/spook1998/rust/object/User;)Z
/*     */     //   197: ifne +11 -> 208
/*     */     //   200: aload_0
/*     */     //   201: iconst_0
/*     */     //   202: invokestatic 109	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
/*     */     //   205: putfield 111	nano/spook1998/rust/structural/Wall:g	Ljava/lang/Boolean;
/*     */     //   208: aload_2
/*     */     //   209: invokevirtual 59	java/lang/Integer:intValue	()I
/*     */     //   212: ifeq +38 -> 250
/*     */     //   215: aload_2
/*     */     //   216: invokevirtual 59	java/lang/Integer:intValue	()I
/*     */     //   219: iconst_5
/*     */     //   220: if_icmpeq +30 -> 250
/*     */     //   223: aload_2
/*     */     //   224: invokevirtual 59	java/lang/Integer:intValue	()I
/*     */     //   227: bipush 10
/*     */     //   229: if_icmpeq +21 -> 250
/*     */     //   232: aload_2
/*     */     //   233: invokevirtual 59	java/lang/Integer:intValue	()I
/*     */     //   236: bipush 15
/*     */     //   238: if_icmpeq +12 -> 250
/*     */     //   241: aload_2
/*     */     //   242: invokevirtual 59	java/lang/Integer:intValue	()I
/*     */     //   245: bipush 20
/*     */     //   247: if_icmpne +27 -> 274
/*     */     //   250: aload 10
/*     */     //   252: invokeinterface 115 1 0
/*     */     //   257: getstatic 121	org/bukkit/Material:LOG	Lorg/bukkit/Material;
/*     */     //   260: invokevirtual 125	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
/*     */     //   263: ifne +11 -> 274
/*     */     //   266: aload_0
/*     */     //   267: iconst_0
/*     */     //   268: invokestatic 109	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
/*     */     //   271: putfield 111	nano/spook1998/rust/structural/Wall:g	Ljava/lang/Boolean;
/*     */     //   274: aload_2
/*     */     //   275: invokevirtual 59	java/lang/Integer:intValue	()I
/*     */     //   278: ifeq +12 -> 290
/*     */     //   281: aload_2
/*     */     //   282: invokevirtual 59	java/lang/Integer:intValue	()I
/*     */     //   285: bipush 20
/*     */     //   287: if_icmpne +23 -> 310
/*     */     //   290: aload 10
/*     */     //   292: invokeinterface 129 1 0
/*     */     //   297: bipush 13
/*     */     //   299: if_icmpeq +11 -> 310
/*     */     //   302: aload_0
/*     */     //   303: iconst_0
/*     */     //   304: invokestatic 109	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
/*     */     //   307: putfield 111	nano/spook1998/rust/structural/Wall:g	Ljava/lang/Boolean;
/*     */     //   310: aload_2
/*     */     //   311: invokevirtual 59	java/lang/Integer:intValue	()I
/*     */     //   314: iconst_4
/*     */     //   315: if_icmpeq +12 -> 327
/*     */     //   318: aload_2
/*     */     //   319: invokevirtual 59	java/lang/Integer:intValue	()I
/*     */     //   322: bipush 24
/*     */     //   324: if_icmpne +15 -> 339
/*     */     //   327: aload_0
/*     */     //   328: getfield 131	nano/spook1998/rust/structural/Wall:M	Ljava/util/List;
/*     */     //   331: aload 10
/*     */     //   333: invokeinterface 136 2 0
/*     */     //   338: pop
/*     */     //   339: aload 10
/*     */     //   341: invokeinterface 115 1 0
/*     */     //   346: getstatic 139	org/bukkit/Material:AIR	Lorg/bukkit/Material;
/*     */     //   349: invokevirtual 125	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
/*     */     //   352: ifeq +100 -> 452
/*     */     //   355: aload_2
/*     */     //   356: invokevirtual 59	java/lang/Integer:intValue	()I
/*     */     //   359: bipush 6
/*     */     //   361: if_icmplt +48 -> 409
/*     */     //   364: aload_2
/*     */     //   365: invokevirtual 59	java/lang/Integer:intValue	()I
/*     */     //   368: bipush 9
/*     */     //   370: if_icmpeq +39 -> 409
/*     */     //   373: aload_2
/*     */     //   374: invokevirtual 59	java/lang/Integer:intValue	()I
/*     */     //   377: bipush 10
/*     */     //   379: if_icmpeq +30 -> 409
/*     */     //   382: aload_2
/*     */     //   383: invokevirtual 59	java/lang/Integer:intValue	()I
/*     */     //   386: bipush 14
/*     */     //   388: if_icmpeq +21 -> 409
/*     */     //   391: aload_2
/*     */     //   392: invokevirtual 59	java/lang/Integer:intValue	()I
/*     */     //   395: bipush 15
/*     */     //   397: if_icmpeq +12 -> 409
/*     */     //   400: aload_2
/*     */     //   401: invokevirtual 59	java/lang/Integer:intValue	()I
/*     */     //   404: bipush 18
/*     */     //   406: if_icmple +19 -> 425
/*     */     //   409: aload_0
/*     */     //   410: getfield 141	nano/spook1998/rust/structural/Wall:f	Ljava/util/List;
/*     */     //   413: aload 10
/*     */     //   415: invokeinterface 136 2 0
/*     */     //   420: pop
/*     */     //   421: aload_2
/*     */     //   422: goto +83 -> 505
/*     */     //   425: aload_0
/*     */     //   426: getfield 143	nano/spook1998/rust/structural/Wall:D	Ljava/util/List;
/*     */     //   429: aload 10
/*     */     //   431: invokeinterface 136 2 0
/*     */     //   436: aload_0
/*     */     //   437: getfield 145	nano/spook1998/rust/structural/Wall:b	Ljava/util/List;
/*     */     //   440: aload 10
/*     */     //   442: invokeinterface 136 2 0
/*     */     //   447: pop2
/*     */     //   448: aload_2
/*     */     //   449: goto +56 -> 505
/*     */     //   452: aload 10
/*     */     //   454: invokeinterface 115 1 0
/*     */     //   459: getstatic 121	org/bukkit/Material:LOG	Lorg/bukkit/Material;
/*     */     //   462: invokevirtual 125	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
/*     */     //   465: aload_0
/*     */     //   466: swap
/*     */     //   467: ifeq +30 -> 497
/*     */     //   470: getfield 141	nano/spook1998/rust/structural/Wall:f	Ljava/util/List;
/*     */     //   473: aload 10
/*     */     //   475: invokeinterface 136 2 0
/*     */     //   480: aload 7
/*     */     //   482: invokevirtual 59	java/lang/Integer:intValue	()I
/*     */     //   485: iconst_1
/*     */     //   486: iadd
/*     */     //   487: invokestatic 23	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   490: astore 7
/*     */     //   492: pop
/*     */     //   493: aload_2
/*     */     //   494: goto +11 -> 505
/*     */     //   497: iconst_0
/*     */     //   498: invokestatic 109	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
/*     */     //   501: putfield 111	nano/spook1998/rust/structural/Wall:g	Ljava/lang/Boolean;
/*     */     //   504: aload_2
/*     */     //   505: invokevirtual 59	java/lang/Integer:intValue	()I
/*     */     //   508: iconst_1
/*     */     //   509: iinc 9 1
/*     */     //   512: iadd
/*     */     //   513: invokestatic 23	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   516: astore_2
/*     */     //   517: iload 9
/*     */     //   519: i2d
/*     */     //   520: aload_0
/*     */     //   521: getfield 49	nano/spook1998/rust/structural/Wall:ALLATORIxDEMO	Lorg/bukkit/Location;
/*     */     //   524: invokevirtual 77	org/bukkit/Location:getY	()D
/*     */     //   527: ldc2_w 146
/*     */     //   530: dadd
/*     */     //   531: dcmpg
/*     */     //   532: ifle -388 -> 144
/*     */     //   535: iinc 8 1
/*     */     //   538: iload 8
/*     */     //   540: i2d
/*     */     //   541: aload_0
/*     */     //   542: getfield 49	nano/spook1998/rust/structural/Wall:ALLATORIxDEMO	Lorg/bukkit/Location;
/*     */     //   545: invokevirtual 55	org/bukkit/Location:getX	()D
/*     */     //   548: ldc2_w 146
/*     */     //   551: dadd
/*     */     //   552: dcmpg
/*     */     //   553: ifle -426 -> 127
/*     */     //   556: aload 6
/*     */     //   558: getstatic 150	nano/spook1998/rust/utils/type/DirectionType:P	Lnano/spook1998/rust/utils/type/DirectionType;
/*     */     //   561: if_acmpne +451 -> 1012
/*     */     //   564: aload_0
/*     */     //   565: getfield 49	nano/spook1998/rust/structural/Wall:ALLATORIxDEMO	Lorg/bukkit/Location;
/*     */     //   568: invokevirtual 62	org/bukkit/Location:getZ	()D
/*     */     //   571: d2i
/*     */     //   572: aload 5
/*     */     //   574: invokevirtual 59	java/lang/Integer:intValue	()I
/*     */     //   577: isub
/*     */     //   578: dup
/*     */     //   579: istore 8
/*     */     //   581: goto +415 -> 996
/*     */     //   584: aload_0
/*     */     //   585: getfield 49	nano/spook1998/rust/structural/Wall:ALLATORIxDEMO	Lorg/bukkit/Location;
/*     */     //   588: invokevirtual 77	org/bukkit/Location:getY	()D
/*     */     //   591: d2i
/*     */     //   592: iconst_2
/*     */     //   593: isub
/*     */     //   594: dup
/*     */     //   595: istore 9
/*     */     //   597: goto +378 -> 975
/*     */     //   600: new 51	org/bukkit/Location
/*     */     //   603: dup
/*     */     //   604: aload_0
/*     */     //   605: getfield 49	nano/spook1998/rust/structural/Wall:ALLATORIxDEMO	Lorg/bukkit/Location;
/*     */     //   608: invokevirtual 81	org/bukkit/Location:getWorld	()Lorg/bukkit/World;
/*     */     //   611: aload_0
/*     */     //   612: getfield 49	nano/spook1998/rust/structural/Wall:ALLATORIxDEMO	Lorg/bukkit/Location;
/*     */     //   615: invokevirtual 55	org/bukkit/Location:getX	()D
/*     */     //   618: iload 9
/*     */     //   620: i2d
/*     */     //   621: iload 8
/*     */     //   623: i2d
/*     */     //   624: invokespecial 85	org/bukkit/Location:<init>	(Lorg/bukkit/World;DDD)V
/*     */     //   627: invokevirtual 89	org/bukkit/Location:getBlock	()Lorg/bukkit/block/Block;
/*     */     //   630: dup
/*     */     //   631: astore 10
/*     */     //   633: invokeinterface 92 1 0
/*     */     //   638: invokestatic 98	nano/spook1998/rust/object/utils/RegionUtil:getRegionAtLocation	(Lorg/bukkit/Location;)Lnano/spook1998/rust/object/Region;
/*     */     //   641: dup
/*     */     //   642: astore 11
/*     */     //   644: ifnull +20 -> 664
/*     */     //   647: aload 11
/*     */     //   649: aload_1
/*     */     //   650: invokevirtual 104	nano/spook1998/rust/object/Region:checkUser	(Lnano/spook1998/rust/object/User;)Z
/*     */     //   653: ifne +11 -> 664
/*     */     //   656: aload_0
/*     */     //   657: iconst_0
/*     */     //   658: invokestatic 109	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
/*     */     //   661: putfield 111	nano/spook1998/rust/structural/Wall:g	Ljava/lang/Boolean;
/*     */     //   664: aload_2
/*     */     //   665: invokevirtual 59	java/lang/Integer:intValue	()I
/*     */     //   668: ifeq +38 -> 706
/*     */     //   671: aload_2
/*     */     //   672: invokevirtual 59	java/lang/Integer:intValue	()I
/*     */     //   675: iconst_5
/*     */     //   676: if_icmpeq +30 -> 706
/*     */     //   679: aload_2
/*     */     //   680: invokevirtual 59	java/lang/Integer:intValue	()I
/*     */     //   683: bipush 10
/*     */     //   685: if_icmpeq +21 -> 706
/*     */     //   688: aload_2
/*     */     //   689: invokevirtual 59	java/lang/Integer:intValue	()I
/*     */     //   692: bipush 15
/*     */     //   694: if_icmpeq +12 -> 706
/*     */     //   697: aload_2
/*     */     //   698: invokevirtual 59	java/lang/Integer:intValue	()I
/*     */     //   701: bipush 20
/*     */     //   703: if_icmpne +27 -> 730
/*     */     //   706: aload 10
/*     */     //   708: invokeinterface 115 1 0
/*     */     //   713: getstatic 121	org/bukkit/Material:LOG	Lorg/bukkit/Material;
/*     */     //   716: invokevirtual 125	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
/*     */     //   719: ifne +11 -> 730
/*     */     //   722: aload_0
/*     */     //   723: iconst_0
/*     */     //   724: invokestatic 109	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
/*     */     //   727: putfield 111	nano/spook1998/rust/structural/Wall:g	Ljava/lang/Boolean;
/*     */     //   730: aload_2
/*     */     //   731: invokevirtual 59	java/lang/Integer:intValue	()I
/*     */     //   734: ifeq +12 -> 746
/*     */     //   737: aload_2
/*     */     //   738: invokevirtual 59	java/lang/Integer:intValue	()I
/*     */     //   741: bipush 20
/*     */     //   743: if_icmpne +23 -> 766
/*     */     //   746: aload 10
/*     */     //   748: invokeinterface 129 1 0
/*     */     //   753: bipush 13
/*     */     //   755: if_icmpeq +11 -> 766
/*     */     //   758: aload_0
/*     */     //   759: iconst_0
/*     */     //   760: invokestatic 109	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
/*     */     //   763: putfield 111	nano/spook1998/rust/structural/Wall:g	Ljava/lang/Boolean;
/*     */     //   766: aload_2
/*     */     //   767: invokevirtual 59	java/lang/Integer:intValue	()I
/*     */     //   770: iconst_4
/*     */     //   771: if_icmpeq +12 -> 783
/*     */     //   774: aload_2
/*     */     //   775: invokevirtual 59	java/lang/Integer:intValue	()I
/*     */     //   778: bipush 24
/*     */     //   780: if_icmpne +15 -> 795
/*     */     //   783: aload_0
/*     */     //   784: getfield 131	nano/spook1998/rust/structural/Wall:M	Ljava/util/List;
/*     */     //   787: aload 10
/*     */     //   789: invokeinterface 136 2 0
/*     */     //   794: pop
/*     */     //   795: aload 10
/*     */     //   797: invokeinterface 115 1 0
/*     */     //   802: getstatic 139	org/bukkit/Material:AIR	Lorg/bukkit/Material;
/*     */     //   805: invokevirtual 125	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
/*     */     //   808: ifeq +100 -> 908
/*     */     //   811: aload_2
/*     */     //   812: invokevirtual 59	java/lang/Integer:intValue	()I
/*     */     //   815: bipush 6
/*     */     //   817: if_icmplt +48 -> 865
/*     */     //   820: aload_2
/*     */     //   821: invokevirtual 59	java/lang/Integer:intValue	()I
/*     */     //   824: bipush 9
/*     */     //   826: if_icmpeq +39 -> 865
/*     */     //   829: aload_2
/*     */     //   830: invokevirtual 59	java/lang/Integer:intValue	()I
/*     */     //   833: bipush 10
/*     */     //   835: if_icmpeq +30 -> 865
/*     */     //   838: aload_2
/*     */     //   839: invokevirtual 59	java/lang/Integer:intValue	()I
/*     */     //   842: bipush 14
/*     */     //   844: if_icmpeq +21 -> 865
/*     */     //   847: aload_2
/*     */     //   848: invokevirtual 59	java/lang/Integer:intValue	()I
/*     */     //   851: bipush 15
/*     */     //   853: if_icmpeq +12 -> 865
/*     */     //   856: aload_2
/*     */     //   857: invokevirtual 59	java/lang/Integer:intValue	()I
/*     */     //   860: bipush 18
/*     */     //   862: if_icmple +19 -> 881
/*     */     //   865: aload_0
/*     */     //   866: getfield 141	nano/spook1998/rust/structural/Wall:f	Ljava/util/List;
/*     */     //   869: aload 10
/*     */     //   871: invokeinterface 136 2 0
/*     */     //   876: pop
/*     */     //   877: aload_2
/*     */     //   878: goto +83 -> 961
/*     */     //   881: aload_0
/*     */     //   882: getfield 143	nano/spook1998/rust/structural/Wall:D	Ljava/util/List;
/*     */     //   885: aload 10
/*     */     //   887: invokeinterface 136 2 0
/*     */     //   892: aload_0
/*     */     //   893: getfield 145	nano/spook1998/rust/structural/Wall:b	Ljava/util/List;
/*     */     //   896: aload 10
/*     */     //   898: invokeinterface 136 2 0
/*     */     //   903: pop2
/*     */     //   904: aload_2
/*     */     //   905: goto +56 -> 961
/*     */     //   908: aload 10
/*     */     //   910: invokeinterface 115 1 0
/*     */     //   915: getstatic 121	org/bukkit/Material:LOG	Lorg/bukkit/Material;
/*     */     //   918: invokevirtual 125	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
/*     */     //   921: aload_0
/*     */     //   922: swap
/*     */     //   923: ifeq +30 -> 953
/*     */     //   926: getfield 141	nano/spook1998/rust/structural/Wall:f	Ljava/util/List;
/*     */     //   929: aload 10
/*     */     //   931: invokeinterface 136 2 0
/*     */     //   936: aload 7
/*     */     //   938: invokevirtual 59	java/lang/Integer:intValue	()I
/*     */     //   941: iconst_1
/*     */     //   942: iadd
/*     */     //   943: invokestatic 23	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   946: astore 7
/*     */     //   948: pop
/*     */     //   949: aload_2
/*     */     //   950: goto +11 -> 961
/*     */     //   953: iconst_0
/*     */     //   954: invokestatic 109	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
/*     */     //   957: putfield 111	nano/spook1998/rust/structural/Wall:g	Ljava/lang/Boolean;
/*     */     //   960: aload_2
/*     */     //   961: invokevirtual 59	java/lang/Integer:intValue	()I
/*     */     //   964: iconst_1
/*     */     //   965: iinc 9 1
/*     */     //   968: iadd
/*     */     //   969: invokestatic 23	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   972: astore_2
/*     */     //   973: iload 9
/*     */     //   975: i2d
/*     */     //   976: aload_0
/*     */     //   977: getfield 49	nano/spook1998/rust/structural/Wall:ALLATORIxDEMO	Lorg/bukkit/Location;
/*     */     //   980: invokevirtual 77	org/bukkit/Location:getY	()D
/*     */     //   983: ldc2_w 146
/*     */     //   986: dadd
/*     */     //   987: dcmpg
/*     */     //   988: ifle -388 -> 600
/*     */     //   991: iinc 8 1
/*     */     //   994: iload 8
/*     */     //   996: i2d
/*     */     //   997: aload_0
/*     */     //   998: getfield 49	nano/spook1998/rust/structural/Wall:ALLATORIxDEMO	Lorg/bukkit/Location;
/*     */     //   1001: invokevirtual 62	org/bukkit/Location:getZ	()D
/*     */     //   1004: ldc2_w 146
/*     */     //   1007: dadd
/*     */     //   1008: dcmpg
/*     */     //   1009: ifle -425 -> 584
/*     */     //   1012: aload_0
/*     */     //   1013: getfield 111	nano/spook1998/rust/structural/Wall:g	Ljava/lang/Boolean;
/*     */     //   1016: invokevirtual 154	java/lang/Boolean:booleanValue	()Z
/*     */     //   1019: ifne +32 -> 1051
/*     */     //   1022: aload_0
/*     */     //   1023: getfield 49	nano/spook1998/rust/structural/Wall:ALLATORIxDEMO	Lorg/bukkit/Location;
/*     */     //   1026: invokevirtual 77	org/bukkit/Location:getY	()D
/*     */     //   1029: aload_3
/*     */     //   1030: invokeinterface 41 1 0
/*     */     //   1035: invokevirtual 77	org/bukkit/Location:getY	()D
/*     */     //   1038: dcmpg
/*     */     //   1039: ifgt +12 -> 1051
/*     */     //   1042: aload_0
/*     */     //   1043: getfield 145	nano/spook1998/rust/structural/Wall:b	Ljava/util/List;
/*     */     //   1046: invokeinterface 158 1 0
/*     */     //   1051: aload 7
/*     */     //   1053: invokevirtual 59	java/lang/Integer:intValue	()I
/*     */     //   1056: iconst_5
/*     */     //   1057: if_icmpeq +51 -> 1108
/*     */     //   1060: aload 7
/*     */     //   1062: invokevirtual 59	java/lang/Integer:intValue	()I
/*     */     //   1065: bipush 10
/*     */     //   1067: if_icmpeq +41 -> 1108
/*     */     //   1070: aload 7
/*     */     //   1072: invokevirtual 59	java/lang/Integer:intValue	()I
/*     */     //   1075: bipush 9
/*     */     //   1077: if_icmpeq +31 -> 1108
/*     */     //   1080: aload 7
/*     */     //   1082: invokevirtual 59	java/lang/Integer:intValue	()I
/*     */     //   1085: bipush 13
/*     */     //   1087: if_icmpeq +21 -> 1108
/*     */     //   1090: aload 7
/*     */     //   1092: invokevirtual 59	java/lang/Integer:intValue	()I
/*     */     //   1095: bipush 16
/*     */     //   1097: if_icmpeq +11 -> 1108
/*     */     //   1100: aload_0
/*     */     //   1101: iconst_0
/*     */     //   1102: invokestatic 109	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
/*     */     //   1105: putfield 111	nano/spook1998/rust/structural/Wall:g	Ljava/lang/Boolean;
/*     */     //   1108: return
/*     */     // Line number table:
/*     */     //   Java source line #72	-> byte code offset #0
/*     */     //   Java source line #5	-> byte code offset #5
/*     */     //   Java source line #86	-> byte code offset #13
/*     */     //   Java source line #29	-> byte code offset #28
/*     */     //   Java source line #163	-> byte code offset #33
/*     */     //   Java source line #193	-> byte code offset #39
/*     */     //   Java source line #60	-> byte code offset #62
/*     */     //   Java source line #129	-> byte code offset #86
/*     */     //   Java source line #21	-> byte code offset #92
/*     */     //   Java source line #175	-> byte code offset #98
/*     */     //   Java source line #112	-> byte code offset #106
/*     */     //   Java source line #70	-> byte code offset #127
/*     */     //   Java source line #158	-> byte code offset #144
/*     */     //   Java source line #138	-> byte code offset #177
/*     */     //   Java source line #91	-> byte code offset #188
/*     */     //   Java source line #39	-> byte code offset #191
/*     */     //   Java source line #174	-> byte code offset #208
/*     */     //   Java source line #19	-> byte code offset #250
/*     */     //   Java source line #120	-> byte code offset #274
/*     */     //   Java source line #11	-> byte code offset #290
/*     */     //   Java source line #66	-> byte code offset #310
/*     */     //   Java source line #20	-> byte code offset #327
/*     */     //   Java source line #139	-> byte code offset #339
/*     */     //   Java source line #71	-> byte code offset #355
/*     */     //   Java source line #80	-> byte code offset #409
/*     */     //   Java source line #64	-> byte code offset #422
/*     */     //   Java source line #147	-> byte code offset #425
/*     */     //   Java source line #74	-> byte code offset #436
/*     */     //   Java source line #132	-> byte code offset #449
/*     */     //   Java source line #186	-> byte code offset #470
/*     */     //   Java source line #133	-> byte code offset #480
/*     */     //   Java source line #121	-> byte code offset #494
/*     */     //   Java source line #57	-> byte code offset #497
/*     */     //   Java source line #99	-> byte code offset #504
/*     */     //   Java source line #70	-> byte code offset #517
/*     */     //   Java source line #112	-> byte code offset #535
/*     */     //   Java source line #124	-> byte code offset #556
/*     */     //   Java source line #140	-> byte code offset #564
/*     */     //   Java source line #85	-> byte code offset #584
/*     */     //   Java source line #14	-> byte code offset #600
/*     */     //   Java source line #67	-> byte code offset #633
/*     */     //   Java source line #125	-> byte code offset #644
/*     */     //   Java source line #122	-> byte code offset #647
/*     */     //   Java source line #137	-> byte code offset #664
/*     */     //   Java source line #165	-> byte code offset #706
/*     */     //   Java source line #154	-> byte code offset #730
/*     */     //   Java source line #87	-> byte code offset #746
/*     */     //   Java source line #179	-> byte code offset #766
/*     */     //   Java source line #16	-> byte code offset #783
/*     */     //   Java source line #148	-> byte code offset #795
/*     */     //   Java source line #116	-> byte code offset #811
/*     */     //   Java source line #15	-> byte code offset #865
/*     */     //   Java source line #102	-> byte code offset #878
/*     */     //   Java source line #196	-> byte code offset #881
/*     */     //   Java source line #159	-> byte code offset #892
/*     */     //   Java source line #191	-> byte code offset #905
/*     */     //   Java source line #197	-> byte code offset #926
/*     */     //   Java source line #126	-> byte code offset #936
/*     */     //   Java source line #6	-> byte code offset #950
/*     */     //   Java source line #53	-> byte code offset #953
/*     */     //   Java source line #17	-> byte code offset #960
/*     */     //   Java source line #85	-> byte code offset #973
/*     */     //   Java source line #140	-> byte code offset #991
/*     */     //   Java source line #131	-> byte code offset #1012
/*     */     //   Java source line #136	-> byte code offset #1022
/*     */     //   Java source line #143	-> byte code offset #1051
/*     */     //   Java source line #33	-> byte code offset #1108
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	1109	0	a	Wall
/*     */     //   0	1109	1	a	nano.spook1998.rust.object.User
/*     */   }
/*     */ }


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\structural\Wall.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */