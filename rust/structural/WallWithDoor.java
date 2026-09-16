/*     */ package nano.spook1998.rust.structural; import org.bukkit.block.Block;
/*     */ 
/*   3 */ public class WallWithDoor { public java.util.List<Block> getListBlock3() { return a.g; }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*  24 */     return a.M;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private java.util.List<Block> g;
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
/*     */   private Boolean D;
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
/*  77 */     return a.D;
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
/*     */   public WallWithDoor(org.bukkit.Location a)
/*     */   {
/*  92 */     
/*     */     
/*     */ 
/*     */ 
/*  96 */       a.ALLATORIxDEMO = a;a;a.<init>();new java/util/ArrayList.M = a;a.f = new java.util.ArrayList();
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/* 162 */     a.g = new java.util.ArrayList();1.D = Boolean.valueOf(a);
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
/*     */     //   1: invokestatic 32	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   4: astore_2
/*     */     //   5: aload_1
/*     */     //   6: invokevirtual 38	nano/spook1998/rust/object/User:getName	()Ljava/lang/String;
/*     */     //   9: invokestatic 44	org/bukkit/Bukkit:getPlayer	(Ljava/lang/String;)Lorg/bukkit/entity/Player;
/*     */     //   12: astore_3
/*     */     //   13: iconst_2
/*     */     //   14: aload_0
/*     */     //   15: dup_x1
/*     */     //   16: aload_3
/*     */     //   17: invokeinterface 50 1 0
/*     */     //   22: invokestatic 56	nano/spook1998/rust/utils/LocationUtil:getLocationWall	(Lorg/bukkit/Location;)Lorg/bukkit/Location;
/*     */     //   25: putfield 58	nano/spook1998/rust/structural/WallWithDoor:ALLATORIxDEMO	Lorg/bukkit/Location;
/*     */     //   28: invokestatic 32	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   31: astore 4
/*     */     //   33: iconst_2
/*     */     //   34: invokestatic 32	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   37: astore 5
/*     */     //   39: getfield 58	nano/spook1998/rust/structural/WallWithDoor:ALLATORIxDEMO	Lorg/bukkit/Location;
/*     */     //   42: invokevirtual 64	org/bukkit/Location:getX	()D
/*     */     //   45: dconst_0
/*     */     //   46: dcmpg
/*     */     //   47: ifge +15 -> 62
/*     */     //   50: aload 4
/*     */     //   52: invokevirtual 68	java/lang/Integer:intValue	()I
/*     */     //   55: iconst_1
/*     */     //   56: iadd
/*     */     //   57: invokestatic 32	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   60: astore 4
/*     */     //   62: aload_0
/*     */     //   63: getfield 58	nano/spook1998/rust/structural/WallWithDoor:ALLATORIxDEMO	Lorg/bukkit/Location;
/*     */     //   66: invokevirtual 71	org/bukkit/Location:getZ	()D
/*     */     //   69: dconst_0
/*     */     //   70: dcmpg
/*     */     //   71: ifge +15 -> 86
/*     */     //   74: aload 5
/*     */     //   76: invokevirtual 68	java/lang/Integer:intValue	()I
/*     */     //   79: iconst_1
/*     */     //   80: iadd
/*     */     //   81: invokestatic 32	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   84: astore 5
/*     */     //   86: aload_3
/*     */     //   87: invokestatic 77	nano/spook1998/rust/utils/DirectionUtil:getDirection	(Lorg/bukkit/entity/Player;)Lnano/spook1998/rust/utils/type/DirectionType;
/*     */     //   90: astore 6
/*     */     //   92: iconst_0
/*     */     //   93: invokestatic 32	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   96: astore 7
/*     */     //   98: aload 6
/*     */     //   100: getstatic 83	nano/spook1998/rust/utils/type/DirectionType:B	Lnano/spook1998/rust/utils/type/DirectionType;
/*     */     //   103: if_acmpne +471 -> 574
/*     */     //   106: aload_0
/*     */     //   107: getfield 58	nano/spook1998/rust/structural/WallWithDoor:ALLATORIxDEMO	Lorg/bukkit/Location;
/*     */     //   110: invokevirtual 64	org/bukkit/Location:getX	()D
/*     */     //   113: d2i
/*     */     //   114: aload 4
/*     */     //   116: invokevirtual 68	java/lang/Integer:intValue	()I
/*     */     //   119: isub
/*     */     //   120: dup
/*     */     //   121: istore 8
/*     */     //   123: goto +435 -> 558
/*     */     //   126: athrow
/*     */     //   127: aload_0
/*     */     //   128: getfield 58	nano/spook1998/rust/structural/WallWithDoor:ALLATORIxDEMO	Lorg/bukkit/Location;
/*     */     //   131: invokevirtual 86	org/bukkit/Location:getY	()D
/*     */     //   134: d2i
/*     */     //   135: iconst_2
/*     */     //   136: isub
/*     */     //   137: dup
/*     */     //   138: istore 9
/*     */     //   140: goto +397 -> 537
/*     */     //   143: athrow
/*     */     //   144: aload_2
/*     */     //   145: invokevirtual 68	java/lang/Integer:intValue	()I
/*     */     //   148: bipush 11
/*     */     //   150: if_icmpeq +372 -> 522
/*     */     //   153: aload_2
/*     */     //   154: invokevirtual 68	java/lang/Integer:intValue	()I
/*     */     //   157: bipush 12
/*     */     //   159: if_icmpeq +363 -> 522
/*     */     //   162: new 60	org/bukkit/Location
/*     */     //   165: dup
/*     */     //   166: aload_0
/*     */     //   167: getfield 58	nano/spook1998/rust/structural/WallWithDoor:ALLATORIxDEMO	Lorg/bukkit/Location;
/*     */     //   170: invokevirtual 90	org/bukkit/Location:getWorld	()Lorg/bukkit/World;
/*     */     //   173: iload 8
/*     */     //   175: i2d
/*     */     //   176: iload 9
/*     */     //   178: i2d
/*     */     //   179: aload_0
/*     */     //   180: getfield 58	nano/spook1998/rust/structural/WallWithDoor:ALLATORIxDEMO	Lorg/bukkit/Location;
/*     */     //   183: invokevirtual 71	org/bukkit/Location:getZ	()D
/*     */     //   186: invokespecial 94	org/bukkit/Location:<init>	(Lorg/bukkit/World;DDD)V
/*     */     //   189: invokevirtual 98	org/bukkit/Location:getBlock	()Lorg/bukkit/block/Block;
/*     */     //   192: dup
/*     */     //   193: astore 10
/*     */     //   195: invokeinterface 101 1 0
/*     */     //   200: invokestatic 107	nano/spook1998/rust/object/utils/RegionUtil:getRegionAtLocation	(Lorg/bukkit/Location;)Lnano/spook1998/rust/object/Region;
/*     */     //   203: dup
/*     */     //   204: astore 11
/*     */     //   206: ifnull +20 -> 226
/*     */     //   209: aload 11
/*     */     //   211: aload_1
/*     */     //   212: invokevirtual 113	nano/spook1998/rust/object/Region:checkUser	(Lnano/spook1998/rust/object/User;)Z
/*     */     //   215: ifne +11 -> 226
/*     */     //   218: aload_0
/*     */     //   219: iconst_0
/*     */     //   220: invokestatic 118	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
/*     */     //   223: putfield 120	nano/spook1998/rust/structural/WallWithDoor:D	Ljava/lang/Boolean;
/*     */     //   226: aload_2
/*     */     //   227: invokevirtual 68	java/lang/Integer:intValue	()I
/*     */     //   230: ifeq +38 -> 268
/*     */     //   233: aload_2
/*     */     //   234: invokevirtual 68	java/lang/Integer:intValue	()I
/*     */     //   237: iconst_5
/*     */     //   238: if_icmpeq +30 -> 268
/*     */     //   241: aload_2
/*     */     //   242: invokevirtual 68	java/lang/Integer:intValue	()I
/*     */     //   245: bipush 10
/*     */     //   247: if_icmpeq +21 -> 268
/*     */     //   250: aload_2
/*     */     //   251: invokevirtual 68	java/lang/Integer:intValue	()I
/*     */     //   254: bipush 15
/*     */     //   256: if_icmpeq +12 -> 268
/*     */     //   259: aload_2
/*     */     //   260: invokevirtual 68	java/lang/Integer:intValue	()I
/*     */     //   263: bipush 20
/*     */     //   265: if_icmpne +27 -> 292
/*     */     //   268: aload 10
/*     */     //   270: invokeinterface 124 1 0
/*     */     //   275: getstatic 130	org/bukkit/Material:LOG	Lorg/bukkit/Material;
/*     */     //   278: invokevirtual 134	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
/*     */     //   281: ifne +11 -> 292
/*     */     //   284: aload_0
/*     */     //   285: iconst_0
/*     */     //   286: invokestatic 118	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
/*     */     //   289: putfield 120	nano/spook1998/rust/structural/WallWithDoor:D	Ljava/lang/Boolean;
/*     */     //   292: aload_2
/*     */     //   293: invokevirtual 68	java/lang/Integer:intValue	()I
/*     */     //   296: ifeq +12 -> 308
/*     */     //   299: aload_2
/*     */     //   300: invokevirtual 68	java/lang/Integer:intValue	()I
/*     */     //   303: bipush 20
/*     */     //   305: if_icmpne +23 -> 328
/*     */     //   308: aload 10
/*     */     //   310: invokeinterface 138 1 0
/*     */     //   315: bipush 13
/*     */     //   317: if_icmpeq +11 -> 328
/*     */     //   320: aload_0
/*     */     //   321: iconst_0
/*     */     //   322: invokestatic 118	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
/*     */     //   325: putfield 120	nano/spook1998/rust/structural/WallWithDoor:D	Ljava/lang/Boolean;
/*     */     //   328: aload_2
/*     */     //   329: invokevirtual 68	java/lang/Integer:intValue	()I
/*     */     //   332: iconst_4
/*     */     //   333: if_icmpeq +12 -> 345
/*     */     //   336: aload_2
/*     */     //   337: invokevirtual 68	java/lang/Integer:intValue	()I
/*     */     //   340: bipush 24
/*     */     //   342: if_icmpne +15 -> 357
/*     */     //   345: aload_0
/*     */     //   346: getfield 140	nano/spook1998/rust/structural/WallWithDoor:g	Ljava/util/List;
/*     */     //   349: aload 10
/*     */     //   351: invokeinterface 145 2 0
/*     */     //   356: pop
/*     */     //   357: aload 10
/*     */     //   359: invokeinterface 124 1 0
/*     */     //   364: getstatic 148	org/bukkit/Material:AIR	Lorg/bukkit/Material;
/*     */     //   367: invokevirtual 134	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
/*     */     //   370: ifeq +100 -> 470
/*     */     //   373: aload_2
/*     */     //   374: invokevirtual 68	java/lang/Integer:intValue	()I
/*     */     //   377: bipush 6
/*     */     //   379: if_icmplt +48 -> 427
/*     */     //   382: aload_2
/*     */     //   383: invokevirtual 68	java/lang/Integer:intValue	()I
/*     */     //   386: bipush 9
/*     */     //   388: if_icmpeq +39 -> 427
/*     */     //   391: aload_2
/*     */     //   392: invokevirtual 68	java/lang/Integer:intValue	()I
/*     */     //   395: bipush 10
/*     */     //   397: if_icmpeq +30 -> 427
/*     */     //   400: aload_2
/*     */     //   401: invokevirtual 68	java/lang/Integer:intValue	()I
/*     */     //   404: bipush 14
/*     */     //   406: if_icmpeq +21 -> 427
/*     */     //   409: aload_2
/*     */     //   410: invokevirtual 68	java/lang/Integer:intValue	()I
/*     */     //   413: bipush 15
/*     */     //   415: if_icmpeq +12 -> 427
/*     */     //   418: aload_2
/*     */     //   419: invokevirtual 68	java/lang/Integer:intValue	()I
/*     */     //   422: bipush 18
/*     */     //   424: if_icmple +19 -> 443
/*     */     //   427: aload_0
/*     */     //   428: getfield 19	nano/spook1998/rust/structural/WallWithDoor:f	Ljava/util/List;
/*     */     //   431: aload 10
/*     */     //   433: invokeinterface 145 2 0
/*     */     //   438: pop
/*     */     //   439: aload_2
/*     */     //   440: goto +83 -> 523
/*     */     //   443: aload_0
/*     */     //   444: getfield 24	nano/spook1998/rust/structural/WallWithDoor:M	Ljava/util/List;
/*     */     //   447: aload 10
/*     */     //   449: invokeinterface 145 2 0
/*     */     //   454: aload_0
/*     */     //   455: getfield 150	nano/spook1998/rust/structural/WallWithDoor:b	Ljava/util/List;
/*     */     //   458: aload 10
/*     */     //   460: invokeinterface 145 2 0
/*     */     //   465: pop2
/*     */     //   466: aload_2
/*     */     //   467: goto +56 -> 523
/*     */     //   470: aload 10
/*     */     //   472: invokeinterface 124 1 0
/*     */     //   477: getstatic 130	org/bukkit/Material:LOG	Lorg/bukkit/Material;
/*     */     //   480: invokevirtual 134	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
/*     */     //   483: aload_0
/*     */     //   484: swap
/*     */     //   485: ifeq +30 -> 515
/*     */     //   488: getfield 19	nano/spook1998/rust/structural/WallWithDoor:f	Ljava/util/List;
/*     */     //   491: aload 10
/*     */     //   493: invokeinterface 145 2 0
/*     */     //   498: aload 7
/*     */     //   500: invokevirtual 68	java/lang/Integer:intValue	()I
/*     */     //   503: iconst_1
/*     */     //   504: iadd
/*     */     //   505: invokestatic 32	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   508: astore 7
/*     */     //   510: pop
/*     */     //   511: aload_2
/*     */     //   512: goto +11 -> 523
/*     */     //   515: iconst_0
/*     */     //   516: invokestatic 118	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
/*     */     //   519: putfield 120	nano/spook1998/rust/structural/WallWithDoor:D	Ljava/lang/Boolean;
/*     */     //   522: aload_2
/*     */     //   523: invokevirtual 68	java/lang/Integer:intValue	()I
/*     */     //   526: iconst_1
/*     */     //   527: iinc 9 1
/*     */     //   530: iadd
/*     */     //   531: invokestatic 32	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   534: astore_2
/*     */     //   535: iload 9
/*     */     //   537: i2d
/*     */     //   538: aload_0
/*     */     //   539: getfield 58	nano/spook1998/rust/structural/WallWithDoor:ALLATORIxDEMO	Lorg/bukkit/Location;
/*     */     //   542: invokevirtual 86	org/bukkit/Location:getY	()D
/*     */     //   545: ldc2_w 151
/*     */     //   548: dadd
/*     */     //   549: dcmpg
/*     */     //   550: ifle -406 -> 144
/*     */     //   553: iinc 8 1
/*     */     //   556: iload 8
/*     */     //   558: i2d
/*     */     //   559: aload_0
/*     */     //   560: getfield 58	nano/spook1998/rust/structural/WallWithDoor:ALLATORIxDEMO	Lorg/bukkit/Location;
/*     */     //   563: invokevirtual 64	org/bukkit/Location:getX	()D
/*     */     //   566: ldc2_w 151
/*     */     //   569: dadd
/*     */     //   570: dcmpg
/*     */     //   571: ifle -444 -> 127
/*     */     //   574: aload 6
/*     */     //   576: getstatic 155	nano/spook1998/rust/utils/type/DirectionType:P	Lnano/spook1998/rust/utils/type/DirectionType;
/*     */     //   579: if_acmpne +469 -> 1048
/*     */     //   582: aload_0
/*     */     //   583: getfield 58	nano/spook1998/rust/structural/WallWithDoor:ALLATORIxDEMO	Lorg/bukkit/Location;
/*     */     //   586: invokevirtual 71	org/bukkit/Location:getZ	()D
/*     */     //   589: d2i
/*     */     //   590: aload 5
/*     */     //   592: invokevirtual 68	java/lang/Integer:intValue	()I
/*     */     //   595: isub
/*     */     //   596: dup
/*     */     //   597: istore 8
/*     */     //   599: goto +433 -> 1032
/*     */     //   602: aload_0
/*     */     //   603: getfield 58	nano/spook1998/rust/structural/WallWithDoor:ALLATORIxDEMO	Lorg/bukkit/Location;
/*     */     //   606: invokevirtual 86	org/bukkit/Location:getY	()D
/*     */     //   609: d2i
/*     */     //   610: iconst_2
/*     */     //   611: isub
/*     */     //   612: dup
/*     */     //   613: istore 9
/*     */     //   615: goto +396 -> 1011
/*     */     //   618: aload_2
/*     */     //   619: invokevirtual 68	java/lang/Integer:intValue	()I
/*     */     //   622: bipush 11
/*     */     //   624: if_icmpeq +372 -> 996
/*     */     //   627: aload_2
/*     */     //   628: invokevirtual 68	java/lang/Integer:intValue	()I
/*     */     //   631: bipush 12
/*     */     //   633: if_icmpeq +363 -> 996
/*     */     //   636: new 60	org/bukkit/Location
/*     */     //   639: dup
/*     */     //   640: aload_0
/*     */     //   641: getfield 58	nano/spook1998/rust/structural/WallWithDoor:ALLATORIxDEMO	Lorg/bukkit/Location;
/*     */     //   644: invokevirtual 90	org/bukkit/Location:getWorld	()Lorg/bukkit/World;
/*     */     //   647: aload_0
/*     */     //   648: getfield 58	nano/spook1998/rust/structural/WallWithDoor:ALLATORIxDEMO	Lorg/bukkit/Location;
/*     */     //   651: invokevirtual 64	org/bukkit/Location:getX	()D
/*     */     //   654: iload 9
/*     */     //   656: i2d
/*     */     //   657: iload 8
/*     */     //   659: i2d
/*     */     //   660: invokespecial 94	org/bukkit/Location:<init>	(Lorg/bukkit/World;DDD)V
/*     */     //   663: invokevirtual 98	org/bukkit/Location:getBlock	()Lorg/bukkit/block/Block;
/*     */     //   666: dup
/*     */     //   667: astore 10
/*     */     //   669: invokeinterface 101 1 0
/*     */     //   674: invokestatic 107	nano/spook1998/rust/object/utils/RegionUtil:getRegionAtLocation	(Lorg/bukkit/Location;)Lnano/spook1998/rust/object/Region;
/*     */     //   677: dup
/*     */     //   678: astore 11
/*     */     //   680: ifnull +20 -> 700
/*     */     //   683: aload 11
/*     */     //   685: aload_1
/*     */     //   686: invokevirtual 113	nano/spook1998/rust/object/Region:checkUser	(Lnano/spook1998/rust/object/User;)Z
/*     */     //   689: ifne +11 -> 700
/*     */     //   692: aload_0
/*     */     //   693: iconst_0
/*     */     //   694: invokestatic 118	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
/*     */     //   697: putfield 120	nano/spook1998/rust/structural/WallWithDoor:D	Ljava/lang/Boolean;
/*     */     //   700: aload_2
/*     */     //   701: invokevirtual 68	java/lang/Integer:intValue	()I
/*     */     //   704: ifeq +38 -> 742
/*     */     //   707: aload_2
/*     */     //   708: invokevirtual 68	java/lang/Integer:intValue	()I
/*     */     //   711: iconst_5
/*     */     //   712: if_icmpeq +30 -> 742
/*     */     //   715: aload_2
/*     */     //   716: invokevirtual 68	java/lang/Integer:intValue	()I
/*     */     //   719: bipush 10
/*     */     //   721: if_icmpeq +21 -> 742
/*     */     //   724: aload_2
/*     */     //   725: invokevirtual 68	java/lang/Integer:intValue	()I
/*     */     //   728: bipush 15
/*     */     //   730: if_icmpeq +12 -> 742
/*     */     //   733: aload_2
/*     */     //   734: invokevirtual 68	java/lang/Integer:intValue	()I
/*     */     //   737: bipush 20
/*     */     //   739: if_icmpne +27 -> 766
/*     */     //   742: aload 10
/*     */     //   744: invokeinterface 124 1 0
/*     */     //   749: getstatic 130	org/bukkit/Material:LOG	Lorg/bukkit/Material;
/*     */     //   752: invokevirtual 134	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
/*     */     //   755: ifne +11 -> 766
/*     */     //   758: aload_0
/*     */     //   759: iconst_0
/*     */     //   760: invokestatic 118	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
/*     */     //   763: putfield 120	nano/spook1998/rust/structural/WallWithDoor:D	Ljava/lang/Boolean;
/*     */     //   766: aload_2
/*     */     //   767: invokevirtual 68	java/lang/Integer:intValue	()I
/*     */     //   770: ifeq +12 -> 782
/*     */     //   773: aload_2
/*     */     //   774: invokevirtual 68	java/lang/Integer:intValue	()I
/*     */     //   777: bipush 20
/*     */     //   779: if_icmpne +23 -> 802
/*     */     //   782: aload 10
/*     */     //   784: invokeinterface 138 1 0
/*     */     //   789: bipush 13
/*     */     //   791: if_icmpeq +11 -> 802
/*     */     //   794: aload_0
/*     */     //   795: iconst_0
/*     */     //   796: invokestatic 118	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
/*     */     //   799: putfield 120	nano/spook1998/rust/structural/WallWithDoor:D	Ljava/lang/Boolean;
/*     */     //   802: aload_2
/*     */     //   803: invokevirtual 68	java/lang/Integer:intValue	()I
/*     */     //   806: iconst_4
/*     */     //   807: if_icmpeq +12 -> 819
/*     */     //   810: aload_2
/*     */     //   811: invokevirtual 68	java/lang/Integer:intValue	()I
/*     */     //   814: bipush 24
/*     */     //   816: if_icmpne +15 -> 831
/*     */     //   819: aload_0
/*     */     //   820: getfield 140	nano/spook1998/rust/structural/WallWithDoor:g	Ljava/util/List;
/*     */     //   823: aload 10
/*     */     //   825: invokeinterface 145 2 0
/*     */     //   830: pop
/*     */     //   831: aload 10
/*     */     //   833: invokeinterface 124 1 0
/*     */     //   838: getstatic 148	org/bukkit/Material:AIR	Lorg/bukkit/Material;
/*     */     //   841: invokevirtual 134	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
/*     */     //   844: ifeq +100 -> 944
/*     */     //   847: aload_2
/*     */     //   848: invokevirtual 68	java/lang/Integer:intValue	()I
/*     */     //   851: bipush 6
/*     */     //   853: if_icmplt +48 -> 901
/*     */     //   856: aload_2
/*     */     //   857: invokevirtual 68	java/lang/Integer:intValue	()I
/*     */     //   860: bipush 9
/*     */     //   862: if_icmpeq +39 -> 901
/*     */     //   865: aload_2
/*     */     //   866: invokevirtual 68	java/lang/Integer:intValue	()I
/*     */     //   869: bipush 10
/*     */     //   871: if_icmpeq +30 -> 901
/*     */     //   874: aload_2
/*     */     //   875: invokevirtual 68	java/lang/Integer:intValue	()I
/*     */     //   878: bipush 14
/*     */     //   880: if_icmpeq +21 -> 901
/*     */     //   883: aload_2
/*     */     //   884: invokevirtual 68	java/lang/Integer:intValue	()I
/*     */     //   887: bipush 15
/*     */     //   889: if_icmpeq +12 -> 901
/*     */     //   892: aload_2
/*     */     //   893: invokevirtual 68	java/lang/Integer:intValue	()I
/*     */     //   896: bipush 18
/*     */     //   898: if_icmple +19 -> 917
/*     */     //   901: aload_0
/*     */     //   902: getfield 19	nano/spook1998/rust/structural/WallWithDoor:f	Ljava/util/List;
/*     */     //   905: aload 10
/*     */     //   907: invokeinterface 145 2 0
/*     */     //   912: pop
/*     */     //   913: aload_2
/*     */     //   914: goto +83 -> 997
/*     */     //   917: aload_0
/*     */     //   918: getfield 24	nano/spook1998/rust/structural/WallWithDoor:M	Ljava/util/List;
/*     */     //   921: aload 10
/*     */     //   923: invokeinterface 145 2 0
/*     */     //   928: aload_0
/*     */     //   929: getfield 150	nano/spook1998/rust/structural/WallWithDoor:b	Ljava/util/List;
/*     */     //   932: aload 10
/*     */     //   934: invokeinterface 145 2 0
/*     */     //   939: pop2
/*     */     //   940: aload_2
/*     */     //   941: goto +56 -> 997
/*     */     //   944: aload 10
/*     */     //   946: invokeinterface 124 1 0
/*     */     //   951: getstatic 130	org/bukkit/Material:LOG	Lorg/bukkit/Material;
/*     */     //   954: invokevirtual 134	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
/*     */     //   957: aload_0
/*     */     //   958: swap
/*     */     //   959: ifeq +30 -> 989
/*     */     //   962: getfield 19	nano/spook1998/rust/structural/WallWithDoor:f	Ljava/util/List;
/*     */     //   965: aload 10
/*     */     //   967: invokeinterface 145 2 0
/*     */     //   972: aload 7
/*     */     //   974: invokevirtual 68	java/lang/Integer:intValue	()I
/*     */     //   977: iconst_1
/*     */     //   978: iadd
/*     */     //   979: invokestatic 32	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   982: astore 7
/*     */     //   984: pop
/*     */     //   985: aload_2
/*     */     //   986: goto +11 -> 997
/*     */     //   989: iconst_0
/*     */     //   990: invokestatic 118	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
/*     */     //   993: putfield 120	nano/spook1998/rust/structural/WallWithDoor:D	Ljava/lang/Boolean;
/*     */     //   996: aload_2
/*     */     //   997: invokevirtual 68	java/lang/Integer:intValue	()I
/*     */     //   1000: iconst_1
/*     */     //   1001: iinc 9 1
/*     */     //   1004: iadd
/*     */     //   1005: invokestatic 32	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   1008: astore_2
/*     */     //   1009: iload 9
/*     */     //   1011: i2d
/*     */     //   1012: aload_0
/*     */     //   1013: getfield 58	nano/spook1998/rust/structural/WallWithDoor:ALLATORIxDEMO	Lorg/bukkit/Location;
/*     */     //   1016: invokevirtual 86	org/bukkit/Location:getY	()D
/*     */     //   1019: ldc2_w 151
/*     */     //   1022: dadd
/*     */     //   1023: dcmpg
/*     */     //   1024: ifle -406 -> 618
/*     */     //   1027: iinc 8 1
/*     */     //   1030: iload 8
/*     */     //   1032: i2d
/*     */     //   1033: aload_0
/*     */     //   1034: getfield 58	nano/spook1998/rust/structural/WallWithDoor:ALLATORIxDEMO	Lorg/bukkit/Location;
/*     */     //   1037: invokevirtual 71	org/bukkit/Location:getZ	()D
/*     */     //   1040: ldc2_w 151
/*     */     //   1043: dadd
/*     */     //   1044: dcmpg
/*     */     //   1045: ifle -443 -> 602
/*     */     //   1048: aload_0
/*     */     //   1049: getfield 120	nano/spook1998/rust/structural/WallWithDoor:D	Ljava/lang/Boolean;
/*     */     //   1052: invokevirtual 159	java/lang/Boolean:booleanValue	()Z
/*     */     //   1055: ifne +32 -> 1087
/*     */     //   1058: aload_0
/*     */     //   1059: getfield 58	nano/spook1998/rust/structural/WallWithDoor:ALLATORIxDEMO	Lorg/bukkit/Location;
/*     */     //   1062: invokevirtual 86	org/bukkit/Location:getY	()D
/*     */     //   1065: aload_3
/*     */     //   1066: invokeinterface 50 1 0
/*     */     //   1071: invokevirtual 86	org/bukkit/Location:getY	()D
/*     */     //   1074: dcmpg
/*     */     //   1075: ifgt +12 -> 1087
/*     */     //   1078: aload_0
/*     */     //   1079: getfield 150	nano/spook1998/rust/structural/WallWithDoor:b	Ljava/util/List;
/*     */     //   1082: invokeinterface 163 1 0
/*     */     //   1087: aload 7
/*     */     //   1089: invokevirtual 68	java/lang/Integer:intValue	()I
/*     */     //   1092: iconst_5
/*     */     //   1093: if_icmpeq +51 -> 1144
/*     */     //   1096: aload 7
/*     */     //   1098: invokevirtual 68	java/lang/Integer:intValue	()I
/*     */     //   1101: bipush 10
/*     */     //   1103: if_icmpeq +41 -> 1144
/*     */     //   1106: aload 7
/*     */     //   1108: invokevirtual 68	java/lang/Integer:intValue	()I
/*     */     //   1111: bipush 9
/*     */     //   1113: if_icmpeq +31 -> 1144
/*     */     //   1116: aload 7
/*     */     //   1118: invokevirtual 68	java/lang/Integer:intValue	()I
/*     */     //   1121: bipush 13
/*     */     //   1123: if_icmpeq +21 -> 1144
/*     */     //   1126: aload 7
/*     */     //   1128: invokevirtual 68	java/lang/Integer:intValue	()I
/*     */     //   1131: bipush 16
/*     */     //   1133: if_icmpeq +11 -> 1144
/*     */     //   1136: aload_0
/*     */     //   1137: iconst_0
/*     */     //   1138: invokestatic 118	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
/*     */     //   1141: putfield 120	nano/spook1998/rust/structural/WallWithDoor:D	Ljava/lang/Boolean;
/*     */     //   1144: return
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
/*     */     //   Java source line #138	-> byte code offset #162
/*     */     //   Java source line #91	-> byte code offset #195
/*     */     //   Java source line #39	-> byte code offset #206
/*     */     //   Java source line #59	-> byte code offset #209
/*     */     //   Java source line #19	-> byte code offset #226
/*     */     //   Java source line #18	-> byte code offset #268
/*     */     //   Java source line #11	-> byte code offset #292
/*     */     //   Java source line #176	-> byte code offset #308
/*     */     //   Java source line #20	-> byte code offset #328
/*     */     //   Java source line #173	-> byte code offset #345
/*     */     //   Java source line #71	-> byte code offset #357
/*     */     //   Java source line #80	-> byte code offset #373
/*     */     //   Java source line #106	-> byte code offset #427
/*     */     //   Java source line #147	-> byte code offset #440
/*     */     //   Java source line #74	-> byte code offset #443
/*     */     //   Java source line #27	-> byte code offset #454
/*     */     //   Java source line #186	-> byte code offset #467
/*     */     //   Java source line #133	-> byte code offset #488
/*     */     //   Java source line #121	-> byte code offset #498
/*     */     //   Java source line #57	-> byte code offset #512
/*     */     //   Java source line #192	-> byte code offset #515
/*     */     //   Java source line #94	-> byte code offset #522
/*     */     //   Java source line #70	-> byte code offset #535
/*     */     //   Java source line #112	-> byte code offset #553
/*     */     //   Java source line #85	-> byte code offset #574
/*     */     //   Java source line #14	-> byte code offset #582
/*     */     //   Java source line #67	-> byte code offset #602
/*     */     //   Java source line #125	-> byte code offset #618
/*     */     //   Java source line #122	-> byte code offset #636
/*     */     //   Java source line #108	-> byte code offset #669
/*     */     //   Java source line #137	-> byte code offset #680
/*     */     //   Java source line #165	-> byte code offset #683
/*     */     //   Java source line #154	-> byte code offset #700
/*     */     //   Java source line #87	-> byte code offset #742
/*     */     //   Java source line #179	-> byte code offset #766
/*     */     //   Java source line #16	-> byte code offset #782
/*     */     //   Java source line #148	-> byte code offset #802
/*     */     //   Java source line #116	-> byte code offset #819
/*     */     //   Java source line #181	-> byte code offset #831
/*     */     //   Java source line #102	-> byte code offset #847
/*     */     //   Java source line #196	-> byte code offset #901
/*     */     //   Java source line #128	-> byte code offset #914
/*     */     //   Java source line #191	-> byte code offset #917
/*     */     //   Java source line #197	-> byte code offset #928
/*     */     //   Java source line #6	-> byte code offset #941
/*     */     //   Java source line #53	-> byte code offset #962
/*     */     //   Java source line #166	-> byte code offset #972
/*     */     //   Java source line #17	-> byte code offset #986
/*     */     //   Java source line #37	-> byte code offset #989
/*     */     //   Java source line #131	-> byte code offset #996
/*     */     //   Java source line #67	-> byte code offset #1009
/*     */     //   Java source line #14	-> byte code offset #1027
/*     */     //   Java source line #33	-> byte code offset #1048
/*     */     //   Java source line #184	-> byte code offset #1058
/*     */     //   Java source line #44	-> byte code offset #1087
/*     */     //   Java source line #52	-> byte code offset #1144
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	1145	0	a	WallWithDoor
/*     */     //   0	1145	1	a	nano.spook1998.rust.object.User
/*     */   }
/*     */ }


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\structural\WallWithDoor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */