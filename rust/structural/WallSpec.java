/*     */ package nano.spook1998.rust.structural; import org.bukkit.block.Block;
/*     */ 
/*   3 */ public class WallSpec { public java.util.List<Block> getListBlock3() { return a.M; }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*  24 */     return a.g;
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
/*     */   private Boolean b;
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
/*  77 */     return a.b;
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
/*     */   public WallSpec(org.bukkit.Location a)
/*     */   {
/*  92 */     
/*     */     
/*     */ 
/*     */ 
/*  96 */       a.ALLATORIxDEMO = a;a;a.<init>();new java/util/ArrayList.g = a;a.f = new java.util.ArrayList();
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 155 */     a.D = new java.util.ArrayList();
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 162 */     a.M = new java.util.ArrayList();1.b = Boolean.valueOf(a);
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
/* 113 */     return a.D;
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
/*     */     //   0: aload_1
/*     */     //   1: invokevirtual 58	nano/spook1998/rust/object/User:getName	()Ljava/lang/String;
/*     */     //   4: invokestatic 64	org/bukkit/Bukkit:getPlayer	(Ljava/lang/String;)Lorg/bukkit/entity/Player;
/*     */     //   7: astore_2
/*     */     //   8: aload_0
/*     */     //   9: aload_2
/*     */     //   10: dup_x1
/*     */     //   11: invokeinterface 70 1 0
/*     */     //   16: invokestatic 76	nano/spook1998/rust/utils/LocationUtil:getLocationWall	(Lorg/bukkit/Location;)Lorg/bukkit/Location;
/*     */     //   19: putfield 28	nano/spook1998/rust/structural/WallSpec:ALLATORIxDEMO	Lorg/bukkit/Location;
/*     */     //   22: invokestatic 82	nano/spook1998/rust/utils/DirectionUtil:getDirectionSpec	(Lorg/bukkit/entity/Player;)Lnano/spook1998/rust/utils/type/DirectionType;
/*     */     //   25: astore_2
/*     */     //   26: iconst_0
/*     */     //   27: invokestatic 87	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   30: astore_3
/*     */     //   31: aload_2
/*     */     //   32: getstatic 93	nano/spook1998/rust/utils/type/DirectionType:P	Lnano/spook1998/rust/utils/type/DirectionType;
/*     */     //   35: invokevirtual 97	nano/spook1998/rust/utils/type/DirectionType:equals	(Ljava/lang/Object;)Z
/*     */     //   38: ifeq +481 -> 519
/*     */     //   41: bipush -2
/*     */     //   43: invokestatic 87	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   46: astore 4
/*     */     //   48: bipush -2
/*     */     //   50: invokestatic 87	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   53: astore 5
/*     */     //   55: aload_0
/*     */     //   56: getfield 28	nano/spook1998/rust/structural/WallSpec:ALLATORIxDEMO	Lorg/bukkit/Location;
/*     */     //   59: invokevirtual 103	org/bukkit/Location:getX	()D
/*     */     //   62: dconst_0
/*     */     //   63: dcmpg
/*     */     //   64: ifge +15 -> 79
/*     */     //   67: aload 4
/*     */     //   69: invokevirtual 107	java/lang/Integer:intValue	()I
/*     */     //   72: iconst_1
/*     */     //   73: isub
/*     */     //   74: invokestatic 87	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   77: astore 4
/*     */     //   79: aload_0
/*     */     //   80: getfield 28	nano/spook1998/rust/structural/WallSpec:ALLATORIxDEMO	Lorg/bukkit/Location;
/*     */     //   83: invokevirtual 110	org/bukkit/Location:getZ	()D
/*     */     //   86: dconst_0
/*     */     //   87: dcmpg
/*     */     //   88: ifge +15 -> 103
/*     */     //   91: aload 5
/*     */     //   93: invokevirtual 107	java/lang/Integer:intValue	()I
/*     */     //   96: iconst_1
/*     */     //   97: isub
/*     */     //   98: invokestatic 87	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   101: astore 5
/*     */     //   103: iconst_0
/*     */     //   104: invokestatic 87	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   107: dup
/*     */     //   108: astore 6
/*     */     //   110: goto +402 -> 512
/*     */     //   113: athrow
/*     */     //   114: iconst_0
/*     */     //   115: invokestatic 87	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   118: astore 7
/*     */     //   120: aload_0
/*     */     //   121: getfield 28	nano/spook1998/rust/structural/WallSpec:ALLATORIxDEMO	Lorg/bukkit/Location;
/*     */     //   124: invokevirtual 113	org/bukkit/Location:clone	()Lorg/bukkit/Location;
/*     */     //   127: invokevirtual 116	org/bukkit/Location:getY	()D
/*     */     //   130: ldc2_w 117
/*     */     //   133: dsub
/*     */     //   134: d2i
/*     */     //   135: invokestatic 87	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   138: dup
/*     */     //   139: astore 8
/*     */     //   141: goto +302 -> 443
/*     */     //   144: athrow
/*     */     //   145: aload_0
/*     */     //   146: getfield 28	nano/spook1998/rust/structural/WallSpec:ALLATORIxDEMO	Lorg/bukkit/Location;
/*     */     //   149: invokevirtual 113	org/bukkit/Location:clone	()Lorg/bukkit/Location;
/*     */     //   152: aload 4
/*     */     //   154: invokevirtual 107	java/lang/Integer:intValue	()I
/*     */     //   157: i2d
/*     */     //   158: dconst_0
/*     */     //   159: aload 5
/*     */     //   161: invokevirtual 107	java/lang/Integer:intValue	()I
/*     */     //   164: i2d
/*     */     //   165: invokevirtual 122	org/bukkit/Location:add	(DDD)Lorg/bukkit/Location;
/*     */     //   168: dup
/*     */     //   169: astore 9
/*     */     //   171: dup
/*     */     //   172: aload 8
/*     */     //   174: invokevirtual 107	java/lang/Integer:intValue	()I
/*     */     //   177: i2d
/*     */     //   178: invokevirtual 126	org/bukkit/Location:setY	(D)V
/*     */     //   181: invokevirtual 130	org/bukkit/Location:getBlock	()Lorg/bukkit/block/Block;
/*     */     //   184: dup
/*     */     //   185: astore 10
/*     */     //   187: invokeinterface 133 1 0
/*     */     //   192: invokestatic 139	nano/spook1998/rust/object/utils/RegionUtil:getRegionAtLocation	(Lorg/bukkit/Location;)Lnano/spook1998/rust/object/Region;
/*     */     //   195: dup
/*     */     //   196: astore 11
/*     */     //   198: ifnull +20 -> 218
/*     */     //   201: aload 11
/*     */     //   203: aload_1
/*     */     //   204: invokevirtual 145	nano/spook1998/rust/object/Region:checkUser	(Lnano/spook1998/rust/object/User;)Z
/*     */     //   207: ifne +11 -> 218
/*     */     //   210: aload_0
/*     */     //   211: iconst_0
/*     */     //   212: invokestatic 43	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
/*     */     //   215: putfield 45	nano/spook1998/rust/structural/WallSpec:b	Ljava/lang/Boolean;
/*     */     //   218: aload_3
/*     */     //   219: invokevirtual 107	java/lang/Integer:intValue	()I
/*     */     //   222: ifeq +11 -> 233
/*     */     //   225: aload_3
/*     */     //   226: invokevirtual 107	java/lang/Integer:intValue	()I
/*     */     //   229: iconst_4
/*     */     //   230: if_icmpne +114 -> 344
/*     */     //   233: aload 7
/*     */     //   235: invokevirtual 107	java/lang/Integer:intValue	()I
/*     */     //   238: ifne +52 -> 290
/*     */     //   241: aload 10
/*     */     //   243: invokeinterface 149 1 0
/*     */     //   248: getstatic 155	org/bukkit/Material:LOG	Lorg/bukkit/Material;
/*     */     //   251: invokevirtual 156	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
/*     */     //   254: ifne +16 -> 270
/*     */     //   257: aload 7
/*     */     //   259: aload_0
/*     */     //   260: iconst_0
/*     */     //   261: invokestatic 43	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
/*     */     //   264: putfield 45	nano/spook1998/rust/structural/WallSpec:b	Ljava/lang/Boolean;
/*     */     //   267: goto +25 -> 292
/*     */     //   270: aload 10
/*     */     //   272: invokeinterface 160 1 0
/*     */     //   277: bipush 13
/*     */     //   279: if_icmpeq +11 -> 290
/*     */     //   282: aload_0
/*     */     //   283: iconst_0
/*     */     //   284: invokestatic 43	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
/*     */     //   287: putfield 45	nano/spook1998/rust/structural/WallSpec:b	Ljava/lang/Boolean;
/*     */     //   290: aload 7
/*     */     //   292: invokevirtual 107	java/lang/Integer:intValue	()I
/*     */     //   295: iconst_4
/*     */     //   296: if_icmpne +31 -> 327
/*     */     //   299: aload 7
/*     */     //   301: aload_0
/*     */     //   302: getfield 33	nano/spook1998/rust/structural/WallSpec:f	Ljava/util/List;
/*     */     //   305: aload 10
/*     */     //   307: invokeinterface 164 2 0
/*     */     //   312: aload_0
/*     */     //   313: getfield 37	nano/spook1998/rust/structural/WallSpec:M	Ljava/util/List;
/*     */     //   316: aload 10
/*     */     //   318: invokeinterface 164 2 0
/*     */     //   323: pop2
/*     */     //   324: goto +96 -> 420
/*     */     //   327: aload_0
/*     */     //   328: getfield 33	nano/spook1998/rust/structural/WallSpec:f	Ljava/util/List;
/*     */     //   331: aload 10
/*     */     //   333: invokeinterface 164 2 0
/*     */     //   338: pop
/*     */     //   339: aload 7
/*     */     //   341: goto +79 -> 420
/*     */     //   344: aload 7
/*     */     //   346: invokevirtual 107	java/lang/Integer:intValue	()I
/*     */     //   349: ifeq +12 -> 361
/*     */     //   352: aload 7
/*     */     //   354: invokevirtual 107	java/lang/Integer:intValue	()I
/*     */     //   357: iconst_4
/*     */     //   358: if_icmpne +20 -> 378
/*     */     //   361: aload_0
/*     */     //   362: getfield 33	nano/spook1998/rust/structural/WallSpec:f	Ljava/util/List;
/*     */     //   365: aload 10
/*     */     //   367: invokeinterface 164 2 0
/*     */     //   372: pop
/*     */     //   373: aload 7
/*     */     //   375: goto +45 -> 420
/*     */     //   378: aload 10
/*     */     //   380: invokeinterface 149 1 0
/*     */     //   385: getstatic 167	org/bukkit/Material:AIR	Lorg/bukkit/Material;
/*     */     //   388: invokevirtual 156	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
/*     */     //   391: ifeq +15 -> 406
/*     */     //   394: aload_0
/*     */     //   395: getfield 35	nano/spook1998/rust/structural/WallSpec:D	Ljava/util/List;
/*     */     //   398: aload 10
/*     */     //   400: invokeinterface 164 2 0
/*     */     //   405: pop
/*     */     //   406: aload_0
/*     */     //   407: getfield 19	nano/spook1998/rust/structural/WallSpec:g	Ljava/util/List;
/*     */     //   410: aload 10
/*     */     //   412: invokeinterface 164 2 0
/*     */     //   417: pop
/*     */     //   418: aload 7
/*     */     //   420: invokevirtual 107	java/lang/Integer:intValue	()I
/*     */     //   423: iconst_1
/*     */     //   424: iadd
/*     */     //   425: invokestatic 87	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   428: astore 7
/*     */     //   430: aload 8
/*     */     //   432: invokevirtual 107	java/lang/Integer:intValue	()I
/*     */     //   435: iconst_1
/*     */     //   436: iadd
/*     */     //   437: invokestatic 87	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   440: dup
/*     */     //   441: astore 8
/*     */     //   443: invokevirtual 107	java/lang/Integer:intValue	()I
/*     */     //   446: i2d
/*     */     //   447: aload_0
/*     */     //   448: getfield 28	nano/spook1998/rust/structural/WallSpec:ALLATORIxDEMO	Lorg/bukkit/Location;
/*     */     //   451: invokevirtual 113	org/bukkit/Location:clone	()Lorg/bukkit/Location;
/*     */     //   454: invokevirtual 116	org/bukkit/Location:getY	()D
/*     */     //   457: ldc2_w 117
/*     */     //   460: dadd
/*     */     //   461: dcmpg
/*     */     //   462: ifle -317 -> 145
/*     */     //   465: aload_3
/*     */     //   466: invokevirtual 107	java/lang/Integer:intValue	()I
/*     */     //   469: iconst_1
/*     */     //   470: iadd
/*     */     //   471: invokestatic 87	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   474: astore_3
/*     */     //   475: aload 4
/*     */     //   477: invokevirtual 107	java/lang/Integer:intValue	()I
/*     */     //   480: iconst_1
/*     */     //   481: iadd
/*     */     //   482: invokestatic 87	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   485: astore 4
/*     */     //   487: aload 5
/*     */     //   489: invokevirtual 107	java/lang/Integer:intValue	()I
/*     */     //   492: iconst_1
/*     */     //   493: iadd
/*     */     //   494: invokestatic 87	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   497: astore 5
/*     */     //   499: aload 6
/*     */     //   501: invokevirtual 107	java/lang/Integer:intValue	()I
/*     */     //   504: iconst_1
/*     */     //   505: iadd
/*     */     //   506: invokestatic 87	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   509: dup
/*     */     //   510: astore 6
/*     */     //   512: invokevirtual 107	java/lang/Integer:intValue	()I
/*     */     //   515: iconst_5
/*     */     //   516: if_icmplt -402 -> 114
/*     */     //   519: aload_2
/*     */     //   520: getstatic 170	nano/spook1998/rust/utils/type/DirectionType:B	Lnano/spook1998/rust/utils/type/DirectionType;
/*     */     //   523: invokevirtual 97	nano/spook1998/rust/utils/type/DirectionType:equals	(Ljava/lang/Object;)Z
/*     */     //   526: ifeq +478 -> 1004
/*     */     //   529: iconst_2
/*     */     //   530: invokestatic 87	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   533: astore 4
/*     */     //   535: bipush -2
/*     */     //   537: invokestatic 87	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   540: astore 5
/*     */     //   542: aload_0
/*     */     //   543: getfield 28	nano/spook1998/rust/structural/WallSpec:ALLATORIxDEMO	Lorg/bukkit/Location;
/*     */     //   546: invokevirtual 103	org/bukkit/Location:getX	()D
/*     */     //   549: dconst_0
/*     */     //   550: dcmpg
/*     */     //   551: ifge +15 -> 566
/*     */     //   554: aload 4
/*     */     //   556: invokevirtual 107	java/lang/Integer:intValue	()I
/*     */     //   559: iconst_1
/*     */     //   560: iadd
/*     */     //   561: invokestatic 87	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   564: astore 4
/*     */     //   566: aload_0
/*     */     //   567: getfield 28	nano/spook1998/rust/structural/WallSpec:ALLATORIxDEMO	Lorg/bukkit/Location;
/*     */     //   570: invokevirtual 110	org/bukkit/Location:getZ	()D
/*     */     //   573: dconst_0
/*     */     //   574: dcmpg
/*     */     //   575: ifge +15 -> 590
/*     */     //   578: aload 5
/*     */     //   580: invokevirtual 107	java/lang/Integer:intValue	()I
/*     */     //   583: iconst_1
/*     */     //   584: isub
/*     */     //   585: invokestatic 87	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   588: astore 5
/*     */     //   590: iconst_0
/*     */     //   591: invokestatic 87	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   594: dup
/*     */     //   595: astore 6
/*     */     //   597: goto +400 -> 997
/*     */     //   600: iconst_0
/*     */     //   601: invokestatic 87	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   604: astore 7
/*     */     //   606: aload_0
/*     */     //   607: getfield 28	nano/spook1998/rust/structural/WallSpec:ALLATORIxDEMO	Lorg/bukkit/Location;
/*     */     //   610: invokevirtual 113	org/bukkit/Location:clone	()Lorg/bukkit/Location;
/*     */     //   613: invokevirtual 116	org/bukkit/Location:getY	()D
/*     */     //   616: ldc2_w 117
/*     */     //   619: dsub
/*     */     //   620: d2i
/*     */     //   621: invokestatic 87	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   624: dup
/*     */     //   625: astore 8
/*     */     //   627: goto +301 -> 928
/*     */     //   630: aload_0
/*     */     //   631: getfield 28	nano/spook1998/rust/structural/WallSpec:ALLATORIxDEMO	Lorg/bukkit/Location;
/*     */     //   634: invokevirtual 113	org/bukkit/Location:clone	()Lorg/bukkit/Location;
/*     */     //   637: aload 4
/*     */     //   639: invokevirtual 107	java/lang/Integer:intValue	()I
/*     */     //   642: i2d
/*     */     //   643: dconst_0
/*     */     //   644: aload 5
/*     */     //   646: invokevirtual 107	java/lang/Integer:intValue	()I
/*     */     //   649: i2d
/*     */     //   650: invokevirtual 122	org/bukkit/Location:add	(DDD)Lorg/bukkit/Location;
/*     */     //   653: dup
/*     */     //   654: astore 9
/*     */     //   656: dup
/*     */     //   657: aload 8
/*     */     //   659: invokevirtual 107	java/lang/Integer:intValue	()I
/*     */     //   662: i2d
/*     */     //   663: invokevirtual 126	org/bukkit/Location:setY	(D)V
/*     */     //   666: invokevirtual 130	org/bukkit/Location:getBlock	()Lorg/bukkit/block/Block;
/*     */     //   669: dup
/*     */     //   670: astore 10
/*     */     //   672: invokeinterface 133 1 0
/*     */     //   677: invokestatic 139	nano/spook1998/rust/object/utils/RegionUtil:getRegionAtLocation	(Lorg/bukkit/Location;)Lnano/spook1998/rust/object/Region;
/*     */     //   680: dup
/*     */     //   681: astore 11
/*     */     //   683: ifnull +20 -> 703
/*     */     //   686: aload 11
/*     */     //   688: aload_1
/*     */     //   689: invokevirtual 145	nano/spook1998/rust/object/Region:checkUser	(Lnano/spook1998/rust/object/User;)Z
/*     */     //   692: ifne +11 -> 703
/*     */     //   695: aload_0
/*     */     //   696: iconst_0
/*     */     //   697: invokestatic 43	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
/*     */     //   700: putfield 45	nano/spook1998/rust/structural/WallSpec:b	Ljava/lang/Boolean;
/*     */     //   703: aload_3
/*     */     //   704: invokevirtual 107	java/lang/Integer:intValue	()I
/*     */     //   707: ifeq +11 -> 718
/*     */     //   710: aload_3
/*     */     //   711: invokevirtual 107	java/lang/Integer:intValue	()I
/*     */     //   714: iconst_4
/*     */     //   715: if_icmpne +114 -> 829
/*     */     //   718: aload 7
/*     */     //   720: invokevirtual 107	java/lang/Integer:intValue	()I
/*     */     //   723: ifne +52 -> 775
/*     */     //   726: aload 10
/*     */     //   728: invokeinterface 149 1 0
/*     */     //   733: getstatic 155	org/bukkit/Material:LOG	Lorg/bukkit/Material;
/*     */     //   736: invokevirtual 156	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
/*     */     //   739: ifne +16 -> 755
/*     */     //   742: aload 7
/*     */     //   744: aload_0
/*     */     //   745: iconst_0
/*     */     //   746: invokestatic 43	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
/*     */     //   749: putfield 45	nano/spook1998/rust/structural/WallSpec:b	Ljava/lang/Boolean;
/*     */     //   752: goto +25 -> 777
/*     */     //   755: aload 10
/*     */     //   757: invokeinterface 160 1 0
/*     */     //   762: bipush 13
/*     */     //   764: if_icmpeq +11 -> 775
/*     */     //   767: aload_0
/*     */     //   768: iconst_0
/*     */     //   769: invokestatic 43	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
/*     */     //   772: putfield 45	nano/spook1998/rust/structural/WallSpec:b	Ljava/lang/Boolean;
/*     */     //   775: aload 7
/*     */     //   777: invokevirtual 107	java/lang/Integer:intValue	()I
/*     */     //   780: iconst_4
/*     */     //   781: if_icmpne +31 -> 812
/*     */     //   784: aload 7
/*     */     //   786: aload_0
/*     */     //   787: getfield 33	nano/spook1998/rust/structural/WallSpec:f	Ljava/util/List;
/*     */     //   790: aload 10
/*     */     //   792: invokeinterface 164 2 0
/*     */     //   797: aload_0
/*     */     //   798: getfield 37	nano/spook1998/rust/structural/WallSpec:M	Ljava/util/List;
/*     */     //   801: aload 10
/*     */     //   803: invokeinterface 164 2 0
/*     */     //   808: pop2
/*     */     //   809: goto +96 -> 905
/*     */     //   812: aload_0
/*     */     //   813: getfield 33	nano/spook1998/rust/structural/WallSpec:f	Ljava/util/List;
/*     */     //   816: aload 10
/*     */     //   818: invokeinterface 164 2 0
/*     */     //   823: pop
/*     */     //   824: aload 7
/*     */     //   826: goto +79 -> 905
/*     */     //   829: aload 7
/*     */     //   831: invokevirtual 107	java/lang/Integer:intValue	()I
/*     */     //   834: ifeq +12 -> 846
/*     */     //   837: aload 7
/*     */     //   839: invokevirtual 107	java/lang/Integer:intValue	()I
/*     */     //   842: iconst_4
/*     */     //   843: if_icmpne +20 -> 863
/*     */     //   846: aload_0
/*     */     //   847: getfield 33	nano/spook1998/rust/structural/WallSpec:f	Ljava/util/List;
/*     */     //   850: aload 10
/*     */     //   852: invokeinterface 164 2 0
/*     */     //   857: pop
/*     */     //   858: aload 7
/*     */     //   860: goto +45 -> 905
/*     */     //   863: aload 10
/*     */     //   865: invokeinterface 149 1 0
/*     */     //   870: getstatic 167	org/bukkit/Material:AIR	Lorg/bukkit/Material;
/*     */     //   873: invokevirtual 156	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
/*     */     //   876: ifeq +15 -> 891
/*     */     //   879: aload_0
/*     */     //   880: getfield 35	nano/spook1998/rust/structural/WallSpec:D	Ljava/util/List;
/*     */     //   883: aload 10
/*     */     //   885: invokeinterface 164 2 0
/*     */     //   890: pop
/*     */     //   891: aload_0
/*     */     //   892: getfield 19	nano/spook1998/rust/structural/WallSpec:g	Ljava/util/List;
/*     */     //   895: aload 10
/*     */     //   897: invokeinterface 164 2 0
/*     */     //   902: pop
/*     */     //   903: aload 7
/*     */     //   905: invokevirtual 107	java/lang/Integer:intValue	()I
/*     */     //   908: iconst_1
/*     */     //   909: iadd
/*     */     //   910: invokestatic 87	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   913: astore 7
/*     */     //   915: aload 8
/*     */     //   917: invokevirtual 107	java/lang/Integer:intValue	()I
/*     */     //   920: iconst_1
/*     */     //   921: iadd
/*     */     //   922: invokestatic 87	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   925: dup
/*     */     //   926: astore 8
/*     */     //   928: invokevirtual 107	java/lang/Integer:intValue	()I
/*     */     //   931: i2d
/*     */     //   932: aload_0
/*     */     //   933: getfield 28	nano/spook1998/rust/structural/WallSpec:ALLATORIxDEMO	Lorg/bukkit/Location;
/*     */     //   936: invokevirtual 113	org/bukkit/Location:clone	()Lorg/bukkit/Location;
/*     */     //   939: invokevirtual 116	org/bukkit/Location:getY	()D
/*     */     //   942: ldc2_w 117
/*     */     //   945: dadd
/*     */     //   946: dcmpg
/*     */     //   947: ifle -317 -> 630
/*     */     //   950: aload_3
/*     */     //   951: invokevirtual 107	java/lang/Integer:intValue	()I
/*     */     //   954: iconst_1
/*     */     //   955: iadd
/*     */     //   956: invokestatic 87	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   959: astore_3
/*     */     //   960: aload 4
/*     */     //   962: invokevirtual 107	java/lang/Integer:intValue	()I
/*     */     //   965: iconst_1
/*     */     //   966: isub
/*     */     //   967: invokestatic 87	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   970: astore 4
/*     */     //   972: aload 5
/*     */     //   974: invokevirtual 107	java/lang/Integer:intValue	()I
/*     */     //   977: iconst_1
/*     */     //   978: iadd
/*     */     //   979: invokestatic 87	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   982: astore 5
/*     */     //   984: aload 6
/*     */     //   986: invokevirtual 107	java/lang/Integer:intValue	()I
/*     */     //   989: iconst_1
/*     */     //   990: iadd
/*     */     //   991: invokestatic 87	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   994: dup
/*     */     //   995: astore 6
/*     */     //   997: invokevirtual 107	java/lang/Integer:intValue	()I
/*     */     //   1000: iconst_5
/*     */     //   1001: if_icmplt -401 -> 600
/*     */     //   1004: return
/*     */     // Line number table:
/*     */     //   Java source line #72	-> byte code offset #0
/*     */     //   Java source line #5	-> byte code offset #8
/*     */     //   Java source line #86	-> byte code offset #22
/*     */     //   Java source line #29	-> byte code offset #26
/*     */     //   Java source line #163	-> byte code offset #31
/*     */     //   Java source line #193	-> byte code offset #41
/*     */     //   Java source line #60	-> byte code offset #48
/*     */     //   Java source line #129	-> byte code offset #55
/*     */     //   Java source line #21	-> byte code offset #79
/*     */     //   Java source line #175	-> byte code offset #103
/*     */     //   Java source line #112	-> byte code offset #114
/*     */     //   Java source line #70	-> byte code offset #120
/*     */     //   Java source line #158	-> byte code offset #145
/*     */     //   Java source line #138	-> byte code offset #171
/*     */     //   Java source line #91	-> byte code offset #181
/*     */     //   Java source line #39	-> byte code offset #187
/*     */     //   Java source line #59	-> byte code offset #198
/*     */     //   Java source line #174	-> byte code offset #201
/*     */     //   Java source line #18	-> byte code offset #218
/*     */     //   Java source line #120	-> byte code offset #233
/*     */     //   Java source line #11	-> byte code offset #241
/*     */     //   Java source line #176	-> byte code offset #259
/*     */     //   Java source line #66	-> byte code offset #267
/*     */     //   Java source line #20	-> byte code offset #270
/*     */     //   Java source line #173	-> byte code offset #282
/*     */     //   Java source line #106	-> byte code offset #290
/*     */     //   Java source line #64	-> byte code offset #301
/*     */     //   Java source line #147	-> byte code offset #312
/*     */     //   Java source line #74	-> byte code offset #324
/*     */     //   Java source line #27	-> byte code offset #327
/*     */     //   Java source line #133	-> byte code offset #341
/*     */     //   Java source line #121	-> byte code offset #344
/*     */     //   Java source line #57	-> byte code offset #361
/*     */     //   Java source line #192	-> byte code offset #375
/*     */     //   Java source line #99	-> byte code offset #378
/*     */     //   Java source line #28	-> byte code offset #394
/*     */     //   Java source line #157	-> byte code offset #406
/*     */     //   Java source line #140	-> byte code offset #418
/*     */     //   Java source line #70	-> byte code offset #430
/*     */     //   Java source line #14	-> byte code offset #465
/*     */     //   Java source line #67	-> byte code offset #475
/*     */     //   Java source line #125	-> byte code offset #487
/*     */     //   Java source line #175	-> byte code offset #499
/*     */     //   Java source line #137	-> byte code offset #519
/*     */     //   Java source line #165	-> byte code offset #529
/*     */     //   Java source line #4	-> byte code offset #535
/*     */     //   Java source line #154	-> byte code offset #542
/*     */     //   Java source line #87	-> byte code offset #566
/*     */     //   Java source line #22	-> byte code offset #590
/*     */     //   Java source line #179	-> byte code offset #600
/*     */     //   Java source line #16	-> byte code offset #606
/*     */     //   Java source line #43	-> byte code offset #630
/*     */     //   Java source line #148	-> byte code offset #656
/*     */     //   Java source line #116	-> byte code offset #666
/*     */     //   Java source line #15	-> byte code offset #672
/*     */     //   Java source line #181	-> byte code offset #683
/*     */     //   Java source line #102	-> byte code offset #686
/*     */     //   Java source line #159	-> byte code offset #703
/*     */     //   Java source line #128	-> byte code offset #718
/*     */     //   Java source line #191	-> byte code offset #726
/*     */     //   Java source line #197	-> byte code offset #744
/*     */     //   Java source line #126	-> byte code offset #752
/*     */     //   Java source line #6	-> byte code offset #755
/*     */     //   Java source line #53	-> byte code offset #767
/*     */     //   Java source line #149	-> byte code offset #775
/*     */     //   Java source line #63	-> byte code offset #786
/*     */     //   Java source line #131	-> byte code offset #797
/*     */     //   Java source line #136	-> byte code offset #809
/*     */     //   Java source line #183	-> byte code offset #812
/*     */     //   Java source line #184	-> byte code offset #826
/*     */     //   Java source line #84	-> byte code offset #829
/*     */     //   Java source line #44	-> byte code offset #846
/*     */     //   Java source line #52	-> byte code offset #860
/*     */     //   Java source line #114	-> byte code offset #863
/*     */     //   Java source line #55	-> byte code offset #879
/*     */     //   Java source line #198	-> byte code offset #891
/*     */     //   Java source line #103	-> byte code offset #903
/*     */     //   Java source line #16	-> byte code offset #915
/*     */     //   Java source line #178	-> byte code offset #950
/*     */     //   Java source line #65	-> byte code offset #960
/*     */     //   Java source line #83	-> byte code offset #972
/*     */     //   Java source line #22	-> byte code offset #984
/*     */     //   Java source line #188	-> byte code offset #1004
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	1005	0	a	WallSpec
/*     */     //   0	1005	1	a	nano.spook1998.rust.object.User
/*     */   }
/*     */ }


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\structural\WallSpec.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */