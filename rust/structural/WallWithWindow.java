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
/*     */ public class WallWithWindow
/*     */ {
/*     */   private List<Block> F;
/*     */   private List<Block> g;
/*     */   private List<Block> f;
/*     */   private Location D;
/*     */   private List<Block> M;
/*     */   private List<Block> b;
/*     */   private Boolean ALLATORIxDEMO;
/*     */   
/*     */   public Boolean isBuild()
/*     */   {
/*  47 */     return a.ALLATORIxDEMO;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public List<Block> getListBlock1()
/*     */   {
/*  56 */     return a.b;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public List<Block> getFakeSpawn()
/*     */   {
/*  68 */     return a.f;
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
/*     */   public List<Block> getListBlock4()
/*     */   {
/*  86 */     return a.M;
/*     */   }
/*     */   
/*  89 */   public List<Block> getListBlock3() { return a.F; }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/* 142 */     return a.g;
/*     */   }
/*     */   
/*     */   public WallWithWindow(Location a)
/*     */   {
/*  32 */     
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  92 */       a.D = a;a;a.<init>();new java/util/ArrayList.g = a;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 155 */     a.b = new ArrayList();
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 162 */     a.f = new ArrayList();a.M = new ArrayList();a.F = new ArrayList();
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 182 */     1.ALLATORIxDEMO = Boolean.valueOf(a);
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public void calculate(nano.spook1998.rust.object.User a)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: iconst_0
/*     */     //   1: invokestatic 33	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   4: astore_2
/*     */     //   5: aload_1
/*     */     //   6: invokevirtual 39	nano/spook1998/rust/object/User:getName	()Ljava/lang/String;
/*     */     //   9: invokestatic 45	org/bukkit/Bukkit:getPlayer	(Ljava/lang/String;)Lorg/bukkit/entity/Player;
/*     */     //   12: astore_3
/*     */     //   13: iconst_2
/*     */     //   14: aload_0
/*     */     //   15: dup_x1
/*     */     //   16: aload_3
/*     */     //   17: invokeinterface 51 1 0
/*     */     //   22: invokestatic 57	nano/spook1998/rust/utils/LocationUtil:getLocationWall	(Lorg/bukkit/Location;)Lorg/bukkit/Location;
/*     */     //   25: putfield 59	nano/spook1998/rust/structural/WallWithWindow:D	Lorg/bukkit/Location;
/*     */     //   28: invokestatic 33	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   31: astore 4
/*     */     //   33: iconst_2
/*     */     //   34: invokestatic 33	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   37: astore 5
/*     */     //   39: getfield 59	nano/spook1998/rust/structural/WallWithWindow:D	Lorg/bukkit/Location;
/*     */     //   42: invokevirtual 65	org/bukkit/Location:getX	()D
/*     */     //   45: dconst_0
/*     */     //   46: dcmpg
/*     */     //   47: ifge +15 -> 62
/*     */     //   50: aload 4
/*     */     //   52: invokevirtual 69	java/lang/Integer:intValue	()I
/*     */     //   55: iconst_1
/*     */     //   56: iadd
/*     */     //   57: invokestatic 33	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   60: astore 4
/*     */     //   62: aload_0
/*     */     //   63: getfield 59	nano/spook1998/rust/structural/WallWithWindow:D	Lorg/bukkit/Location;
/*     */     //   66: invokevirtual 72	org/bukkit/Location:getZ	()D
/*     */     //   69: dconst_0
/*     */     //   70: dcmpg
/*     */     //   71: ifge +15 -> 86
/*     */     //   74: aload 5
/*     */     //   76: invokevirtual 69	java/lang/Integer:intValue	()I
/*     */     //   79: iconst_1
/*     */     //   80: iadd
/*     */     //   81: invokestatic 33	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   84: astore 5
/*     */     //   86: aload_3
/*     */     //   87: invokestatic 78	nano/spook1998/rust/utils/DirectionUtil:getDirection	(Lorg/bukkit/entity/Player;)Lnano/spook1998/rust/utils/type/DirectionType;
/*     */     //   90: astore 6
/*     */     //   92: iconst_0
/*     */     //   93: invokestatic 33	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   96: astore 7
/*     */     //   98: aload 6
/*     */     //   100: getstatic 84	nano/spook1998/rust/utils/type/DirectionType:B	Lnano/spook1998/rust/utils/type/DirectionType;
/*     */     //   103: if_acmpne +508 -> 611
/*     */     //   106: aload_0
/*     */     //   107: getfield 59	nano/spook1998/rust/structural/WallWithWindow:D	Lorg/bukkit/Location;
/*     */     //   110: invokevirtual 65	org/bukkit/Location:getX	()D
/*     */     //   113: d2i
/*     */     //   114: aload 4
/*     */     //   116: invokevirtual 69	java/lang/Integer:intValue	()I
/*     */     //   119: isub
/*     */     //   120: dup
/*     */     //   121: istore 8
/*     */     //   123: goto +472 -> 595
/*     */     //   126: athrow
/*     */     //   127: aload_0
/*     */     //   128: getfield 59	nano/spook1998/rust/structural/WallWithWindow:D	Lorg/bukkit/Location;
/*     */     //   131: invokevirtual 87	org/bukkit/Location:getY	()D
/*     */     //   134: d2i
/*     */     //   135: iconst_2
/*     */     //   136: isub
/*     */     //   137: dup
/*     */     //   138: istore 9
/*     */     //   140: goto +434 -> 574
/*     */     //   143: athrow
/*     */     //   144: new 61	org/bukkit/Location
/*     */     //   147: dup
/*     */     //   148: aload_0
/*     */     //   149: getfield 59	nano/spook1998/rust/structural/WallWithWindow:D	Lorg/bukkit/Location;
/*     */     //   152: invokevirtual 91	org/bukkit/Location:getWorld	()Lorg/bukkit/World;
/*     */     //   155: iload 8
/*     */     //   157: i2d
/*     */     //   158: iload 9
/*     */     //   160: i2d
/*     */     //   161: aload_0
/*     */     //   162: getfield 59	nano/spook1998/rust/structural/WallWithWindow:D	Lorg/bukkit/Location;
/*     */     //   165: invokevirtual 72	org/bukkit/Location:getZ	()D
/*     */     //   168: invokespecial 95	org/bukkit/Location:<init>	(Lorg/bukkit/World;DDD)V
/*     */     //   171: invokevirtual 99	org/bukkit/Location:getBlock	()Lorg/bukkit/block/Block;
/*     */     //   174: dup
/*     */     //   175: astore 10
/*     */     //   177: invokeinterface 102 1 0
/*     */     //   182: invokestatic 108	nano/spook1998/rust/object/utils/RegionUtil:getRegionAtLocation	(Lorg/bukkit/Location;)Lnano/spook1998/rust/object/Region;
/*     */     //   185: dup
/*     */     //   186: astore 11
/*     */     //   188: ifnull +20 -> 208
/*     */     //   191: aload 11
/*     */     //   193: aload_1
/*     */     //   194: invokevirtual 114	nano/spook1998/rust/object/Region:checkUser	(Lnano/spook1998/rust/object/User;)Z
/*     */     //   197: ifne +11 -> 208
/*     */     //   200: aload_0
/*     */     //   201: iconst_0
/*     */     //   202: invokestatic 119	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
/*     */     //   205: putfield 121	nano/spook1998/rust/structural/WallWithWindow:ALLATORIxDEMO	Ljava/lang/Boolean;
/*     */     //   208: aload_2
/*     */     //   209: invokevirtual 69	java/lang/Integer:intValue	()I
/*     */     //   212: ifeq +38 -> 250
/*     */     //   215: aload_2
/*     */     //   216: invokevirtual 69	java/lang/Integer:intValue	()I
/*     */     //   219: iconst_5
/*     */     //   220: if_icmpeq +30 -> 250
/*     */     //   223: aload_2
/*     */     //   224: invokevirtual 69	java/lang/Integer:intValue	()I
/*     */     //   227: bipush 10
/*     */     //   229: if_icmpeq +21 -> 250
/*     */     //   232: aload_2
/*     */     //   233: invokevirtual 69	java/lang/Integer:intValue	()I
/*     */     //   236: bipush 15
/*     */     //   238: if_icmpeq +12 -> 250
/*     */     //   241: aload_2
/*     */     //   242: invokevirtual 69	java/lang/Integer:intValue	()I
/*     */     //   245: bipush 20
/*     */     //   247: if_icmpne +27 -> 274
/*     */     //   250: aload 10
/*     */     //   252: invokeinterface 125 1 0
/*     */     //   257: getstatic 131	org/bukkit/Material:LOG	Lorg/bukkit/Material;
/*     */     //   260: invokevirtual 135	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
/*     */     //   263: ifne +11 -> 274
/*     */     //   266: aload_0
/*     */     //   267: iconst_0
/*     */     //   268: invokestatic 119	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
/*     */     //   271: putfield 121	nano/spook1998/rust/structural/WallWithWindow:ALLATORIxDEMO	Ljava/lang/Boolean;
/*     */     //   274: aload_2
/*     */     //   275: invokevirtual 69	java/lang/Integer:intValue	()I
/*     */     //   278: ifeq +12 -> 290
/*     */     //   281: aload_2
/*     */     //   282: invokevirtual 69	java/lang/Integer:intValue	()I
/*     */     //   285: bipush 20
/*     */     //   287: if_icmpne +23 -> 310
/*     */     //   290: aload 10
/*     */     //   292: invokeinterface 139 1 0
/*     */     //   297: bipush 13
/*     */     //   299: if_icmpeq +11 -> 310
/*     */     //   302: aload_0
/*     */     //   303: iconst_0
/*     */     //   304: invokestatic 119	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
/*     */     //   307: putfield 121	nano/spook1998/rust/structural/WallWithWindow:ALLATORIxDEMO	Ljava/lang/Boolean;
/*     */     //   310: aload_2
/*     */     //   311: invokevirtual 69	java/lang/Integer:intValue	()I
/*     */     //   314: iconst_4
/*     */     //   315: if_icmpeq +12 -> 327
/*     */     //   318: aload_2
/*     */     //   319: invokevirtual 69	java/lang/Integer:intValue	()I
/*     */     //   322: bipush 24
/*     */     //   324: if_icmpne +15 -> 339
/*     */     //   327: aload_0
/*     */     //   328: getfield 20	nano/spook1998/rust/structural/WallWithWindow:F	Ljava/util/List;
/*     */     //   331: aload 10
/*     */     //   333: invokeinterface 144 2 0
/*     */     //   338: pop
/*     */     //   339: aload_2
/*     */     //   340: invokevirtual 69	java/lang/Integer:intValue	()I
/*     */     //   343: bipush 12
/*     */     //   345: if_icmpne +15 -> 360
/*     */     //   348: aload_0
/*     */     //   349: getfield 146	nano/spook1998/rust/structural/WallWithWindow:M	Ljava/util/List;
/*     */     //   352: aload 10
/*     */     //   354: invokeinterface 144 2 0
/*     */     //   359: pop
/*     */     //   360: aload 10
/*     */     //   362: invokeinterface 125 1 0
/*     */     //   367: getstatic 149	org/bukkit/Material:AIR	Lorg/bukkit/Material;
/*     */     //   370: invokevirtual 135	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
/*     */     //   373: ifeq +134 -> 507
/*     */     //   376: aload_2
/*     */     //   377: invokevirtual 69	java/lang/Integer:intValue	()I
/*     */     //   380: bipush 6
/*     */     //   382: if_icmplt +48 -> 430
/*     */     //   385: aload_2
/*     */     //   386: invokevirtual 69	java/lang/Integer:intValue	()I
/*     */     //   389: bipush 9
/*     */     //   391: if_icmpeq +39 -> 430
/*     */     //   394: aload_2
/*     */     //   395: invokevirtual 69	java/lang/Integer:intValue	()I
/*     */     //   398: bipush 10
/*     */     //   400: if_icmpeq +30 -> 430
/*     */     //   403: aload_2
/*     */     //   404: invokevirtual 69	java/lang/Integer:intValue	()I
/*     */     //   407: bipush 14
/*     */     //   409: if_icmpeq +21 -> 430
/*     */     //   412: aload_2
/*     */     //   413: invokevirtual 69	java/lang/Integer:intValue	()I
/*     */     //   416: bipush 15
/*     */     //   418: if_icmpeq +12 -> 430
/*     */     //   421: aload_2
/*     */     //   422: invokevirtual 69	java/lang/Integer:intValue	()I
/*     */     //   425: bipush 18
/*     */     //   427: if_icmple +19 -> 446
/*     */     //   430: aload_0
/*     */     //   431: getfield 151	nano/spook1998/rust/structural/WallWithWindow:b	Ljava/util/List;
/*     */     //   434: aload 10
/*     */     //   436: invokeinterface 144 2 0
/*     */     //   441: pop
/*     */     //   442: aload_2
/*     */     //   443: goto +117 -> 560
/*     */     //   446: aload_2
/*     */     //   447: invokevirtual 69	java/lang/Integer:intValue	()I
/*     */     //   450: bipush 12
/*     */     //   452: if_icmpne +19 -> 471
/*     */     //   455: aload_2
/*     */     //   456: aload_0
/*     */     //   457: getfield 153	nano/spook1998/rust/structural/WallWithWindow:f	Ljava/util/List;
/*     */     //   460: aload 10
/*     */     //   462: invokeinterface 144 2 0
/*     */     //   467: pop
/*     */     //   468: goto +92 -> 560
/*     */     //   471: aload_2
/*     */     //   472: invokevirtual 69	java/lang/Integer:intValue	()I
/*     */     //   475: bipush 12
/*     */     //   477: if_icmpeq +82 -> 559
/*     */     //   480: aload_2
/*     */     //   481: aload_0
/*     */     //   482: getfield 25	nano/spook1998/rust/structural/WallWithWindow:g	Ljava/util/List;
/*     */     //   485: aload 10
/*     */     //   487: invokeinterface 144 2 0
/*     */     //   492: aload_0
/*     */     //   493: getfield 153	nano/spook1998/rust/structural/WallWithWindow:f	Ljava/util/List;
/*     */     //   496: aload 10
/*     */     //   498: invokeinterface 144 2 0
/*     */     //   503: pop2
/*     */     //   504: goto +56 -> 560
/*     */     //   507: aload 10
/*     */     //   509: invokeinterface 125 1 0
/*     */     //   514: getstatic 131	org/bukkit/Material:LOG	Lorg/bukkit/Material;
/*     */     //   517: invokevirtual 135	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
/*     */     //   520: aload_0
/*     */     //   521: swap
/*     */     //   522: ifeq +30 -> 552
/*     */     //   525: getfield 151	nano/spook1998/rust/structural/WallWithWindow:b	Ljava/util/List;
/*     */     //   528: aload 10
/*     */     //   530: invokeinterface 144 2 0
/*     */     //   535: aload 7
/*     */     //   537: invokevirtual 69	java/lang/Integer:intValue	()I
/*     */     //   540: iconst_1
/*     */     //   541: iadd
/*     */     //   542: invokestatic 33	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   545: astore 7
/*     */     //   547: pop
/*     */     //   548: aload_2
/*     */     //   549: goto +11 -> 560
/*     */     //   552: iconst_0
/*     */     //   553: invokestatic 119	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
/*     */     //   556: putfield 121	nano/spook1998/rust/structural/WallWithWindow:ALLATORIxDEMO	Ljava/lang/Boolean;
/*     */     //   559: aload_2
/*     */     //   560: invokevirtual 69	java/lang/Integer:intValue	()I
/*     */     //   563: iconst_1
/*     */     //   564: iinc 9 1
/*     */     //   567: iadd
/*     */     //   568: invokestatic 33	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   571: astore_2
/*     */     //   572: iload 9
/*     */     //   574: i2d
/*     */     //   575: aload_0
/*     */     //   576: getfield 59	nano/spook1998/rust/structural/WallWithWindow:D	Lorg/bukkit/Location;
/*     */     //   579: invokevirtual 87	org/bukkit/Location:getY	()D
/*     */     //   582: ldc2_w 154
/*     */     //   585: dadd
/*     */     //   586: dcmpg
/*     */     //   587: ifle -443 -> 144
/*     */     //   590: iinc 8 1
/*     */     //   593: iload 8
/*     */     //   595: i2d
/*     */     //   596: aload_0
/*     */     //   597: getfield 59	nano/spook1998/rust/structural/WallWithWindow:D	Lorg/bukkit/Location;
/*     */     //   600: invokevirtual 65	org/bukkit/Location:getX	()D
/*     */     //   603: ldc2_w 154
/*     */     //   606: dadd
/*     */     //   607: dcmpg
/*     */     //   608: ifle -481 -> 127
/*     */     //   611: aload 6
/*     */     //   613: getstatic 158	nano/spook1998/rust/utils/type/DirectionType:P	Lnano/spook1998/rust/utils/type/DirectionType;
/*     */     //   616: if_acmpne +506 -> 1122
/*     */     //   619: aload_0
/*     */     //   620: getfield 59	nano/spook1998/rust/structural/WallWithWindow:D	Lorg/bukkit/Location;
/*     */     //   623: invokevirtual 72	org/bukkit/Location:getZ	()D
/*     */     //   626: d2i
/*     */     //   627: aload 5
/*     */     //   629: invokevirtual 69	java/lang/Integer:intValue	()I
/*     */     //   632: isub
/*     */     //   633: dup
/*     */     //   634: istore 8
/*     */     //   636: goto +470 -> 1106
/*     */     //   639: aload_0
/*     */     //   640: getfield 59	nano/spook1998/rust/structural/WallWithWindow:D	Lorg/bukkit/Location;
/*     */     //   643: invokevirtual 87	org/bukkit/Location:getY	()D
/*     */     //   646: d2i
/*     */     //   647: iconst_2
/*     */     //   648: isub
/*     */     //   649: dup
/*     */     //   650: istore 9
/*     */     //   652: goto +433 -> 1085
/*     */     //   655: new 61	org/bukkit/Location
/*     */     //   658: dup
/*     */     //   659: aload_0
/*     */     //   660: getfield 59	nano/spook1998/rust/structural/WallWithWindow:D	Lorg/bukkit/Location;
/*     */     //   663: invokevirtual 91	org/bukkit/Location:getWorld	()Lorg/bukkit/World;
/*     */     //   666: aload_0
/*     */     //   667: getfield 59	nano/spook1998/rust/structural/WallWithWindow:D	Lorg/bukkit/Location;
/*     */     //   670: invokevirtual 65	org/bukkit/Location:getX	()D
/*     */     //   673: iload 9
/*     */     //   675: i2d
/*     */     //   676: iload 8
/*     */     //   678: i2d
/*     */     //   679: invokespecial 95	org/bukkit/Location:<init>	(Lorg/bukkit/World;DDD)V
/*     */     //   682: invokevirtual 99	org/bukkit/Location:getBlock	()Lorg/bukkit/block/Block;
/*     */     //   685: dup
/*     */     //   686: astore 10
/*     */     //   688: invokeinterface 102 1 0
/*     */     //   693: invokestatic 108	nano/spook1998/rust/object/utils/RegionUtil:getRegionAtLocation	(Lorg/bukkit/Location;)Lnano/spook1998/rust/object/Region;
/*     */     //   696: dup
/*     */     //   697: astore 11
/*     */     //   699: ifnull +20 -> 719
/*     */     //   702: aload 11
/*     */     //   704: aload_1
/*     */     //   705: invokevirtual 114	nano/spook1998/rust/object/Region:checkUser	(Lnano/spook1998/rust/object/User;)Z
/*     */     //   708: ifne +11 -> 719
/*     */     //   711: aload_0
/*     */     //   712: iconst_0
/*     */     //   713: invokestatic 119	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
/*     */     //   716: putfield 121	nano/spook1998/rust/structural/WallWithWindow:ALLATORIxDEMO	Ljava/lang/Boolean;
/*     */     //   719: aload_2
/*     */     //   720: invokevirtual 69	java/lang/Integer:intValue	()I
/*     */     //   723: ifeq +38 -> 761
/*     */     //   726: aload_2
/*     */     //   727: invokevirtual 69	java/lang/Integer:intValue	()I
/*     */     //   730: iconst_5
/*     */     //   731: if_icmpeq +30 -> 761
/*     */     //   734: aload_2
/*     */     //   735: invokevirtual 69	java/lang/Integer:intValue	()I
/*     */     //   738: bipush 10
/*     */     //   740: if_icmpeq +21 -> 761
/*     */     //   743: aload_2
/*     */     //   744: invokevirtual 69	java/lang/Integer:intValue	()I
/*     */     //   747: bipush 15
/*     */     //   749: if_icmpeq +12 -> 761
/*     */     //   752: aload_2
/*     */     //   753: invokevirtual 69	java/lang/Integer:intValue	()I
/*     */     //   756: bipush 20
/*     */     //   758: if_icmpne +27 -> 785
/*     */     //   761: aload 10
/*     */     //   763: invokeinterface 125 1 0
/*     */     //   768: getstatic 131	org/bukkit/Material:LOG	Lorg/bukkit/Material;
/*     */     //   771: invokevirtual 135	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
/*     */     //   774: ifne +11 -> 785
/*     */     //   777: aload_0
/*     */     //   778: iconst_0
/*     */     //   779: invokestatic 119	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
/*     */     //   782: putfield 121	nano/spook1998/rust/structural/WallWithWindow:ALLATORIxDEMO	Ljava/lang/Boolean;
/*     */     //   785: aload_2
/*     */     //   786: invokevirtual 69	java/lang/Integer:intValue	()I
/*     */     //   789: ifeq +12 -> 801
/*     */     //   792: aload_2
/*     */     //   793: invokevirtual 69	java/lang/Integer:intValue	()I
/*     */     //   796: bipush 20
/*     */     //   798: if_icmpne +23 -> 821
/*     */     //   801: aload 10
/*     */     //   803: invokeinterface 139 1 0
/*     */     //   808: bipush 13
/*     */     //   810: if_icmpeq +11 -> 821
/*     */     //   813: aload_0
/*     */     //   814: iconst_0
/*     */     //   815: invokestatic 119	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
/*     */     //   818: putfield 121	nano/spook1998/rust/structural/WallWithWindow:ALLATORIxDEMO	Ljava/lang/Boolean;
/*     */     //   821: aload_2
/*     */     //   822: invokevirtual 69	java/lang/Integer:intValue	()I
/*     */     //   825: iconst_4
/*     */     //   826: if_icmpeq +12 -> 838
/*     */     //   829: aload_2
/*     */     //   830: invokevirtual 69	java/lang/Integer:intValue	()I
/*     */     //   833: bipush 24
/*     */     //   835: if_icmpne +15 -> 850
/*     */     //   838: aload_0
/*     */     //   839: getfield 20	nano/spook1998/rust/structural/WallWithWindow:F	Ljava/util/List;
/*     */     //   842: aload 10
/*     */     //   844: invokeinterface 144 2 0
/*     */     //   849: pop
/*     */     //   850: aload_2
/*     */     //   851: invokevirtual 69	java/lang/Integer:intValue	()I
/*     */     //   854: bipush 12
/*     */     //   856: if_icmpne +15 -> 871
/*     */     //   859: aload_0
/*     */     //   860: getfield 146	nano/spook1998/rust/structural/WallWithWindow:M	Ljava/util/List;
/*     */     //   863: aload 10
/*     */     //   865: invokeinterface 144 2 0
/*     */     //   870: pop
/*     */     //   871: aload 10
/*     */     //   873: invokeinterface 125 1 0
/*     */     //   878: getstatic 149	org/bukkit/Material:AIR	Lorg/bukkit/Material;
/*     */     //   881: invokevirtual 135	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
/*     */     //   884: ifeq +134 -> 1018
/*     */     //   887: aload_2
/*     */     //   888: invokevirtual 69	java/lang/Integer:intValue	()I
/*     */     //   891: bipush 6
/*     */     //   893: if_icmplt +48 -> 941
/*     */     //   896: aload_2
/*     */     //   897: invokevirtual 69	java/lang/Integer:intValue	()I
/*     */     //   900: bipush 9
/*     */     //   902: if_icmpeq +39 -> 941
/*     */     //   905: aload_2
/*     */     //   906: invokevirtual 69	java/lang/Integer:intValue	()I
/*     */     //   909: bipush 10
/*     */     //   911: if_icmpeq +30 -> 941
/*     */     //   914: aload_2
/*     */     //   915: invokevirtual 69	java/lang/Integer:intValue	()I
/*     */     //   918: bipush 14
/*     */     //   920: if_icmpeq +21 -> 941
/*     */     //   923: aload_2
/*     */     //   924: invokevirtual 69	java/lang/Integer:intValue	()I
/*     */     //   927: bipush 15
/*     */     //   929: if_icmpeq +12 -> 941
/*     */     //   932: aload_2
/*     */     //   933: invokevirtual 69	java/lang/Integer:intValue	()I
/*     */     //   936: bipush 18
/*     */     //   938: if_icmple +19 -> 957
/*     */     //   941: aload_0
/*     */     //   942: getfield 151	nano/spook1998/rust/structural/WallWithWindow:b	Ljava/util/List;
/*     */     //   945: aload 10
/*     */     //   947: invokeinterface 144 2 0
/*     */     //   952: pop
/*     */     //   953: aload_2
/*     */     //   954: goto +117 -> 1071
/*     */     //   957: aload_2
/*     */     //   958: invokevirtual 69	java/lang/Integer:intValue	()I
/*     */     //   961: bipush 12
/*     */     //   963: if_icmpne +19 -> 982
/*     */     //   966: aload_2
/*     */     //   967: aload_0
/*     */     //   968: getfield 153	nano/spook1998/rust/structural/WallWithWindow:f	Ljava/util/List;
/*     */     //   971: aload 10
/*     */     //   973: invokeinterface 144 2 0
/*     */     //   978: pop
/*     */     //   979: goto +92 -> 1071
/*     */     //   982: aload_2
/*     */     //   983: invokevirtual 69	java/lang/Integer:intValue	()I
/*     */     //   986: bipush 12
/*     */     //   988: if_icmpeq +82 -> 1070
/*     */     //   991: aload_2
/*     */     //   992: aload_0
/*     */     //   993: getfield 25	nano/spook1998/rust/structural/WallWithWindow:g	Ljava/util/List;
/*     */     //   996: aload 10
/*     */     //   998: invokeinterface 144 2 0
/*     */     //   1003: aload_0
/*     */     //   1004: getfield 153	nano/spook1998/rust/structural/WallWithWindow:f	Ljava/util/List;
/*     */     //   1007: aload 10
/*     */     //   1009: invokeinterface 144 2 0
/*     */     //   1014: pop2
/*     */     //   1015: goto +56 -> 1071
/*     */     //   1018: aload 10
/*     */     //   1020: invokeinterface 125 1 0
/*     */     //   1025: getstatic 131	org/bukkit/Material:LOG	Lorg/bukkit/Material;
/*     */     //   1028: invokevirtual 135	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
/*     */     //   1031: aload_0
/*     */     //   1032: swap
/*     */     //   1033: ifeq +30 -> 1063
/*     */     //   1036: getfield 151	nano/spook1998/rust/structural/WallWithWindow:b	Ljava/util/List;
/*     */     //   1039: aload 10
/*     */     //   1041: invokeinterface 144 2 0
/*     */     //   1046: aload 7
/*     */     //   1048: invokevirtual 69	java/lang/Integer:intValue	()I
/*     */     //   1051: iconst_1
/*     */     //   1052: iadd
/*     */     //   1053: invokestatic 33	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   1056: astore 7
/*     */     //   1058: pop
/*     */     //   1059: aload_2
/*     */     //   1060: goto +11 -> 1071
/*     */     //   1063: iconst_0
/*     */     //   1064: invokestatic 119	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
/*     */     //   1067: putfield 121	nano/spook1998/rust/structural/WallWithWindow:ALLATORIxDEMO	Ljava/lang/Boolean;
/*     */     //   1070: aload_2
/*     */     //   1071: invokevirtual 69	java/lang/Integer:intValue	()I
/*     */     //   1074: iconst_1
/*     */     //   1075: iinc 9 1
/*     */     //   1078: iadd
/*     */     //   1079: invokestatic 33	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   1082: astore_2
/*     */     //   1083: iload 9
/*     */     //   1085: i2d
/*     */     //   1086: aload_0
/*     */     //   1087: getfield 59	nano/spook1998/rust/structural/WallWithWindow:D	Lorg/bukkit/Location;
/*     */     //   1090: invokevirtual 87	org/bukkit/Location:getY	()D
/*     */     //   1093: ldc2_w 154
/*     */     //   1096: dadd
/*     */     //   1097: dcmpg
/*     */     //   1098: ifle -443 -> 655
/*     */     //   1101: iinc 8 1
/*     */     //   1104: iload 8
/*     */     //   1106: i2d
/*     */     //   1107: aload_0
/*     */     //   1108: getfield 59	nano/spook1998/rust/structural/WallWithWindow:D	Lorg/bukkit/Location;
/*     */     //   1111: invokevirtual 72	org/bukkit/Location:getZ	()D
/*     */     //   1114: ldc2_w 154
/*     */     //   1117: dadd
/*     */     //   1118: dcmpg
/*     */     //   1119: ifle -480 -> 639
/*     */     //   1122: aload_0
/*     */     //   1123: getfield 121	nano/spook1998/rust/structural/WallWithWindow:ALLATORIxDEMO	Ljava/lang/Boolean;
/*     */     //   1126: invokevirtual 162	java/lang/Boolean:booleanValue	()Z
/*     */     //   1129: ifne +32 -> 1161
/*     */     //   1132: aload_0
/*     */     //   1133: getfield 59	nano/spook1998/rust/structural/WallWithWindow:D	Lorg/bukkit/Location;
/*     */     //   1136: invokevirtual 87	org/bukkit/Location:getY	()D
/*     */     //   1139: aload_3
/*     */     //   1140: invokeinterface 51 1 0
/*     */     //   1145: invokevirtual 87	org/bukkit/Location:getY	()D
/*     */     //   1148: dcmpg
/*     */     //   1149: ifgt +12 -> 1161
/*     */     //   1152: aload_0
/*     */     //   1153: getfield 153	nano/spook1998/rust/structural/WallWithWindow:f	Ljava/util/List;
/*     */     //   1156: invokeinterface 166 1 0
/*     */     //   1161: aload 7
/*     */     //   1163: invokevirtual 69	java/lang/Integer:intValue	()I
/*     */     //   1166: iconst_5
/*     */     //   1167: if_icmpeq +51 -> 1218
/*     */     //   1170: aload 7
/*     */     //   1172: invokevirtual 69	java/lang/Integer:intValue	()I
/*     */     //   1175: bipush 10
/*     */     //   1177: if_icmpeq +41 -> 1218
/*     */     //   1180: aload 7
/*     */     //   1182: invokevirtual 69	java/lang/Integer:intValue	()I
/*     */     //   1185: bipush 9
/*     */     //   1187: if_icmpeq +31 -> 1218
/*     */     //   1190: aload 7
/*     */     //   1192: invokevirtual 69	java/lang/Integer:intValue	()I
/*     */     //   1195: bipush 13
/*     */     //   1197: if_icmpeq +21 -> 1218
/*     */     //   1200: aload 7
/*     */     //   1202: invokevirtual 69	java/lang/Integer:intValue	()I
/*     */     //   1205: bipush 16
/*     */     //   1207: if_icmpeq +11 -> 1218
/*     */     //   1210: aload_0
/*     */     //   1211: iconst_0
/*     */     //   1212: invokestatic 119	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
/*     */     //   1215: putfield 121	nano/spook1998/rust/structural/WallWithWindow:ALLATORIxDEMO	Ljava/lang/Boolean;
/*     */     //   1218: return
/*     */     // Line number table:
/*     */     //   Java source line #193	-> byte code offset #0
/*     */     //   Java source line #60	-> byte code offset #5
/*     */     //   Java source line #129	-> byte code offset #13
/*     */     //   Java source line #21	-> byte code offset #28
/*     */     //   Java source line #175	-> byte code offset #33
/*     */     //   Java source line #112	-> byte code offset #39
/*     */     //   Java source line #70	-> byte code offset #62
/*     */     //   Java source line #158	-> byte code offset #86
/*     */     //   Java source line #138	-> byte code offset #92
/*     */     //   Java source line #91	-> byte code offset #98
/*     */     //   Java source line #39	-> byte code offset #106
/*     */     //   Java source line #59	-> byte code offset #127
/*     */     //   Java source line #174	-> byte code offset #144
/*     */     //   Java source line #19	-> byte code offset #177
/*     */     //   Java source line #18	-> byte code offset #188
/*     */     //   Java source line #120	-> byte code offset #191
/*     */     //   Java source line #176	-> byte code offset #208
/*     */     //   Java source line #66	-> byte code offset #250
/*     */     //   Java source line #173	-> byte code offset #274
/*     */     //   Java source line #139	-> byte code offset #290
/*     */     //   Java source line #80	-> byte code offset #310
/*     */     //   Java source line #106	-> byte code offset #327
/*     */     //   Java source line #147	-> byte code offset #339
/*     */     //   Java source line #74	-> byte code offset #348
/*     */     //   Java source line #132	-> byte code offset #360
/*     */     //   Java source line #186	-> byte code offset #376
/*     */     //   Java source line #133	-> byte code offset #430
/*     */     //   Java source line #57	-> byte code offset #443
/*     */     //   Java source line #192	-> byte code offset #456
/*     */     //   Java source line #99	-> byte code offset #468
/*     */     //   Java source line #28	-> byte code offset #481
/*     */     //   Java source line #94	-> byte code offset #492
/*     */     //   Java source line #50	-> byte code offset #504
/*     */     //   Java source line #124	-> byte code offset #525
/*     */     //   Java source line #140	-> byte code offset #535
/*     */     //   Java source line #85	-> byte code offset #549
/*     */     //   Java source line #14	-> byte code offset #552
/*     */     //   Java source line #125	-> byte code offset #559
/*     */     //   Java source line #59	-> byte code offset #572
/*     */     //   Java source line #39	-> byte code offset #590
/*     */     //   Java source line #4	-> byte code offset #611
/*     */     //   Java source line #154	-> byte code offset #619
/*     */     //   Java source line #87	-> byte code offset #639
/*     */     //   Java source line #22	-> byte code offset #655
/*     */     //   Java source line #179	-> byte code offset #688
/*     */     //   Java source line #16	-> byte code offset #699
/*     */     //   Java source line #43	-> byte code offset #702
/*     */     //   Java source line #116	-> byte code offset #719
/*     */     //   Java source line #15	-> byte code offset #761
/*     */     //   Java source line #102	-> byte code offset #785
/*     */     //   Java source line #196	-> byte code offset #801
/*     */     //   Java source line #128	-> byte code offset #821
/*     */     //   Java source line #191	-> byte code offset #838
/*     */     //   Java source line #126	-> byte code offset #850
/*     */     //   Java source line #6	-> byte code offset #859
/*     */     //   Java source line #166	-> byte code offset #871
/*     */     //   Java source line #17	-> byte code offset #887
/*     */     //   Java source line #37	-> byte code offset #941
/*     */     //   Java source line #63	-> byte code offset #954
/*     */     //   Java source line #131	-> byte code offset #967
/*     */     //   Java source line #136	-> byte code offset #979
/*     */     //   Java source line #183	-> byte code offset #992
/*     */     //   Java source line #143	-> byte code offset #1003
/*     */     //   Java source line #184	-> byte code offset #1015
/*     */     //   Java source line #84	-> byte code offset #1036
/*     */     //   Java source line #44	-> byte code offset #1046
/*     */     //   Java source line #52	-> byte code offset #1060
/*     */     //   Java source line #114	-> byte code offset #1063
/*     */     //   Java source line #198	-> byte code offset #1070
/*     */     //   Java source line #87	-> byte code offset #1083
/*     */     //   Java source line #154	-> byte code offset #1101
/*     */     //   Java source line #115	-> byte code offset #1122
/*     */     //   Java source line #178	-> byte code offset #1132
/*     */     //   Java source line #83	-> byte code offset #1161
/*     */     //   Java source line #79	-> byte code offset #1218
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	1219	0	a	WallWithWindow
/*     */     //   0	1219	1	a	nano.spook1998.rust.object.User
/*     */   }
/*     */ }


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\structural\WallWithWindow.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */