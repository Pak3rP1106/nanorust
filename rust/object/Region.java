/*     */ package nano.spook1998.rust.object;
/*     */ 
/*     */ import java.util.List;
/*     */ 
/*     */ public class Region {
/*   6 */   public void removeUser(User a) { if (a.M.contains(a)) { a.M.remove(a);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void addUser(User a)
/*     */   {
/*  17 */     if (!a.M.contains(a)) { a.M.add(a);
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
/*     */   private org.bukkit.Location m;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private org.bukkit.block.Block F;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private Integer g;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private Integer f;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public List<org.bukkit.Location> getLocations()
/*     */   {
/*  63 */     return a.ALLATORIxDEMO;
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
/*     */   public org.bukkit.block.Block getBlock()
/*     */   {
/*  77 */     return a.F;
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
/*     */   public Region(org.bukkit.Location a)
/*     */   {
/*  93 */     a.m = a;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 119 */     a.F = a.m.getBlock();
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 170 */     a;a.<init>();new java/util/ArrayList.M = a;0.b = Integer.valueOf(a);tmp7_6.D = Integer.valueOf(a);tmp7_6.g = Integer.valueOf(a);0.f = Integer.valueOf(a);a.ALLATORIxDEMO = new java.util.ArrayList();a.calcInteger();nano.spook1998.rust.object.utils.RegionUtil.addRegion(a);
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
/*     */   public org.bukkit.Location getLocation()
/*     */   {
/* 113 */     return a.m;
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
/*     */   public void setUsers(List<User> a)
/*     */   {
/* 141 */     a.M = a;
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
/*     */   private Integer D;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private List<User> M;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private Integer b;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private List<org.bukkit.Location> ALLATORIxDEMO;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public List<User> getUsers()
/*     */   {
/* 191 */     return a.M;
/*     */   }
/*     */   
/*     */   public void clearUser()
/*     */   {
/* 196 */     a.M.clear();
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public boolean checkLocation(org.bukkit.Location a)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: invokevirtual 27	org/bukkit/Location:getX	()D
/*     */     //   4: aload_0
/*     */     //   5: getfield 29	nano/spook1998/rust/object/Region:D	Ljava/lang/Integer;
/*     */     //   8: invokevirtual 35	java/lang/Integer:intValue	()I
/*     */     //   11: i2d
/*     */     //   12: dcmpg
/*     */     //   13: ifge +54 -> 67
/*     */     //   16: aload_1
/*     */     //   17: invokevirtual 27	org/bukkit/Location:getX	()D
/*     */     //   20: aload_0
/*     */     //   21: getfield 37	nano/spook1998/rust/object/Region:b	Ljava/lang/Integer;
/*     */     //   24: invokevirtual 35	java/lang/Integer:intValue	()I
/*     */     //   27: i2d
/*     */     //   28: dcmpl
/*     */     //   29: ifle +38 -> 67
/*     */     //   32: aload_1
/*     */     //   33: invokevirtual 40	org/bukkit/Location:getZ	()D
/*     */     //   36: aload_0
/*     */     //   37: getfield 42	nano/spook1998/rust/object/Region:f	Ljava/lang/Integer;
/*     */     //   40: invokevirtual 35	java/lang/Integer:intValue	()I
/*     */     //   43: i2d
/*     */     //   44: dcmpg
/*     */     //   45: ifge +22 -> 67
/*     */     //   48: aload_1
/*     */     //   49: invokevirtual 40	org/bukkit/Location:getZ	()D
/*     */     //   52: aload_0
/*     */     //   53: getfield 44	nano/spook1998/rust/object/Region:g	Ljava/lang/Integer;
/*     */     //   56: invokevirtual 35	java/lang/Integer:intValue	()I
/*     */     //   59: i2d
/*     */     //   60: dcmpl
/*     */     //   61: ifle +6 -> 67
/*     */     //   64: iconst_1
/*     */     //   65: ireturn
/*     */     //   66: athrow
/*     */     //   67: iconst_0
/*     */     //   68: ireturn
/*     */     // Line number table:
/*     */     //   Java source line #27	-> byte code offset #0
/*     */     //   Java source line #132	-> byte code offset #32
/*     */     //   Java source line #186	-> byte code offset #64
/*     */     //   Java source line #57	-> byte code offset #67
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	69	0	a	Region
/*     */     //   0	69	1	a	org.bukkit.Location
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public Boolean checkLocations(List<org.bukkit.Location> a)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: invokeinterface 76 1 0
/*     */     //   6: dup
/*     */     //   7: astore_2
/*     */     //   8: goto +29 -> 37
/*     */     //   11: athrow
/*     */     //   12: aload_2
/*     */     //   13: invokeinterface 82 1 0
/*     */     //   18: checkcast 23	org/bukkit/Location
/*     */     //   21: astore_1
/*     */     //   22: aload_0
/*     */     //   23: aload_1
/*     */     //   24: invokevirtual 84	nano/spook1998/rust/object/Region:checkLocation	(Lorg/bukkit/Location;)Z
/*     */     //   27: ifeq +9 -> 36
/*     */     //   30: iconst_1
/*     */     //   31: invokestatic 90	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
/*     */     //   34: areturn
/*     */     //   35: athrow
/*     */     //   36: aload_2
/*     */     //   37: invokeinterface 94 1 0
/*     */     //   42: ifne -30 -> 12
/*     */     //   45: iconst_0
/*     */     //   46: invokestatic 90	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
/*     */     //   49: areturn
/*     */     // Line number table:
/*     */     //   Java source line #183	-> byte code offset #0
/*     */     //   Java source line #143	-> byte code offset #22
/*     */     //   Java source line #183	-> byte code offset #36
/*     */     //   Java source line #184	-> byte code offset #45
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	50	0	a	Region
/*     */     //   0	50	1	a	List
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public void calcInteger()
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: dup
/*     */     //   2: dup_x1
/*     */     //   3: getfield 98	nano/spook1998/rust/object/Region:ALLATORIxDEMO	Ljava/util/List;
/*     */     //   6: invokeinterface 101 1 0
/*     */     //   11: getfield 103	nano/spook1998/rust/object/Region:m	Lorg/bukkit/Location;
/*     */     //   14: invokevirtual 107	org/bukkit/Location:clone	()Lorg/bukkit/Location;
/*     */     //   17: getstatic 112	nano/spook1998/rust/data/Settings:REGION_SIZE	Ljava/lang/Integer;
/*     */     //   20: invokevirtual 35	java/lang/Integer:intValue	()I
/*     */     //   23: i2d
/*     */     //   24: dconst_0
/*     */     //   25: getstatic 112	nano/spook1998/rust/data/Settings:REGION_SIZE	Ljava/lang/Integer;
/*     */     //   28: invokevirtual 35	java/lang/Integer:intValue	()I
/*     */     //   31: i2d
/*     */     //   32: invokevirtual 115	org/bukkit/Location:add	(DDD)Lorg/bukkit/Location;
/*     */     //   35: astore_1
/*     */     //   36: getfield 103	nano/spook1998/rust/object/Region:m	Lorg/bukkit/Location;
/*     */     //   39: invokevirtual 107	org/bukkit/Location:clone	()Lorg/bukkit/Location;
/*     */     //   42: getstatic 112	nano/spook1998/rust/data/Settings:REGION_SIZE	Ljava/lang/Integer;
/*     */     //   45: invokevirtual 35	java/lang/Integer:intValue	()I
/*     */     //   48: ineg
/*     */     //   49: i2d
/*     */     //   50: dconst_0
/*     */     //   51: getstatic 112	nano/spook1998/rust/data/Settings:REGION_SIZE	Ljava/lang/Integer;
/*     */     //   54: invokevirtual 35	java/lang/Integer:intValue	()I
/*     */     //   57: ineg
/*     */     //   58: i2d
/*     */     //   59: invokevirtual 115	org/bukkit/Location:add	(DDD)Lorg/bukkit/Location;
/*     */     //   62: astore_2
/*     */     //   63: aload_1
/*     */     //   64: invokevirtual 27	org/bukkit/Location:getX	()D
/*     */     //   67: aload_2
/*     */     //   68: invokevirtual 27	org/bukkit/Location:getX	()D
/*     */     //   71: dcmpl
/*     */     //   72: ifle +32 -> 104
/*     */     //   75: aload_1
/*     */     //   76: aload_2
/*     */     //   77: aload_0
/*     */     //   78: dup_x1
/*     */     //   79: aload_1
/*     */     //   80: invokevirtual 27	org/bukkit/Location:getX	()D
/*     */     //   83: d2i
/*     */     //   84: invokestatic 118	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   87: putfield 29	nano/spook1998/rust/object/Region:D	Ljava/lang/Integer;
/*     */     //   90: invokevirtual 27	org/bukkit/Location:getX	()D
/*     */     //   93: d2i
/*     */     //   94: invokestatic 118	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   97: putfield 37	nano/spook1998/rust/object/Region:b	Ljava/lang/Integer;
/*     */     //   100: goto +29 -> 129
/*     */     //   103: athrow
/*     */     //   104: aload_0
/*     */     //   105: aload_1
/*     */     //   106: aload_0
/*     */     //   107: aload_2
/*     */     //   108: invokevirtual 27	org/bukkit/Location:getX	()D
/*     */     //   111: d2i
/*     */     //   112: invokestatic 118	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   115: putfield 29	nano/spook1998/rust/object/Region:D	Ljava/lang/Integer;
/*     */     //   118: invokevirtual 27	org/bukkit/Location:getX	()D
/*     */     //   121: d2i
/*     */     //   122: invokestatic 118	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   125: putfield 37	nano/spook1998/rust/object/Region:b	Ljava/lang/Integer;
/*     */     //   128: aload_1
/*     */     //   129: invokevirtual 40	org/bukkit/Location:getZ	()D
/*     */     //   132: aload_2
/*     */     //   133: invokevirtual 40	org/bukkit/Location:getZ	()D
/*     */     //   136: dcmpl
/*     */     //   137: ifle +32 -> 169
/*     */     //   140: aload_2
/*     */     //   141: aload_0
/*     */     //   142: dup_x1
/*     */     //   143: dup_x2
/*     */     //   144: aload_1
/*     */     //   145: invokevirtual 40	org/bukkit/Location:getZ	()D
/*     */     //   148: d2i
/*     */     //   149: invokestatic 118	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   152: putfield 42	nano/spook1998/rust/object/Region:f	Ljava/lang/Integer;
/*     */     //   155: invokevirtual 40	org/bukkit/Location:getZ	()D
/*     */     //   158: d2i
/*     */     //   159: invokestatic 118	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   162: putfield 44	nano/spook1998/rust/object/Region:g	Ljava/lang/Integer;
/*     */     //   165: goto +29 -> 194
/*     */     //   168: athrow
/*     */     //   169: aload_0
/*     */     //   170: aload_1
/*     */     //   171: aload_0
/*     */     //   172: dup_x1
/*     */     //   173: aload_2
/*     */     //   174: invokevirtual 40	org/bukkit/Location:getZ	()D
/*     */     //   177: d2i
/*     */     //   178: invokestatic 118	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   181: putfield 42	nano/spook1998/rust/object/Region:f	Ljava/lang/Integer;
/*     */     //   184: invokevirtual 40	org/bukkit/Location:getZ	()D
/*     */     //   187: d2i
/*     */     //   188: invokestatic 118	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*     */     //   191: putfield 44	nano/spook1998/rust/object/Region:g	Ljava/lang/Integer;
/*     */     //   194: getfield 44	nano/spook1998/rust/object/Region:g	Ljava/lang/Integer;
/*     */     //   197: invokevirtual 35	java/lang/Integer:intValue	()I
/*     */     //   200: dup
/*     */     //   201: istore_1
/*     */     //   202: goto +107 -> 309
/*     */     //   205: aload_0
/*     */     //   206: dup
/*     */     //   207: getfield 103	nano/spook1998/rust/object/Region:m	Lorg/bukkit/Location;
/*     */     //   210: invokevirtual 122	org/bukkit/Location:getWorld	()Lorg/bukkit/World;
/*     */     //   213: aload_0
/*     */     //   214: dup_x1
/*     */     //   215: getfield 37	nano/spook1998/rust/object/Region:b	Ljava/lang/Integer;
/*     */     //   218: invokevirtual 35	java/lang/Integer:intValue	()I
/*     */     //   221: iload_1
/*     */     //   222: invokeinterface 128 3 0
/*     */     //   227: invokeinterface 133 1 0
/*     */     //   232: astore_2
/*     */     //   233: getfield 103	nano/spook1998/rust/object/Region:m	Lorg/bukkit/Location;
/*     */     //   236: invokevirtual 122	org/bukkit/Location:getWorld	()Lorg/bukkit/World;
/*     */     //   239: aload_0
/*     */     //   240: getfield 29	nano/spook1998/rust/object/Region:D	Ljava/lang/Integer;
/*     */     //   243: invokevirtual 35	java/lang/Integer:intValue	()I
/*     */     //   246: iload_1
/*     */     //   247: invokeinterface 128 3 0
/*     */     //   252: invokeinterface 133 1 0
/*     */     //   257: astore_3
/*     */     //   258: getfield 98	nano/spook1998/rust/object/Region:ALLATORIxDEMO	Ljava/util/List;
/*     */     //   261: aload_2
/*     */     //   262: invokeinterface 62 2 0
/*     */     //   267: ifne +14 -> 281
/*     */     //   270: aload_0
/*     */     //   271: getfield 98	nano/spook1998/rust/object/Region:ALLATORIxDEMO	Ljava/util/List;
/*     */     //   274: aload_2
/*     */     //   275: invokeinterface 70 2 0
/*     */     //   280: pop
/*     */     //   281: aload_0
/*     */     //   282: getfield 98	nano/spook1998/rust/object/Region:ALLATORIxDEMO	Ljava/util/List;
/*     */     //   285: aload_3
/*     */     //   286: invokeinterface 62 2 0
/*     */     //   291: ifne +14 -> 305
/*     */     //   294: aload_0
/*     */     //   295: getfield 98	nano/spook1998/rust/object/Region:ALLATORIxDEMO	Ljava/util/List;
/*     */     //   298: aload_3
/*     */     //   299: invokeinterface 70 2 0
/*     */     //   304: pop
/*     */     //   305: iinc 1 1
/*     */     //   308: iload_1
/*     */     //   309: aload_0
/*     */     //   310: getfield 42	nano/spook1998/rust/object/Region:f	Ljava/lang/Integer;
/*     */     //   313: invokevirtual 35	java/lang/Integer:intValue	()I
/*     */     //   316: if_icmple -111 -> 205
/*     */     //   319: aload_0
/*     */     //   320: getfield 37	nano/spook1998/rust/object/Region:b	Ljava/lang/Integer;
/*     */     //   323: invokevirtual 35	java/lang/Integer:intValue	()I
/*     */     //   326: dup
/*     */     //   327: istore_1
/*     */     //   328: goto +107 -> 435
/*     */     //   331: aload_0
/*     */     //   332: dup
/*     */     //   333: getfield 103	nano/spook1998/rust/object/Region:m	Lorg/bukkit/Location;
/*     */     //   336: invokevirtual 122	org/bukkit/Location:getWorld	()Lorg/bukkit/World;
/*     */     //   339: iload_1
/*     */     //   340: aload_0
/*     */     //   341: dup_x2
/*     */     //   342: getfield 44	nano/spook1998/rust/object/Region:g	Ljava/lang/Integer;
/*     */     //   345: invokevirtual 35	java/lang/Integer:intValue	()I
/*     */     //   348: invokeinterface 128 3 0
/*     */     //   353: invokeinterface 133 1 0
/*     */     //   358: astore_2
/*     */     //   359: getfield 103	nano/spook1998/rust/object/Region:m	Lorg/bukkit/Location;
/*     */     //   362: invokevirtual 122	org/bukkit/Location:getWorld	()Lorg/bukkit/World;
/*     */     //   365: iload_1
/*     */     //   366: aload_0
/*     */     //   367: getfield 42	nano/spook1998/rust/object/Region:f	Ljava/lang/Integer;
/*     */     //   370: invokevirtual 35	java/lang/Integer:intValue	()I
/*     */     //   373: invokeinterface 128 3 0
/*     */     //   378: invokeinterface 133 1 0
/*     */     //   383: astore_3
/*     */     //   384: getfield 98	nano/spook1998/rust/object/Region:ALLATORIxDEMO	Ljava/util/List;
/*     */     //   387: aload_2
/*     */     //   388: invokeinterface 62 2 0
/*     */     //   393: ifne +14 -> 407
/*     */     //   396: aload_0
/*     */     //   397: getfield 98	nano/spook1998/rust/object/Region:ALLATORIxDEMO	Ljava/util/List;
/*     */     //   400: aload_2
/*     */     //   401: invokeinterface 70 2 0
/*     */     //   406: pop
/*     */     //   407: aload_0
/*     */     //   408: getfield 98	nano/spook1998/rust/object/Region:ALLATORIxDEMO	Ljava/util/List;
/*     */     //   411: aload_3
/*     */     //   412: invokeinterface 62 2 0
/*     */     //   417: ifne +14 -> 431
/*     */     //   420: aload_0
/*     */     //   421: getfield 98	nano/spook1998/rust/object/Region:ALLATORIxDEMO	Ljava/util/List;
/*     */     //   424: aload_3
/*     */     //   425: invokeinterface 70 2 0
/*     */     //   430: pop
/*     */     //   431: iinc 1 1
/*     */     //   434: iload_1
/*     */     //   435: aload_0
/*     */     //   436: getfield 29	nano/spook1998/rust/object/Region:D	Ljava/lang/Integer;
/*     */     //   439: invokevirtual 35	java/lang/Integer:intValue	()I
/*     */     //   442: if_icmple -111 -> 331
/*     */     //   445: return
/*     */     // Line number table:
/*     */     //   Java source line #24	-> byte code offset #0
/*     */     //   Java source line #194	-> byte code offset #11
/*     */     //   Java source line #142	-> byte code offset #36
/*     */     //   Java source line #3	-> byte code offset #63
/*     */     //   Java source line #160	-> byte code offset #76
/*     */     //   Java source line #89	-> byte code offset #90
/*     */     //   Java source line #72	-> byte code offset #100
/*     */     //   Java source line #5	-> byte code offset #104
/*     */     //   Java source line #86	-> byte code offset #118
/*     */     //   Java source line #163	-> byte code offset #128
/*     */     //   Java source line #193	-> byte code offset #140
/*     */     //   Java source line #60	-> byte code offset #155
/*     */     //   Java source line #129	-> byte code offset #165
/*     */     //   Java source line #21	-> byte code offset #169
/*     */     //   Java source line #175	-> byte code offset #184
/*     */     //   Java source line #70	-> byte code offset #194
/*     */     //   Java source line #158	-> byte code offset #205
/*     */     //   Java source line #138	-> byte code offset #233
/*     */     //   Java source line #91	-> byte code offset #258
/*     */     //   Java source line #39	-> byte code offset #270
/*     */     //   Java source line #174	-> byte code offset #281
/*     */     //   Java source line #19	-> byte code offset #294
/*     */     //   Java source line #70	-> byte code offset #305
/*     */     //   Java source line #11	-> byte code offset #319
/*     */     //   Java source line #176	-> byte code offset #331
/*     */     //   Java source line #66	-> byte code offset #359
/*     */     //   Java source line #20	-> byte code offset #384
/*     */     //   Java source line #173	-> byte code offset #396
/*     */     //   Java source line #71	-> byte code offset #407
/*     */     //   Java source line #80	-> byte code offset #420
/*     */     //   Java source line #11	-> byte code offset #431
/*     */     //   Java source line #147	-> byte code offset #445
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	446	0	a	Region
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public void sendPacket(org.bukkit.entity.Player a, org.bukkit.Material a, byte a)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: iconst_0
/*     */     //   1: invokestatic 90	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
/*     */     //   4: astore 4
/*     */     //   6: aload_0
/*     */     //   7: getfield 98	nano/spook1998/rust/object/Region:ALLATORIxDEMO	Ljava/util/List;
/*     */     //   10: invokeinterface 76 1 0
/*     */     //   15: dup
/*     */     //   16: astore 6
/*     */     //   18: goto +59 -> 77
/*     */     //   21: athrow
/*     */     //   22: aload 6
/*     */     //   24: invokeinterface 82 1 0
/*     */     //   29: checkcast 23	org/bukkit/Location
/*     */     //   32: dup
/*     */     //   33: astore 5
/*     */     //   35: invokevirtual 141	org/bukkit/Location:getBlock	()Lorg/bukkit/block/Block;
/*     */     //   38: invokeinterface 145 1 0
/*     */     //   43: getstatic 151	org/bukkit/Material:AIR	Lorg/bukkit/Material;
/*     */     //   46: invokevirtual 154	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
/*     */     //   49: ifeq +20 -> 69
/*     */     //   52: invokestatic 160	nano/spook1998/rust/utils/BlockUtil:getInstance	()Lnano/spook1998/rust/utils/BlockUtil;
/*     */     //   55: aload_1
/*     */     //   56: aload 5
/*     */     //   58: aload_2
/*     */     //   59: iload_3
/*     */     //   60: invokevirtual 164	nano/spook1998/rust/utils/BlockUtil:sendBlock	(Lorg/bukkit/entity/Player;Lorg/bukkit/Location;Lorg/bukkit/Material;B)V
/*     */     //   63: aload 6
/*     */     //   65: goto +12 -> 77
/*     */     //   68: athrow
/*     */     //   69: iconst_1
/*     */     //   70: invokestatic 90	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
/*     */     //   73: astore 4
/*     */     //   75: aload 6
/*     */     //   77: invokeinterface 94 1 0
/*     */     //   82: ifne -60 -> 22
/*     */     //   85: aload 4
/*     */     //   87: invokevirtual 167	java/lang/Boolean:booleanValue	()Z
/*     */     //   90: ifeq +7 -> 97
/*     */     //   93: aload_0
/*     */     //   94: invokevirtual 169	nano/spook1998/rust/object/Region:calcInteger	()V
/*     */     //   97: return
/*     */     // Line number table:
/*     */     //   Java source line #154	-> byte code offset #0
/*     */     //   Java source line #87	-> byte code offset #6
/*     */     //   Java source line #22	-> byte code offset #35
/*     */     //   Java source line #179	-> byte code offset #52
/*     */     //   Java source line #16	-> byte code offset #65
/*     */     //   Java source line #43	-> byte code offset #69
/*     */     //   Java source line #87	-> byte code offset #75
/*     */     //   Java source line #15	-> byte code offset #85
/*     */     //   Java source line #181	-> byte code offset #97
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	98	0	a	Region
/*     */     //   0	98	1	a	org.bukkit.entity.Player
/*     */     //   0	98	2	a	org.bukkit.Material
/*     */     //   0	98	3	a	int
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public boolean checkUser(User a)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield 56	nano/spook1998/rust/object/Region:M	Ljava/util/List;
/*     */     //   4: aload_1
/*     */     //   5: invokeinterface 62 2 0
/*     */     //   10: ifeq +6 -> 16
/*     */     //   13: iconst_1
/*     */     //   14: ireturn
/*     */     //   15: athrow
/*     */     //   16: iconst_0
/*     */     //   17: ireturn
/*     */     // Line number table:
/*     */     //   Java source line #28	-> byte code offset #0
/*     */     //   Java source line #94	-> byte code offset #16
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	18	0	a	Region
/*     */     //   0	18	1	a	User
/*     */   }
/*     */   
/*     */   /* Error */
/*     */   public void sendPacket(org.bukkit.entity.Player a, Integer a, byte a)
/*     */   {
/*     */     // Byte code:
/*     */     //   0: iconst_0
/*     */     //   1: invokestatic 90	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
/*     */     //   4: astore 4
/*     */     //   6: aload_0
/*     */     //   7: getfield 98	nano/spook1998/rust/object/Region:ALLATORIxDEMO	Ljava/util/List;
/*     */     //   10: invokeinterface 76 1 0
/*     */     //   15: dup
/*     */     //   16: astore 6
/*     */     //   18: goto +59 -> 77
/*     */     //   21: athrow
/*     */     //   22: aload 6
/*     */     //   24: invokeinterface 82 1 0
/*     */     //   29: checkcast 23	org/bukkit/Location
/*     */     //   32: dup
/*     */     //   33: astore 5
/*     */     //   35: invokevirtual 141	org/bukkit/Location:getBlock	()Lorg/bukkit/block/Block;
/*     */     //   38: invokeinterface 145 1 0
/*     */     //   43: getstatic 151	org/bukkit/Material:AIR	Lorg/bukkit/Material;
/*     */     //   46: invokevirtual 154	org/bukkit/Material:equals	(Ljava/lang/Object;)Z
/*     */     //   49: ifeq +20 -> 69
/*     */     //   52: invokestatic 160	nano/spook1998/rust/utils/BlockUtil:getInstance	()Lnano/spook1998/rust/utils/BlockUtil;
/*     */     //   55: aload_1
/*     */     //   56: aload 5
/*     */     //   58: aload_2
/*     */     //   59: iload_3
/*     */     //   60: invokevirtual 196	nano/spook1998/rust/utils/BlockUtil:sendBlock	(Lorg/bukkit/entity/Player;Lorg/bukkit/Location;Ljava/lang/Integer;B)V
/*     */     //   63: aload 6
/*     */     //   65: goto +12 -> 77
/*     */     //   68: athrow
/*     */     //   69: iconst_1
/*     */     //   70: invokestatic 90	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
/*     */     //   73: astore 4
/*     */     //   75: aload 6
/*     */     //   77: invokeinterface 94 1 0
/*     */     //   82: ifne -60 -> 22
/*     */     //   85: aload 4
/*     */     //   87: invokevirtual 167	java/lang/Boolean:booleanValue	()Z
/*     */     //   90: ifeq +7 -> 97
/*     */     //   93: aload_0
/*     */     //   94: invokevirtual 169	nano/spook1998/rust/object/Region:calcInteger	()V
/*     */     //   97: return
/*     */     // Line number table:
/*     */     //   Java source line #124	-> byte code offset #0
/*     */     //   Java source line #140	-> byte code offset #6
/*     */     //   Java source line #85	-> byte code offset #35
/*     */     //   Java source line #14	-> byte code offset #52
/*     */     //   Java source line #67	-> byte code offset #65
/*     */     //   Java source line #125	-> byte code offset #69
/*     */     //   Java source line #140	-> byte code offset #75
/*     */     //   Java source line #137	-> byte code offset #85
/*     */     //   Java source line #165	-> byte code offset #97
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	signature
/*     */     //   0	98	0	a	Region
/*     */     //   0	98	1	a	org.bukkit.entity.Player
/*     */     //   0	98	2	a	Integer
/*     */     //   0	98	3	a	int
/*     */   }
/*     */ }


/* Location:              C:\Users\User\Desktop\Otek\NanoRust.jar!\nano\spook1998\rust\object\Region.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */