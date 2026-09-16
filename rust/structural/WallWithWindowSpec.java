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
/*     */ public class WallWithWindowSpec
/*     */ {
/*     */   private Location F;
/*     */   private List<Block> g;
/*     */   private List<Block> f;
/*     */   private List<Block> D;
/*     */   private Boolean M;
/*     */   private List<Block> b;
/*     */   private List<Block> ALLATORIxDEMO;
/*     */   
/*     */   public Boolean isBuild()
/*     */   {
/*  47 */     return a.M;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public List<Block> getListBlock1()
/*     */   {
/*  56 */     return a.f;
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
/*  68 */     return a.g;
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
/*  86 */     return a.b;
/*     */   }
/*     */   
/*  89 */   public List<Block> getListBlock3() { return a.D; }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/* 142 */     return a.ALLATORIxDEMO;
/*     */   }
/*     */   
/*     */   public WallWithWindowSpec(Location a)
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
/*  92 */       a.F = a;a;a.<init>();new java/util/ArrayList.ALLATORIxDEMO = a;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/* 162 */     a.b = new ArrayList();a.g = new ArrayList();a.D = new ArrayList();
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 182 */     1.M = Boolean.valueOf(a);
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public void calculate(nano.spook1998.rust.object.User a)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: invokevirtual 60	nano/spook1998/rust/object/User:getName	()Ljava/lang/String;
/*     */     //   4: invokestatic 66	org/bukkit/Bukkit:getPlayer	(Ljava/lang/String;)Lorg/bukkit/entity/Player;
/*     */     //   7: astore_2
/*     */     //   8: aload_0
/*     */     //   9: aload_2
/*     */     //   10: dup_x1
/*     */     //   11: invokeinterface 72 1 0
/*     */     //   16: invokestatic 78	nano/spook1998/rust/utils/LocationUtil:getLocationWall	(Lorg/bukkit/Location;)Lorg/bukkit/Location;
/*     */     //   19: putfield 23	nano/spook1998/rust/structural/WallWithWindowSpec:F	Lorg/bukkit/Location;
/*     */     //   22: invokestatic 84	nano/spook1998/rust/utils/DirectionUtil:getDirectionSpec	(Lorg/bukkit/entity/Player;)Lnano/spook1998/rust/utils/type/DirectionType;
/*     */     //   25: astore_2
/*     */     //   26: iconst_0
/*     */     //   27: invokestatic 89	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   30: astore_3
/*     */     //   31: aload_2
/*     */     //   32: getstatic 95	nano/spook1998/rust/utils/type/DirectionType:P	Lnano/spook1998/rust/utils/type/DirectionType;
/*     */     //   35: invokevirtual 99	nano/spook1998/rust/utils/type/DirectionType:equals	(Ljava/lang/Object;)Z
/*     */     //   38: ifeq +622 -> 660
/*     */     //   41: bipush -2
/*     */     //   43: invokestatic 89	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   46: astore 4
/*     */     //   48: bipush -2
/*     */     //   50: invokestatic 89	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   53: astore 5
/*     */     //   55: aload_0
/*     */     //   56: getfield 23	nano/spook1998/rust/structural/WallWithWindowSpec:F	Lorg/bukkit/Location;
/*     */     //   59: invokevirtual 105	org/bukkit/Location:getX	()D
/*     */     //   62: dconst_0
/*     */     //   63: dcmpg
/*     */     //   64: ifge +15 -> 79
/*     */     //   67: aload 4
/*     */     //   69: invokevirtual 109	java/lang/Integer:intValue	()I
/*     */     //   72: iconst_1
/*     */     //   73: isub
/*     */     //   74: invokestatic 89	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   77: astore 4
/*     */     //   79: aload_0
/*     */     //   80: getfield 23	nano/spook1998/rust/structural/WallWithWindowSpec:F	Lorg/bukkit/Location;
/*     */     //   83: invokevirtual 112	org/bukkit/Location:getZ	()D
/*     */     //   86: dconst_0
/*     */     //   87: dcmpg
/*     */     //   88: ifge +15 -> 103
/*     */     //   91: aload 5
/*     */     //   93: invokevirtual 109	java/lang/Integer:intValue	()I
/*     */     //   96: iconst_1
/*     */     //   97: isub
/*     */     //   98: invokestatic 89	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   101: astore 5
/*     */     //   103: iconst_0
/*     */     //   104: invokestatic 89	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   107: dup
/*     */     //   108: astore 6
/*     */     //   110: goto +543 -> 653
/*     */     //   113: athrow
/*     */     //   114: iconst_0
/*     */     //   115: invokestatic 89	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   118: astore 7
/*     */     //   120: aload_0
/*     */     //   121: getfield 23	nano/spook1998/rust/structural/WallWithWindowSpec:F	Lorg/bukkit/Location;
/*     */     //   124: invokevirtual 115	org/bukkit/Location:clone	()Lorg/bukkit/Location;
/*     */     //   127: invokevirtual 118	org/bukkit/Location:getY	()D
/*     */     //   130: ldc2_w 119
/*     */     //   133: dsub
/*     */     //   134: d2i
/*     */     //   135: invokestatic 89	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   138: dup
/*     */     //   139: astore 8
/*     */     //   141: goto +443 -> 584
/*     */     //   144: athrow
/*     */     //   145: aload_0
/*     */     //   146: getfield 23	nano/spook1998/rust/structural/WallWithWindowSpec:F	Lorg/bukkit/Location;
/*     */     //   149: invokevirtual 115	org/bukkit/Location:clone	()Lorg/bukkit/Location;
/*     */     //   152: aload 4
/*     */     //   154: invokevirtual 109	java/lang/Integer:intValue	()I
/*     */     //   157: i2d
/*     */     //   158: dconst_0
/*     */     //   159: aload 5
/*     */     //   161: invokevirtual 109	java/lang/Integer:intValue	()I
/*     */     //   164: i2d
/*     */     //   165: invokevirtual 124	org/bukkit/Location:add	(DDD)Lorg/bukkit/Location;
/*     */     //   168: dup
/*     */     //   169: astore 9
/*     */     //   171: dup
/*     */     //   172: aload 8
/*     */     //   174: invokevirtual 109	java/lang/Integer:intValue	()I
/*     */     //   177: i2d
/*     */     //   178: invokevirtual 128	org/bukkit/Location:setY	(D)V
/*     */     //   181: invokevirtual 132	org/bukkit/Location:getBlock	()Lorg/bukkit/block/Block;
/*     */     //   184: dup
/*     */     //   185: astore 10
/*     */     //   187: invokeinterface 135 1 0
/*     */     //   192: invokestatic 141	nano/spook1998/rust/object/utils/RegionUtil:getRegionAtLocation	(Lorg/bukkit/Location;)Lnano/spook1998/rust/object/Region;
/*     */     //   195: dup
/*     */     //   196: astore 11
/*     */     //   198: ifnull +20 -> 218
/*     */     //   201: aload 11
/*     */     //   203: aload_1
/*     */     //   204: invokevirtual 147	nano/spook1998/rust/object/Region:checkUser	(Lnano/spook1998/rust/object/User;)Z
/*     */     //   207: ifne +11 -> 218
/*     */     //   210: aload_0
/*     */     //   211: iconst_0
/*     */     //   212: invokestatic 42	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
/*     */     //   215: putfield 44	nano/spook1998/rust/structural/WallWithWindowSpec:M	Ljava/lang/Boolean;
/*     */     //   218: aload_3
/*     */     //   219: invokevirtual 109	java/lang/Integer:intValue	()I
/*     */     //   222: iconst_2
/*     */     //   223: if_icmpne +123 -> 346
/*     */     //   226: aload 7
/*     */     //   228: invokevirtual 109	java/lang/Integer:intValue	()I
/*     */     //   231: iconst_2
/*     */     //   232: if_icmpne +43 -> 275
/*     */     //   235: aload 10
/*     */     //   237: invokeinterface 151 1 0
/*     */     //   242: getstatic 157	org/bukkit/Material:AIR	Lorg/bukkit/Material;
/*     */     //   245: invokevirtual 158	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
/*     */     //   248: ifeq +15 -> 263
/*     */     //   251: aload_0
/*     */     //   252: getfield 34	nano/spook1998/rust/structural/WallWithWindowSpec:g	Ljava/util/List;
/*     */     //   255: aload 10
/*     */     //   257: invokeinterface 162 2 0
/*     */     //   262: pop
/*     */     //   263: aload_0
/*     */     //   264: getfield 32	nano/spook1998/rust/structural/WallWithWindowSpec:b	Ljava/util/List;
/*     */     //   267: aload 10
/*     */     //   269: invokeinterface 162 2 0
/*     */     //   274: pop
/*     */     //   275: aload 7
/*     */     //   277: invokevirtual 109	java/lang/Integer:intValue	()I
/*     */     //   280: ifeq +12 -> 292
/*     */     //   283: aload 7
/*     */     //   285: invokevirtual 109	java/lang/Integer:intValue	()I
/*     */     //   288: iconst_4
/*     */     //   289: if_icmpne +32 -> 321
/*     */     //   292: aload 10
/*     */     //   294: invokeinterface 151 1 0
/*     */     //   299: getstatic 157	org/bukkit/Material:AIR	Lorg/bukkit/Material;
/*     */     //   302: invokevirtual 158	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
/*     */     //   305: aload_0
/*     */     //   306: getfield 30	nano/spook1998/rust/structural/WallWithWindowSpec:f	Ljava/util/List;
/*     */     //   309: aload 10
/*     */     //   311: invokeinterface 162 2 0
/*     */     //   316: pop2
/*     */     //   317: aload_3
/*     */     //   318: goto +29 -> 347
/*     */     //   321: aload 10
/*     */     //   323: invokeinterface 151 1 0
/*     */     //   328: getstatic 157	org/bukkit/Material:AIR	Lorg/bukkit/Material;
/*     */     //   331: invokevirtual 158	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
/*     */     //   334: aload_0
/*     */     //   335: getfield 28	nano/spook1998/rust/structural/WallWithWindowSpec:ALLATORIxDEMO	Ljava/util/List;
/*     */     //   338: aload 10
/*     */     //   340: invokeinterface 162 2 0
/*     */     //   345: pop2
/*     */     //   346: aload_3
/*     */     //   347: invokevirtual 109	java/lang/Integer:intValue	()I
/*     */     //   350: ifeq +11 -> 361
/*     */     //   353: aload_3
/*     */     //   354: invokevirtual 109	java/lang/Integer:intValue	()I
/*     */     //   357: iconst_4
/*     */     //   358: if_icmpne +114 -> 472
/*     */     //   361: aload 7
/*     */     //   363: invokevirtual 109	java/lang/Integer:intValue	()I
/*     */     //   366: ifne +52 -> 418
/*     */     //   369: aload 10
/*     */     //   371: invokeinterface 151 1 0
/*     */     //   376: getstatic 165	org/bukkit/Material:LOG	Lorg/bukkit/Material;
/*     */     //   379: invokevirtual 158	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
/*     */     //   382: ifne +16 -> 398
/*     */     //   385: aload 7
/*     */     //   387: aload_0
/*     */     //   388: iconst_0
/*     */     //   389: invokestatic 42	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
/*     */     //   392: putfield 44	nano/spook1998/rust/structural/WallWithWindowSpec:M	Ljava/lang/Boolean;
/*     */     //   395: goto +25 -> 420
/*     */     //   398: aload 10
/*     */     //   400: invokeinterface 169 1 0
/*     */     //   405: bipush 13
/*     */     //   407: if_icmpeq +11 -> 418
/*     */     //   410: aload_0
/*     */     //   411: iconst_0
/*     */     //   412: invokestatic 42	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
/*     */     //   415: putfield 44	nano/spook1998/rust/structural/WallWithWindowSpec:M	Ljava/lang/Boolean;
/*     */     //   418: aload 7
/*     */     //   420: invokevirtual 109	java/lang/Integer:intValue	()I
/*     */     //   423: iconst_4
/*     */     //   424: if_icmpne +31 -> 455
/*     */     //   427: aload 7
/*     */     //   429: aload_0
/*     */     //   430: getfield 30	nano/spook1998/rust/structural/WallWithWindowSpec:f	Ljava/util/List;
/*     */     //   433: aload 10
/*     */     //   435: invokeinterface 162 2 0
/*     */     //   440: aload_0
/*     */     //   441: getfield 36	nano/spook1998/rust/structural/WallWithWindowSpec:D	Ljava/util/List;
/*     */     //   444: aload 10
/*     */     //   446: invokeinterface 162 2 0
/*     */     //   451: pop2
/*     */     //   452: goto +109 -> 561
/*     */     //   455: aload_0
/*     */     //   456: getfield 30	nano/spook1998/rust/structural/WallWithWindowSpec:f	Ljava/util/List;
/*     */     //   459: aload 10
/*     */     //   461: invokeinterface 162 2 0
/*     */     //   466: pop
/*     */     //   467: aload 7
/*     */     //   469: goto +92 -> 561
/*     */     //   472: aload 7
/*     */     //   474: invokevirtual 109	java/lang/Integer:intValue	()I
/*     */     //   477: ifeq +12 -> 489
/*     */     //   480: aload 7
/*     */     //   482: invokevirtual 109	java/lang/Integer:intValue	()I
/*     */     //   485: iconst_4
/*     */     //   486: if_icmpne +33 -> 519
/*     */     //   489: aload 10
/*     */     //   491: invokeinterface 151 1 0
/*     */     //   496: getstatic 157	org/bukkit/Material:AIR	Lorg/bukkit/Material;
/*     */     //   499: invokevirtual 158	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
/*     */     //   502: aload_0
/*     */     //   503: getfield 30	nano/spook1998/rust/structural/WallWithWindowSpec:f	Ljava/util/List;
/*     */     //   506: aload 10
/*     */     //   508: invokeinterface 162 2 0
/*     */     //   513: pop2
/*     */     //   514: aload 7
/*     */     //   516: goto +45 -> 561
/*     */     //   519: aload 10
/*     */     //   521: invokeinterface 151 1 0
/*     */     //   526: getstatic 157	org/bukkit/Material:AIR	Lorg/bukkit/Material;
/*     */     //   529: invokevirtual 158	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
/*     */     //   532: ifeq +15 -> 547
/*     */     //   535: aload_0
/*     */     //   536: getfield 34	nano/spook1998/rust/structural/WallWithWindowSpec:g	Ljava/util/List;
/*     */     //   539: aload 10
/*     */     //   541: invokeinterface 162 2 0
/*     */     //   546: pop
/*     */     //   547: aload_0
/*     */     //   548: getfield 28	nano/spook1998/rust/structural/WallWithWindowSpec:ALLATORIxDEMO	Ljava/util/List;
/*     */     //   551: aload 10
/*     */     //   553: invokeinterface 162 2 0
/*     */     //   558: pop
/*     */     //   559: aload 7
/*     */     //   561: invokevirtual 109	java/lang/Integer:intValue	()I
/*     */     //   564: iconst_1
/*     */     //   565: iadd
/*     */     //   566: invokestatic 89	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   569: astore 7
/*     */     //   571: aload 8
/*     */     //   573: invokevirtual 109	java/lang/Integer:intValue	()I
/*     */     //   576: iconst_1
/*     */     //   577: iadd
/*     */     //   578: invokestatic 89	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   581: dup
/*     */     //   582: astore 8
/*     */     //   584: invokevirtual 109	java/lang/Integer:intValue	()I
/*     */     //   587: i2d
/*     */     //   588: aload_0
/*     */     //   589: getfield 23	nano/spook1998/rust/structural/WallWithWindowSpec:F	Lorg/bukkit/Location;
/*     */     //   592: invokevirtual 115	org/bukkit/Location:clone	()Lorg/bukkit/Location;
/*     */     //   595: invokevirtual 118	org/bukkit/Location:getY	()D
/*     */     //   598: ldc2_w 119
/*     */     //   601: dadd
/*     */     //   602: dcmpg
/*     */     //   603: ifle -458 -> 145
/*     */     //   606: aload_3
/*     */     //   607: invokevirtual 109	java/lang/Integer:intValue	()I
/*     */     //   610: iconst_1
/*     */     //   611: iadd
/*     */     //   612: invokestatic 89	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   615: astore_3
/*     */     //   616: aload 4
/*     */     //   618: invokevirtual 109	java/lang/Integer:intValue	()I
/*     */     //   621: iconst_1
/*     */     //   622: iadd
/*     */     //   623: invokestatic 89	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   626: astore 4
/*     */     //   628: aload 5
/*     */     //   630: invokevirtual 109	java/lang/Integer:intValue	()I
/*     */     //   633: iconst_1
/*     */     //   634: iadd
/*     */     //   635: invokestatic 89	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   638: astore 5
/*     */     //   640: aload 6
/*     */     //   642: invokevirtual 109	java/lang/Integer:intValue	()I
/*     */     //   645: iconst_1
/*     */     //   646: iadd
/*     */     //   647: invokestatic 89	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   650: dup
/*     */     //   651: astore 6
/*     */     //   653: invokevirtual 109	java/lang/Integer:intValue	()I
/*     */     //   656: iconst_5
/*     */     //   657: if_icmplt -543 -> 114
/*     */     //   660: aload_2
/*     */     //   661: getstatic 172	nano/spook1998/rust/utils/type/DirectionType:B	Lnano/spook1998/rust/utils/type/DirectionType;
/*     */     //   664: invokevirtual 99	nano/spook1998/rust/utils/type/DirectionType:equals	(Ljava/lang/Object;)Z
/*     */     //   667: ifeq +619 -> 1286
/*     */     //   670: iconst_2
/*     */     //   671: invokestatic 89	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   674: astore 4
/*     */     //   676: bipush -2
/*     */     //   678: invokestatic 89	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   681: astore 5
/*     */     //   683: aload_0
/*     */     //   684: getfield 23	nano/spook1998/rust/structural/WallWithWindowSpec:F	Lorg/bukkit/Location;
/*     */     //   687: invokevirtual 105	org/bukkit/Location:getX	()D
/*     */     //   690: dconst_0
/*     */     //   691: dcmpg
/*     */     //   692: ifge +15 -> 707
/*     */     //   695: aload 4
/*     */     //   697: invokevirtual 109	java/lang/Integer:intValue	()I
/*     */     //   700: iconst_1
/*     */     //   701: iadd
/*     */     //   702: invokestatic 89	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   705: astore 4
/*     */     //   707: aload_0
/*     */     //   708: getfield 23	nano/spook1998/rust/structural/WallWithWindowSpec:F	Lorg/bukkit/Location;
/*     */     //   711: invokevirtual 112	org/bukkit/Location:getZ	()D
/*     */     //   714: dconst_0
/*     */     //   715: dcmpg
/*     */     //   716: ifge +15 -> 731
/*     */     //   719: aload 5
/*     */     //   721: invokevirtual 109	java/lang/Integer:intValue	()I
/*     */     //   724: iconst_1
/*     */     //   725: isub
/*     */     //   726: invokestatic 89	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   729: astore 5
/*     */     //   731: iconst_0
/*     */     //   732: invokestatic 89	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   735: dup
/*     */     //   736: astore 6
/*     */     //   738: goto +541 -> 1279
/*     */     //   741: iconst_0
/*     */     //   742: invokestatic 89	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   745: astore 7
/*     */     //   747: aload_0
/*     */     //   748: getfield 23	nano/spook1998/rust/structural/WallWithWindowSpec:F	Lorg/bukkit/Location;
/*     */     //   751: invokevirtual 115	org/bukkit/Location:clone	()Lorg/bukkit/Location;
/*     */     //   754: invokevirtual 118	org/bukkit/Location:getY	()D
/*     */     //   757: ldc2_w 119
/*     */     //   760: dsub
/*     */     //   761: d2i
/*     */     //   762: invokestatic 89	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   765: dup
/*     */     //   766: astore 8
/*     */     //   768: goto +442 -> 1210
/*     */     //   771: aload_0
/*     */     //   772: getfield 23	nano/spook1998/rust/structural/WallWithWindowSpec:F	Lorg/bukkit/Location;
/*     */     //   775: invokevirtual 115	org/bukkit/Location:clone	()Lorg/bukkit/Location;
/*     */     //   778: aload 4
/*     */     //   780: invokevirtual 109	java/lang/Integer:intValue	()I
/*     */     //   783: i2d
/*     */     //   784: dconst_0
/*     */     //   785: aload 5
/*     */     //   787: invokevirtual 109	java/lang/Integer:intValue	()I
/*     */     //   790: i2d
/*     */     //   791: invokevirtual 124	org/bukkit/Location:add	(DDD)Lorg/bukkit/Location;
/*     */     //   794: dup
/*     */     //   795: astore 9
/*     */     //   797: dup
/*     */     //   798: aload 8
/*     */     //   800: invokevirtual 109	java/lang/Integer:intValue	()I
/*     */     //   803: i2d
/*     */     //   804: invokevirtual 128	org/bukkit/Location:setY	(D)V
/*     */     //   807: invokevirtual 132	org/bukkit/Location:getBlock	()Lorg/bukkit/block/Block;
/*     */     //   810: dup
/*     */     //   811: astore 10
/*     */     //   813: invokeinterface 135 1 0
/*     */     //   818: invokestatic 141	nano/spook1998/rust/object/utils/RegionUtil:getRegionAtLocation	(Lorg/bukkit/Location;)Lnano/spook1998/rust/object/Region;
/*     */     //   821: dup
/*     */     //   822: astore 11
/*     */     //   824: ifnull +20 -> 844
/*     */     //   827: aload 11
/*     */     //   829: aload_1
/*     */     //   830: invokevirtual 147	nano/spook1998/rust/object/Region:checkUser	(Lnano/spook1998/rust/object/User;)Z
/*     */     //   833: ifne +11 -> 844
/*     */     //   836: aload_0
/*     */     //   837: iconst_0
/*     */     //   838: invokestatic 42	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
/*     */     //   841: putfield 44	nano/spook1998/rust/structural/WallWithWindowSpec:M	Ljava/lang/Boolean;
/*     */     //   844: aload_3
/*     */     //   845: invokevirtual 109	java/lang/Integer:intValue	()I
/*     */     //   848: iconst_2
/*     */     //   849: if_icmpne +123 -> 972
/*     */     //   852: aload 7
/*     */     //   854: invokevirtual 109	java/lang/Integer:intValue	()I
/*     */     //   857: iconst_2
/*     */     //   858: if_icmpne +43 -> 901
/*     */     //   861: aload 10
/*     */     //   863: invokeinterface 151 1 0
/*     */     //   868: getstatic 157	org/bukkit/Material:AIR	Lorg/bukkit/Material;
/*     */     //   871: invokevirtual 158	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
/*     */     //   874: ifeq +15 -> 889
/*     */     //   877: aload_0
/*     */     //   878: getfield 34	nano/spook1998/rust/structural/WallWithWindowSpec:g	Ljava/util/List;
/*     */     //   881: aload 10
/*     */     //   883: invokeinterface 162 2 0
/*     */     //   888: pop
/*     */     //   889: aload_0
/*     */     //   890: getfield 32	nano/spook1998/rust/structural/WallWithWindowSpec:b	Ljava/util/List;
/*     */     //   893: aload 10
/*     */     //   895: invokeinterface 162 2 0
/*     */     //   900: pop
/*     */     //   901: aload 7
/*     */     //   903: invokevirtual 109	java/lang/Integer:intValue	()I
/*     */     //   906: ifeq +12 -> 918
/*     */     //   909: aload 7
/*     */     //   911: invokevirtual 109	java/lang/Integer:intValue	()I
/*     */     //   914: iconst_4
/*     */     //   915: if_icmpne +32 -> 947
/*     */     //   918: aload 10
/*     */     //   920: invokeinterface 151 1 0
/*     */     //   925: getstatic 157	org/bukkit/Material:AIR	Lorg/bukkit/Material;
/*     */     //   928: invokevirtual 158	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
/*     */     //   931: aload_0
/*     */     //   932: getfield 30	nano/spook1998/rust/structural/WallWithWindowSpec:f	Ljava/util/List;
/*     */     //   935: aload 10
/*     */     //   937: invokeinterface 162 2 0
/*     */     //   942: pop2
/*     */     //   943: aload_3
/*     */     //   944: goto +29 -> 973
/*     */     //   947: aload 10
/*     */     //   949: invokeinterface 151 1 0
/*     */     //   954: getstatic 157	org/bukkit/Material:AIR	Lorg/bukkit/Material;
/*     */     //   957: invokevirtual 158	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
/*     */     //   960: aload_0
/*     */     //   961: getfield 28	nano/spook1998/rust/structural/WallWithWindowSpec:ALLATORIxDEMO	Ljava/util/List;
/*     */     //   964: aload 10
/*     */     //   966: invokeinterface 162 2 0
/*     */     //   971: pop2
/*     */     //   972: aload_3
/*     */     //   973: invokevirtual 109	java/lang/Integer:intValue	()I
/*     */     //   976: ifeq +11 -> 987
/*     */     //   979: aload_3
/*     */     //   980: invokevirtual 109	java/lang/Integer:intValue	()I
/*     */     //   983: iconst_4
/*     */     //   984: if_icmpne +114 -> 1098
/*     */     //   987: aload 7
/*     */     //   989: invokevirtual 109	java/lang/Integer:intValue	()I
/*     */     //   992: ifne +52 -> 1044
/*     */     //   995: aload 10
/*     */     //   997: invokeinterface 151 1 0
/*     */     //   1002: getstatic 165	org/bukkit/Material:LOG	Lorg/bukkit/Material;
/*     */     //   1005: invokevirtual 158	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
/*     */     //   1008: ifne +16 -> 1024
/*     */     //   1011: aload 7
/*     */     //   1013: aload_0
/*     */     //   1014: iconst_0
/*     */     //   1015: invokestatic 42	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
/*     */     //   1018: putfield 44	nano/spook1998/rust/structural/WallWithWindowSpec:M	Ljava/lang/Boolean;
/*     */     //   1021: goto +25 -> 1046
/*     */     //   1024: aload 10
/*     */     //   1026: invokeinterface 169 1 0
/*     */     //   1031: bipush 13
/*     */     //   1033: if_icmpeq +11 -> 1044
/*     */     //   1036: aload_0
/*     */     //   1037: iconst_0
/*     */     //   1038: invokestatic 42	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
/*     */     //   1041: putfield 44	nano/spook1998/rust/structural/WallWithWindowSpec:M	Ljava/lang/Boolean;
/*     */     //   1044: aload 7
/*     */     //   1046: invokevirtual 109	java/lang/Integer:intValue	()I
/*     */     //   1049: iconst_4
/*     */     //   1050: if_icmpne +31 -> 1081
/*     */     //   1053: aload 7
/*     */     //   1055: aload_0
/*     */     //   1056: getfield 30	nano/spook1998/rust/structural/WallWithWindowSpec:f	Ljava/util/List;
/*     */     //   1059: aload 10
/*     */     //   1061: invokeinterface 162 2 0
/*     */     //   1066: aload_0
/*     */     //   1067: getfield 36	nano/spook1998/rust/structural/WallWithWindowSpec:D	Ljava/util/List;
/*     */     //   1070: aload 10
/*     */     //   1072: invokeinterface 162 2 0
/*     */     //   1077: pop2
/*     */     //   1078: goto +109 -> 1187
/*     */     //   1081: aload_0
/*     */     //   1082: getfield 30	nano/spook1998/rust/structural/WallWithWindowSpec:f	Ljava/util/List;
/*     */     //   1085: aload 10
/*     */     //   1087: invokeinterface 162 2 0
/*     */     //   1092: pop
/*     */     //   1093: aload 7
/*     */     //   1095: goto +92 -> 1187
/*     */     //   1098: aload 7
/*     */     //   1100: invokevirtual 109	java/lang/Integer:intValue	()I
/*     */     //   1103: ifeq +12 -> 1115
/*     */     //   1106: aload 7
/*     */     //   1108: invokevirtual 109	java/lang/Integer:intValue	()I
/*     */     //   1111: iconst_4
/*     */     //   1112: if_icmpne +33 -> 1145
/*     */     //   1115: aload 10
/*     */     //   1117: invokeinterface 151 1 0
/*     */     //   1122: getstatic 157	org/bukkit/Material:AIR	Lorg/bukkit/Material;
/*     */     //   1125: invokevirtual 158	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
/*     */     //   1128: aload_0
/*     */     //   1129: getfield 30	nano/spook1998/rust/structural/WallWithWindowSpec:f	Ljava/util/List;
/*     */     //   1132: aload 10
/*     */     //   1134: invokeinterface 162 2 0
/*     */     //   1139: pop2
/*     */     //   1140: aload 7
/*     */     //   1142: goto +45 -> 1187
/*     */     //   1145: aload 10
/*     */     //   1147: invokeinterface 151 1 0
/*     */     //   1152: getstatic 157	org/bukkit/Material:AIR	Lorg/bukkit/Material;
/*     */     //   1155: invokevirtual 158	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
/*     */     //   1158: ifeq +15 -> 1173
/*     */     //   1161: aload_0
/*     */     //   1162: getfield 34	nano/spook1998/rust/structural/WallWithWindowSpec:g	Ljava/util/List;
/*     */     //   1165: aload 10
/*     */     //   1167: invokeinterface 162 2 0
/*     */     //   1172: pop
/*     */     //   1173: aload_0
/*     */     //   1174: getfield 28	nano/spook1998/rust/structural/WallWithWindowSpec:ALLATORIxDEMO	Ljava/util/List;
/*     */     //   1177: aload 10
/*     */     //   1179: invokeinterface 162 2 0
/*     */     //   1184: pop
/*     */     //   1185: aload 7
/*     */     //   1187: invokevirtual 109	java/lang/Integer:intValue	()I
/*     */     //   1190: iconst_1
/*     */     //   1191: iadd
/*     */     //   1192: invokestatic 89	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   1195: astore 7
/*     */     //   1197: aload 8
/*     */     //   1199: invokevirtual 109	java/lang/Integer:intValue	()I
/*     */     //   1202: iconst_1
/*     */     //   1203: iadd
/*     */     //   1204: invokestatic 89	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   1207: dup
/*     */     //   1208: astore 8
/*     */     //   1210: invokevirtual 109	java/lang/Integer:intValue	()I
/*     */     //   1213: i2d
/*     */     //   1214: aload_0
/*     */     //   1215: getfield 23	nano/spook1998/rust/structural/WallWithWindowSpec:F	Lorg/bukkit/Location;
/*     */     //   1218: invokevirtual 115	org/bukkit/Location:clone	()Lorg/bukkit/Location;
/*     */     //   1221: invokevirtual 118	org/bukkit/Location:getY	()D
/*     */     //   1224: ldc2_w 119
/*     */     //   1227: dadd
/*     */     //   1228: dcmpg
/*     */     //   1229: ifle -458 -> 771
/*     */     //   1232: aload_3
/*     */     //   1233: invokevirtual 109	java/lang/Integer:intValue	()I
/*     */     //   1236: iconst_1
/*     */     //   1237: iadd
/*     */     //   1238: invokestatic 89	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   1241: astore_3
/*     */     //   1242: aload 4
/*     */     //   1244: invokevirtual 109	java/lang/Integer:intValue	()I
/*     */     //   1247: iconst_1
/*     */     //   1248: isub
/*     */     //   1249: invokestatic 89	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   1252: astore 4
/*     */     //   1254: aload 5
/*     */     //   1256: invokevirtual 109	java/lang/Integer:intValue	()I
/*     */     //   1259: iconst_1
/*     */     //   1260: iadd
/*     */     //   1261: invokestatic 89	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   1264: astore 5
/*     */     //   1266: aload 6
/*     */     //   1268: invokevirtual 109	java/lang/Integer:intValue	()I
/*     */     //   1271: iconst_1
/*     */     //   1272: iadd
/*     */     //   1273: invokestatic 89	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   1276: dup
/*     */     //   1277: astore 6
/*     */     //   1279: invokevirtual 109	java/lang/Integer:intValue	()I
/*     */     //   1282: iconst_5
/*     */     //   1283: if_icmplt -542 -> 741
/*     */     //   1286: return
/*     */     // Line number table:
/*     */     //   Java source line #193	-> byte code offset #0
/*     */     //   Java source line #60	-> byte code offset #8
/*     */     //   Java source line #129	-> byte code offset #22
/*     */     //   Java source line #21	-> byte code offset #26
/*     */     //   Java source line #175	-> byte code offset #31
/*     */     //   Java source line #112	-> byte code offset #41
/*     */     //   Java source line #70	-> byte code offset #48
/*     */     //   Java source line #158	-> byte code offset #55
/*     */     //   Java source line #138	-> byte code offset #79
/*     */     //   Java source line #91	-> byte code offset #103
/*     */     //   Java source line #39	-> byte code offset #114
/*     */     //   Java source line #59	-> byte code offset #120
/*     */     //   Java source line #174	-> byte code offset #145
/*     */     //   Java source line #19	-> byte code offset #171
/*     */     //   Java source line #18	-> byte code offset #181
/*     */     //   Java source line #120	-> byte code offset #187
/*     */     //   Java source line #11	-> byte code offset #198
/*     */     //   Java source line #176	-> byte code offset #201
/*     */     //   Java source line #20	-> byte code offset #218
/*     */     //   Java source line #173	-> byte code offset #226
/*     */     //   Java source line #139	-> byte code offset #235
/*     */     //   Java source line #71	-> byte code offset #251
/*     */     //   Java source line #106	-> byte code offset #263
/*     */     //   Java source line #147	-> byte code offset #275
/*     */     //   Java source line #74	-> byte code offset #292
/*     */     //   Java source line #186	-> byte code offset #305
/*     */     //   Java source line #133	-> byte code offset #318
/*     */     //   Java source line #121	-> byte code offset #321
/*     */     //   Java source line #99	-> byte code offset #334
/*     */     //   Java source line #157	-> byte code offset #346
/*     */     //   Java source line #50	-> byte code offset #361
/*     */     //   Java source line #124	-> byte code offset #369
/*     */     //   Java source line #140	-> byte code offset #387
/*     */     //   Java source line #85	-> byte code offset #395
/*     */     //   Java source line #14	-> byte code offset #398
/*     */     //   Java source line #67	-> byte code offset #410
/*     */     //   Java source line #137	-> byte code offset #418
/*     */     //   Java source line #165	-> byte code offset #429
/*     */     //   Java source line #4	-> byte code offset #440
/*     */     //   Java source line #154	-> byte code offset #452
/*     */     //   Java source line #87	-> byte code offset #455
/*     */     //   Java source line #179	-> byte code offset #469
/*     */     //   Java source line #16	-> byte code offset #472
/*     */     //   Java source line #43	-> byte code offset #489
/*     */     //   Java source line #15	-> byte code offset #502
/*     */     //   Java source line #181	-> byte code offset #516
/*     */     //   Java source line #102	-> byte code offset #519
/*     */     //   Java source line #196	-> byte code offset #535
/*     */     //   Java source line #128	-> byte code offset #547
/*     */     //   Java source line #126	-> byte code offset #559
/*     */     //   Java source line #59	-> byte code offset #571
/*     */     //   Java source line #53	-> byte code offset #606
/*     */     //   Java source line #166	-> byte code offset #616
/*     */     //   Java source line #17	-> byte code offset #628
/*     */     //   Java source line #91	-> byte code offset #640
/*     */     //   Java source line #63	-> byte code offset #660
/*     */     //   Java source line #131	-> byte code offset #670
/*     */     //   Java source line #136	-> byte code offset #676
/*     */     //   Java source line #183	-> byte code offset #683
/*     */     //   Java source line #143	-> byte code offset #707
/*     */     //   Java source line #33	-> byte code offset #731
/*     */     //   Java source line #184	-> byte code offset #741
/*     */     //   Java source line #84	-> byte code offset #747
/*     */     //   Java source line #44	-> byte code offset #771
/*     */     //   Java source line #52	-> byte code offset #797
/*     */     //   Java source line #114	-> byte code offset #807
/*     */     //   Java source line #55	-> byte code offset #813
/*     */     //   Java source line #185	-> byte code offset #824
/*     */     //   Java source line #198	-> byte code offset #827
/*     */     //   Java source line #200	-> byte code offset #844
/*     */     //   Java source line #103	-> byte code offset #852
/*     */     //   Java source line #115	-> byte code offset #861
/*     */     //   Java source line #178	-> byte code offset #877
/*     */     //   Java source line #83	-> byte code offset #889
/*     */     //   Java source line #40	-> byte code offset #901
/*     */     //   Java source line #188	-> byte code offset #918
/*     */     //   Java source line #127	-> byte code offset #931
/*     */     //   Java source line #76	-> byte code offset #944
/*     */     //   Java source line #69	-> byte code offset #947
/*     */     //   Java source line #130	-> byte code offset #960
/*     */     //   Java source line #58	-> byte code offset #972
/*     */     //   Java source line #1	-> byte code offset #987
/*     */     //   Java source line #26	-> byte code offset #995
/*     */     //   Java source line #107	-> byte code offset #1013
/*     */     //   Java source line #109	-> byte code offset #1021
/*     */     //   Java source line #81	-> byte code offset #1024
/*     */     //   Java source line #54	-> byte code offset #1036
/*     */     //   Java source line #111	-> byte code offset #1044
/*     */     //   Java source line #153	-> byte code offset #1055
/*     */     //   Java source line #82	-> byte code offset #1066
/*     */     //   Java source line #169	-> byte code offset #1078
/*     */     //   Java source line #156	-> byte code offset #1081
/*     */     //   Java source line #190	-> byte code offset #1095
/*     */     //   Java source line #135	-> byte code offset #1098
/*     */     //   Java source line #7	-> byte code offset #1115
/*     */     //   Java source line #187	-> byte code offset #1128
/*     */     //   Java source line #161	-> byte code offset #1142
/*     */     //   Java source line #168	-> byte code offset #1145
/*     */     //   Java source line #101	-> byte code offset #1161
/*     */     //   Java source line #9	-> byte code offset #1173
/*     */     //   Java source line #42	-> byte code offset #1185
/*     */     //   Java source line #84	-> byte code offset #1197
/*     */     //   Java source line #88	-> byte code offset #1232
/*     */     //   Java source line #34	-> byte code offset #1242
/*     */     //   Java source line #152	-> byte code offset #1254
/*     */     //   Java source line #33	-> byte code offset #1266
/*     */     //   Java source line #36	-> byte code offset #1286
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	1287	0	a	WallWithWindowSpec
/*     */     //   0	1287	1	a	nano.spook1998.rust.object.User
/*     */   }
/*     */ }


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\structural\WallWithWindowSpec.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */