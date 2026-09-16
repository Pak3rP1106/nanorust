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
/*     */ public class Stairs
/*     */ {
/*     */   private List<Block> g;
/*     */   private List<Block> f;
/*     */   private Location D;
/*     */   private byte M;
/*     */   private Boolean b;
/*     */   private List<Block> ALLATORIxDEMO;
/*     */   
/*     */   public Stairs(Location a)
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
/* 155 */     a.f = new ArrayList();
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 162 */     a.ALLATORIxDEMO = new ArrayList();1.b = Boolean.valueOf(a);0.M = a;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Boolean isBuild()
/*     */   {
/* 104 */     return a.b;
/*     */   }
/*     */   
/*     */ 
/*     */   public List<Block> getFakeSpawn()
/*     */   {
/* 110 */     return a.ALLATORIxDEMO;
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
/*     */   public List<Block> getListBlock2()
/*     */   {
/* 160 */     return a.g;
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
/*     */   public byte getDirection()
/*     */   {
/* 180 */     return a.M;
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
/*     */   public List<Block> getListBlock1()
/*     */   {
/* 194 */     return a.f;
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public void calculate(nano.spook1998.rust.object.User a)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: invokevirtual 24	nano/spook1998/rust/object/User:getName	()Ljava/lang/String;
/*     */     //   4: invokestatic 30	org/bukkit/Bukkit:getPlayer	(Ljava/lang/String;)Lorg/bukkit/entity/Player;
/*     */     //   7: astore_2
/*     */     //   8: iconst_2
/*     */     //   9: invokestatic 36	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   12: astore_3
/*     */     //   13: iconst_2
/*     */     //   14: invokestatic 36	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   17: astore 4
/*     */     //   19: aload_0
/*     */     //   20: getfield 38	nano/spook1998/rust/structural/Stairs:D	Lorg/bukkit/Location;
/*     */     //   23: invokevirtual 44	org/bukkit/Location:getX	()D
/*     */     //   26: dconst_0
/*     */     //   27: dcmpg
/*     */     //   28: ifge +13 -> 41
/*     */     //   31: aload_3
/*     */     //   32: invokevirtual 48	java/lang/Integer:intValue	()I
/*     */     //   35: iconst_1
/*     */     //   36: iadd
/*     */     //   37: invokestatic 36	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   40: astore_3
/*     */     //   41: aload_0
/*     */     //   42: getfield 38	nano/spook1998/rust/structural/Stairs:D	Lorg/bukkit/Location;
/*     */     //   45: invokevirtual 51	org/bukkit/Location:getZ	()D
/*     */     //   48: dconst_0
/*     */     //   49: dcmpg
/*     */     //   50: ifge +15 -> 65
/*     */     //   53: aload 4
/*     */     //   55: invokevirtual 48	java/lang/Integer:intValue	()I
/*     */     //   58: iconst_1
/*     */     //   59: iadd
/*     */     //   60: invokestatic 36	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   63: astore 4
/*     */     //   65: aload_2
/*     */     //   66: invokestatic 57	nano/spook1998/rust/utils/DirectionUtil:getDirection	(Lorg/bukkit/entity/Player;)Lnano/spook1998/rust/utils/type/DirectionType;
/*     */     //   69: astore 5
/*     */     //   71: iconst_0
/*     */     //   72: invokestatic 62	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
/*     */     //   75: astore 6
/*     */     //   77: iconst_0
/*     */     //   78: invokestatic 36	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   81: astore 6
/*     */     //   83: aload 5
/*     */     //   85: getstatic 67	nano/spook1998/rust/utils/type/DirectionType:B	Lnano/spook1998/rust/utils/type/DirectionType;
/*     */     //   88: if_acmpne +453 -> 541
/*     */     //   91: aload_2
/*     */     //   92: invokeinterface 73 1 0
/*     */     //   97: iconst_3
/*     */     //   98: invokestatic 36	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   101: iconst_m1
/*     */     //   102: invokestatic 36	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   105: invokestatic 79	nano/spook1998/rust/utils/LocationUtil:getLocationStairs	(Lorg/bukkit/Location;Ljava/lang/Integer;Ljava/lang/Integer;)Lorg/bukkit/Location;
/*     */     //   108: dup
/*     */     //   109: astore 6
/*     */     //   111: invokevirtual 82	org/bukkit/Location:getDirection	()Lorg/bukkit/util/Vector;
/*     */     //   114: invokevirtual 87	org/bukkit/util/Vector:normalize	()Lorg/bukkit/util/Vector;
/*     */     //   117: invokevirtual 88	org/bukkit/util/Vector:getZ	()D
/*     */     //   120: invokestatic 93	java/lang/Double:valueOf	(D)Ljava/lang/Double;
/*     */     //   123: astore 7
/*     */     //   125: iconst_3
/*     */     //   126: invokestatic 36	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   129: astore 8
/*     */     //   131: iconst_3
/*     */     //   132: invokestatic 36	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   135: astore 9
/*     */     //   137: iconst_0
/*     */     //   138: invokestatic 36	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   141: dup
/*     */     //   142: astore 10
/*     */     //   144: goto +390 -> 534
/*     */     //   147: athrow
/*     */     //   148: new 95	java/util/ArrayList
/*     */     //   151: dup
/*     */     //   152: invokespecial 99	java/util/ArrayList:<init>	()V
/*     */     //   155: astore 11
/*     */     //   157: aload 6
/*     */     //   159: invokevirtual 44	org/bukkit/Location:getX	()D
/*     */     //   162: d2i
/*     */     //   163: aload_3
/*     */     //   164: invokevirtual 48	java/lang/Integer:intValue	()I
/*     */     //   167: isub
/*     */     //   168: dup
/*     */     //   169: istore 12
/*     */     //   171: goto +180 -> 351
/*     */     //   174: athrow
/*     */     //   175: aconst_null
/*     */     //   176: astore 13
/*     */     //   178: aload 7
/*     */     //   180: invokevirtual 102	java/lang/Double:doubleValue	()D
/*     */     //   183: dconst_0
/*     */     //   184: dcmpg
/*     */     //   185: new 40	org/bukkit/Location
/*     */     //   188: swap
/*     */     //   189: ifge +53 -> 242
/*     */     //   192: dup
/*     */     //   193: aload 6
/*     */     //   195: invokevirtual 106	org/bukkit/Location:getWorld	()Lorg/bukkit/World;
/*     */     //   198: iload 12
/*     */     //   200: i2d
/*     */     //   201: aload 6
/*     */     //   203: invokevirtual 109	org/bukkit/Location:getY	()D
/*     */     //   206: aload 9
/*     */     //   208: invokevirtual 48	java/lang/Integer:intValue	()I
/*     */     //   211: i2d
/*     */     //   212: dadd
/*     */     //   213: aload 6
/*     */     //   215: invokevirtual 51	org/bukkit/Location:getZ	()D
/*     */     //   218: aload 9
/*     */     //   220: invokevirtual 48	java/lang/Integer:intValue	()I
/*     */     //   223: i2d
/*     */     //   224: dsub
/*     */     //   225: invokespecial 112	org/bukkit/Location:<init>	(Lorg/bukkit/World;DDD)V
/*     */     //   228: invokevirtual 116	org/bukkit/Location:getBlock	()Lorg/bukkit/block/Block;
/*     */     //   231: dup
/*     */     //   232: astore 13
/*     */     //   234: aload_0
/*     */     //   235: iconst_3
/*     */     //   236: putfield 118	nano/spook1998/rust/structural/Stairs:M	B
/*     */     //   239: goto +50 -> 289
/*     */     //   242: dup
/*     */     //   243: aload 6
/*     */     //   245: invokevirtual 106	org/bukkit/Location:getWorld	()Lorg/bukkit/World;
/*     */     //   248: iload 12
/*     */     //   250: i2d
/*     */     //   251: aload 6
/*     */     //   253: invokevirtual 109	org/bukkit/Location:getY	()D
/*     */     //   256: aload 9
/*     */     //   258: invokevirtual 48	java/lang/Integer:intValue	()I
/*     */     //   261: i2d
/*     */     //   262: dadd
/*     */     //   263: aload 6
/*     */     //   265: invokevirtual 51	org/bukkit/Location:getZ	()D
/*     */     //   268: aload 9
/*     */     //   270: invokevirtual 48	java/lang/Integer:intValue	()I
/*     */     //   273: i2d
/*     */     //   274: dadd
/*     */     //   275: invokespecial 112	org/bukkit/Location:<init>	(Lorg/bukkit/World;DDD)V
/*     */     //   278: invokevirtual 116	org/bukkit/Location:getBlock	()Lorg/bukkit/block/Block;
/*     */     //   281: dup
/*     */     //   282: astore 13
/*     */     //   284: aload_0
/*     */     //   285: iconst_2
/*     */     //   286: putfield 118	nano/spook1998/rust/structural/Stairs:M	B
/*     */     //   289: invokeinterface 121 1 0
/*     */     //   294: invokestatic 127	nano/spook1998/rust/object/utils/RegionUtil:getRegionAtLocation	(Lorg/bukkit/Location;)Lnano/spook1998/rust/object/Region;
/*     */     //   297: dup
/*     */     //   298: astore 14
/*     */     //   300: ifnull +20 -> 320
/*     */     //   303: aload 14
/*     */     //   305: aload_1
/*     */     //   306: invokevirtual 133	nano/spook1998/rust/object/Region:checkUser	(Lnano/spook1998/rust/object/User;)Z
/*     */     //   309: ifne +11 -> 320
/*     */     //   312: aload_0
/*     */     //   313: iconst_0
/*     */     //   314: invokestatic 62	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
/*     */     //   317: putfield 135	nano/spook1998/rust/structural/Stairs:b	Ljava/lang/Boolean;
/*     */     //   320: aload 13
/*     */     //   322: invokeinterface 139 1 0
/*     */     //   327: getstatic 145	org/bukkit/Material:AIR	Lorg/bukkit/Material;
/*     */     //   330: invokevirtual 149	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
/*     */     //   333: ifeq +13 -> 346
/*     */     //   336: aload 11
/*     */     //   338: aload 13
/*     */     //   340: invokeinterface 154 2 0
/*     */     //   345: pop
/*     */     //   346: iinc 12 1
/*     */     //   349: iload 12
/*     */     //   351: i2d
/*     */     //   352: aload 6
/*     */     //   354: invokevirtual 44	org/bukkit/Location:getX	()D
/*     */     //   357: ldc2_w 155
/*     */     //   360: dadd
/*     */     //   361: dcmpg
/*     */     //   362: ifle -187 -> 175
/*     */     //   365: iconst_0
/*     */     //   366: invokestatic 36	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   369: astore 12
/*     */     //   371: aload 11
/*     */     //   373: invokeinterface 159 1 0
/*     */     //   378: iconst_5
/*     */     //   379: if_icmpne +118 -> 497
/*     */     //   382: aload 11
/*     */     //   384: invokeinterface 163 1 0
/*     */     //   389: dup
/*     */     //   390: astore 14
/*     */     //   392: goto +97 -> 489
/*     */     //   395: aload 14
/*     */     //   397: invokeinterface 169 1 0
/*     */     //   402: checkcast 120	org/bukkit/block/Block
/*     */     //   405: astore 13
/*     */     //   407: aload 12
/*     */     //   409: invokevirtual 48	java/lang/Integer:intValue	()I
/*     */     //   412: ifeq +12 -> 424
/*     */     //   415: aload 12
/*     */     //   417: invokevirtual 48	java/lang/Integer:intValue	()I
/*     */     //   420: iconst_4
/*     */     //   421: if_icmpne +31 -> 452
/*     */     //   424: aload_0
/*     */     //   425: getfield 171	nano/spook1998/rust/structural/Stairs:f	Ljava/util/List;
/*     */     //   428: aload 13
/*     */     //   430: invokeinterface 154 2 0
/*     */     //   435: aload_0
/*     */     //   436: getfield 173	nano/spook1998/rust/structural/Stairs:ALLATORIxDEMO	Ljava/util/List;
/*     */     //   439: aload 13
/*     */     //   441: invokeinterface 154 2 0
/*     */     //   446: pop2
/*     */     //   447: aload 12
/*     */     //   449: goto +28 -> 477
/*     */     //   452: aload_0
/*     */     //   453: getfield 175	nano/spook1998/rust/structural/Stairs:g	Ljava/util/List;
/*     */     //   456: aload 13
/*     */     //   458: invokeinterface 154 2 0
/*     */     //   463: aload_0
/*     */     //   464: getfield 173	nano/spook1998/rust/structural/Stairs:ALLATORIxDEMO	Ljava/util/List;
/*     */     //   467: aload 13
/*     */     //   469: invokeinterface 154 2 0
/*     */     //   474: pop2
/*     */     //   475: aload 12
/*     */     //   477: invokevirtual 48	java/lang/Integer:intValue	()I
/*     */     //   480: iconst_1
/*     */     //   481: iadd
/*     */     //   482: invokestatic 36	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   485: astore 12
/*     */     //   487: aload 14
/*     */     //   489: invokeinterface 179 1 0
/*     */     //   494: ifne -99 -> 395
/*     */     //   497: aload 9
/*     */     //   499: invokevirtual 48	java/lang/Integer:intValue	()I
/*     */     //   502: iconst_1
/*     */     //   503: isub
/*     */     //   504: invokestatic 36	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   507: astore 9
/*     */     //   509: aload 8
/*     */     //   511: invokevirtual 48	java/lang/Integer:intValue	()I
/*     */     //   514: iconst_1
/*     */     //   515: isub
/*     */     //   516: invokestatic 36	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   519: astore 8
/*     */     //   521: aload 10
/*     */     //   523: invokevirtual 48	java/lang/Integer:intValue	()I
/*     */     //   526: iconst_1
/*     */     //   527: iadd
/*     */     //   528: invokestatic 36	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   531: dup
/*     */     //   532: astore 10
/*     */     //   534: invokevirtual 48	java/lang/Integer:intValue	()I
/*     */     //   537: iconst_3
/*     */     //   538: if_icmple -390 -> 148
/*     */     //   541: aload 5
/*     */     //   543: getstatic 182	nano/spook1998/rust/utils/type/DirectionType:P	Lnano/spook1998/rust/utils/type/DirectionType;
/*     */     //   546: if_acmpne +452 -> 998
/*     */     //   549: aload_2
/*     */     //   550: invokeinterface 73 1 0
/*     */     //   555: iconst_3
/*     */     //   556: invokestatic 36	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   559: iconst_m1
/*     */     //   560: invokestatic 36	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   563: invokestatic 79	nano/spook1998/rust/utils/LocationUtil:getLocationStairs	(Lorg/bukkit/Location;Ljava/lang/Integer;Ljava/lang/Integer;)Lorg/bukkit/Location;
/*     */     //   566: dup
/*     */     //   567: astore 6
/*     */     //   569: invokevirtual 82	org/bukkit/Location:getDirection	()Lorg/bukkit/util/Vector;
/*     */     //   572: invokevirtual 87	org/bukkit/util/Vector:normalize	()Lorg/bukkit/util/Vector;
/*     */     //   575: invokevirtual 183	org/bukkit/util/Vector:getX	()D
/*     */     //   578: invokestatic 93	java/lang/Double:valueOf	(D)Ljava/lang/Double;
/*     */     //   581: astore 7
/*     */     //   583: iconst_3
/*     */     //   584: invokestatic 36	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   587: astore 8
/*     */     //   589: iconst_3
/*     */     //   590: invokestatic 36	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   593: astore 9
/*     */     //   595: iconst_0
/*     */     //   596: invokestatic 36	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   599: dup
/*     */     //   600: astore 10
/*     */     //   602: goto +389 -> 991
/*     */     //   605: new 95	java/util/ArrayList
/*     */     //   608: dup
/*     */     //   609: invokespecial 99	java/util/ArrayList:<init>	()V
/*     */     //   612: astore 11
/*     */     //   614: aload 6
/*     */     //   616: invokevirtual 51	org/bukkit/Location:getZ	()D
/*     */     //   619: d2i
/*     */     //   620: aload 4
/*     */     //   622: invokevirtual 48	java/lang/Integer:intValue	()I
/*     */     //   625: isub
/*     */     //   626: dup
/*     */     //   627: istore 12
/*     */     //   629: goto +179 -> 808
/*     */     //   632: aconst_null
/*     */     //   633: astore 13
/*     */     //   635: aload 7
/*     */     //   637: invokevirtual 102	java/lang/Double:doubleValue	()D
/*     */     //   640: dconst_0
/*     */     //   641: dcmpg
/*     */     //   642: new 40	org/bukkit/Location
/*     */     //   645: swap
/*     */     //   646: ifge +53 -> 699
/*     */     //   649: dup
/*     */     //   650: aload 6
/*     */     //   652: invokevirtual 106	org/bukkit/Location:getWorld	()Lorg/bukkit/World;
/*     */     //   655: aload 6
/*     */     //   657: invokevirtual 44	org/bukkit/Location:getX	()D
/*     */     //   660: aload 9
/*     */     //   662: invokevirtual 48	java/lang/Integer:intValue	()I
/*     */     //   665: i2d
/*     */     //   666: dsub
/*     */     //   667: aload 6
/*     */     //   669: invokevirtual 109	org/bukkit/Location:getY	()D
/*     */     //   672: aload 9
/*     */     //   674: invokevirtual 48	java/lang/Integer:intValue	()I
/*     */     //   677: i2d
/*     */     //   678: dadd
/*     */     //   679: iload 12
/*     */     //   681: i2d
/*     */     //   682: invokespecial 112	org/bukkit/Location:<init>	(Lorg/bukkit/World;DDD)V
/*     */     //   685: invokevirtual 116	org/bukkit/Location:getBlock	()Lorg/bukkit/block/Block;
/*     */     //   688: dup
/*     */     //   689: astore 13
/*     */     //   691: aload_0
/*     */     //   692: iconst_1
/*     */     //   693: putfield 118	nano/spook1998/rust/structural/Stairs:M	B
/*     */     //   696: goto +50 -> 746
/*     */     //   699: dup
/*     */     //   700: aload 6
/*     */     //   702: invokevirtual 106	org/bukkit/Location:getWorld	()Lorg/bukkit/World;
/*     */     //   705: aload 6
/*     */     //   707: invokevirtual 44	org/bukkit/Location:getX	()D
/*     */     //   710: aload 9
/*     */     //   712: invokevirtual 48	java/lang/Integer:intValue	()I
/*     */     //   715: i2d
/*     */     //   716: dadd
/*     */     //   717: aload 6
/*     */     //   719: invokevirtual 109	org/bukkit/Location:getY	()D
/*     */     //   722: aload 9
/*     */     //   724: invokevirtual 48	java/lang/Integer:intValue	()I
/*     */     //   727: i2d
/*     */     //   728: dadd
/*     */     //   729: iload 12
/*     */     //   731: i2d
/*     */     //   732: invokespecial 112	org/bukkit/Location:<init>	(Lorg/bukkit/World;DDD)V
/*     */     //   735: invokevirtual 116	org/bukkit/Location:getBlock	()Lorg/bukkit/block/Block;
/*     */     //   738: dup
/*     */     //   739: astore 13
/*     */     //   741: aload_0
/*     */     //   742: iconst_0
/*     */     //   743: putfield 118	nano/spook1998/rust/structural/Stairs:M	B
/*     */     //   746: invokeinterface 121 1 0
/*     */     //   751: invokestatic 127	nano/spook1998/rust/object/utils/RegionUtil:getRegionAtLocation	(Lorg/bukkit/Location;)Lnano/spook1998/rust/object/Region;
/*     */     //   754: dup
/*     */     //   755: astore 14
/*     */     //   757: ifnull +20 -> 777
/*     */     //   760: aload 14
/*     */     //   762: aload_1
/*     */     //   763: invokevirtual 133	nano/spook1998/rust/object/Region:checkUser	(Lnano/spook1998/rust/object/User;)Z
/*     */     //   766: ifne +11 -> 777
/*     */     //   769: aload_0
/*     */     //   770: iconst_0
/*     */     //   771: invokestatic 62	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
/*     */     //   774: putfield 135	nano/spook1998/rust/structural/Stairs:b	Ljava/lang/Boolean;
/*     */     //   777: aload 13
/*     */     //   779: invokeinterface 139 1 0
/*     */     //   784: getstatic 145	org/bukkit/Material:AIR	Lorg/bukkit/Material;
/*     */     //   787: invokevirtual 149	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
/*     */     //   790: ifeq +13 -> 803
/*     */     //   793: aload 11
/*     */     //   795: aload 13
/*     */     //   797: invokeinterface 154 2 0
/*     */     //   802: pop
/*     */     //   803: iinc 12 1
/*     */     //   806: iload 12
/*     */     //   808: i2d
/*     */     //   809: aload 6
/*     */     //   811: invokevirtual 51	org/bukkit/Location:getZ	()D
/*     */     //   814: ldc2_w 155
/*     */     //   817: dadd
/*     */     //   818: dcmpg
/*     */     //   819: ifle -187 -> 632
/*     */     //   822: iconst_0
/*     */     //   823: invokestatic 36	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   826: astore 12
/*     */     //   828: aload 11
/*     */     //   830: invokeinterface 159 1 0
/*     */     //   835: iconst_5
/*     */     //   836: if_icmpne +118 -> 954
/*     */     //   839: aload 11
/*     */     //   841: invokeinterface 163 1 0
/*     */     //   846: dup
/*     */     //   847: astore 14
/*     */     //   849: goto +97 -> 946
/*     */     //   852: aload 14
/*     */     //   854: invokeinterface 169 1 0
/*     */     //   859: checkcast 120	org/bukkit/block/Block
/*     */     //   862: astore 13
/*     */     //   864: aload 12
/*     */     //   866: invokevirtual 48	java/lang/Integer:intValue	()I
/*     */     //   869: ifeq +12 -> 881
/*     */     //   872: aload 12
/*     */     //   874: invokevirtual 48	java/lang/Integer:intValue	()I
/*     */     //   877: iconst_4
/*     */     //   878: if_icmpne +31 -> 909
/*     */     //   881: aload_0
/*     */     //   882: getfield 171	nano/spook1998/rust/structural/Stairs:f	Ljava/util/List;
/*     */     //   885: aload 13
/*     */     //   887: invokeinterface 154 2 0
/*     */     //   892: aload_0
/*     */     //   893: getfield 173	nano/spook1998/rust/structural/Stairs:ALLATORIxDEMO	Ljava/util/List;
/*     */     //   896: aload 13
/*     */     //   898: invokeinterface 154 2 0
/*     */     //   903: pop2
/*     */     //   904: aload 12
/*     */     //   906: goto +28 -> 934
/*     */     //   909: aload_0
/*     */     //   910: getfield 175	nano/spook1998/rust/structural/Stairs:g	Ljava/util/List;
/*     */     //   913: aload 13
/*     */     //   915: invokeinterface 154 2 0
/*     */     //   920: aload_0
/*     */     //   921: getfield 173	nano/spook1998/rust/structural/Stairs:ALLATORIxDEMO	Ljava/util/List;
/*     */     //   924: aload 13
/*     */     //   926: invokeinterface 154 2 0
/*     */     //   931: pop2
/*     */     //   932: aload 12
/*     */     //   934: invokevirtual 48	java/lang/Integer:intValue	()I
/*     */     //   937: iconst_1
/*     */     //   938: iadd
/*     */     //   939: invokestatic 36	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   942: astore 12
/*     */     //   944: aload 14
/*     */     //   946: invokeinterface 179 1 0
/*     */     //   951: ifne -99 -> 852
/*     */     //   954: aload 9
/*     */     //   956: invokevirtual 48	java/lang/Integer:intValue	()I
/*     */     //   959: iconst_1
/*     */     //   960: isub
/*     */     //   961: invokestatic 36	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   964: astore 9
/*     */     //   966: aload 8
/*     */     //   968: invokevirtual 48	java/lang/Integer:intValue	()I
/*     */     //   971: iconst_1
/*     */     //   972: isub
/*     */     //   973: invokestatic 36	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   976: astore 8
/*     */     //   978: aload 10
/*     */     //   980: invokevirtual 48	java/lang/Integer:intValue	()I
/*     */     //   983: iconst_1
/*     */     //   984: iadd
/*     */     //   985: invokestatic 36	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   988: dup
/*     */     //   989: astore 10
/*     */     //   991: invokevirtual 48	java/lang/Integer:intValue	()I
/*     */     //   994: iconst_3
/*     */     //   995: if_icmple -390 -> 605
/*     */     //   998: aload_0
/*     */     //   999: getfield 173	nano/spook1998/rust/structural/Stairs:ALLATORIxDEMO	Ljava/util/List;
/*     */     //   1002: invokeinterface 159 1 0
/*     */     //   1007: ifne +4 -> 1011
/*     */     //   1010: return
/*     */     //   1011: aload_0
/*     */     //   1012: getfield 173	nano/spook1998/rust/structural/Stairs:ALLATORIxDEMO	Ljava/util/List;
/*     */     //   1015: invokeinterface 159 1 0
/*     */     //   1020: iconst_1
/*     */     //   1021: isub
/*     */     //   1022: invokestatic 36	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   1025: astore 6
/*     */     //   1027: iconst_0
/*     */     //   1028: invokestatic 36	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   1031: astore 7
/*     */     //   1033: aload 6
/*     */     //   1035: dup
/*     */     //   1036: astore 8
/*     */     //   1038: goto +119 -> 1157
/*     */     //   1041: aload 8
/*     */     //   1043: invokevirtual 48	java/lang/Integer:intValue	()I
/*     */     //   1046: ifge +12 -> 1058
/*     */     //   1049: aload_0
/*     */     //   1050: iconst_0
/*     */     //   1051: invokestatic 62	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
/*     */     //   1054: putfield 135	nano/spook1998/rust/structural/Stairs:b	Ljava/lang/Boolean;
/*     */     //   1057: return
/*     */     //   1058: aload_0
/*     */     //   1059: getfield 173	nano/spook1998/rust/structural/Stairs:ALLATORIxDEMO	Ljava/util/List;
/*     */     //   1062: aload 8
/*     */     //   1064: invokevirtual 48	java/lang/Integer:intValue	()I
/*     */     //   1067: invokeinterface 187 2 0
/*     */     //   1072: checkcast 120	org/bukkit/block/Block
/*     */     //   1075: getstatic 193	org/bukkit/block/BlockFace:DOWN	Lorg/bukkit/block/BlockFace;
/*     */     //   1078: invokeinterface 197 2 0
/*     */     //   1083: dup
/*     */     //   1084: astore 9
/*     */     //   1086: invokeinterface 139 1 0
/*     */     //   1091: getstatic 200	org/bukkit/Material:GRASS	Lorg/bukkit/Material;
/*     */     //   1094: invokevirtual 149	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
/*     */     //   1097: ifne +35 -> 1132
/*     */     //   1100: aload 9
/*     */     //   1102: invokeinterface 139 1 0
/*     */     //   1107: getstatic 203	org/bukkit/Material:DIRT	Lorg/bukkit/Material;
/*     */     //   1110: invokevirtual 149	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
/*     */     //   1113: ifne +19 -> 1132
/*     */     //   1116: aload 9
/*     */     //   1118: invokeinterface 139 1 0
/*     */     //   1123: getstatic 206	org/bukkit/Material:SAND	Lorg/bukkit/Material;
/*     */     //   1126: invokevirtual 149	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
/*     */     //   1129: ifeq +15 -> 1144
/*     */     //   1132: aload 7
/*     */     //   1134: invokevirtual 48	java/lang/Integer:intValue	()I
/*     */     //   1137: iconst_1
/*     */     //   1138: iadd
/*     */     //   1139: invokestatic 36	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   1142: astore 7
/*     */     //   1144: aload 8
/*     */     //   1146: invokevirtual 48	java/lang/Integer:intValue	()I
/*     */     //   1149: iconst_1
/*     */     //   1150: isub
/*     */     //   1151: invokestatic 36	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   1154: dup
/*     */     //   1155: astore 8
/*     */     //   1157: invokevirtual 48	java/lang/Integer:intValue	()I
/*     */     //   1160: aload 6
/*     */     //   1162: invokevirtual 48	java/lang/Integer:intValue	()I
/*     */     //   1165: iconst_4
/*     */     //   1166: isub
/*     */     //   1167: if_icmpge -126 -> 1041
/*     */     //   1170: aload 7
/*     */     //   1172: invokevirtual 48	java/lang/Integer:intValue	()I
/*     */     //   1175: iconst_3
/*     */     //   1176: if_icmpge +11 -> 1187
/*     */     //   1179: aload_0
/*     */     //   1180: iconst_0
/*     */     //   1181: invokestatic 62	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
/*     */     //   1184: putfield 135	nano/spook1998/rust/structural/Stairs:b	Ljava/lang/Boolean;
/*     */     //   1187: return
/*     */     // Line number table:
/*     */     //   Java source line #5	-> byte code offset #0
/*     */     //   Java source line #86	-> byte code offset #8
/*     */     //   Java source line #29	-> byte code offset #13
/*     */     //   Java source line #163	-> byte code offset #19
/*     */     //   Java source line #193	-> byte code offset #41
/*     */     //   Java source line #60	-> byte code offset #65
/*     */     //   Java source line #129	-> byte code offset #71
/*     */     //   Java source line #21	-> byte code offset #77
/*     */     //   Java source line #175	-> byte code offset #83
/*     */     //   Java source line #112	-> byte code offset #91
/*     */     //   Java source line #70	-> byte code offset #111
/*     */     //   Java source line #158	-> byte code offset #125
/*     */     //   Java source line #138	-> byte code offset #131
/*     */     //   Java source line #91	-> byte code offset #137
/*     */     //   Java source line #39	-> byte code offset #148
/*     */     //   Java source line #59	-> byte code offset #157
/*     */     //   Java source line #174	-> byte code offset #175
/*     */     //   Java source line #19	-> byte code offset #178
/*     */     //   Java source line #18	-> byte code offset #192
/*     */     //   Java source line #120	-> byte code offset #234
/*     */     //   Java source line #11	-> byte code offset #239
/*     */     //   Java source line #176	-> byte code offset #242
/*     */     //   Java source line #66	-> byte code offset #284
/*     */     //   Java source line #139	-> byte code offset #289
/*     */     //   Java source line #71	-> byte code offset #300
/*     */     //   Java source line #80	-> byte code offset #303
/*     */     //   Java source line #64	-> byte code offset #320
/*     */     //   Java source line #147	-> byte code offset #336
/*     */     //   Java source line #59	-> byte code offset #346
/*     */     //   Java source line #132	-> byte code offset #365
/*     */     //   Java source line #186	-> byte code offset #371
/*     */     //   Java source line #133	-> byte code offset #382
/*     */     //   Java source line #121	-> byte code offset #407
/*     */     //   Java source line #57	-> byte code offset #424
/*     */     //   Java source line #192	-> byte code offset #435
/*     */     //   Java source line #99	-> byte code offset #449
/*     */     //   Java source line #28	-> byte code offset #452
/*     */     //   Java source line #94	-> byte code offset #463
/*     */     //   Java source line #50	-> byte code offset #475
/*     */     //   Java source line #133	-> byte code offset #487
/*     */     //   Java source line #85	-> byte code offset #497
/*     */     //   Java source line #14	-> byte code offset #509
/*     */     //   Java source line #91	-> byte code offset #521
/*     */     //   Java source line #122	-> byte code offset #541
/*     */     //   Java source line #108	-> byte code offset #549
/*     */     //   Java source line #137	-> byte code offset #569
/*     */     //   Java source line #165	-> byte code offset #583
/*     */     //   Java source line #4	-> byte code offset #589
/*     */     //   Java source line #154	-> byte code offset #595
/*     */     //   Java source line #87	-> byte code offset #605
/*     */     //   Java source line #22	-> byte code offset #614
/*     */     //   Java source line #179	-> byte code offset #632
/*     */     //   Java source line #16	-> byte code offset #635
/*     */     //   Java source line #43	-> byte code offset #649
/*     */     //   Java source line #148	-> byte code offset #691
/*     */     //   Java source line #116	-> byte code offset #696
/*     */     //   Java source line #15	-> byte code offset #699
/*     */     //   Java source line #181	-> byte code offset #741
/*     */     //   Java source line #196	-> byte code offset #746
/*     */     //   Java source line #159	-> byte code offset #757
/*     */     //   Java source line #128	-> byte code offset #760
/*     */     //   Java source line #197	-> byte code offset #777
/*     */     //   Java source line #22	-> byte code offset #803
/*     */     //   Java source line #53	-> byte code offset #822
/*     */     //   Java source line #166	-> byte code offset #828
/*     */     //   Java source line #17	-> byte code offset #839
/*     */     //   Java source line #37	-> byte code offset #864
/*     */     //   Java source line #149	-> byte code offset #881
/*     */     //   Java source line #63	-> byte code offset #892
/*     */     //   Java source line #131	-> byte code offset #906
/*     */     //   Java source line #136	-> byte code offset #909
/*     */     //   Java source line #183	-> byte code offset #920
/*     */     //   Java source line #33	-> byte code offset #932
/*     */     //   Java source line #17	-> byte code offset #944
/*     */     //   Java source line #44	-> byte code offset #954
/*     */     //   Java source line #52	-> byte code offset #966
/*     */     //   Java source line #154	-> byte code offset #978
/*     */     //   Java source line #185	-> byte code offset #998
/*     */     //   Java source line #198	-> byte code offset #1011
/*     */     //   Java source line #10	-> byte code offset #1027
/*     */     //   Java source line #200	-> byte code offset #1033
/*     */     //   Java source line #103	-> byte code offset #1041
/*     */     //   Java source line #115	-> byte code offset #1049
/*     */     //   Java source line #178	-> byte code offset #1057
/*     */     //   Java source line #83	-> byte code offset #1058
/*     */     //   Java source line #79	-> byte code offset #1086
/*     */     //   Java source line #200	-> byte code offset #1144
/*     */     //   Java source line #188	-> byte code offset #1170
/*     */     //   Java source line #61	-> byte code offset #1187
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	1188	0	a	Stairs
/*     */     //   0	1188	1	a	nano.spook1998.rust.object.User
/*     */   }
/*     */ }


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\structural\Stairs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */